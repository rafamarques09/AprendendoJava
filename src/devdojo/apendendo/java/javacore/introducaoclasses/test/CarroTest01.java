package devdojo.apendendo.java.javacore.introducaoclasses.test;

import devdojo.apendendo.java.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Corolla";
        carro1.modelo = "Toyota";
        carro1.ano = 2021;

        carro2.nome = "Civic";
        carro2.modelo = "Honda";
        carro2.ano = 2023;

        System.out.println("Carro 1:\nNome: "+carro1.nome+"\nModelo: "+carro1.modelo+"\nAno: "+carro1.ano);
        System.out.println("------------------------------");
        System.out.println("Carro 2:\nNome: "+carro2.nome+"\nModelo: "+carro2.modelo+"\nAno: "+carro2.ano);
    }
}
