package fatec.prjRevisaoExercicio3;

public class Main {

    public static void main(String[] args) {
	Porta porta = new Porta();

	porta.abre();
	porta.fecha();
	porta.abre();

	porta.pinta();

	porta.alterarDimensoes();

	porta.estaAberta();

	porta.imprimir();
    }
}
