package model;

import actors.Character;
import enums.SystemColor;

import java.util.ArrayList;

public final class Case {

    private int number;
    private ArrayList<Character> blueCharacters;
    private ArrayList<Character> redCharacters;

    public Case(int number) {
        setNumber(number);
        setBlueCharacters(new ArrayList<>());
        setRedCharacters(new ArrayList<>());
    }

    public int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Character> getBlueCharacters() {
        return blueCharacters;
    }

    private void setBlueCharacters(ArrayList<Character> blueRharacters) {
        this.blueCharacters = blueRharacters;
    }

    public ArrayList<Character> getRedCharacters() {
        return redCharacters;
    }

    private void setRedCharacters(ArrayList<Character> redCharacters) {
        this.redCharacters = redCharacters;
    }

    public boolean canLaunchBattle() {
        return !getBlueCharacters().isEmpty() && !getRedCharacters().isEmpty();
    }

    @Override
    public String toString() {
        String result = "========== " + getNumber() + " ==========\r\n";
        for (Character character : getBlueCharacters()) result += "    " + SystemColor.ANSI_CYAN.getCode() + character.toString() + SystemColor.ANSI_RESET.getCode();
        for (Character character : getRedCharacters()) result += "    " + SystemColor.ANSI_RED.getCode() + character.toString() + SystemColor.ANSI_RESET.getCode();
        return result + "\r\n";
    }
}
