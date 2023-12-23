
package controller;

import model.DAO.UsuarioDAO;
import controller.Helper.LoginHelper;
import model.Usuario;
import view.Login;
import view.MenuPrincipal;


public class LoginController {

    private final Login view;
    private final LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarSistema(){
        Usuario usuario = helper.obterModelo();
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDao.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null) {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        } else {
            view.exibirMensagem("Usuário ou senha invalídos");
        }
        
    }
    
}
