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
    public boolean isVisible;


    public LineSet() {
        lineList = new LinkedList<Line>();
        lineIsSelected = false;
        isVisible = true;
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
    
}
