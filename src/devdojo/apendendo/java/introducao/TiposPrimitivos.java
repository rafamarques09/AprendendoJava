package devdojo.apendendo.java.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 16;
        long numeroGrande = 10000000000L;
        double salarioDouble = 2000;
        float salarioFLoat = 2500;
        byte idadeByte = 10;
        short idadeShort = 20;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';
        String nome = "Rafael";

        System.out.println(idade); // Imprimi apenas o valor atribuído a variavel
        System.out.println("idade"); // Imprimi apenas o texto
        System.out.println("A idade é "+idade+" anos"); // // Imprimi o texto e o valor atribuído
        System.out.println(nome);
    }
}
