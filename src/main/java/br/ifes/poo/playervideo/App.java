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
public class App {
    
    public static void main(String[] args) {
        
        System.out.println("Player AVI \n");
        PlayerVideo playerVideoAvi = new PlayerVideoAvi();
        playerVideoAvi.reproduzir();
        
        System.out.println("\nPlayer MP3  \n");
        PlayerVideo playerVideoMp3 = new PlayerVideoMp3();
        playerVideoMp3.reproduzir();
    }
}
