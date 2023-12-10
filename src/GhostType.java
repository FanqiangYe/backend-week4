package src;

public class GhostType extends Pokemon{

    private int xp;
    private int weight;

    private String food;


    public GhostType(String name, int level, String attack, int xp, int weight, String food) {
        super(name, level, attack);
        super.setType("ghost");
        this.xp = xp;
        this.weight = weight;
        this.food = food;
    }



    @Override
    public void returns() {
        System.out.println(getName()+" returns to his ultra ball");
    }

    public void attack(){
        System.out.println(getName()+" used " + getAttack() + ", this attack is super effective");
    }

    public void xp(){
        System.out.println("After the fight " + getName() + " has gained " + getXp() + " experience.");
    }

    public void food(){
        System.out.println("An " + getFood() + " has been awarded to " + getName());
    }

    public void weightIncrease(){
        int originalWeight = getWeight();
        this.weight+= 15;
        System.out.println(getName() + " his weight increased from " + originalWeight + " to " + getWeight());
    }

    public int getXp(){
        return xp;
    }

    public int getWeight(){
        return weight;
    }


    public void setXp (int xp){
        this.xp = xp;
    }

    public void setWeight (int weight){
        this.weight = weight;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
