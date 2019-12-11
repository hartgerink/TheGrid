/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hartgerink.thegrid3;

import java.awt.Color;


/**
 *
 * @author kevinhartgerink
 */
public class ColorChooser extends javax.swing.JPanel {
    private Color color;
    /**
     * Creates new form ColorChooser
     */
    public ColorChooser() {
        initComponents();
        
        color = Color.BLACK;
        setColor(color);
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color c) {
        int RGB = c.getRGB();
        
        if(RGB == Color.BLACK.getRGB()) {
            jRadioBlack.doClick();
        }
        else if (RGB == Color.BLUE.getRGB()) {
            jRadioBlue.doClick();
        }
        else if (RGB == Color.CYAN.getRGB()) {
            jRadioCyan.doClick();
        }
        else if (RGB == Color.DARK_GRAY.getRGB()) {
            jRadioDarkGray.doClick();
        }
        else if (RGB == Color.GRAY.getRGB()) {
            jRadioGray.doClick();
        }
        else if (RGB == Color.GREEN.getRGB()) {
            jRadioGreen.doClick();
        }
        else if (RGB == Color.LIGHT_GRAY.getRGB()) {
            jRadioLightGray.doClick();
        }
        else if (RGB == Color.MAGENTA.getRGB()) {
            jRadioMagenta.doClick();
        }
        else if (RGB == Color.ORANGE.getRGB()) {
            jRadioOrange.doClick();
        }
        else if (RGB == Color.PINK.getRGB()) {
            jRadioPink.doClick();
        }
        else if (RGB == Color.RED.getRGB()) {
            jRadioRed.doClick();
        }
        else if (RGB == Color.WHITE.getRGB()) {
            jRadioWhite.doClick();
        }
        else if (RGB == Color.YELLOW.getRGB()) {
            jRadioYellow.doClick();
        }
        else {
            jRadioBlack.doClick();
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioRed = new javax.swing.JRadioButton();
        jRadioBlue = new javax.swing.JRadioButton();
        jRadioGreen = new javax.swing.JRadioButton();
        jRadioYellow = new javax.swing.JRadioButton();
        jRadioDarkGray = new javax.swing.JRadioButton();
        jRadioGray = new javax.swing.JRadioButton();
        jRadioLightGray = new javax.swing.JRadioButton();
        jRadioWhite = new javax.swing.JRadioButton();
        jRadioBlack = new javax.swing.JRadioButton();
        jRadioPink = new javax.swing.JRadioButton();
        jRadioOrange = new javax.swing.JRadioButton();
        jRadioMagenta = new javax.swing.JRadioButton();
        jRadioCyan = new javax.swing.JRadioButton();
        jPanelColorDisplay = new javax.swing.JPanel();

        setBackground(new java.awt.Color(153, 204, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(310, 125));
        setSize(new java.awt.Dimension(310, 125));

        buttonGroup1.add(jRadioRed);
        jRadioRed.setText("Red");
        jRadioRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRedActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioBlue);
        jRadioBlue.setText("Blue");
        jRadioBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBlueActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioGreen);
        jRadioGreen.setText("Green");
        jRadioGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGreenActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioYellow);
        jRadioYellow.setText("Yellow");
        jRadioYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioYellowActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioDarkGray);
        jRadioDarkGray.setText("Dark Gray");
        jRadioDarkGray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioDarkGrayActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioGray);
        jRadioGray.setText("Gray");
        jRadioGray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGrayActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioLightGray);
        jRadioLightGray.setText("Light Gray");
        jRadioLightGray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioLightGrayActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioWhite);
        jRadioWhite.setText("White");
        jRadioWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioWhiteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioBlack);
        jRadioBlack.setText("Black");
        jRadioBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBlackActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioPink);
        jRadioPink.setText("Pink");
        jRadioPink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPinkActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioOrange);
        jRadioOrange.setText("Orange");
        jRadioOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioOrangeActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioMagenta);
        jRadioMagenta.setText("Magenta");
        jRadioMagenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMagentaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioCyan);
        jRadioCyan.setText("Cyan");
        jRadioCyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCyanActionPerformed(evt);
            }
        });

        jPanelColorDisplay.setBackground(java.awt.Color.black);
        jPanelColorDisplay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelColorDisplay.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanelColorDisplayLayout = new javax.swing.GroupLayout(jPanelColorDisplay);
        jPanelColorDisplay.setLayout(jPanelColorDisplayLayout);
        jPanelColorDisplayLayout.setHorizontalGroup(
            jPanelColorDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
        jPanelColorDisplayLayout.setVerticalGroup(
            jPanelColorDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioYellow)
                    .addComponent(jRadioGreen)
                    .addComponent(jRadioBlue)
                    .addComponent(jRadioRed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioLightGray)
                    .addComponent(jRadioGray)
                    .addComponent(jRadioDarkGray)
                    .addComponent(jRadioBlack)
                    .addComponent(jRadioWhite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioCyan)
                    .addComponent(jRadioPink)
                    .addComponent(jRadioOrange)
                    .addComponent(jRadioMagenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelColorDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelColorDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioRed)
                            .addComponent(jRadioWhite)
                            .addComponent(jRadioPink))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioBlue)
                            .addComponent(jRadioLightGray)
                            .addComponent(jRadioOrange))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioGreen)
                            .addComponent(jRadioGray)
                            .addComponent(jRadioMagenta))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioYellow)
                            .addComponent(jRadioDarkGray)
                            .addComponent(jRadioCyan))
                        .addGap(0, 0, 0)
                        .addComponent(jRadioBlack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBlueActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.BLUE);
        color = Color.BLUE;
        signal();
    }//GEN-LAST:event_jRadioBlueActionPerformed

    private void jRadioRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRedActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.red);
        color = Color.red;
        signal();

    }//GEN-LAST:event_jRadioRedActionPerformed

    private void jRadioGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGreenActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.green);
        color = Color.green;
        signal();
    }//GEN-LAST:event_jRadioGreenActionPerformed

    private void jRadioYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioYellowActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.yellow);
        color = Color.yellow;
        signal();
    }//GEN-LAST:event_jRadioYellowActionPerformed

    private void jRadioWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioWhiteActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.white);
        color = Color.white;
        signal();
    }//GEN-LAST:event_jRadioWhiteActionPerformed

    private void jRadioLightGrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioLightGrayActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.lightGray);
        color = Color.lightGray;
        signal();
    }//GEN-LAST:event_jRadioLightGrayActionPerformed

    private void jRadioGrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGrayActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.gray);
        color = Color.gray;
        signal();
    }//GEN-LAST:event_jRadioGrayActionPerformed

    private void jRadioDarkGrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioDarkGrayActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.darkGray);
        color = Color.darkGray;
        signal();
    }//GEN-LAST:event_jRadioDarkGrayActionPerformed

    private void jRadioBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBlackActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.black);
        color = Color.black;
        signal();
    }//GEN-LAST:event_jRadioBlackActionPerformed

    private void jRadioPinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPinkActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.pink);
        color = Color.pink;
        signal();
    }//GEN-LAST:event_jRadioPinkActionPerformed

    private void jRadioOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOrangeActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.orange);
        color = Color.orange;
        signal();
    }//GEN-LAST:event_jRadioOrangeActionPerformed

    private void jRadioCyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCyanActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.cyan);
        color = Color.cyan;
        signal();
    }//GEN-LAST:event_jRadioCyanActionPerformed

    private void jRadioMagentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMagentaActionPerformed
        // TODO add your handling code here:
        jPanelColorDisplay.setBackground(Color.magenta);
        color = Color.magenta;
        signal();
    }//GEN-LAST:event_jRadioMagentaActionPerformed

    private void signal() {
        this.firePropertyChange("Change", false, true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanelColorDisplay;
    private javax.swing.JRadioButton jRadioBlack;
    private javax.swing.JRadioButton jRadioBlue;
    private javax.swing.JRadioButton jRadioCyan;
    private javax.swing.JRadioButton jRadioDarkGray;
    private javax.swing.JRadioButton jRadioGray;
    private javax.swing.JRadioButton jRadioGreen;
    private javax.swing.JRadioButton jRadioLightGray;
    private javax.swing.JRadioButton jRadioMagenta;
    private javax.swing.JRadioButton jRadioOrange;
    private javax.swing.JRadioButton jRadioPink;
    private javax.swing.JRadioButton jRadioRed;
    private javax.swing.JRadioButton jRadioWhite;
    private javax.swing.JRadioButton jRadioYellow;
    // End of variables declaration//GEN-END:variables
}
