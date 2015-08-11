package eddpractica1;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Lista {
    int id;
    int tipo;
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
        
        if(nombreImagen == "mario2.png"){
            tipo = 1;
        }
        else if(nombreImagen == "castillo.png"){
            tipo = 2;
        }
         else if(nombreImagen == "ficha.png"){
            tipo = 3;
        }
         else if(nombreImagen == "koopa.png"){
            tipo = 4;
        }
         else if(nombreImagen == "goomba.png"){
            tipo = 5;
        }
         else if(nombreImagen == "hongo.png"){
            tipo = 6;
        }
         else if(nombreImagen == "pared.png" || nombreImagen == "Suelo.png"){
            tipo = 7;
        }
        
        nuevo = new Nodo(id,nombreImagen, nombreElemento, tipo);
        
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
            //temporal.siguiente = null;
            ultimo = temporal;
            temporal = null;
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
                    //ultimo.siguiente = null;
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
     
     public void graficar(){
         Nodo aux;
         
         aux = primero;
         FileWriter fichero = null;
        PrintWriter pw = null;
        
        if(aux == null){
            System.out.println("No hay elementos en la lista");
        }
        else
        {
            
            try
        {
            fichero = new FileWriter("prueba.dot");
            pw = new PrintWriter(fichero);
 
            pw.println("digraph Elementos{");
            pw.println("node [shape=record];");
            
            for(int i = 1; i<= contadorNodos; i++){
                
                String codigo = "e_"+aux.id+"[label = \"ID_Elemento: "+aux.id + " \\n Nombre: "+aux.nombreElemento +"\\n Tipo:"+ aux.id + "\"];\n"; 
                
                pw.println(codigo);
                
                if(aux.siguiente != null){
                    String sentencia = "e_"+aux.id+"->e_"+aux.siguiente.id+";";
                    pw.println(sentencia);
                    String sentencia2 = "e_"+aux.siguiente.id+"->e_"+aux.id+";";
                    pw.println(sentencia2);
                
                    aux = aux.siguiente;
                }
                
            }
            pw.println("}\n");
           
            
            
            try {

//path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz

String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

//path del archivo creado con el codigo del graphviz que queremos

String fileInputPath = "C:\\Users\\Luiskr\\Documents\\NetBeansProjects\\EDDPractica1\\prueba.dot";

//path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz

String fileOutputPath = "C:\\Users\\Luiskr\\Documents\\NetBeansProjects\\EDDPractica1\\src\\eddpractica1\\listaElementos.jpg";

//tipo de imagen de salida, en este caso es jpg

String tParam = "-Tjpg";

String tOParam = "-o";

//concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas

//recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:

String[] cmd = new String[5];
cmd[0] = dotPath;
cmd[1] = tParam;
cmd[2] = fileInputPath;
cmd[3] = tOParam;
cmd[4] = fileOutputPath;

//Invocamos nuestra clase 

Runtime rt = Runtime.getRuntime();

//Ahora ejecutamos como lo hacemos en consola

rt.exec( cmd );

} catch (Exception ex) {
ex.printStackTrace();
}  finally {
}
                
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
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
