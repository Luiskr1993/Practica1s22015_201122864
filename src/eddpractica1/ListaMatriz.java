/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;


public class ListaMatriz {
    
    NodoMatriz primero;
    NodoMatriz ultimo;
    int contadorColumnas;
    
    public ListaMatriz(){
        
        this.primero = null;
        this.ultimo = null;
        this.contadorColumnas = 0;
    }
    
    public void insertar(int x, int y, String nombreImagen, String nombreElemento){
        NodoMatriz nuevo;
        nuevo = new NodoMatriz(x, y, nombreImagen, nombreElemento);
        
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
