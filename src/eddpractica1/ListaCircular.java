/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

/**
 *
 * @author Luiskr
 */
public class ListaCircular {
     public Nodo primero;
    public Nodo ultimo;
    int contadorNodos;
    
    public ListaCircular(){
        this.primero = null;
        this.ultimo = null;
        contadorNodos = 0;
    }
    
    public void insertar(int id, String nombre){
         Nodo nuevo;
        nuevo = new Nodo(id, nombre);
        
        if(primero == null){
            primero = nuevo;
            primero.anterior = ultimo;
            ultimo = primero;
        }
        else
        {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
        
        contadorNodos++;
    }
}
