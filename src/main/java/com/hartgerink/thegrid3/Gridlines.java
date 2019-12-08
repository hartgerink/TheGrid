/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hartgerink.thegrid3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

/**
 *
 * @author kevinhartgerink
 */
public class Gridlines {

    private static final Color DEFAULT_BACKGROUND_COLOR = Color.white;
    private static final Color DEFAULT_GRIDLINES_COLOR = Color.LIGHT_GRAY;
    
    private static int zoom, cursorX, cursorY;
    
    private static int width, height;
    private static Color backgroundColor, gridlinesColor;
    private static boolean backgroundVisible, gridlinesVisible;
    private static int lineWidth;
    
    public Gridlines() {
        width = 100;
        height = 100;
        zoom = 20;
        cursorX = cursorY = 0;
        
        backgroundColor = DEFAULT_BACKGROUND_COLOR;
        gridlinesColor = DEFAULT_GRIDLINES_COLOR;
        backgroundVisible = true;
        gridlinesVisible = true;
        lineWidth = 0;
    }
    
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(gridlinesColor);
        g2.setStroke(new BasicStroke(lineWidth));
        
        //Fill in the background color.
        if(backgroundVisible) {
            g2.setColor(backgroundColor);
            g2.fillRect(0, 0, width, height);
        }
        
        //If zoom level at 4 or higher, draw gridlines.
        if(gridlinesVisible && (zoom >=4)) {
            
            g2.setColor(gridlinesColor);
            int rows = height / zoom;
            int columns = width / zoom;

            //Draw rows
            for(int i=0; i<height; i+=zoom) {
                g2.drawLine(0,i, width,i);
            }

            //Draw columns
            for(int i=0; i<width; i+=zoom) {
                g2.drawLine(i, 0, i, height);
            }
        }
    }
    
    public static void setBackgroundColor(Color c) {
        backgroundColor = c;
    }
    public static Color getBackgroundColor() {
        return backgroundColor;
    }
    public static void setGridlinesColor(Color c) {
        gridlinesColor = c;
    }
    public static Color getGridlinesColor() {
        return gridlinesColor;
    }
    public static void setZoom(int i) {
        zoom = i;
    }
    public static int getZoom() {
        return zoom;
    }
    
    public static int screenToGridX (int screenX) {
        int gridX = screenX / zoom;
        gridX += cursorX;
        return gridX;
    }
    public static int screenToGridY (int screenY) {
        int gridY = screenY / zoom;
        gridY += cursorY;
        return gridY;
    }
    public static int gridToScreenX (int gridX) {
        int screenX = gridX - cursorX;
        screenX *= zoom;
        screenX += zoom/2;
        return screenX ;
    }
    public static int gridToScreenY (int gridY) {
        int screenY = gridY - cursorY;
        screenY *= zoom;
        screenY += zoom/2;
        return screenY;
    }

    
    
    
    
    
    
    
    public static void setWidth(int i) {
        width = i;
    }
    public static void setHeight(int i) {
        height = i;
    }
    public static void setBackgroundVisibility(boolean b) {
        backgroundVisible = b;
    }
    public static void setGridlinesVisibility(boolean b) {
        gridlinesVisible = b;
    }
    public static void setLineWidth(int i) {
        lineWidth = i;
    }
}