/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo.playervideo;

/**
 *
 * @author aeller
 */
public abstract class PlayerVideo {
    protected abstract void carregaArquivo();
    protected abstract void carregaLegenda();
    protected abstract void reproduzirVideo();
    protected abstract void finalizarReproducao();
    
    public final void reproduzir(){
        carregaArquivo();
        carregaLegenda();
        reproduzirVideo();
        finalizarReproducao();
    }
}
