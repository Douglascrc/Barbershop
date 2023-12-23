
package controller.Helper;

import model.Usuario;
import view.Login;


public class LoginHelper {
    
    private final Login view;
    
    public LoginHelper(Login view){
        this.view = view;
    }
    
    public Usuario obterModelo() {    
        String user = view.getTxt_user().getText();
        String pass = String.valueOf(view.getTxt_pass().getPassword());     
        Usuario modelo = new Usuario(0,user,pass);
        return modelo;
    }
    
   public void setarModelo(Usuario modelo) {   
       String nome = modelo.getNome();
       String senha = modelo.getSenha();
       
       view.getTxt_user().setText(nome);
       view.getTxt_pass().setText(senha);
   }
   
   public void limparTela(){
       view.getTxt_user().setText("");
       view.getTxt_pass().setText("");
       view.getTxt_user().requestFocus();
   }
}
