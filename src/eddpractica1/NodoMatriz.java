/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;


public class NodoMatriz {
    
    NodoMatriz siguiente;
    NodoMatriz anterior;
    NodoMatriz arriba;
    NodoMatriz abajo;
    
    int x;
    int y;
    String nombreImagen;
    String nombreElemento;
    
    public NodoMatriz(int x, int y, String nombreImagen, String nombreElemento){
        
        this.abajo = null;
        this.arriba = null;
        this.anterior = null;
        this.siguiente = null;
        
        this.nombreElemento = nombreElemento;
        this.nombreImagen = nombreImagen;
        
    }
}
