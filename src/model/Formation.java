package model;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Formation {
    private ArrayList<JLabel> dancers;

    public Formation() {
        this.dancers = new ArrayList<JLabel>();
    }
    public Formation(ArrayList<JLabel> dancers) {
        this.dancers = dancers;
    }

    public ArrayList<JLabel> getDancers() {
        return dancers;
    }
    public JLabel getDancers(int n) {
        return this.dancers.get(n);
    }

    public void setDancers(ArrayList<JLabel> dancers) {
        this.dancers = dancers;
    }
    public void AddDancer(JLabel dancer){
        this.dancers.add(dancer);
    }
    public void DeleteDancer(JLabel dancer){
        this.dancers.remove(dancer);
    }

    public int number(){
        return this.dancers.size();
    }
    public void showFormation() {
        for (JLabel lb : dancers) {
            lb.setVisible(true);
        }
    }
    public void hideFormation() {
        for (JLabel lb : dancers) {
            lb.setVisible(false);
        }
    }
    public void saveFormation(){
        for (JLabel lb : dancers) {
            lb.setLocation(lb.getX(), lb.getY());
        }
    }
    @Override
    public String toString() {
        return "Formation{" +
                "dancers=" + dancers +
                '}';
    }

    public void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
