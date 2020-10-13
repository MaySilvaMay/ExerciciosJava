package fatec.prjRevisaoExercicio5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Sorteio {

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void gerarSorteio()  {

        int sorteio = this.getRandomNumber(1,75);
        System.out.println("----------------------------------");
        System.out.println("o numero sorteado eh: " + sorteio);
        System.out.println("----------------------------------");
    }

}
