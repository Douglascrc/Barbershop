
package controller;

import controller.Helper.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.DAO.AgendamentoDAO;
import view.Agenda;

public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;
    
    
    public AgendaController(Agenda view){
       this.view = view; 
       this.helper = new AgendaHelper(view);
    }

    public void atualizaTabela() {
        AgendamentoDAO agendamentoDao = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDao.selectAll();
        
        helper.PreencherTabela(agendamentos);
    }

    public void atualizaClientes() {
        
    }

    public void atualizaServicos() {
       
    }

    public void agendar() {
        
    }

    public void atualizaValor() {
        
    }
    
    
    
}
