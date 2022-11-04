package hilo.p4;

public class Main {
    public static void main(String[] args) {
        Proceso1 p1 = new Proceso1();
        Proceso2 p2 = new Proceso2();

        p1.start();
        p2.start();
    }
}
