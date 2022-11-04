package hilo.cont;

public class Main {
    public static void main(String[] args) {
        Proceso1 p1 = new Proceso1();
        Proceso2 p2 = new Proceso2();
        Proceso1 p3 = new Proceso1();
        Proceso2 p4 = new Proceso2();

//      Proceso1 p5 = new Proceso1();
//      Proceso2 p6 = new Proceso2();

        p1.start();
        p2.start();
        p3.start();
        p4.start();

//      p5.start();
//      p6.start();
    }
}
