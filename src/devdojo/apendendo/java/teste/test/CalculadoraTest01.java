package devdojo.apendendo.java.teste.test;

import devdojo.apendendo.java.teste.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(3,4);
        calculadora.subtraiDoisNumeros(14,10);
        calculadora.multiplicaDoisNumeros(9,6);
        calculadora.divideDoisNumeros(12,4);
    }
}
