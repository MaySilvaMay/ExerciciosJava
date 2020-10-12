package fatec.prjRevisaoExercicio5;

import java.util.HashMap;

public class Cartela {
    int[][] cartela = new int[6][4];

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void preencherCartela(){
        for (int i=0; i<6; i++){
            for (int j=0; j<4; j++){
                this.cartela[i][j]=this.getRandomNumber(1,75);
            }
        }
    }

    public void exibirCartela(){
        for (int i=0; i<6; i++){
            String linha="";
            for (int j=0; j<4; j++){
                linha += this.cartela[i][j] + " ";
            }
            System.out.println(linha);
        }
    }
}
