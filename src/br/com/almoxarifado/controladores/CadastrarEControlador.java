/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.controladores;

import br.com.almoxarifado.modelos.EstoqueEntradaSaida;
import br.com.almoxarifado.modelos.Funcionario;

/**
 *
 * @author Bonfim
 */
public class CadastrarEControlador {

    private EstoqueEntradaSaida estoque = new EstoqueEntradaSaida();

    public EstoqueEntradaSaida getEstoque() {
        return estoque;
    }

    public void setEstoque(EstoqueEntradaSaida estoque) {
        this.estoque = estoque;
    }

    public boolean cadastrarEstoque() {
        if (getEstoque().getNomeProduto() != null
                && getEstoque().getQuantidade() > 0
                && getEstoque().getData() != null){
            System.out.println("Nome do Produto: " + getEstoque().getNomeProduto());
            System.out.println("Quantidade " + getEstoque().getQuantidade());
            System.out.println("Data: " + getEstoque().getData());
            return true;
        }
        return false;
    }

}
