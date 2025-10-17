package devdojo.apendendo.java.javacore.introducaometodos.test;

import devdojo.apendendo.java.javacore.introducaometodos.dominio.Estudante;
import devdojo.apendendo.java.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Rafael";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Ana";
        estudante02.idade = 42;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
    }
}
