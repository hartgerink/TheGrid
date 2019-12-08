/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hartgerink.thegrid3;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 *
 * @author kevinhartgerink
 */
public class TheGrid extends JPanel{
    
    private int jPanelWidth;
    private int jPanelHeight;
    
    public Polymorph polymorph;
    public PolymorphRotator polymorphRotator;






    
    

    public Gridlines gridlines;

    
    
    public TheGrid () {
        Dimension d = this.getSize();
        jPanelWidth = (int)d.getWidth();
        jPanelHeight = (int)d.getHeight();

        gridlines = new Gridlines();
        gridlines.setWidth(jPanelWidth);
        gridlines.setHeight(jPanelHeight);
        
        polymorph = new Polymorph();
        
        polymorphRotator = new PolymorphRotator(polymorph);
    }
    
    public void updatePolymorphRotator() {
        polymorphRotator.updatePolymorphRotator(polymorph);
    }
    
    
    
    
    
    @Override
    public void paintComponent(Graphics g) {
        Dimension d = this.getSize();
        jPanelWidth = (int)d.getWidth();
        jPanelHeight = (int)d.getHeight();

        gridlines.setWidth(jPanelWidth);
        gridlines.setHeight(jPanelHeight);
        gridlines.draw(g);
        
        
        polymorph.draw(g);
        
        polymorphRotator.draw(g);
        
        polymorphRotator.drawAnchor(g);
        
        
       
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
