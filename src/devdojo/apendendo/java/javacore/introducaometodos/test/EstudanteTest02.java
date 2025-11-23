package devdojo.apendendo.java.javacore.introducaometodos.test;

import devdojo.apendendo.java.javacore.introducaometodos.dominio.Estudante;
import devdojo.apendendo.java.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Rafael";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Ana";
        estudante02.idade = 43;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
