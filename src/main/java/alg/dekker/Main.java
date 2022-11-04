
package alg.dekker;
//Clase principal

public class Main {
    //metodo principal.

    public static void main(String[] args) {
        //se declaran variables para validar si el proceso esta activo.

        boolean p1_en = true;
        boolean p2_en = true;
        //creamos los objetos de la clase proceso.

        Proceso1 hilo1 = new Proceso1(p1_en, p2_en);
        Proceso2 hilo2 = new Proceso2(p1_en, p2_en);
        //llamamos la funcion start del objeto.

        hilo1.start();
        hilo2.start();
    }
}