/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

import javax.swing.JLabel;


public class NodoMatriz extends JLabel{
    
    NodoMatriz siguiente;
    NodoMatriz anterior;
    NodoMatriz arriba;
    NodoMatriz abajo;
    
    int x;
    int y;
    int tipo;
    String nombreImagen;
    String nombreElemento;
    
    public NodoMatriz(int x, int y, String nombreImagen, String nombreElemento, int tipo){
        
        this.abajo = null;
        this.arriba = null;
        this.anterior = null;
        this.siguiente = null;
        
        this.nombreElemento = nombreElemento;
        this.nombreImagen = nombreImagen;
        this.x = x;
        this.y = y;
        this.tipo = tipo;
        
    }
}
