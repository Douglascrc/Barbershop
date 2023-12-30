
package controller.Helper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import model.Cliente;
import static model.DAO.Banco.agendamento;
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
    public Agendamento obterModelo() {
        try {
            int id = Integer.parseInt(view.getTextId().getText());
            Cliente cliente = (Cliente)view.getJComboBoxCliente().getSelectedItem();
            Servico servico = (Servico) view.getJComboBoxServico().getSelectedItem();
            float valor = Float.parseFloat(view.getTextValor().getText());
            String data = view.getTextFormatedData().getText();
            String hora = view.getTextFormatedHora().getText();
            String dataHora = data + "" + hora;
            String observacao = view.getTextObservacao().getText();
            
            Agendamento agendamento = new Agendamento(
                    id,cliente,servico,dataHora,observacao,valor
            );
            
            return agendamento;
        } catch (ParseException ex) {
            Logger.getLogger(AgendaHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void limparTela() {
        view.getTextId().setText("");
        view.getTextFormatedData().setText("");
        view.getTextFormatedHora().setText("");
        view.getTextValor().setText("");
        view.getTextId().requestFocus();
    }
    
}
