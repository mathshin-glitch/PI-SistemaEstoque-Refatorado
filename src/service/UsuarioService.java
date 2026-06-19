package service;

import dao.UsuarioDAO;
import classes.Usuario;

public class UsuarioService {
    //adicionar usuaruiDAO para pagar os metodos e inserir na web
    private UsuarioDAO usuarioDAO;
    
    //No costrutor vazio, criar um novo DAO da classes
    public UsuarioService(){
        this.usuarioDAO = new UsuarioDAO();
    }
    
    //Criar Método de Inserir usuario do DAO que é criar no Construtor
    public Usuario UsuarioAutenticar(String login, String senha){
        return usuarioDAO.login(login, senha);
    }
}
