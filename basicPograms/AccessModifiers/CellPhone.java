package basicPograms.AccessModifiers;

public class CellPhone {
    void ring(){
        System.out.println("Ringing....");
    }

    void vibrate(){
        System.out.println("Vibrating....");
    }

    public static void main(String[] args) {
        CellPhone cell = new CellPhone();
        cell.ring();
        cell.vibrate();
    }
}
