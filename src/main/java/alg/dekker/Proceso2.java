/*EL PROCESO 2 ES EXACTAMENTE EL MISMO */

package alg.dekker;

public class Proceso2 extends Thread{
    boolean p1_en;
    boolean p2_en;
    int turno =0;
    Proceso2(boolean p1_en, boolean p2_en){
        this.p1_en = p1_en;
        this.p2_en = p2_en;
    }

    public void run() {
        p2_en = true;
        while (p1_en){
            if (turno == 0){
                p2_en = false;
                while (turno == 0){
                    System.out.println("\n segunda entrada \n");
                    p2_en=true;

                    System.out.println("2 Entrada estado critico \n");
                    System.out.println("segunda entrada finalizada \n");
                    turno = 0;
                    if (turno == 0);
                    p2_en = false;
                    turno = 1;
                }
            }
        }
    }
}

