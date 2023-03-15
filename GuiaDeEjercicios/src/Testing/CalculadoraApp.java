package Testing;

public class CalculadoraApp {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        double resultado;

        /* Primer punto de la guia */
        resultado = cal.multiplicar(80, 3);
        System.out.println(resultado);

        /* Segundo punto de la guia */
        double resultadoSuma = cal.sumar(150, 180);
        resultado = cal.dividir(resultadoSuma, 3);
        System.out.println(resultado);

        /* Tercer punto de la guia */
        double resultadoResta = cal.restar(90, 50);
        resultado = cal.multiplicar(resultadoResta, 15);
        System.out.println(resultado);

        /* Cuarto punto de la guia */
        resultadoSuma = cal.sumar(70, 40);
        resultado = cal.multiplicar(resultadoSuma, 25);
        System.out.println(resultado);

    }
}
