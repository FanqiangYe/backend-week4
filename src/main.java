package src;

public class main {
    public static void main(String[] args) {
GrassType bulbasaur = new GrassType("Bulbasaur", 14, "Razor Leaf", "Bulba bulba", "Oran berry");
GhostType gengar = new GhostType("Gengar", 45, "shadow ball", 1400, 80, "razz bery");
IceType articuno = new IceType("articuno", 90, "ice beam", 80, "gravity");
FireType charmeleon = new FireType("charmeleon", 36, "ember", "charmeleon char", "nanab berry");
FireFlying charizard = new FireFlying("charizard", 36, "wing attack", "charizarddd", "nanab berry", 250);

        System.out.println("I choose you " + bulbasaur.getName() + "!");
        bulbasaur.attackAndFood();
        bulbasaur.sound();
        bulbasaur.returns();

        System.out.println();

        System.out.println("It's your turn now " + gengar.getName() );
        gengar.attack();
        gengar.food();
        gengar.weightIncrease();
        gengar.xp();
        gengar.levelUp();
        gengar.returns();

        System.out.println();

        System.out.println("Go " + articuno.getName());
        articuno.moveAndAccuracy();
        System.out.println("This move made all " + articuno.getName() + " his " + articuno.getType() + " moves gain more accuracy");
        articuno.remainLevel();
        articuno.returns();

        System.out.println();

        System.out.println("Come out " + charmeleon.getName());
        charmeleon.attack();
        charmeleon.foodAndSound();
        charmeleon.returns();
        System.out.println(charmeleon.getName() + " is evolving!");

        System.out.println();

        System.out.println(charmeleon.getName() + " has evolved to " + charizard.getName());
        charizard.heightIncrease();
        charizard.returns();

    }
}
