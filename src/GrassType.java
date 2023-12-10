package src;

public class GrassType extends Pokemon {
    private String sound;
    private String food;

    public GrassType(String name, int level, String attack, String sound, String food) {
        super(name, level, attack);
        super.setType("grass");
        this.food = food;
        this.sound = sound;
    }

    /* Waarom gebruik je bijvoorbeeld "getFood" in plaats van gewoon food? */

public void attackAndFood(){
        System.out.println(getName() + " used" + getAttack() + " and eats an " + getFood() + " after" );
    }

    public void sound(){
        System.out.println(getName()+ " is happy and says " + getSound() + "!");
    }

    public void returns(){
        System.out.println(getName()+ " returns to his pokeball");
    }


    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setFood(String food) {
        this.food = food;

    }
}
