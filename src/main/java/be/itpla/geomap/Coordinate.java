/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.itpla.geomap;

import java.util.Comparator;

/**
 *
 * @author Alessandro
 */
public class Coordinate implements Comparator<Coordinate> {
    
    private int deg;
    private int min;
    private float sec;

    public Coordinate(int deg, int min, float sec) {
        this.deg = deg;
        this.min = min;
        this.sec = sec;
    }
    
    public float toDD() {
        return deg+(min/60)+(sec/3600);
    }

    @Override
    public int compare(Coordinate o1, Coordinate o2) {
        if (o1.toDD() > o2.toDD())
            return 1;
        else
            return -1;
    }
}
