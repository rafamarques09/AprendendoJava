package devdojo.apendendo.java.introducao;

public class EstruturaRepeticao04Exercicio {
    public static void main(String[] args) {
        double valorCarro = 40000;
        int parcela;
        for(parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela: "+parcela+ " R$ "+valorParcela);
            }else{
                break;
            }
        }
    }
}
