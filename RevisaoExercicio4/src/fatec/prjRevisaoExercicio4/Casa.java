package fatec.prjRevisaoExercicio4;

import java.util.Scanner;

public class Casa {
    private String cor;
    private boolean porta1;
    private boolean porta2;
    private boolean porta3;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPorta1() {
        return porta1;
    }

    public void setPorta1(boolean porta1) {
        this.porta1 = porta1;
    }

    public boolean isPorta2() {
        return porta2;
    }

    public void setPorta2(boolean porta2) {
        this.porta2 = porta2;
    }

    public boolean isPorta3() {
        return porta3;
    }

    public void setPorta3(boolean porta3) {
        this.porta3 = porta3;
    }

    void pinta(){
        System.out.println("Digite a cor da sua casa: ");
        Scanner novacor = new Scanner(System.in);
        cor = novacor.nextLine();
        System.out.println("Sua casa foi pintada de "+cor);
    }

    void quantasPortasEstaoAbertas(){
        int cont=0;
        if (porta1==true){
            cont=cont+1;
            if (porta2==true){
                cont=cont+1;
                if(porta3==true){
                    cont=cont+1;
                }
            }
        }
        System.out.println("Total de portas abertas: " + cont);
    }

    void abrePortas(){
        porta1 = true;
        System.out.println("Porta 1 está aberta");

        porta2 = true;
        System.out.println("Porta 2 está aberta");

        porta3 = true;
        System.out.println("Porta 3 está aberta");
    }

    void fechaPortas(){
        porta1 = false;
        System.out.println("Porta 1 está fechada");

        porta2 = false;
        System.out.println("Porta 2 está fechada");

        porta3 = false;
        System.out.println("Porta 3 está fechada");
    }
}
