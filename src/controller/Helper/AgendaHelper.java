
package controller.Helper;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import view.Agenda;

public class AgendaHelper {
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
    
}
