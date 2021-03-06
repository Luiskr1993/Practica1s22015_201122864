package eddpractica1;

import static com.sun.org.apache.xml.internal.utils.StringBufferPool.free;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MatrizLogica {

    int posX = 0;
    int posY = 600;

    ListaMatriz columna1 = new ListaMatriz();
    //NodoMatriz primero;
    //NodoMatriz ultimo;
    ListaMatriz primero;
    ListaMatriz ultimo;
    NodoMatriz actual1;
    NodoMatriz actual2;
    int contadorFilas;

    public MatrizLogica() {

        this.primero = null;
        this.ultimo = null;
        this.actual1 = null;
        this.actual2 = null;
        this.contadorFilas = 0;
    }

    public void crearMatriz() {

        ListaMatriz actualFila;
        NodoMatriz actualColumna;

        actualFila = primero;

        for (int i = 1; i <= 2; i++) {
            ListaMatriz fila = new ListaMatriz();
            actualColumna = fila.primero;
            System.out.println("*****************Fila No. " + i + " **********************");
            if (primero == null) {

                primero = fila;
                ultimo = primero;

                for (int z = 1; z <= 4; z++) {
                    System.out.println(z);
                    NodoMatriz nuevo = new NodoMatriz(z, i, null, null, 0);// z = coordenada X ; i = coordenada Y
                    //nuevo.setBounds(posX, posY, 100, 100);
                    //nuevo.setLocation(posX, posY);
                    //nuevo.setIcon(new ImageIcon(getClass().getResource("piedra.png")));
                    //nuevo.setVisible(true);

                    if (fila.primero == null) {
                        fila.primero = nuevo;
                        fila.ultimo = fila.primero;
                        //primero = fila.primero;

                    } else {
                        fila.ultimo.siguiente = nuevo;
                        nuevo.anterior = fila.ultimo;
                        fila.ultimo = nuevo;
                    }
                    posX += 100;
                    System.out.println("Pos X: " + nuevo.x + " Pos Y: " + nuevo.y + "\n");
                    fila.contadorColumnas++;
                }

                posX = 0;
            } else {

                ultimo.siguiente = fila;
                fila.anterior = ultimo;
                ultimo = fila;

                for (int z = 1; z <= 4; z++) {
                    NodoMatriz nuevo = new NodoMatriz(z, i, null, null, 0);   // z = coordenada X ; i = coordenada Y
                    //nuevo.setBounds(posX, posY, 100, 100);
                    //nuevo.setLocation(posX, posY);
                    //nuevo.setIcon(new ImageIcon(getClass().getResource("piedra.png")));
                    //nuevo.setVisible(true);

                    if (fila.primero == null) {
                        fila.primero = nuevo;
                        fila.ultimo = fila.primero;
                        //primero = fila.primero;

                    } else {
                        fila.ultimo.siguiente = nuevo;
                        nuevo.anterior = fila.ultimo;
                        fila.ultimo = nuevo;
                    }
                    posX += 100;
                    System.out.println("Pos X: " + nuevo.x + " Pos Y: " + nuevo.y + "\n");
                    fila.contadorColumnas++;
                }
                posX = 0;

                //ultimo.abajo = fila.primero;
                //ultimo.primero.abajo = fila.primero;
                ultimo.siguiente = fila;
                fila.anterior = ultimo;
                ultimo = fila;
               //fila.primero.arriba = ultimo;
                //fila.primero.arriba = ultimo.primero;
                //ultimo = fila.primero;
                //ultimo = fila;

                //actual1 = primero.siguiente;
                //actual2 = primero.abajo.siguiente;
                actualColumna = primero.primero;
                actualFila = primero.siguiente;

                actual1 = actualColumna;
                actual2 = actualFila.siguiente.primero;

                for (int p = 1; p <= fila.contadorColumnas; p++) {
                    actual1.abajo = actual2;
                    actual2.arriba = actual1;

                    actual1 = actual1.siguiente;
                    actual2 = actual2.siguiente;
                }
            }
            posX = 0;
            contadorFilas++;

            posY -= 100;

        }
    }

    public void cargarMatriz() {

        ListaMatriz actualFila;
        NodoMatriz actualColumna;

        actualFila = primero;

        for (int i = 1; i <= contadorFilas; i++) {
            ListaMatriz fila = new ListaMatriz();
            actualColumna = fila.primero;
            System.out.println("*****************Fila No. " + i + " **********************");
            if (primero == null) {

                primero = fila;
                ultimo = primero;

                for (int z = 1; z <= actualFila.contadorColumnas; z++) {
                    System.out.println(z);
                    NodoMatriz nuevo = new NodoMatriz(z, i, actualColumna.nombreImagen, actualColumna.nombreElemento, actualColumna.tipo);// z = coordenada X ; i = coordenada Y
                    //nuevo.setBounds(posX, posY, 100, 100);
                    //nuevo.setLocation(posX, posY);
                    //nuevo.setIcon(new ImageIcon(getClass().getResource("piedra.png")));
                    //nuevo.setVisible(true);

                    if (fila.primero == null) {
                        fila.primero = nuevo;
                        fila.ultimo = fila.primero;
                        //primero = fila.primero;

                    } else {
                        fila.ultimo.siguiente = nuevo;
                        nuevo.anterior = fila.ultimo;
                        fila.ultimo = nuevo;
                    }
                    posX += 100;
                    System.out.println("Pos X: " + nuevo.x + " Pos Y: " + nuevo.y + "\n");
                    fila.contadorColumnas++;
                }

                posX = 0;
            } else {

                ultimo.siguiente = fila;
                fila.anterior = ultimo;
                ultimo = fila;

                for (int z = 1; z <= 4; z++) {
                    NodoMatriz nuevo = new NodoMatriz(z, i, actualColumna.nombreImagen, actualColumna.nombreElemento, actualColumna.tipo);   // z = coordenada X ; i = coordenada Y
                    //nuevo.setBounds(posX, posY, 100, 100);
                    //nuevo.setLocation(posX, posY);
                    //nuevo.setIcon(new ImageIcon(getClass().getResource("piedra.png")));
                    //nuevo.setVisible(true);

                    if (fila.primero == null) {
                        fila.primero = nuevo;
                        fila.ultimo = fila.primero;
                        //primero = fila.primero;

                    } else {
                        fila.ultimo.siguiente = nuevo;
                        nuevo.anterior = fila.ultimo;
                        fila.ultimo = nuevo;
                    }
                    posX += 100;
                    System.out.println("Pos X: " + nuevo.x + " Pos Y: " + nuevo.y + "\n");
                    fila.contadorColumnas++;
                }
                posX = 0;

                //ultimo.abajo = fila.primero;
                //ultimo.primero.abajo = fila.primero;
                ultimo.siguiente = fila;
                fila.anterior = ultimo;
                ultimo = fila;
               //fila.primero.arriba = ultimo;
                //fila.primero.arriba = ultimo.primero;
                //ultimo = fila.primero;
                //ultimo = fila;

                //actual1 = primero.siguiente;
                //actual2 = primero.abajo.siguiente;
                actualColumna = primero.primero;
                actualFila = primero.siguiente;

                actual1 = actualColumna;
                actual2 = actualFila.siguiente.primero;

                for (int p = 1; p <= fila.contadorColumnas; p++) {
                    actual1.abajo = actual2;
                    actual2.arriba = actual1;

                    actual1 = actual1.siguiente;
                    actual2 = actual2.siguiente;
                }
            }
            posX = 0;
            contadorFilas++;

            posY -= 100;

        }
    }

    public void agregarColumna() {
        ListaMatriz tempFila;
        ListaMatriz tF, tF2;
        NodoMatriz tempColumna;
        tempFila = primero;

        if (tempFila == null) {
            System.out.println("matriz vacia");
        } else {
            for (int i = 1; i <= contadorFilas; i++) {

                tempColumna = tempFila.primero;

                for (int a = 1; a <= tempFila.contadorColumnas; a++) {
                    if (tempColumna.siguiente != null) {
                        tempColumna = tempColumna.siguiente;
                    }

                }

                NodoMatriz nuevo = new NodoMatriz(tempFila.contadorColumnas + 1, i, "fondo1.jpg", null, tempColumna.tipo);

                tempColumna.siguiente = nuevo;
                nuevo.anterior = tempColumna;
                tempFila.ultimo = nuevo;

                tempFila.contadorColumnas++;

                if (tempFila.siguiente != null) {
                    tempFila = tempFila.siguiente;
                } else {
                    System.out.println("es la ultima fila");
                }

            }
            tF = primero;
            tF2 = tF.siguiente;

            actual1 = tF.ultimo;
            actual2 = tF.siguiente.ultimo;

            for (int p = 1; p <= contadorFilas; p++) {

                // actual1 = tF.ultimo;
                actual1.abajo = actual2;
                actual2.arriba = actual1;
                if (tF.siguiente != null) {
                    //actual2 = tF.siguiente.ultimo;
                    //actual2 = tF2.ultimo;
                    //actual1.abajo = actual2;
                    //actual2.arriba = actual1;
                    tF = tF.siguiente;
                    actual1 = tF.ultimo;
                    if (tF.siguiente != null) {
                        actual2 = tF.siguiente.ultimo;
                    }

//tF2 = tF2.siguiente;
                }

                if (tF.siguiente != null) {
                    tF = tF.siguiente;
                }

            }

        }

    }

    public void agregarFila() {
        ListaMatriz temp;
        NodoMatriz tempColumna;

        NodoMatriz actual1, actual2;

        int y = 0;
        temp = ultimo;

        if (primero == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "No existe la matriz");
        } else {
            ListaMatriz nuevaFila = new ListaMatriz();
            y = ultimo.primero.y;
            ultimo.siguiente = nuevaFila;
            nuevaFila.anterior = ultimo;
            ultimo = nuevaFila;

            for (int z = 1; z <= temp.contadorColumnas; z++) {
                System.out.println(z);
                NodoMatriz nuevo = new NodoMatriz(z, y + 1, "fondo1.jpg", null, 0);// z = coordenada X ; i = coordenada Y
                //nuevo.setBounds(posX, posY, 100, 100);
                //nuevo.setLocation(posX, posY);
                //nuevo.setIcon(new ImageIcon(getClass().getResource("piedra.png")));
                //nuevo.setVisible(true);

                if (nuevaFila.primero == null) {
                    nuevaFila.primero = nuevo;
                    nuevaFila.ultimo = nuevaFila.primero;
                    //primero = fila.primero;

                } else {
                    nuevaFila.ultimo.siguiente = nuevo;
                    nuevo.anterior = nuevaFila.ultimo;
                    nuevaFila.ultimo = nuevo;
                }
                posX += 100;
                System.out.println("Pos X: " + nuevo.x + " Pos Y: " + nuevo.y + "\n");
                nuevaFila.contadorColumnas++;
            }

            actual1 = ultimo.primero;
            actual2 = ultimo.anterior.primero;

            for (int j = 1; j <= primero.contadorColumnas; j++) {
                actual1.abajo = actual2;
                actual2.arriba = actual1;

                if (actual1.siguiente != null && actual2.siguiente != null) {
                    actual1 = actual1.siguiente;
                    actual2 = actual2.siguiente;
                }

            }

        }

        contadorFilas++;
    }

    public void eliminarColumna(int idColumna) {
        ListaMatriz tempFila;
        NodoMatriz tempColumna, temp;

        tempFila = primero;

        for (int i = 1; i <= contadorFilas; i++) {
            tempColumna = tempFila.primero;

            if (tempColumna.x == idColumna) {
                tempFila.primero = tempColumna.siguiente;
                tempColumna = null;
            } else {
                while (tempColumna.x != idColumna) {

                    if (tempColumna.siguiente != null) {
                        tempColumna = tempColumna.siguiente;
                    } else {
                        tempColumna = tempFila.ultimo;
                    }
                    
                    
                }
                
                if(tempColumna == tempFila.ultimo){
                        tempFila.ultimo = tempColumna.anterior;
                        tempFila.ultimo.siguiente = null;
                        tempColumna = null;
                        
                    }
                    else{
                        temp = tempColumna.anterior;
                        temp.siguiente = tempColumna.siguiente;
                        tempColumna.siguiente.anterior = temp;
                        
                    }
            }
            
            tempFila.contadorColumnas--;
            
            if(tempFila.siguiente != null){
                tempFila = tempFila.siguiente;
            }
            
            
        }
        //tempFila.contadorColumnas--;
    }

    public void graficarMatriz() {

        ListaMatriz tempFila;
        NodoMatriz tempColumna1, tempColumna2;

        FileWriter fichero = null;
        PrintWriter pw = null;

        tempFila = primero;

        if (tempFila == null) {
            System.out.println("La matriz se encuentra vacia");
        } else {

            try {

                fichero = new FileWriter("matriz.dot");
                pw = new PrintWriter(fichero);

                pw.println("digraph Matriz{");
                pw.println("node[shape=record];");

                //tempColumna1 = tempFila.primero;
                for (int i = 1; i <= contadorFilas; i++) {

                    //pw.println("rank = same; node;");
                    tempColumna1 = tempFila.primero;
                    pw.println("subgraph Fila_" + i + "{");

                    pw.println("node[shape=record;];");

                    //pw.println("rankdir=\"LR\";");
                    for (int j = 1; j <= tempFila.contadorColumnas; j++) {

                        int y = i * 10;
                        int id = y + tempColumna1.x;
                        //int id21 = y + tempColumna1.siguiente.x;

                        String codigo = "x_" + id + "[label = \"ID_Elemento: " + tempColumna1.x + " \\n Nombre: " + tempColumna1.nombreElemento + "\\n Tipo:" + tempColumna1.nombreImagen + "\"];\n";
                        //String codigo1 = "y_" + tempColumna1.x + "[label = \"ID_Elemento: " + tempColumna1.x + " \\n Nombre: " + tempColumna1.nombreElemento + "\\n Tipo:" + tempColumna1.x + "\"];\n";

                        pw.println(codigo);

                        if (tempColumna1.siguiente != null) {

                            int id2 = y + tempColumna1.siguiente.x;

                            String sentencia = "x_" + id + "->x_" + id2 + ";";
                            pw.println(sentencia);
                            String sentencia2 = "x_" + id2 + "->x_" + id + ";";
                            pw.println(sentencia2);
                            pw.println("rankdir = LR;");

                            if (tempColumna1.abajo != null) {
                                int idY1 = (10 * tempColumna1.abajo.y) + tempColumna1.x;
                                String sentencia3 = "x_" + id + "->x_" + idY1 + ";";
                                pw.println(sentencia3);

                                String sentencia4 = "x_" + idY1 + "->x_" + id + ";";
                                pw.println(sentencia4);

                                //pw.println("rankdir = TB;");
                            }

                            tempColumna1 = tempColumna1.siguiente;

                            pw.println("rankdir = LR;");
                            pw.println("{rank = same; x_" + id + "; x_" + id2 + ";}");
                        } else {
                            if (tempColumna1.abajo != null) {
                                int idY1 = (10 * tempColumna1.abajo.y) + tempColumna1.x;
                                String sentencia3 = "x_" + id + "->x_" + idY1 + ";";
                                pw.println(sentencia3);

                                String sentencia4 = "x_" + idY1 + "->x_" + id + ";";
                                pw.println(sentencia4);

                                //pw.println("rankdir = TB;");
                            }
                        }

                    }

                    if (tempFila.siguiente != null) {
                        tempFila = tempFila.siguiente;
                    }

                    pw.println("}\n");

                }

                pw.println("}\n");

                try {

//path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz
                    String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

//path del archivo creado con el codigo del graphviz que queremos
                    String fileInputPath = "C:\\Users\\Luiskr\\Documents\\NetBeansProjects\\EDDPractica1\\matriz.dot";

//path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz
                    String fileOutputPath = "C:\\Users\\Luiskr\\Documents\\NetBeansProjects\\EDDPractica1\\src\\eddpractica1\\matrizJuego.jpg";

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
                    rt.exec(cmd);

                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    // Nuevamente aprovechamos el finally para 
                    // asegurarnos que se cierra el fichero.
                    if (null != fichero) {
                        fichero.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
