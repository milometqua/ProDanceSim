/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Admin
 */
public class Stage extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public Stage() {
        initComponents();
        setBackground(Color.BLACK);
    }

   @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 80, 430);
        g.fillRect(720, 0, 80, 430);
        int cellSize = 20; // Kích thước của mỗi ô lưới
        int rows = getHeight() / cellSize;
        int cols = getWidth() / cellSize;

        g.setColor(Color.DARK_GRAY);

        // Vẽ các đường ngang
        for (int i = 0; i < rows + 1; i++) {
            g.drawLine(0, i * cellSize, getWidth(), i * cellSize);
        }

        // Vẽ các đường dọc
        for (int i = 0; i < cols + 1; i++) {
            g.drawLine(i * cellSize, 0, i * cellSize, getHeight());
        }
        g2D.setColor(Color.red);
        g2D.setStroke(new BasicStroke(2));
        g2D.drawLine(400, 165, 400, 185);
        g2D.drawLine(390, 175, 410, 175);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
