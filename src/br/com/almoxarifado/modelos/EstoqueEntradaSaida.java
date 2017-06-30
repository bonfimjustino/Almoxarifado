/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.modelos;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;



/**
 *
 * @author Bonfim
 */
public class EstoqueEntradaSaida extends Produto {
    private int quantidade;
    private Date datahora;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return datahora;
    }

    public void setData(Date data) {
        this.datahora = data;
    }


  
    
    
}
