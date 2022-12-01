package models;

import java.util.ArrayList;

public class Groups {
    String  name;
    ArrayList<Teams> teams;

    public Groups(String name, ArrayList<Teams> teams) {
        this.name = name;
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Teams> getTeams() {
        return teams;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeams(ArrayList<Teams> teams) {
        this.teams = teams;
    }
}
