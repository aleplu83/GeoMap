/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package be.itpla.geomap;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
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
    
    public GeoMap() {
        geoPoints = new ArrayList<>(); // initialize the ArrayList
        fMain = new JFrame("GeoMap");
        fMain.setLocation(400, 200);
        pMap = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.draw3DRect(50, 50, 60, 60, true);
            }
        };
        pMap.setBackground(Color.BLACK);
        fMain.setLayout(new FlowLayout());
        pMap.setPreferredSize(new Dimension(800,600));
        fMain.add(pMap);
        fMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fMain.pack();
      
        fMain.setVisible(true);
        
        geoPoints.add(new CPoint("MILANO",new Coordinate(45,27f,40.68f),new Coordinate(9,9f,34.20f),800,600));
        geoPoints.add(new CPoint("ROMA",new Coordinate(41,53f,36f),new Coordinate(12,28f,58f),800,600));
        geoPoints.add(new CPoint("TORINO",new Coordinate(44,4f,13.8f),new Coordinate(7,41f,12.6f),800,600));
        
        for (CPoint cp : geoPoints)
            System.out.println(cp);
        
        
        
    }
    
    public float maxLat() {
        float max = 0.0f;
        for (CPoint cp : geoPoints)
            if (cp.lat() > max)
                max = cp.lat();

        return max;
    }
    
    public float maxLng() {
        float max = 0.0f;
        for (CPoint cp : geoPoints)
            if (cp.lng() > max)
                max = cp.lng();

        return max;
    }
    
    public float minLat() {
        float min = 0.0f;
        for (CPoint cp : geoPoints)
            if (cp.lat() < min)
                min = cp.lat();

        return min;
    }
    
    public float minLng() {
        float min = 0.0f;
        for (CPoint cp : geoPoints)
            if (cp.lng() < min)
                min = cp.lng();

        return min;
    }
    
    
    public static void main(String[] args) {
        new GeoMap();
    }
}
