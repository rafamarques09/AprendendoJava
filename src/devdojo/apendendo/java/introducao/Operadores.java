package devdojo.apendendo.java.introducao;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int num01 = 4;
        int num02 = 2;
        System.out.println(num01/num02);
        // %
        int resto = 20%2;
        System.out.println(resto);
        // <> <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);
        // && || !
        int idade = 28;
        double salario = 3800;
        boolean isDentroDaLeiMaiorTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorTrinta "+isDentroDaLeiMaiorTrinta);
        System.out.println("isDentroDaLeiMenorTrinta "+isDentroDaLeiMenorTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalPoupanca = 4000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalPoupanca >= valorPlaystation;
        System.out.println("isPlaystationCompravel "+isPlaystationCompravel);
        // = += -= *= /= %=
        double bonus = 1300; //1300
        bonus += 1000; // 2300
        bonus -= 500; // 1800
        bonus *= 2; // 3600
        bonus /= 4; // 900
        bonus %= 2; // 0
        System.out.println(bonus);
        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println(contador);
    }
}
