
package view;

import model.Servico;

public class Main {

    public static void main(String args[]) {
   
    Servico service = new Servico(1,"Corte na máquina",30);
        System.out.println(service.getValor());   
    }
}
