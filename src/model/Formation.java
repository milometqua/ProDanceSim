package model;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Formation {
    private ArrayList<Point> dancers;

    public Formation() {
        this.dancers = new ArrayList<Point>();
    }
    public Formation(ArrayList<Point> dancers) {
        this.dancers = dancers;
    }

    public ArrayList<Point> getDancers() {
        return dancers;
    }

    public void setDancers(ArrayList<Point> dancers) {
        this.dancers = dancers;
    }
    public void AddDancer(Point dancer){
        this.dancers.add(dancer);
    }
    public int size(){
        return dancers.size();
    }
    public Point getPoint(int n){
        return dancers.get(n);
    }
    public void updatePoint(int n, Point p){
        this.dancers.set(0, p);
    }

    public void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
