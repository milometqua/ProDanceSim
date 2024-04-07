package model;

import javax.swing.*;
import java.util.ArrayList;

public class ControllerProject {
    private String title;
    private int numberDancer;
    private ArrayList<Formation> listFormation;
    private ArrayList<JButton> btnFormation;

    public ControllerProject(String title, int numberDancer, ArrayList<Formation> listFormation, ArrayList<JButton> btnFormation) {
        this.title = title;
        this.numberDancer = numberDancer;
        this.listFormation = listFormation;
        this.btnFormation = btnFormation;
    }

    public ArrayList<JButton> getBtnFormation() {
        return btnFormation;
    }

    public void setBtnFormation(ArrayList<JButton> btnFormation) {
        this.btnFormation = btnFormation;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberDancer() {
        return numberDancer;
    }

    public void setNumberDancer(int numberDancer) {
        this.numberDancer = numberDancer;
    }

    public ArrayList<Formation> getListFormation() {
        return listFormation;
    }

    public void setListFormation(ArrayList<Formation> listFormation) {
        this.listFormation = listFormation;
    }
    public void AddFormation(Formation formation){
        this.listFormation.add(formation);
    }
    public void DeleteFormation(Formation formation){
        this.listFormation.remove(formation);
    }
    public void UpdateFormation(Formation formation){
        this.listFormation.remove(formation);
        this.listFormation.add(formation);
    }
}
