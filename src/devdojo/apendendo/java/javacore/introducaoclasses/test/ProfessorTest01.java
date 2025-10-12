package devdojo.apendendo.java.javacore.introducaoclasses.test;

import devdojo.apendendo.java.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Renato Cariri";
        professor.idade = 48;
        professor.sexo = 'M';
        System.out.println("Nome: "+professor.nome+" Idade: "+professor.idade+" Sexo: "+professor.sexo);
    }
}
