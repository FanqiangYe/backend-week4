package src;

public class FireFlying extends FireType{
    private int height;


    public FireFlying(String name, int level, String attack, String sound, String food, int height) {
        super(name, level, attack, sound, food);
        this.height = height;
    }

    public void heightIncrease(){
        System.out.println(getName() + " his height has grown to " + getHeight());
    }

    public void returns(){
        System.out.println(getName() + " returns to his great ball");
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }



}
