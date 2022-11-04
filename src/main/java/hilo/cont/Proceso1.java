package hilo.cont;

public class Proceso1 extends Thread{
    int contador;
    public static int call = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            contador+=i;
            //System.out.println(contador);
        }
        System.out.println(contador);
        call++;
        System.out.println(call+" procesos "+this.getClass().toString());
    }
}
