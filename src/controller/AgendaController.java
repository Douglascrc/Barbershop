
package controller;

import model.DAO.ClienteDAO;
import model.DAO.ServicoDAO;
import controller.Helper.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import model.DAO.AgendamentoDAO;
import model.Servico;
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
        ClienteDAO clienteDao = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDao.selectAll();
        
        helper.PreencherCliente(clientes);
    }

    public void atualizaServico() {
       ServicoDAO servicoDao = new ServicoDAO();
       ArrayList<Servico> servicos = servicoDao.selectAll();
       
       helper.PreencherServicos(servicos);
    }

    public void agendar() {
        Agendamento agendamento = helper.obterModelo();   
        new AgendamentoDAO().insert(agendamento);
         
        atualizaTabela();
        helper.limparTela();
    }

    public void atualizaValor() {
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    
    
}
