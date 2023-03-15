package Testing;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int numIngresado;

        do {
            System.out.println("Ingrese un número");
            numIngresado = lectura.nextInt();
        } while (numIngresado < 0 || numIngresado == 0);

        System.out.println("Número ingresado: " + numIngresado);

    }

}
