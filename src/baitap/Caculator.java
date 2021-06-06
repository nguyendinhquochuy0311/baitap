package baitap;

public class Caculator {

    private int aa;

    private static int bb;

    public static void p(){
        System.out.println("Ok man");
    }


    public static int getBb() {
        return bb;
    }

    public static void setBb(int bb) {
        Caculator.bb = bb;
    }

    public Caculator() {
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }
}
