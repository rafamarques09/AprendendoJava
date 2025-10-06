package devdojo.apendendo.java.introducao;

public class Arrays03 {
    public static void main(String[] args) {
        String [] nomes= new String[3];
        nomes[0] = "Rafael";
        nomes[1] = "Tiago";
        nomes[2] = "Ana";

        for (int i = 0; i <nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
