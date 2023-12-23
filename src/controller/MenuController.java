
package controller;

import view.Agenda;
import view.MenuPrincipal;


public class MenuController {
    
    private final MenuPrincipal view;
    
    public MenuController(MenuPrincipal view) {
        this.view = view;
        
    }
    
    public void navegarAgenda() {
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        view.dispose();
    }    
}
