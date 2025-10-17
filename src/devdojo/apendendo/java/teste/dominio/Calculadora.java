package devdojo.apendendo.java.teste.dominio;

public class Calculadora {
    public void somaDoisNumeros(int num1, int num2){
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
    public void subtraiDoisNumeros(int num1, int num2){
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1+" x "+num2+" = "+(num1*num2));
    }
    public void divideDoisNumeros(int num1, int num2){
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
    }
}
