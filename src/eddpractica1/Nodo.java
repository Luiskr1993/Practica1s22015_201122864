
package eddpractica1;


public class Nodo {
    
    Nodo siguiente;
    Nodo anterior;
    int id;
    String nombre;
    
    public Nodo(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.anterior = null;
        this.siguiente = null;
    }         
}
