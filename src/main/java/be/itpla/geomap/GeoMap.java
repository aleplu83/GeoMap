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
    }
    
   
    
    
    public static void main(String[] args) {
        new GeoMap();
    }
}
