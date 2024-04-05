package model;

import java.util.ArrayList;

public class Formation {
    private ArrayList<Dancer> dancers;

    public Formation() {
        this.dancers = new ArrayList<Dancer>();
    }
    public Formation(ArrayList<Dancer> dancers) {
        this.dancers = dancers;
    }

    public ArrayList<Dancer> getDancers() {
        return dancers;
    }

    public void setDancers(ArrayList<Dancer> dancers) {
        this.dancers = dancers;
    }

    @Override
    public String toString() {
        return "Formation{" +
                "dancers=" + dancers +
                '}';
    }
}
