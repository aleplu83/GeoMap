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
    private int mapWidth,mapHeight;
    
    public CPoint() {
        // Empty constructor
    }

    public CPoint(String ID, Coordinate lat, Coordinate lng,int mapWidth,int mapHeight) {
        this.ID = ID;
        this.lat = lat;
        this.lng = lng;
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
    }

    @Override
    public String toString() {
        return "ID: "+ ID+"\tLatitude: "+lat.toDD()+"\tLongitude: "+lng.toDD();
    }
    
     
    public Point pos() {
        //return new Point((int)pMap.getWidth() / (pMap.getMaxLng()-mapSize.getMinLng()),0);
        return new Point();
    }

    public float lat() {
        return lat.toDD();
    }
    
    public float lng() {
        return lng.toDD();
    }

}
