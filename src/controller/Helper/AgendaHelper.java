
package controller.Helper;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import view.Agenda;

public class AgendaHelper implements IHelper {
    private final Agenda view;
    
    public AgendaHelper(Agenda view) {
       this.view = view; 
    }

    public void PreencherTabela(ArrayList<Agendamento> agendamentos) {
       DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
       tableModel.setNumRows(0);
       
       for(Agendamento agendamento: agendamentos) {
           
          tableModel.addRow( new Object[]{
              agendamento.getId(),
              agendamento.getCliente().getNome(),
              agendamento.getServico().getNome(),
              agendamento.getValor(),
              agendamento.getDataFormatado(),
              agendamento.getHoraFormatado(),
              agendamento.getObservacao()
          });
           
       }
        
    }

    public void PreencherCliente(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes) {
           comboBoxModel.addElement(cliente); 
        }
        
    }

    public void PreencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxServico().getModel();
        
        for(Servico servico: servicos) {
            comboBoxModel.addElement(servico);
        }
    }

    public Servico obterServico() {
        return (Servico) view.getJComboBoxServico().getSelectedItem();
       
    }

    public void setarValor(float valor) {
        view.getTextValor().setText(valor +"");
    }

    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
