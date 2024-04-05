package model;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Dancer {
    private Panel dancerPanel;
    private Button buttonDancer;
    private Label labelDancer;
    private int pressOffsetX;
    private int pressOffsetY;

    public Dancer() {
        this.labelDancer = null;
        panelMove(this.dancerPanel);
        add(this.buttonDancer, this.labelDancer, this.dancerPanel);
    }

    public Panel getDancerPanel() {
        return dancerPanel;
    }

    public void setDancerPanel(Panel dancerPanel) {
        this.dancerPanel = dancerPanel;
    }

    public Button getButtonDancer() {
        return buttonDancer;
    }

    public void setButtonDancer(Button buttonDancer) {
        this.buttonDancer = buttonDancer;
    }

    public Label getLabelDancer() {
        return labelDancer;
    }

    public void setLabelDancer(Label labelDancer) {
        this.labelDancer = labelDancer;
    }

    public void add(Button buttonDancer, Label labelDancer, Panel dancerPanel){
        dancerPanel.add(labelDancer);
        dancerPanel.add(buttonDancer);
    }

    public void panelMove(Panel dancerPanel){

        dancerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                pressOffsetX = e.getX();
                pressOffsetY = e.getY();
            }
        });

        dancerPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int newX = dancerPanel.getX() + e.getX() - pressOffsetX;
                int newY = dancerPanel.getY() + e.getY() - pressOffsetY;

                dancerPanel.setLocation(newX, newY);
            }
        });

    }
}
