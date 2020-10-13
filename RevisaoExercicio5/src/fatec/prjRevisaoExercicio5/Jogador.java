package fatec.prjRevisaoExercicio5;

public class Jogador {

    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("Cartela da Mayara: ");
        Cartela mayara =new Cartela();
        mayara.preencherCartela();
        mayara.exibirCartela();
        System.out.println("----------------------------------");

        System.out.println("Cartela do Leo: ");
        Cartela leo = new Cartela();
        leo.preencherCartela();
        leo.exibirCartela();
        System.out.println("----------------------------------");

        Sorteio sorteio = new Sorteio();
        mayara.marcarCartela(sorteio.gerarSorteio());
        System.out.println("------------------------------------------");
        System.out.println("Cartela da Mayara marcada após sorteio: ");
        mayara.exibirCartelaMarcada();
        System.out.println("-------------------------------------------");

        mayara.marcarCartela(sorteio.gerarSorteio());
        System.out.println("------------------------------------------");
        System.out.println("Cartela da Mayara marcada após sorteio: ");
        mayara.exibirCartelaMarcada();
        System.out.println("-------------------------------------------");
    }
}
