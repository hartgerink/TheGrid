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



/**
 *
 * @author kevinhartgerink
 */
public class PolymorphIO {
    
    private Polymorph polymorph;    
    
    
    public static void polymorphToXML (Polymorph p) {
        
        String stringXML;
        
        stringXML  = "<POLYMORPH>\r\n";
        stringXML += "<NAME>" + p.getName() + "</NAME>\r\n";
        stringXML += "<COLOR>" + p.getColor().getRGB() + "<COLOR>\r\n";
        stringXML += "<STROKEWIDTH>" + p.getStrokeWidth() + "</STROKEWIDTH>\r\n";
        
        for(int i=0; i<p.getMarkerList().size(); i++) {
            stringXML += "<POINT><X>" + p.getMarkerList().get(i).getGridX() + "</X><Y>" + p.getMarkerList().get(i).getGridY() + "</Y></POINT>\r\n";
        }
        
        stringXML += "</POLYMORPH>";
        
        System.out.println(stringXML);
    }
}
