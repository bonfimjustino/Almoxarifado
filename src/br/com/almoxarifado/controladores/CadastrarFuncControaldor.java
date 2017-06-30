/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.controladores;

import br.com.almoxarifado.modelos.Funcionario;

/**
 *
 * @author Bonfim
 */
public class CadastrarFuncControaldor {
    private Funcionario funcionario = new Funcionario();

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public boolean cadastrar(){
        if(getFuncionario().getNome() != null 
                && getFuncionario().getCpf() != null){
        System.out.println("Nome: "+getFuncionario().getNome());
        System.out.println("CPF: "+getFuncionario().getCpf());
        System.out.println("Telefone: "+getFuncionario().getTelefone());
        System.out.println("Email: "+getFuncionario().getEmail());
        
        return true;
        }
       return false;
    }
}
