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
    
    private float dd;

    public Coordinate() {
        // Empty constructor
    }
    
    public Coordinate(float dd) {
        this.dd = dd;
    }
    
    public Coordinate(char pole,int deg, float min, float sec) {
        dd=deg+(min/60)+(sec/3600); // Convert to Decimal Degrees
        if (pole == 'S' || pole == 'W') // if pole is South or West
            dd*=-1;
        
    }
    
    public float getDD() {
        return dd;
    }

}
