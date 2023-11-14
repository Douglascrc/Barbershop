
package model;

import java.text.ParseException;

public class Usuario extends Pessoa {
    
    private String senha;
    private String nivelAcesso;

    public Usuario(int id, String nome) {
        super(id, nome);
    }

    public Usuario(String senha, String nivelAcesso, int id, String nome, String dataNascimento, String telefone, String email, char sexo) throws ParseException {
        super(id, nome, dataNascimento, telefone, email, sexo);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

   
}
