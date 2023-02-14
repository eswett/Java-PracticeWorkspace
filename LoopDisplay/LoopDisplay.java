package LoopDisplay;

public class LoopDisplay {
    public static void main(String [] args) {
        forwards();
        backwards();
        onlyEvenForwards();
    }

    public static void forwards() {
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void backwards() {
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void onlyEvenForwards() {
        int i = 1;
        while(i <= 20) {
            if(i % 2 == 0) {
            System.out.println(i);
            }
            i++;
        }
    }
}
