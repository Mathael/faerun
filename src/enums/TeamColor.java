package enums;

public enum TeamColor {
    RED("Rouge"),
    BLUE("Bleu");

    private String name;

    TeamColor(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
