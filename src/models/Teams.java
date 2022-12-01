package models;
import java.util.ArrayList;

public class Teams {
    String Name;
    String JerseyColor;
    String FifaPosition;
    String group;
    ArrayList<Players> player;

    public Teams(String name, String jerseyColor, String fifaPosition, String group, ArrayList<Players> player) {
        Name = name;
        JerseyColor = jerseyColor;
        FifaPosition = fifaPosition;
        this.group = group;
        this.player = player;
    }

    public String getName() {
        return Name;
    }

    public String getJerseyColor() {
        return JerseyColor;
    }

    public String getFifaPosition() {
        return FifaPosition;
    }

    public String getGroup() {
        return group;
    }

    public ArrayList<Players> getPlayer() {
        return player;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setJerseyColor(String jerseyColor) {
        JerseyColor = jerseyColor;
    }

    public void setFifaPosition(String fifaPosition) {
        FifaPosition = fifaPosition;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setPlayer(ArrayList<Players> player) {
        this.player = player;
    }
}

