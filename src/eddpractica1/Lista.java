package eddpractica1;

public class Lista {
    public Nodo primero;
    public Nodo ultimo;
    int contadorNodos;
    
    public Lista(){
        this.primero = null;
        this.ultimo = null;
        contadorNodos = 0;
    }
    
    public void insertar(int id, String nombre){
        Nodo nuevo;
        nuevo = new Nodo(id, nombre);
        
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
        
        contadorNodos++;
        //System.out.println("Se insertó: ID: "+id +" Nombre: "+nombre);
    }
    
    public String imprimir(){
        String listado = "";
        String list = null;
        Nodo actual;
        actual = primero;
        
        if(actual == null){
            System.out.println("La lista esta vacia");
        }
        else
        {
            for(int i = 1; i<= contadorNodos; i++){
                //System.out.println("Id: "+actual.id + " Nombre: "+ actual.nombre + "\n");
                listado += "Id: "+actual.id + " Nombre: "+ actual.nombre + "\n";
                actual = actual.siguiente;
            }
            list = listado;
        }
        
        return list;
    }
}
