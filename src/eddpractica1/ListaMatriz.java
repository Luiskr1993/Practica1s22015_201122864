/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

import javax.swing.JLabel;


public class ListaMatriz {
    
    NodoMatriz primero;
    NodoMatriz ultimo;
    
    ListaMatriz siguiente;
    ListaMatriz anterior;
    int contadorColumnas;
    
    public ListaMatriz(){
        
        this.primero = null;
        this.ultimo = null;
        this.anterior = null;
        this.siguiente = null;
        this.contadorColumnas = 0;
    }
    
    public void insertar(int x, int y, String nombreImagen, String nombreElemento, int tipo){
        NodoMatriz nuevo;
        nuevo = new NodoMatriz(x, y, nombreImagen, nombreElemento, tipo);
        
        if(primero == null){
            primero = nuevo;
            ultimo = primero;
        }
        else
        {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
        
        contadorColumnas++;
        //System.out.println("Se insertó: ID: "+id +" Nombre: "+nombre);
    }
    
  
}
