package hilo.p4;

public class Proceso1 extends Thread{
    int contador;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            contador+=i;
            //System.out.println(contador);
        }
        System.out.println(contador);
    }
}
