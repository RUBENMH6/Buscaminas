/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.minesweeper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.border.*;

 

public class UpperPanel extends javax.swing.JPanel implements TimerInterface {

    private Timer timer;
    private int seconds;
    private InitGamer initGamer;
    
    
    
    public UpperPanel() {
        initComponents();
        myInit();
    }
    public void setInitGamer(InitGamer initGamer) {
        this.initGamer = initGamer;
    }
    private void myInit() {
        buttonSmile.setFocusable(false);
        Border border = labelTime.getBorder();
        Border margin = new EmptyBorder(10,5,5,5);
        labelTime.setBorder(new CompoundBorder(border, margin)); 
        labelRemaining.setBorder(new CompoundBorder(board, margin));
        seconds = 0;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tick();
            }
        });
        
    }
    public void startTimer() {
        if (!timer.isRunning()) {
            timer.start();
        }
    }
    
    public void updateTimerLabel (int min, int sec) {
        String timeStr = String.format("%02d:%02d", min, sec);
        labelTime.setText(timeStr);
    }
    private void tick() {
        seconds++;
        int min = seconds / 60;
        int sec = seconds % 60; 
        updateTimerLabel(min,sec);
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelLeft = new javax.swing.JPanel();
        labelBomb = new javax.swing.JLabel();
        panelRight = new javax.swing.JPanel();
        labelTime = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        buttonSmile = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new java.awt.BorderLayout());

        panelLeft.setBackground(new java.awt.Color(204, 255, 204));
        panelLeft.setLayout(new java.awt.GridBagLayout());

        labelBomb.setBackground(new java.awt.Color(0, 0, 0));
        labelBomb.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        labelBomb.setForeground(new java.awt.Color(255, 51, 51));
        labelBomb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelBomb.setText("999");
        labelBomb.setOpaque(true);
        labelBomb.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 20, 31, 20);
        panelLeft.add(labelBomb, gridBagConstraints);

        add(panelLeft, java.awt.BorderLayout.LINE_START);

        panelRight.setBackground(new java.awt.Color(204, 255, 255));
        panelRight.setLayout(new java.awt.GridBagLayout());

        labelTime.setBackground(new java.awt.Color(0, 0, 0));
        labelTime.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        labelTime.setForeground(new java.awt.Color(255, 51, 51));
        labelTime.setText("00:00");
        labelTime.setOpaque(true);
        labelTime.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 23, 31, 31);
        panelRight.add(labelTime, gridBagConstraints);

        add(panelRight, java.awt.BorderLayout.LINE_END);

        panelCenter.setBackground(new java.awt.Color(255, 255, 204));
        panelCenter.setLayout(new java.awt.GridBagLayout());

        buttonSmile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/smiley.png"))); // NOI18N
        buttonSmile.setAlignmentX(0.5F);
        buttonSmile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSmile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSmileActionPerformed(evt);
            }
        });
        panelCenter.add(buttonSmile, new java.awt.GridBagConstraints());

        add(panelCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSmileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSmileActionPerformed
        seconds = 0;
        updateTimerLabel(0,0);
        timer.restart();
        initGamer.initGame();
    }//GEN-LAST:event_buttonSmileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSmile;
    private javax.swing.JLabel labelBomb;
    private javax.swing.JLabel labelTime;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelRight;
    // End of variables declaration//GEN-END:variables

   
}
