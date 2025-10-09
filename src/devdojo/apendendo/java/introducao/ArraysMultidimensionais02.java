package devdojo.apendendo.java.introducao;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1,2};
        int [][] arrayInt = new int[3][];
        arrayInt[0] = array;
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[6];
        for( int []arrayBase : arrayInt){
            System.out.println("\n------------");
            for (int num: arrayBase){
                System.out.print(num);
            }
        }

        int [][] arrayInt2 = {{1,2},{3,4,5},{6,7,8,9}};
        for( int []arrayBase : arrayInt2){
            System.out.println("\n------------");
            for (int num: arrayBase){
                System.out.print(num);
            }
        }
    }
}
