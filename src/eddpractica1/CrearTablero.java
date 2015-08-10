/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Luiskr
 */
public class CrearTablero extends javax.swing.JFrame {

    /**
     * Creates new form CrearTablero
     */
    int x = 0;
    int y = 600;
    String name;
    Lista lista = new Lista();
    MatrizLogica matriz = new MatrizLogica();
        
        
    public CrearTablero() {
        
        
        initComponents();
        
        matriz.crearMatriz();
        
        ListaMatriz apuntadorFila;
        NodoMatriz apuntadorColumna;
        
        apuntadorFila = matriz.primero;
        for(int i = 1; i<= matriz.contadorFilas; i++){
            apuntadorColumna = apuntadorFila.primero;
            
            for(int z=1; z<=apuntadorFila.contadorColumnas; z++){
               
                jPanel1.add(apuntadorColumna);
                apuntadorColumna.nombreImagen = "piedra.png";
                apuntadorColumna.setBounds(x, y, 100, 100);
                apuntadorColumna.setText("("+x+","+y+")");
                apuntadorColumna.setIcon(new ImageIcon(getClass().getResource(apuntadorColumna.nombreImagen)));
               apuntadorColumna.setVisible(true);
               
                
                if(apuntadorColumna.siguiente != null){
                    apuntadorColumna = apuntadorColumna.siguiente;
                }
                
                x+=100;
            }
            
            
            
            if(apuntadorFila.siguiente !=  null){
                apuntadorColumna = null;
                apuntadorFila = apuntadorFila.siguiente;
            }
            x=0;
            y-=100;
            
        }
        
        
       
        //jPanel1.add(matriz.primero.siguiente.primero);
        //jPanel1.add(matriz.ultimo.ultimo);
        
        /*
        for(int i  = 1; i<=2; i++){
            for(int a = 1; a<=4; a++){
                JButton casilla = new JButton();
                //jScrollPane1.add(casilla);
               // MouseListener listener = new DragMouseAdapter();
                casilla.setBounds(x ,y, 100, 100);
                
               jPanel1.add(casilla);
                casilla.setText("Casilla"+a);
                casilla.setBackground(Color.white);
                casilla.setName("casilla"+x);
                //casilla.addMouseListener(this);
                casilla.setVisible(true);
                
                x+=100;
                
                System.out.println("Se ha creado la casilla: "+a +" Fila:"+i);
                name = casilla.getName();
                System.out.println("Boton:"+name);
               
            }
            x=0;
            y-=100;
        }
        */
        
        
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(700, 1200));

        jLabel1.setText("Imagen a insertar");
        jLabel1.setEnabled(false);

        jRadioButton2.setText("Forma de Cola");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(153, 204, 255));
        jRadioButton1.setText("Forma de Pila");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("Carga de Elementos en forma de:");

        jButton1.setText("Cargar Elementos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1091, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton2.setText("Insertar a Tablero");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Pos. X:");

        jLabel3.setText("Pos. Y:");

        jLabel4.setText("0");

        jLabel5.setText("0");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setText("nombre");

        jButton3.setText("Agregar Columna");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("AgregarFila");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setText("jLabel8");

        jButton5.setText("Jugar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jRadioButton2)
                                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addContainerGap(27, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(63, 63, 63)))
                                .addGap(15, 15, 15))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        jRadioButton2.setEnabled(false);
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jRadioButton1.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            jLabel1.setIcon(new ImageIcon(getClass().getResource(lista.ultimo.nombreImagen)));
            jLabel7.setText(lista.ultimo.nombreImagen);
            jLabel8.setText(lista.ultimo.nombreElemento);
        }
        else if(jRadioButton2.isSelected()){
            jLabel1.setIcon(new ImageIcon(getClass().getResource(lista.primero.nombreImagen)));
            jLabel7.setText(lista.primero.nombreImagen);
            jLabel8.setText(lista.primero.nombreElemento);
        }
        
        jLabel1.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int idColumna = Integer.parseInt(jTextField1.getText());
        int idFila = Integer.parseInt(jTextField2.getText());
        
        
        
        NodoMatriz tempColumna;
        ListaMatriz tempFila;
        
        tempFila = matriz.primero;
        
        if(idFila > matriz.contadorFilas || idColumna > tempFila.contadorColumnas){
            JOptionPane.showMessageDialog(
                null,
                "Coordenada incorrecta, no existe coordenada");
            
        
        }
        else{
            if(tempFila == null){
            JOptionPane.showMessageDialog(
                null,
                "no hay elementos en la matriz");
        }
        else{
           while(idFila != tempFila.primero.y){
               if(tempFila.siguiente != null){
                   tempFila = tempFila.siguiente;
               }
               else{
                   JOptionPane.showMessageDialog(
                null,
                "No existe la Fila donde se desea insertar el Elemento");
                   
               }
           }
           
           tempColumna = tempFila.primero;
           
           while(tempColumna.x != idColumna){
               if(tempColumna.siguiente != null){
                   tempColumna = tempColumna.siguiente;
               }
               else{
                   JOptionPane.showMessageDialog(
                null,
                "No existe la columna donde se desea insertar el elemento");
                
               }
           }
           
           tempColumna.nombreImagen = jLabel7.getText();
           tempColumna.nombreElemento = jLabel8.getText();
           
        }
        
         jPanel1.removeAll();
        
        int x = 0;
        int y = 600;
        
        ListaMatriz apuntadorFila;
        NodoMatriz apuntadorColumna;
        
        apuntadorFila = matriz.primero;
        for(int i = 1; i<= matriz.contadorFilas; i++){
            apuntadorColumna = apuntadorFila.primero;
            
            for(int z=1; z<=apuntadorFila.contadorColumnas; z++){
               
                jPanel1.add(apuntadorColumna);
               
                String idImg = apuntadorColumna.nombreImagen;
                apuntadorColumna.setBounds(x, y, 100, 100);
                apuntadorColumna.setText("("+x+","+y+")");
                apuntadorColumna.setIcon(new ImageIcon(getClass().getResource(idImg)));
               apuntadorColumna.setVisible(true);
               
                
                if(apuntadorColumna.siguiente != null){
                    apuntadorColumna = apuntadorColumna.siguiente;
                }
                
                x+=100;
            }
            
            
            
            if(apuntadorFila.siguiente !=  null){
                apuntadorColumna = null;
                apuntadorFila = apuntadorFila.siguiente;
            }
            x=0;
            y-=100;
            
        }
        
       if(jRadioButton1.isSelected()){
            if(lista.contadorNodos!=0){
                lista.eliminarFinal();
                jLabel1.setIcon(new ImageIcon(getClass().getResource(lista.ultimo.nombreImagen)));
                
                jLabel7.setText(lista.ultimo.nombreImagen);
            }
            else
            {
                JOptionPane.showMessageDialog(
                null,
                "Ya no hay elementos para agregar");
            }
          
        }
        else if(jRadioButton2.isSelected()){
            if(lista.contadorNodos!=0){
                lista.eliminarInicio();
                if(lista.primero != null){
                    jLabel1.setIcon(new ImageIcon(getClass().getResource(lista.primero.nombreImagen)));
                    
                    jLabel7.setText(lista.primero.nombreImagen);
                }
                
                else{
                    JOptionPane.showMessageDialog(
                null,
                "Ya no hay elementos para agregar");
                }
                
                    
            }
            else
            {
                JOptionPane.showMessageDialog(
                null,
                "Ya no hay elementos para agregar");
 
                
            }
            
        }
        }
        
        
        
        
        
        
         
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        matriz.agregarColumna();
        
        jPanel1.removeAll();
        
        int x = 0;
        int y = 600;
        
        ListaMatriz apuntadorFila;
        NodoMatriz apuntadorColumna;
        
        apuntadorFila = matriz.primero;
        for(int i = 1; i<= matriz.contadorFilas; i++){
            apuntadorColumna = apuntadorFila.primero;
            
            for(int z=1; z<=apuntadorFila.contadorColumnas; z++){
               
                jPanel1.add(apuntadorColumna);
                //apuntadorColumna.nombreImagen = "piedra.png";
                apuntadorColumna.setBounds(x, y, 100, 100);
                apuntadorColumna.setText("("+x+","+y+")");
                apuntadorColumna.setIcon(new ImageIcon(getClass().getResource(apuntadorColumna.nombreImagen)));
               apuntadorColumna.setVisible(true);
               
                
                if(apuntadorColumna.siguiente != null){
                    apuntadorColumna = apuntadorColumna.siguiente;
                }
                
                x+=100;
            }
            
            
            
            if(apuntadorFila.siguiente !=  null){
                apuntadorColumna = null;
                apuntadorFila = apuntadorFila.siguiente;
            }
            x=0;
            y-=100;
            
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        matriz.agregarFila();
        
         jPanel1.removeAll();
        
        int x = 0;
        int y = 600;
        
        ListaMatriz apuntadorFila;
        NodoMatriz apuntadorColumna;
        
        apuntadorFila = matriz.primero;
        for(int i = 1; i<= matriz.contadorFilas; i++){
            apuntadorColumna = apuntadorFila.primero;
            
            for(int z=1; z<=apuntadorFila.contadorColumnas; z++){
               
                jPanel1.add(apuntadorColumna);
                //apuntadorColumna.nombreImagen = "piedra.png";
                apuntadorColumna.setBounds(x, y, 100, 100);
                apuntadorColumna.setText("("+x+","+y+")");
                apuntadorColumna.setIcon(new ImageIcon(getClass().getResource(apuntadorColumna.nombreImagen)));
               apuntadorColumna.setVisible(true);
               
                
                if(apuntadorColumna.siguiente != null){
                    apuntadorColumna = apuntadorColumna.siguiente;
                }
                
                x+=100;
            }
            
            
            
            if(apuntadorFila.siguiente !=  null){
                apuntadorColumna = null;
                apuntadorFila = apuntadorFila.siguiente;
            }
            x=0;
            y-=100;
            
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Juego juego = new Juego();
        juego.matrizJuego = matriz;
        juego.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

   
}
