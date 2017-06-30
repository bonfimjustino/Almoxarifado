/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.controladores;

import br.com.almoxarifado.modelos.Usuario;

/**
 *
 * @author Bonfim
 */
public class LoginControlador {
    
    private Usuario usuario = new Usuario();
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public boolean autenticar(){
        return getUsuario().getLogin().equals("admin") && (getUsuario().getSenha().equals("admin"));
    }
}
