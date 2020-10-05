package fatec.prjRevisaoExercicio3;

import java.util.Scanner;

public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    void abre(){
        aberta = true;
        System.out.println("Porta aberta");
    }
    void fecha(){
        aberta=false;
        System.out.println("Porta fechada");

    }
    void pinta(){
        System.out.println("Digite a cor da sua porta: ");
        Scanner novacor = new Scanner(System.in);
        cor = novacor.nextLine();
    }
    void estaAberta(){
        if(aberta==true){
            System.out.println("A porta está aberta!");
        }else{
            System.out.println("A porta está fechada!");
        }
    }

    void alterarDimensoes(){
        System.out.println("Digite o valor da dimensao X: ");
        Scanner x = new Scanner(System.in);
        dimensaoX = x.nextDouble();

        System.out.println("Digite o valor da dimensao Y: ");
        Scanner y = new Scanner(System.in);
        dimensaoY = y.nextDouble();

        System.out.println("Digite o valor da dimensao Z: ");
        Scanner z = new Scanner(System.in);
        dimensaoZ = z.nextDouble();

        System.out.println("As novas dimensoes sao: ");
        System.out.println("X: "+ dimensaoX);
        System.out.println("Y: "+ dimensaoY);
        System.out.println("Z: "+ dimensaoZ);
    }

    void imprimir(){
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println(toString());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }

    @Override
    public String toString() {
        return "Porta{" +
                "aberta=" + aberta +
                ", cor='" + cor + '\'' +
                ", dimensaoX=" + dimensaoX +
                ", dimensaoY=" + dimensaoY +
                ", dimensaoZ=" + dimensaoZ +
                '}';
    }
}

