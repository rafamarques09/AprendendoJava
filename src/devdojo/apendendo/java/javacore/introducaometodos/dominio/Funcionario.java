package devdojo.apendendo.java.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios != null) {
            for (double salario : this.salarios) {
                System.out.println(salario + " ");
            }
        }
    }

    public void mediaSalarios(){
        if (salarios == null) {
            return;
        }
        double media=0;
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
            System.out.println("A média de salários é de: " + media);
    }
}
