
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Agendamento {
    
    private int id;
    private Cliente cliente;
    private Servico servico;
    private Date data;
    private String observacao;
    private float valor;
    

    public Agendamento(int id, Cliente cliente, Servico servico, String data, String observacao, float valor) throws ParseException {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.data = new SimpleDateFormat("dd/mm/yyyy").parse(data);  
        this.observacao = observacao;
        this.valor = valor;
    }

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data) throws ParseException {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.data = new SimpleDateFormat("dd/mm/yyyy").parse(data);
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public String getDataFormatado(){
        return new SimpleDateFormat("dd/mm/yyyy").format(data);
    }
    
    public String getHoraFormatado(){
        return new SimpleDateFormat("hh:mm").format(data);
    }


    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
