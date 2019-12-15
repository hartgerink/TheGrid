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
    
    public void draw(Graphics g) {
        //Setup graphics settings for drawing.
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(strokeWidth));
        g2.setColor(color);
        
        g2.drawLine(pointA.getScreenX(), pointA.getScreenY(), pointB.getScreenX(), pointB.getScreenY());
    }
}
