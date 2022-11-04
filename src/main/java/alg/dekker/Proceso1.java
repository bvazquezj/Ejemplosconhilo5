package alg.dekker;
//clase Proceso1 que hereda de la clase thread
public class Proceso1 extends Thread{
    //Atributos declaramos la el atributo que indica si esta o no activo
    boolean p1_en;
    boolean p2_en;
    //le añadimos un turno;
    int turno = 1;
    //declaramos un constructor para asignarle el valor a los atributos
    Proceso1(boolean p1_en, boolean p2_en){
        this.p1_en = p1_en;
        this.p2_en = p2_en;
    }
    //sobreescribimos el metodo run de la clase thread

    @Override
    public void run() {
        p1_en = true;//activa el proceso 1
        while (p2_en){//mientras el proceso 2 este activo...
            if (turno == 1){//si el turno es 1
                p1_en = false;//desactiva el proceso 1
                while (turno == 1){//mientras el turno sea 1
                    System.out.println("\n Primera entrada");//puede entrar el proceso 1
                    p1_en=true;//activa el proceso 1
                    System.out.println("1 Entrada estado critico \n");//entra al estado critico
                    System.out.println("primera entrada finalizada \n");//finaliza el proceso
                    turno = 1;//asigna el valor 1 al turno
                    if (turno == 1);//VALIDACION solo de sintaxis del IDE
                    p1_en = false;//desactiva el proceso 1
                    turno = 0;//asigna el proceso a 0
                }
            }
        }
    }
}
