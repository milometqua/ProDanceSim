package model;

import java.util.ArrayList;

public class Menu {
    private ArrayList<ControllerProject> controllerProjects;
    public Menu(){
        this.controllerProjects = new ArrayList<ControllerProject>();
    }

    public Menu(ArrayList<ControllerProject> controllerProjects) {
        this.controllerProjects = controllerProjects;
    }

    public void AddProject(ControllerProject controllerProject){
        this.controllerProjects.add(controllerProject);
    }
    public void DeleteProject(ControllerProject controllerProject){
        this.controllerProjects.remove(controllerProject);
    }
    public void UpdateProject(ControllerProject controllerProject){
        this.controllerProjects.remove(controllerProject);
        this.controllerProjects.add(controllerProject);
    }
}
