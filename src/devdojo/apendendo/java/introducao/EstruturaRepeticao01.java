package devdojo.apendendo.java.introducao;

public class EstruturaRepeticao01 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10){
            System.out.println(contador);
            contador++;
        }
        contador = 0;
        do{
            System.out.println("dentro do do-while"+ ++contador);
        }while(contador<10);

        for(contador=0;contador<10;contador++){
            System.out.println("For"+ contador);
        }
    }

}
