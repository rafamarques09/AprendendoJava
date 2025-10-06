package devdojo.apendendo.java.introducao;

public class EstruturaCondicionais03 {
    public static void main(String[] args) {
        double salario = 5000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Não vou doar";
        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
