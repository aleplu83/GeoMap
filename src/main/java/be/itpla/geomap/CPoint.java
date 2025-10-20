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
    
    public CPoint() {
        // Empty constructor
    }

    public CPoint(String ID, Coordinate lat, Coordinate lng) {
        this.ID = ID;
        this.lat = lat;
        this.lng = lng;
    }
     
    public Point pos() {
        //return new Point((int)pMap.getWidth() / (pMap.getMaxLng()-mapSize.getMinLng()),0);
        return new Point(0,0);
    }

}
