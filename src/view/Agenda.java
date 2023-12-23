
package view;

import controller.AgendaController;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Agenda extends javax.swing.JFrame {


    private final AgendaController controller;

  
    public Agenda() {
        initComponents();
        this.controller = new AgendaController(this);
        iniciar();
    }

    
    private void iniciar(){
        controller.atualizaTabela();
        controller.atualizaClientes();
        controller.atualizaServico();
        layoutTabela();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAgenda = new javax.swing.JLabel();
        LabelId = new javax.swing.JLabel();
        LabelCliente = new javax.swing.JLabel();
        LabelServico = new javax.swing.JLabel();
        LabelValor = new javax.swing.JLabel();
        LabelData = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        LabelObservacao = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        JComboBoxCliente = new javax.swing.JComboBox<String>();
        JComboBoxServico = new javax.swing.JComboBox<String>();
        TextValor = new javax.swing.JTextField();
        TextFormatedData = new javax.swing.JFormattedTextField();
        TextFormatedHora = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextObservacao = new javax.swing.JTextArea();
        ButtonAgendar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAgendamentos = new javax.swing.JTable();
        LabelAgendaPainelFundo = new javax.swing.JLabel();
        LabelAgendaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelAgenda.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        LabelAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelAgenda.setText("Agenda");
        getContentPane().add(LabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 150, 60));

        LabelId.setForeground(new java.awt.Color(255, 255, 255));
        LabelId.setText("Id");
        getContentPane().add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        LabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCliente.setText("Cliente");
        getContentPane().add(LabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        LabelServico.setForeground(new java.awt.Color(255, 255, 255));
        LabelServico.setText("Servico");
        getContentPane().add(LabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        LabelValor.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor.setText("Valor R$");
        getContentPane().add(LabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        LabelData.setForeground(new java.awt.Color(255, 255, 255));
        LabelData.setText("Data");
        getContentPane().add(LabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        LabelHora.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora.setText("Hora");
        getContentPane().add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        LabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        LabelObservacao.setText("Observação");
        getContentPane().add(LabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        TextId.setEditable(false);
        TextId.setText("0");
        TextId.setToolTipText("");
        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });
        getContentPane().add(TextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 280, 40));

        getContentPane().add(JComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 280, 40));

        JComboBoxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(JComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 280, 40));

        TextValor.setText("0");
        TextValor.setToolTipText("");
        TextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorActionPerformed(evt);
            }
        });
        getContentPane().add(TextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 280, 40));

        TextFormatedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(TextFormatedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 280, 40));

        TextFormatedHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(TextFormatedHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 280, 40));

        TextObservacao.setColumns(20);
        TextObservacao.setRows(5);
        jScrollPane2.setViewportView(TextObservacao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 610, 280));

        ButtonAgendar.setBackground(new java.awt.Color(60, 233, 106));
        ButtonAgendar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonAgendar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgendar.setText("Agendar");
        ButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 610, 50));

        TableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Alan", "Corte", "10", "22/04/2018", "08:00", ""},
                {"2", "Abigail", "Barba", "20", "22/04/2018", "09:00", "Pode se Atrazar um pouco"},
                {"3", "Pedro", "Barba", "20", "23/04/2018", "08:00", null},
                {"4", "Teste", "Barba + Corte", "30", "23/04/2018", "09:00", null}
            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        TableAgendamentos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(TableAgendamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 1050, 330));

        LabelAgendaPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(LabelAgendaPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1000));

        LabelAgendaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/AgendaFundo.png"))); // NOI18N
        getContentPane().add(LabelAgendaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdActionPerformed

    private void ButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendarActionPerformed
        controller.agendar();
    }//GEN-LAST:event_ButtonAgendarActionPerformed

    private void TextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorActionPerformed

    private void JComboBoxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxServicoItemStateChanged
        controller.atualizaValor();
    }//GEN-LAST:event_JComboBoxServicoItemStateChanged

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgendar;
    private javax.swing.JComboBox<String> JComboBoxCliente;
    private javax.swing.JComboBox<String> JComboBoxServico;
    private javax.swing.JLabel LabelAgenda;
    private javax.swing.JLabel LabelAgendaFundo;
    private javax.swing.JLabel LabelAgendaPainelFundo;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelObservacao;
    private javax.swing.JLabel LabelServico;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JTable TableAgendamentos;
    private javax.swing.JFormattedTextField TextFormatedData;
    private javax.swing.JFormattedTextField TextFormatedHora;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextArea TextObservacao;
    private javax.swing.JTextField TextValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void layoutTabela() {

        this.TableAgendamentos.getColumnModel().getColumn(0).setPreferredWidth(45);
        this.TableAgendamentos.getColumnModel().getColumn(1).setPreferredWidth(200);
        this.TableAgendamentos.getColumnModel().getColumn(2).setPreferredWidth(200);
        this.TableAgendamentos.getColumnModel().getColumn(3).setPreferredWidth(100);
        this.TableAgendamentos.getColumnModel().getColumn(4).setPreferredWidth(100);
        this.TableAgendamentos.getColumnModel().getColumn(5).setPreferredWidth(100);
        this.TableAgendamentos.getColumnModel().getColumn(6).setPreferredWidth(350);
    }
    
    public JTable getTableAgendamentos() {
        return TableAgendamentos;
    }

    public void setTableAgendamentos(JTable TableAgendamentos) {
        this.TableAgendamentos = TableAgendamentos;
    }

    public JComboBox<String> getJComboBoxCliente() {
        return JComboBoxCliente;
    }

    public void setJComboBoxCliente(JComboBox<String> JComboBoxCliente) {
        this.JComboBoxCliente = JComboBoxCliente;
    }

    public JComboBox<String> getJComboBoxServico() {
        return JComboBoxServico;
    }

    public void setJComboBoxServico(JComboBox<String> JComboBoxServico) {
        this.JComboBoxServico = JComboBoxServico;
    }

    public JTextField getTextValor() {
        return TextValor;
    }

    public void setTextValor(JTextField TextValor) {
        this.TextValor = TextValor;
    }

    public JFormattedTextField getTextFormatedData() {
        return TextFormatedData;
    }

    public void setTextFormatedData(JFormattedTextField TextFormatedData) {
        this.TextFormatedData = TextFormatedData;
    }

    public JFormattedTextField getTextFormatedHora() {
        return TextFormatedHora;
    }

    public void setTextFormatedHora(JFormattedTextField TextFormatedHora) {
        this.TextFormatedHora = TextFormatedHora;
    }

    public JTextField getTextId() {
        return TextId;
    }

    public void setTextId(JTextField TextId) {
        this.TextId = TextId;
    }

    public JTextArea getTextObservacao() {
        return TextObservacao;
    }

    public void setTextObservacao(JTextArea TextObservacao) {
        this.TextObservacao = TextObservacao;
    }

    
    





}
