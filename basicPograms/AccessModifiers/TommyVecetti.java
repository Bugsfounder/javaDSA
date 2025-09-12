package basicPograms.AccessModifiers;

public class TommyVecetti {
    void hitting(){
        System.out.println("Hitting...");
    }

    void running(){
        System.out.println("running...");
    }

    void firing(){
        System.out.println("firing...");
    }

    public static void main(String[] args){
        TommyVecetti tom = new TommyVecetti();

        tom.hitting();
        tom.firing();
        tom.running();
    }
}
