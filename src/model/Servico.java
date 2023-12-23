
package model;

public class Servico {
    
    private int id;
    private float valor;
    private String nome;
    private String descricao;
    
    
    public Servico( int id,String nome, float valor){  
    this.id = id;
    this.nome = nome;
    this.valor = valor;
    }

    public Servico(int id, float valor, String nome, String descricao) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
    
}

