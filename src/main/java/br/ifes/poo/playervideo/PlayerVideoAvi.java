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
public class PlayerVideoAvi extends PlayerVideo{
    
    @Override
    protected void carregaArquivo() {
        System.out.println("Carregando arquivo AVI...");
    }

    @Override
    protected void carregaLegenda() {
        System.out.println("Carregando legenda AVI...");
    }

    @Override
    protected void reproduzirVideo() {
        System.out.println("Reproduzindo video AVI...");
    }

    @Override
    protected void finalizarReproducao() {
        System.out.println("Finalizando reprodução AVI...");
    }
    
}
