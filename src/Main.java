/**
 * Created by NACHZEHER on 28/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        /**

        Caja c = new Caja(20,25,15, Caja.unidad.CM);

        c.etiqueta = "Carlos perez / irlanda 12";
        c.getVolumen();

        System.out.println(c);
        System.out.println(c.getVolumen());
         */

        CajaCarton c = new CajaCarton(20,50,60);
        c.etiqueta = 156;

        System.out.println("Cliente: " + c.etiqueta + " Volumen: " + c.getVolumen());
        System.out.println(c);
    }
}
