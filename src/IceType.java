package src;

public class IceType extends Pokemon{
    private int accuracy;
    private String move;
    public IceType(String name, int level, String attack, int accuracy, String move) {
        super(name, level, attack);
        super.setType("Ice");
        this.accuracy = accuracy;
        this.move= move;
    }

    @Override
    public void returns() {
        System.out.println(getName() + " returns to his master ball");
    }

    public void moveAndAccuracy(){
        this.accuracy+= 10;
        System.out.println(getName() + " uses the move " + getMove() + " and his accuracy increased to " + getAccuracy() );
    }

    public void remainLevel(){
        System.out.println(getName() + " remains level " + getLevel());
    }


    public int getAccuracy(){
        return accuracy;
    }

    public void setAccuracy (int accuracy){
        this.accuracy = accuracy;
    }

    public String getMove(){
        return move;
    }

    public void setMove (String move){
        this.move = move;
    }

}
