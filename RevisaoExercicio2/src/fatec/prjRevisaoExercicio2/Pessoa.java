package fatec.prjRevisaoExercicio2;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void registrarNome(){
        System.out.println("Entre com o nome da pessoa: ");
        Scanner name = new Scanner(System.in);
        nome = name.nextLine();
    }

    void registrarIdade(){
        System.out.println("Entre com a idade da pessoa: ");
        Scanner idad = new Scanner(System.in);
        idade = idad.nextInt();
    }

    void fazAniversario(){
        System.out.println("Voce está fazendo aniversário! PARABÉNS!");
        idade=idade+1;
        System.out.println("Sua nova idade eh: " + idade);
    }

    void imprimir(){
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println(toString());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
