/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package be.itpla.geomap;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alessandro Pluchino
 * 
 * 20/10/25
 * 
 * Convert Geographical coordinates to Cartesian Coordinates and draw on a window
 */
public class GeoMap {

    private JFrame fMain;
    private JPanel pMap;
    private ArrayList<CPoint> geoPoints;
    private final Dimension mapSize = new Dimension(800,600);
    
    public GeoMap() {
        geoPoints = new ArrayList<>(); // initialize the ArrayList
        geoPoints.add(new CPoint("MILANO",new Coordinate(45.4654f),new Coordinate(9.1859f),this));
        geoPoints.add(new CPoint("ROMA",new Coordinate('N',41,53f,36f),new Coordinate('E',12,28f,58f),this));
        geoPoints.add(new CPoint("TORINO",new Coordinate(45.0705f),new Coordinate(7.68682f),this));
        geoPoints.add(new CPoint("Firenze",new Coordinate(43.7700f),new Coordinate(11.2577f),this));
        geoPoints.add(new CPoint("Pisa",new Coordinate(43.7228f),new Coordinate(10.4018f),this));
        geoPoints.add(new CPoint("San Marino",new Coordinate(43.9424f),new Coordinate(12.4578f),this));
        geoPoints.add(new CPoint("Bologna",new Coordinate(44.4936f),new Coordinate(11.3430f),this));
        geoPoints.add(new CPoint("La Spezia",new Coordinate(44.0999f),new Coordinate(9.8166f),this));
                
        fMain = new JFrame("GeoMap");
        fMain.setLocation(400, 200);
        pMap = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.WHITE);
                for (CPoint cp : geoPoints) {
                    g2d.fillRect(cp.getX(), cp.getY(), 5, 5);
                    g2d.setFont(new Font("Tahoma",0,10));
                    g2d.drawString(cp.getID(), cp.getX()+6, cp.getY()+18);
                }
            }
        };
        pMap.setBackground(Color.BLACK);
        fMain.setLayout(new FlowLayout());
        pMap.setPreferredSize(mapSize);
        
        fMain.add(pMap);
        fMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fMain.pack();
      
        fMain.setVisible(true);
        
        for (CPoint cp : geoPoints)
            System.out.println(cp);
        
    }
    /*
    The following functions calculate min and max lat and long to center the map
    */
    public float getMinLat() { 
        float max = geoPoints.get(0).lat();
        for (CPoint cp : geoPoints)
            if (cp.lat() > max)
                max = cp.lat();
        
        return max+0.5f;
    }
    
    public Dimension getMapSize() {
        return mapSize;
    }
    
    public float getMaxLat() {
        float min = geoPoints.get(0).lat();
        for (CPoint cp : geoPoints)
            if (cp.lat() < min)
                min = cp.lat();

        return min-0.5f;
    }
    
    public float getMaxLng() {
        float max = geoPoints.get(0).lng();
        for (CPoint cp : geoPoints)
            if (cp.lng() > max)
                max = cp.lng();

        return max+0.5f;
    }
    
    
    
    public float getMinLng() {
        float min = geoPoints.get(0).lng();
        for (CPoint cp : geoPoints)
            if (cp.lng() < min)
                min = cp.lng();

        return min-0.5f;
    }
    
    
    public static void main(String[] args) {
        new GeoMap();
    }
}
