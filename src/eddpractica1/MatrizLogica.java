
package eddpractica1;

public class MatrizLogica {
    ListaMatriz columna1 = new ListaMatriz();
    NodoMatriz primero;
    NodoMatriz ultimo;
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
           if(primero == null){
               for(int z=1; z<=4; z++){
               NodoMatriz nuevo = new NodoMatriz(z, i, null, null);// z = coordenada X ; i = coordenada Y
               
               if(fila.primero == null){
                   fila.primero = nuevo;
                   fila.ultimo = fila.primero;
                   primero = fila.primero;
                   ultimo = primero;
               }
               else{
                   fila.ultimo.siguiente = nuevo;
                   nuevo.anterior = fila.ultimo;
                   fila.ultimo = nuevo;
               }
               
               fila.contadorColumnas++;
            }
           }
           else{
               
               for(int z=1; z<=4; z++){
               NodoMatriz nuevo = new NodoMatriz(z, i, null, null);   // z = coordenada X ; i = coordenada Y
               
               if(fila.primero == null){
                   fila.primero = nuevo;
                   fila.ultimo = fila.primero;
                   primero = fila.primero;
                   ultimo = primero;
               }
               else{
                   fila.ultimo.siguiente = nuevo;
                   nuevo.anterior = fila.ultimo;
                   fila.ultimo = nuevo;
               }
               
               fila.contadorColumnas++;
            }
               
               ultimo.abajo = fila.primero;
               fila.primero.arriba = ultimo;
               ultimo = fila.primero;
               
               actual1 = primero.siguiente;
               actual2 = actual1.abajo.siguiente;
               
               for(int p = 1+1; p<=fila.contadorColumnas; p++){
                   actual1.abajo = actual2;
                   actual2.arriba = actual1;
                   
                   actual1 = actual1.siguiente;
                   actual2 = actual2.siguiente;
               }
           }
           
           contadorFilas++;
           
           
          
        }
    }
}
