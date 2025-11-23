package devdojo.apendendo.java.javacore.introducaometodos.test;

import devdojo.apendendo.java.javacore.introducaometodos.dominio.Funcionario;

public class FuncionaroTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome="Rafael";
        funcionario.idade=23;
        funcionario.salarios=new double[]{1200, 2500, 3050};
        funcionario.imprimir();
        funcionario.mediaSalarios();
    }
}
