
package eddpractica1;


public class Nodo {
    
    Nodo siguiente;
    Nodo anterior;
    int id;
    int tipo;
    String nombreImagen;
    String nombreElemento;
    //int idElemento;
    
    public Nodo(int id,String nombreImagen, String nombreElemento, int tipo){
        this.id = id;
        this.nombreElemento = nombreElemento;
        this.nombreImagen = nombreImagen;
        this.anterior = null;
        this.siguiente = null;
    }         
}
