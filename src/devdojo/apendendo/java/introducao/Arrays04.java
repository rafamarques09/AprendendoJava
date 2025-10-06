package devdojo.apendendo.java.introducao;

public class Arrays04 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int [] numeros2 = new int[]{5,4,3,2,1};
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        for(int num: numeros2){
            System.out.println(num);
        }
    }
}
