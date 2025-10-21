/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.itpla.geomap;

/**
 *
 * @author Alessandro
 * 
 * Class representing a Coordinate Point
 * 
 */
public class CPoint {
 
    private String ID;
    private Coordinate lat,lng;
    private GeoMap map;
    
    public CPoint() {
        // Empty constructor
    }

    public CPoint(String ID, Coordinate lat, Coordinate lng,GeoMap map) {
        this.ID = ID;
        this.lat = lat;
        this.lng = lng;
        this.map = map;
    }

    @Override
    public String toString() {
        return "ID: "+ ID+"\tLatitude: "+lat.getDD()+"\tLongitude: "+lng.getDD() + "\tX: "+getX()+"\tY: "+getY();
    }

    public String getID() {
        return ID;
    }
     
    /*
    convert to XY
    divide map size by difference between max-min of lat and long
    
    */
    public int getX() {
        return (int)(map.getMapSize().width / (map.getMaxLng()-map.getMinLng())*(lng.getDD()-map.getMinLng()));
    }
    public int getY() {
        return (int)(map.getMapSize().height / (map.getMaxLat()-map.getMinLat())*(lat.getDD()-map.getMinLat()));
    }

    public float lat() {
        return lat.getDD();
    }
    
    public float lng() {
        return lng.getDD();
    }

}
