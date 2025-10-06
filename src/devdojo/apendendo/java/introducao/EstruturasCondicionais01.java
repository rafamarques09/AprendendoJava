package devdojo.apendendo.java.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        //if
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }


    }
}
