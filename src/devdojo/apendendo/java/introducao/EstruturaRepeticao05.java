package devdojo.apendendo.java.introducao;

public class EstruturaRepeticao05 {
    public static void main(String[] args) {
        double valorCarro = 40000;
        int parcela;
        for(parcela = (int)valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }
    }
}
