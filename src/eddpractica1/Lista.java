package eddpractica1;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Lista {
    int id;
    public Nodo primero;
    public Nodo ultimo;
    int contadorNodos;
    
    public Lista(){
        this.primero = null;
        this.ultimo = null;
        this.contadorNodos = 0;
        this.id = 0;
    }
    
    public void insertar(String nombreImagen, String nombreElemento){
        Nodo nuevo;
        id++;
        nuevo = new Nodo(id,nombreImagen, nombreElemento);
        
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
    
    public void eliminarInicio(){
        Nodo temporal;
        temporal = primero;
        
        if(temporal == null){
            System.out.println("la lista esta vacia\n");
        }
        else{
            primero = temporal.siguiente;
            temporal = null;
        }
    }
    public void eliminarFinal(){
        Nodo temporal;
        
        
        if(ultimo == null){
            System.out.println("la lista esta vacia\n");
        }
        else{
            
            temporal = ultimo.anterior;
            temporal.siguiente = null;
            ultimo = temporal;
        }
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
                listado += "Id Imagen: "+actual.nombreImagen + " Nombre: "+ actual.nombreElemento + "\n";
                actual = actual.siguiente;
            }
            list = listado;
        }
        
        return list;
    }
    
    
     public void imprimir2(){
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
                System.out.println("Id Imagen: "+actual.nombreImagen + " Nombre: "+ actual.nombreElemento + "\n");
                //listado += "Id Imagen: "+actual.nombreImagen + " Nombre: "+ actual.nombreElemento + "\n";
                actual = actual.siguiente;
            }
        }
        
    }
    
    public JLabel elementosCreador(){
        
        Nodo temp;
        temp = primero;
        
        for(int i = 1; i <= contadorNodos; i++){
            
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon(getClass().getResource(temp.nombreImagen)));
            label.setVisible(true);
            label.setBounds(null);
            
            return label;
        }
        return null;
        
        
    }
}
