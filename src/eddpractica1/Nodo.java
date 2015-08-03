
package eddpractica1;


public class Nodo {
    
    Nodo siguiente;
    Nodo anterior;
    int id;
    String nombreImagen;
    String nombreElemento;
    String nombre;
    
    public Nodo(String nombreImagen, String nombreElemento){
        this.nombreElemento = nombreElemento;
        this.nombreImagen = nombreImagen;
        this.anterior = null;
        this.siguiente = null;
    }         
}
