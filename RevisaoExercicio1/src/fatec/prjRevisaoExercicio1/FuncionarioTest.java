package fatec.prjRevisaoExercicio1;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        func.registrarNome();
        func.registrarData();
        func.registrarDepartamento();
        func.registrarId();
        func.registrarDoc();
        func.registrarSalario();
        func.registrarAtivo();

        System.out.println("Dados dos funcionarios: ");
        func.imprimir();

        func.atualizarSalario();
        func.imprimir();

        System.out.println("O funcionario sera inativado: ");
        func.demiteFuncionario();
        func.imprimir();

    }
}
