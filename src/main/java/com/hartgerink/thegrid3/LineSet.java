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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.Point;
import java.util.Date;


/**
 *
 * @author kevinhartgerink
 */
public class LineSet {
    private List<Line> lineList;
    
    private boolean lineIsSelected;
    
    
    private Line selectedLine;
    private Line workingLine;
    
    
    public boolean isVisible;


    public LineSet() {
        lineList = new LinkedList<Line>();
        lineIsSelected = false;
        isVisible = true;
        workingLine = new Line();
    }

    public void click(int screenX, int screenY) {
        if(!workingLine.pointA.isSet && !workingLine.pointB.isSet) {
            workingLine.pointA.setFromScreen(screenX, screenY);
        }
        else if(workingLine.pointA.isSet && !workingLine.pointB.isSet) {
            workingLine.pointB.setFromScreen(screenX, screenY);
            lineList.add(workingLine);
            workingLine = new Line();
        }
        else {
            //Do Nothing.
        }
    }


    public void add(Line L) {
        lineList.add(L);
    }
    
    public void remove(Line L) {
        lineList.remove(L);
    }
    
    public void removeFirst() {
        if (lineList.size() > 0) {
            lineList.remove(0);
        }
    }
    
    public void removeLast() {
        if (lineList.size() > 0) {
            lineList.remove(lineList.size() - 1);
        }
    }

    public void clear() {
        lineList.clear();
    }
    
    public void draw(Graphics g) {
        //Setup graphics settings for drawing.
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //g2.setStroke(new BasicStroke(3));
        //g2.setColor(Color.BLACK);
        
        
        for(int i=0; i<lineList.size(); i++) {
            lineList.get(i).draw(g);
        }
        
        
    }
    
}
