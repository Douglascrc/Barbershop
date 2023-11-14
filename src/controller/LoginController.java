
package controller;

import view.BarbeariaLogin;

public class LoginController {

    private BarbeariaLogin view; 
    
    public LoginController(BarbeariaLogin view) {
        this.view = view;       
    }
    
    public void fizTarefa() {
        System.out.println("Buscando...");
        
        this.view.exibirMensagem("Oi ");
    }
    
    
    public void entrarSistema(){
        
    }
    
}
