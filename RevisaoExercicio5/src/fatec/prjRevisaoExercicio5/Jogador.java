package fatec.prjRevisaoExercicio5;

public class Jogador {

    public static void main(String[] args) {
        System.out.println("Cartela da Mayara: ");
        Cartela mayara =new Cartela();
        mayara.preencherCartela();
        mayara.exibirCartela();

        System.out.println("Cartela do Leo: ");
        Cartela leo = new Cartela();
        leo.preencherCartela();
        leo.exibirCartela();
    }
}
