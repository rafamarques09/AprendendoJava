package devdojo.apendendo.java.introducao;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int [3][3];
        for(int i =0; i <dias.length; i++){
            for(int j = 0; j <dias[0].length;j++){
                System.out.println(dias[i][j]);
            }
        }
    }
}
