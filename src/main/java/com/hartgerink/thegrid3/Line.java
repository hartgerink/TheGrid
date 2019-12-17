/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hartgerink.thegrid3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.BasicStroke;

/**
 *
 * @author kevinhartgerink
 */
public class Line {
    private Marker pointA, pointB;
    private Color color;
    private float strokeWidth;
    
    
    public Line() {
        pointA = new Marker();
        pointB = new Marker();
        color = Color.BLACK;
        strokeWidth = 3.0f;
    }
    
    public Line(Marker a, Marker b, Color c, float f) {
        pointA = a;
        pointB = b;
        color = c;
        strokeWidth = f;
    }
    
    public void clear() {
        pointA = new Marker();
        pointB = new Marker();
        color = Color.BLACK;
        strokeWidth = 3.0f;
    }
    
    public void click(int screenX, int screenY) {
        if(!pointA.isSet && !pointB.isSet) {
            pointA.setFromScreen(screenX, screenY);
        }
        else if(pointA.isSet && !pointB.isSet) {
            pointB.setFromScreen(screenX, screenY);
        }
        else {
            //Do Nothing.
        }
    }
    
    
    
    public void addPoint(int x, int y) {
        pointA.setFromScreen(x,y);
    }
   
    
    public void draw(Graphics g) {
        //Setup graphics settings for drawing.
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(strokeWidth));
        g2.setColor(color);
        
        int zoom = Gridlines.getZoom()/2;
        int offset = zoom/2;
        
        
        if(pointA.isSet && !pointB.isSet) {
            g2.setStroke(new BasicStroke(3));
            g2.setColor(Color.BLUE);
            g2.drawOval(pointA.getScreenX() - offset, pointA.getScreenY() - offset, zoom, zoom);
        }
        
        if(pointA.isSet && pointB.isSet) {
            g2.drawLine(pointA.getScreenX(), pointA.getScreenY(), pointB.getScreenX(), pointB.getScreenY());
        }
    }
}
