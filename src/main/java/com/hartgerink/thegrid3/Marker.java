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

import java.awt.Point;

//Markers hold a position on TheGrid.
//Markers are positioned on a Column and a Row of The Grid; they are forced into integer positions.
public class Marker {

    private int x,y;
    public boolean isSet;
    public boolean isSelected;
    
    public Marker(int screenX, int screenY) {
        x = Gridlines.screenToGridX(screenX);
        y = Gridlines.screenToGridY(screenY);
        isSet = true;
        isSelected = false;
    }
    
    public Marker() {
        x = y = 0;
        isSet = false;
        isSelected = false;
    }
    
    //Translate the Marker's X coordinate so that it can be used for drawing graphics on the screen.
    public int getScreenX() {
        return Gridlines.gridToScreenX(x);
    }
    
    //Translate the Marker's Y coordinate so that it can be used for drawing graphics on the screen.
    public int getScreenY() {
        return Gridlines.gridToScreenY(y);
    }
    
    public int getGridX() {
        return x;
    }
    
    public int getGridY() {
        return y;
    }
    
    public boolean match (int gridX, int gridY) {
        boolean matchX = (x == gridX);
        boolean matchY = (y == gridY);
        return matchX && matchY;
    }
    
    public boolean match(Marker m) {
        boolean matchX = (x == m.getGridX());
        boolean matchY = (y == m.getGridY());
        return matchX && matchY;
    }
    
    public void set(int gridX, int gridY) {
        x = gridX;
        y = gridY;
        isSet = true;
    }
    
    public void setFromScreen(int screenX, int screenY) {
        x = Gridlines.screenToGridX(screenX);
        y = Gridlines.screenToGridY(screenY);
        isSet = true;
    }
    
    public Point getPoint() {
        Point p = new Point(x,y);
        return p;
    }
}
