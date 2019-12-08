/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hartgerink.thegrid3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.Polygon;
import java.util.LinkedList;
import java.util.List;
import java.awt.Shape;


/**
 *
 * @author kevinhartgerink
 */
public class PolymorphRotator {
    
    private Polygon polygon;
    private List<Marker> markerList;
    private Marker anchor;
    private Shape shape;
    private double theta;
    private Color color;
    public boolean isVisible, anchorIsVisible;
    
    
    public PolymorphRotator(Polymorph p) {
        polygon = new Polygon();
        markerList = p.getMarkerList();
        anchor = new Marker();
        color = Color.BLUE;
        isVisible = anchorIsVisible = false;
    }
    
    public void updatePolymorphRotator(Polymorph p) {
        markerList = p.getMarkerList();
    }
    
    private void buildPolygon() {
        polygon.reset();
        Marker m;
        int x,y;
        for (int i=0; i<markerList.size(); i++) {
            m = markerList.get(i);
            x = m.getScreenX();
            y = m.getScreenY();
            polygon.addPoint(x,y);
        }
    }
    
    public void setAnchor(int x, int y) {
        anchor = new Marker(x,y);
        
    }
    public void setRotation(float f) {
        theta = f;
    }
    private void rotatePolygon() {
        int x = anchor.getScreenX();
        int y = anchor.getScreenY();
        double radians = Math.toRadians(theta);
        AffineTransform transform = AffineTransform.getRotateInstance(radians, x, y);
        shape = transform.createTransformedShape(polygon);
    }
    
    public void draw(Graphics g) {
        if(isVisible) {
            //Update settings
            buildPolygon();
            rotatePolygon();
            
            //Setup graphics settings for drawing.
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setStroke(new BasicStroke(1));
            g2.setColor(color);
            
            //Draw
            g2.draw(shape);
        }
    }
    
    public void drawAnchor(Graphics g) {
        if(anchorIsVisible) {
            int zoom = Gridlines.getZoom()/2;
            int offset = zoom/2;
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setStroke(new BasicStroke(1));
            g2.setColor(Color.red);
            g2.drawOval(anchor.getScreenX() - offset, anchor.getScreenY() -offset, zoom, zoom); 
        }
    }
}
