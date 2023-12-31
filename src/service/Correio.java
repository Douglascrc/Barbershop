
package service;

import model.Agendamento;

public class Correio {
    
    public void notificarEmail(Agendamento agendamento) {
        
        String emailFormatado = formatarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        Email email = new Email("Agendamento BarberShop",emailFormatado,destinatario);
        email.enviar();
    }

    private String formatarEmail(Agendamento agendamento) {
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String data = agendamento.getDataFormatado();
        String hora = agendamento.getHoraFormatado();
        float preco = agendamento.getValor();
         
        return "Olá "+ nomeCliente + ". Seu agendamento para "+ servico + ", esta marcado para dia "+ data
                +" às "+ hora + "\n\n O preço para você fica R$"+ preco + " \n\nGrande Abraço!!";
        
    }
      
}
