package model;

import actors.Character;
import enums.TeamColor;

import java.util.ArrayList;

public final class Castle {

    private int resources;
    private TeamColor color;
    private ArrayList<Character> wasBought;

    public Castle(TeamColor color) {
        setResources(2);
        setColor(color);
        setWasBought(new ArrayList<>());
    }

    public void addResources(int amount) {
        setResources(getResources() + amount);
    }

    public int getResources() {
        return resources;
    }

    private void setResources(int resources) {
        this.resources = resources;
    }

    public TeamColor getColor() {
        return color;
    }

    private void setColor(TeamColor color) {
        this.color = color;
    }

    public void buildUnit(Character character) {
        addResources(-character.getCost());
        wasBought.add(character);
    }

    public ArrayList<Character> getWasBought() {
        return wasBought;
    }

    private void setWasBought(ArrayList<Character> wasBought) {
        this.wasBought = wasBought;
    }
}
