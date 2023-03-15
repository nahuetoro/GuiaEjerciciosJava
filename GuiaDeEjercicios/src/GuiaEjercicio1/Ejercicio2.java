package GuiaEjercicio1;

public class Ejercicio2 {

    public static void main(String[] args) {

        float ingMenTot = 499000;
        int vehiculos = 2;
        int antVehiculo = 5;
        int inmueble = 2;
        boolean capEcoPlena = true;

        if ((ingMenTot >= 489083) && (vehiculos >= 3 && antVehiculo < 5) && (inmueble >= 3) && (capEcoPlena == true)) {
            System.out.println("Pertenece al segmento de ingresos altos");
        } else {
            System.out.println("No posee ingresos altos para ingresar en la proxima categoria");
        }

    }

}
