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
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.BasicStroke;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.Point;
import java.util.Date;

public class Polymorph {
    
    private String name;
    private List<Marker> markerList;
    private boolean markerIsSelected;
    private Marker selectedMarker;
    private Color color;
    private float strokeWidth;
    public boolean isVisible;
    
    public Polymorph() {
        Date d = new Date();
        name = Long.toString(d.getTime());
        markerList = new LinkedList<Marker>();
        markerIsSelected = false;
        color = Color.BLACK;
        isVisible = true;
        strokeWidth = 3;
    }
    
    public List<Marker> getMarkerList() {
        return markerList;
    }
    
    //Check to see if the point x,y is on any of the line segments that
    //make up the polygon. Return -1 if the point is not on any line segment.
    //If the point is on a line segment, return the index of the first point of that
    //line segment.
    private int onLine (int x, int y) {
        int index = -1;
        Point p = new Point(Gridlines.screenToGridX(x),Gridlines.screenToGridY(y));
        
        if(markerList.size() > 1) {
            Marker a,b;
            Line2D.Float line;
            
            for(int i=0; i<markerList.size()-1; i++) {
                a = markerList.get(i);
                b = markerList.get(i+1);
                line = new Line2D.Float(a.getPoint(), b.getPoint());
                
                //relativeCCW is a function of java.awt.geom.Line2D that will return 0
                //if the point is on the line segment.
                if(line.relativeCCW(p)==0){
                    index = i+1;
                    break;
                }
            }
        }
        return index;
        //return -1;
    }
    
    //Add a new Marker to the markerList.
    public void add(int x, int y) {
        Marker m = new Marker(x,y);

        //Check to see if this new marker lies on an existing line segment.
        int index = onLine(x,y);
        if (index != -1) {
            markerList.add(index, m);
        }
        else {
            markerList.add(m);
        }
    }
    
    //Remove the specified Marker from the markerList
    public void remove(Marker m) {
        markerList.remove(m);
    }
    
    //Remove the first Marker from the markerList
    public void removeFirst() {
        if (markerList.size() > 0) {
            markerList.remove(0);
        }
    }
    
    //Remove the last Marker from the markerList
    public void removeLast() {
        if (markerList.size() > 0) {
            markerList.remove(markerList.size() - 1);
        }
    }

    //Clear the entire markerList.
    public void clear() {
        markerList.clear();
    }
    
    //The user has right-clicked on the grid... if a marker has been selected, move that marker to these doubleArray. If no marker is slected, check to see if the user has clicked on a marker. If so, select that marker so that it can be moved in the next round.
    public void moveMarker(int x, int y) {
        x = Gridlines.screenToGridX(x);
        y = Gridlines.screenToGridY(y);
        
        if(markerIsSelected) {
            selectedMarker.set(x, y);
            markerIsSelected = false;
        }
        else {
            for(int i=0; i<markerList.size(); i++) {
                Marker m = markerList.get(i);
                if(m.match(x, y)) {
                    selectedMarker = m;
                    markerIsSelected = true;
                    break;
                }
            }
        }
    }
    
    //If a marker is selected, delete that selected marker.
    public void deleteMarker() {
        if(markerIsSelected) {
            markerList.remove(selectedMarker);
            markerIsSelected = false;
        }
    }
  
    public Color getColor() {
        return color;
    }
    public void setColor(Color c) {
        color = c;
    }
    public float getStrokeWidth() {
        return strokeWidth;
    }
    public void setStrokeWidth(float f) {
        strokeWidth = f;
    }
    public String getName() {
        return name;
    }
    public void setName(String s) {
        name = s;
    }
    
    
    //Drawing a Dot2Dot is like drawing the lines between the dots of a Dot-To-Dot worksheet.
    public void draw(Graphics g) {
        if(isVisible) {
            //Make sure there is at least 1 Marker in the markerList.
            if(markerList.size() > 0) {

                //Setup graphics settings for drawing.
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setStroke(new BasicStroke(strokeWidth));
                g2.setColor(color);

                //Setup an iterator.
                Iterator<Marker> I = markerList.iterator();

                //start will hold the first (and possibly only) Marker in the list. It will not be altered in the while loop.
                Marker start = I.next();

                //a and b will be will be updated in the while loop if there is more than a single Marker in the list.
                Marker a = start;
                Marker b = start;

                while(I.hasNext()) {
                    b = I.next();
                    //Draw a line from Marker a to Marker b.
                    g2.drawLine(a.getScreenX(), a.getScreenY(), b.getScreenX(), b.getScreenY());
                    a = b;
                }
                //Finally, draw a line from the first Marker to the last Marker.
                g2.drawLine(start.getScreenX(), start.getScreenY(), b.getScreenX(), b.getScreenY());

                g2.setColor(Color.BLACK);
                g2.setStroke(new BasicStroke(3));
                int zoom = Gridlines.getZoom()/2;
                int offset = zoom/2;

                //Draw a small black circle where each line segment meets.
                for(int i=0; i<markerList.size(); i++) {
                    Marker m = markerList.get(i);
                    g2.drawOval(m.getScreenX() - offset, m.getScreenY() - offset, zoom, zoom);
                }

                //If a Marker has been selected, draw a circle around it.
                if(markerIsSelected) {
                    g2.setColor(Color.magenta);
                    g2.drawOval(selectedMarker.getScreenX() - offset, selectedMarker.getScreenY() - offset, zoom, zoom);
                }
            }
        }
    }
}
    
