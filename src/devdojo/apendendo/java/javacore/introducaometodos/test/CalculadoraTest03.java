package devdojo.apendendo.java.javacore.introducaometodos.test;

import devdojo.apendendo.java.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
    }
}
