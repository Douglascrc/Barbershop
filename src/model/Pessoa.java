
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract public class Pessoa {
    
    protected int id;
    protected String nome;
    protected Date dataNascimento;
    protected String telefone;
    protected String email;
    protected char sexo;

    public Pessoa(int id, String nome, String dataNascimento, String telefone, String email, char sexo) throws ParseException {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = new SimpleDateFormat("dd/mm/yyyy").parse(dataNascimento);
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    
}
