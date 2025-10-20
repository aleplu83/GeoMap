/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.itpla.geomap;

/**
 *
 * @author Alessandro
 */
public class Coordinate {
    
    private final int deg;
    private final float min;
    private final float sec;

    public Coordinate(int deg, float min, float sec) {
        this.deg = deg;
        this.min = min;
        this.sec = sec;
    }
    
    public float toDD() {
        return deg+(min/60)+(sec/3600);
    }

}
