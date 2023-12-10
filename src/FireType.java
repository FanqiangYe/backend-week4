package src;

public class FireType extends Pokemon {
    private String sound;
    private String food;

    public FireType(String name, int level, String attack, String sound, String food) {
        super(name, level, attack);
        super.setType("fire");
        this.food = food;
        this.sound = sound;
    }

    public void attack(){
        System.out.println(getName() + " uses " + getAttack());
    }

    public void foodAndSound(){
        System.out.println(getName() + " eats an " + getFood() + ". He is happy and says " + getSound());
    }
    public void returns(){
        System.out.println(getName()+ " doesn't want to return to his ball yet, something is happening");
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
