
package model;

import java.text.ParseException;
import java.util.Date;


public class Cliente extends Pessoa {
    
   
   private String endereco;

    public Cliente(int id, String nome, String endereco) {
        super(id, nome);
        this.endereco = endereco;
    }

    public Cliente(int id, String nome, char sexo, String dataNascimento, String email, String telefone, String endereco) throws ParseException {
        super(id, nome, dataNascimento, telefone, email, sexo);
        this.endereco = endereco;
    }

  
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    

    
}
