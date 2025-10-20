/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.itpla.geomap;

import java.awt.Point;

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
        return "ID: "+ ID+"\tLatitude: "+lat.toDD()+"\tLongitude: "+lng.toDD();
    }

    public String getID() {
        return ID;
    }
     
    public Point pos() {
        int x = (int) (map.getMapSize().width / (map.maxLng()-map.minLng()));
        int y = (int) (map.getMapSize().height / (map.maxLat()-map.minLat()));
        return new Point(x,y);
    }

    public float lat() {
        return lat.toDD();
    }
    
    public float lng() {
        return lng.toDD();
    }

}
