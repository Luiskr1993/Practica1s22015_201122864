package eddpractica1;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
        
        contadorNodos--;
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
        
        contadorNodos--;
    }
    
    public void eliminarNodo(int id){
        Nodo temp, temp2;
        temp = primero;
        
        if(temp == null){
                JOptionPane.showMessageDialog(
               null,
                "No se encontro el elemento a eliminar");
        }
        else{
            while(temp.id != id){
                if(temp.siguiente != null){
                    temp = temp.siguiente;
                }
                
                else if(temp.anterior == null){
                        primero = null;
                }
              
            }
            
            if(temp == primero){
                primero = temp.siguiente;
                
            }
            else{
                
                if(temp == ultimo){
                    ultimo = temp.anterior;
                    ultimo.siguiente = null;
                }
                else{
                    temp2 = temp.siguiente;
                    
                    temp2.anterior = temp.anterior;
                    temp.anterior.siguiente = temp2;
                }
                
            }
            
            
        }
        
        contadorNodos--;
        
    }
    
    public Nodo buscar(int id){
        Nodo actual;
        actual = primero;
        
        if(primero == null){
            return null;
        }
        else{
            while(actual.id != id){
                
                if(actual.siguiente != null){
                    actual = actual.siguiente;
                }
                else{
                    return null;
                }
            }
            
            return actual;
        }
        
    }
    
     public boolean buscarNodo(int id){
        Nodo actual;
        actual = primero;
        
        if(primero == null){
            return false;
        }
        else{
            while(actual.id != id){
                
                if(actual.siguiente != null){
                    actual = actual.siguiente;
                }
                else{
                    return false;
                }
            }
            
            return true;
        }
        
    }
    
    public void modificar(int id, String nuevoNombre){
        Nodo temp;
        
        temp = primero;
        
        while(temp.id != id){
            if(temp.siguiente != null){
                temp = temp.siguiente;
            }
            else{
                 JOptionPane.showMessageDialog(
               null,
                "No se encontro el elemento buscado");
            }
        }
        
        temp.nombreElemento = nuevoNombre;
         JOptionPane.showMessageDialog(
               null,
                "El nuevo nombre del elemento es: "+nuevoNombre);
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
