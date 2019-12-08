/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hartgerink.thegrid3;

/**
 *
 * @author kevinhartgerink
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.List;
import java.util.LinkedList;

public class Plot {
    
    private List<Marker> markerList;
    private Color color;
    
    public Plot() {
        markerList = new LinkedList<Marker>();
        color = Color.BLACK;
    }

    public void add(int x, int y) {
        Marker m = new Marker(x,y);
        if(!contains(m)) {
            markerList.add(m);
        }
    } 
    
    private boolean contains(Marker b) {
        boolean containsNumber = false;
        Marker a;
        for(int i=0; i<markerList.size(); i++) {
            a = markerList.get(i);
            if (a.match(b)) {
                containsNumber = true;
                break;
            }
        }
        return containsNumber;
    }
    
    public void clear() {
        markerList.clear();
    }

    public void draw(Graphics g) {
        //Setup graphics settings for drawing.
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(1));
        g2.setColor(color);
        
        int zoom = Gridlines.getZoom()/2;
        int offset = zoom/2;
        
        for(int i=0; i<markerList.size(); i++) {
            Marker m = markerList.get(i);
            g2.fillRect(m.getScreenX() - offset, m.getScreenY() - offset, zoom, zoom);
        }
        
    }
}