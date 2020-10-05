package fatec.prjRevisaoExercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.format.DateTimeFormatter.ofPattern;

public class Funcionario {
    public int idFunc;
    public String nomeFunc;
    public String departamento;
    public java.time.LocalDate dataContratacao;
    public double salario;
    public String documento;
    public boolean ativo;

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) { this.dataContratacao = dataContratacao; }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void atualizarSalario() {
        double novoSalario;
        double aumento;

        do {
            System.out.println("Digite o valor do seu aumento. Deve ser um valor positivo!");
            Scanner valorSalario = new Scanner(System.in);
            aumento = valorSalario.nextDouble();
        } while (aumento <= 0);

        novoSalario = salario + aumento;
        System.out.println("O seu salario com aumento eh : " + novoSalario);
    }

    public void demiteFuncionario() {
        ativo = false;
        System.out.println("Funcionario inativado com sucesso! ");
    }

    public void imprimir() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println(toString());
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    void registrarNome(){
        System.out.println("Entre com o nome do funcionario: ");
        Scanner nome = new Scanner(System.in);
        nomeFunc = nome.nextLine();
    }

    void registrarDepartamento(){
        System.out.println("Entre com o departamento do funcionario: ");
        Scanner depto = new Scanner(System.in);
        departamento = depto.nextLine();
    }

    void registrarDoc(){
        System.out.println("Entre com o documento do funcionario: ");
        Scanner doc = new Scanner(System.in);
        documento = doc.nextLine();
    }

    void registrarId(){
        System.out.println("Entre com o ID do funcionario: ");
        Scanner id = new Scanner(System.in);
        idFunc = id.nextInt();
    }
    void registrarSalario(){
        System.out.println("Entre com o salario do funcionario: ");
        Scanner sal = new Scanner(System.in);
        salario = sal.nextDouble();
    }

    void registrarData(){
        System.out.println("Entre com o registro da data: ");

        DateTimeFormatter formatter;
        formatter = ofPattern("d-MM-yyyy");

        Scanner data = new Scanner(System.in);
        String dataString = data.nextLine();

        LocalDate localDate = LocalDate.parse(dataString, formatter);

        dataContratacao=localDate;
    }

    void registrarAtivo(){
        ativo=true;
        System.out.println("Funcionario Ativo");
        System.out.println("---------------------------------------");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFunc=" + idFunc +
                ", nomeFunc='" + nomeFunc + '\'' +
                ", departamento='" + departamento + '\'' +
                ", dataContratacao=" + dataContratacao +
                ", salario=" + salario +
                ", documento='" + documento + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
