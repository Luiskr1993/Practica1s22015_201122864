
package eddpractica1;

import javax.swing.ImageIcon;

public class MatrizLogica {
    
    int posX=0;
    int posY=600;
    
    ListaMatriz columna1 = new ListaMatriz();
    //NodoMatriz primero;
    //NodoMatriz ultimo;
    ListaMatriz primero;
    ListaMatriz ultimo;
    NodoMatriz actual1;
    NodoMatriz actual2;
    int contadorFilas;
    
    public MatrizLogica(){
        
        this.primero = null;
        this.ultimo = null;
        this.actual1 = null;
        this.actual2 = null;
        this.contadorFilas = 0;
    }
    
    public void crearMatriz(){
        
        
        for(int i = 1; i<=2; i++){
           ListaMatriz fila = new ListaMatriz();
           System.out.println("*****************Fila No. "+i+" **********************");
           if(primero == null){
               for(int z=1; z<=4; z++){
                   System.out.println(z);
               NodoMatriz nuevo = new NodoMatriz(z, i, null, null);// z = coordenada X ; i = coordenada Y
               //nuevo.setBounds(posX, posY, 100, 100);
               //nuevo.setLocation(posX, posY);
               //nuevo.setIcon(new ImageIcon(getClass().getResource("piedra.png")));
               //nuevo.setVisible(true);
               
               if(fila.primero == null){
                   fila.primero = nuevo;
                   fila.ultimo = fila.primero;
                   //primero = fila.primero;
                   primero = fila;
                   ultimo = primero;
               }
               else{
                   fila.ultimo.siguiente = nuevo;
                   nuevo.anterior = fila.ultimo;
                   fila.ultimo = nuevo;
               }
                   posX+=100;
                   System.out.println("Pos X: "+nuevo.x +" Pos Y: "+nuevo.y +"\n");
               fila.contadorColumnas++;
            }
               posX=0;
           }
           else{
               
               for(int z=1; z<=4; z++){
               NodoMatriz nuevo = new NodoMatriz(z, i, null, null);   // z = coordenada X ; i = coordenada Y
               //nuevo.setBounds(posX, posY, 100, 100);
               //nuevo.setLocation(posX, posY);
               //nuevo.setIcon(new ImageIcon(getClass().getResource("piedra.png")));
               //nuevo.setVisible(true);
               
               if(fila.primero == null){
                   fila.primero = nuevo;
                   fila.ultimo = fila.primero;
                   //primero = fila.primero;
                   primero = fila;
                   ultimo = primero;
               }
               else{
                   fila.ultimo.siguiente = nuevo;
                   nuevo.anterior = fila.ultimo;
                   fila.ultimo = nuevo;
               }
               posX+=100;
               System.out.println("Pos X: "+nuevo.x +" Pos Y: "+nuevo.y +"\n");
               fila.contadorColumnas++;
            }
               posX=0;
               
               //ultimo.abajo = fila.primero;
               ultimo.primero.abajo = fila.primero;
               ultimo.siguiente = fila;
               fila.anterior = ultimo;
               ultimo = fila;
               //fila.primero.arriba = ultimo;
               fila.primero.arriba = ultimo.primero;
               //ultimo = fila.primero;
               ultimo = fila;
               
               //actual1 = primero.siguiente;
               //actual2 = primero.abajo.siguiente;
               actual1 = primero.primero.siguiente;
               actual2 = primero.primero.abajo.siguiente;
               
               for(int p = 1+1; p<=fila.contadorColumnas; p++){
                   actual1.abajo = actual2;
                   actual2.arriba = actual1;
                   
                   actual1 = actual1.siguiente;
                   actual2 = actual2.siguiente;
               }
           }
           posX=0;
           contadorFilas++;
           
           posY-=100;
          
        }
    }
    
    public void agregarColumna(){
        ListaMatriz tempFila;
        ListaMatriz tF, tF2;
        NodoMatriz tempColumna;
        tempFila = primero;
        
        
        if(tempFila==null){
            System.out.println("matriz vacia");
        }
        else
        {
            for(int i = 1; i<= contadorFilas; i++){
                
                tempColumna = tempFila.primero;
                
                for(int a=1; a<=tempFila.contadorColumnas; a++){
                    if(tempColumna.siguiente != null)
                    {tempColumna = tempColumna.siguiente;}
                    
                }
            
                NodoMatriz nuevo = new NodoMatriz(tempFila.contadorColumnas+1, i, null, null);
            
                tempColumna.siguiente = nuevo;
                nuevo.anterior = tempColumna;
                tempFila.ultimo = nuevo;
                
                tempFila.contadorColumnas++;
                
                if(tempFila.siguiente != null){
                    tempFila = tempFila.siguiente;
                }
                else{
                    System.out.println("es la ultima fila");
                }
                
                
                
                
            }
             tF = primero;
             tF2 = tF.siguiente;
             
             
               
               for(int p = 1; p<=contadorFilas; p++){
                    actual1 = tF.ultimo;
                    actual2 = tF2.ultimo;
                    
                   actual1.abajo = actual2;
                   actual2.arriba = actual1;
                   
                   tF2 = tF2.siguiente;
                   tF = tF.siguiente;
               }
            
            
            
        }
        
    }
}
