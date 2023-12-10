package src;

import java.util.Objects;

public abstract class Pokemon {
    private String name;
    private String attack;
    private String type;
    private int level;

    public Pokemon(String name, int level, String attack) {
        this.name = name;
        this.level = level;
        this.attack = attack;
    }

    public abstract void returns();

    public void levelUp(){
        this.level++;
        System.out.println(name + " grew to level " + level);
    }


    public String getName() {
        return name;
    }

    public String getAttack() {
        return attack;
    }

    public int getLevel() {
        return level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}