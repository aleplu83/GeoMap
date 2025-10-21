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
    
    public Coordinate(int deg, float min, float sec) {
        dd=deg+(min/60)+(sec/3600); // Convert to Decimal Degrees
    }
    
    public Coordinate(String DMS) {
        // for passing Coordinates like e.g. "0501020"
        int deg=Integer.parseInt(DMS.substring(0, 3)); // extract "050"
        float min=Float.parseFloat(DMS.substring(4, 5)); // extract "10"
        float sec=Float.parseFloat(DMS.substring(5));  // extract "20"
        dd=deg+(min/60)+(sec/3600); // Convert to Decimal Degrees
    }
    
    public float getDD() {
        return dd;
    }

}
