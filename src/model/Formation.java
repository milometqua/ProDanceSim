package model;

import java.awt.Label;
import java.awt.Panel;
import java.util.ArrayList;

public class Formation {
    private ArrayList<Label> dancers;

    public Formation() {
        this.dancers = new ArrayList<Label>();
    }
    public Formation(ArrayList<Label> dancers) {
        this.dancers = dancers;
    }

    public ArrayList<Label> getDancers() {
        return dancers;
    }

    public void setDancers(ArrayList<Label> dancers) {
        this.dancers = dancers;
    }

    @Override
    public String toString() {
        return "Formation{" +
                "dancers=" + dancers +
                '}';
    }
}
