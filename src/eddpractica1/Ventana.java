/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eddpractica1;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
/**
 *
 * @author Luiskr
 */
public class Ventana extends javax.swing.JFrame {

Lista lista = new Lista();

//Image mario = new ImageIcon("mario.png").getImage();
    
    

    /**
     * Creates new form Ventana
     */
    public Ventana() {
       
        initComponents();
        Boton1.setIcon(new ImageIcon(getClass().getResource("marioCorre.gif")));
        Boton2.setIcon(new ImageIcon(getClass().getResource("goomba.png")));
        Boton3.setIcon(new ImageIcon(getClass().getResource("koopa.png")));
        Boton4.setIcon(new ImageIcon(getClass().getResource("pared.png")));
        Boton5.setIcon(new ImageIcon(getClass().getResource("ficha.png")));
        Boton6.setIcon(new ImageIcon(getClass().getResource("suelo.png")));
        Boton7.setIcon(new ImageIcon(getClass().getResource("piedra.png")));
        Boton8.setIcon(new ImageIcon(getClass().getResource("hongo.png")));
        Boton9.setIcon(new ImageIcon(getClass().getResource("castillo.png")));
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreObjeto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });

        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Panel de Objetos de Juego");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton7, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(Boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Boton2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(Boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Boton6, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addComponent(Boton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Boton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(Boton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Boton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton6, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Boton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton9, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addGap(86, 86, 86))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setAutoscrolls(true);

        jLabel2.setBackground(new java.awt.Color(204, 255, 51));

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Objeto a Agregar al Escenario");

        nombreObjeto.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        nombreObjeto.setText("Nombre de Objeto");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Nuevo Nombre:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente ->");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ver Elementos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre Asignado");

        jLabel7.setText("Id de elemento agregado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel3)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(339, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(59, 59, 59)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nombreObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(101, 101, 101)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(300, 300, 300)
                    .addComponent(jLabel7)
                    .addContainerGap(398, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
         
         jLabel2.setIcon(new ImageIcon(getClass().getResource("mario2.png")));
         nombreObjeto.setText("mario2.png");
         
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        jLabel2.setIcon(new ImageIcon(getClass().getResource("hongo.png")));
        nombreObjeto.setText("hongo.png");
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        jLabel2.setIcon(new ImageIcon(getClass().getResource("castillo.png")));
        nombreObjeto.setText("castillo.png");
    }//GEN-LAST:event_Boton9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        jLabel2.setIcon(new ImageIcon(getClass().getResource("goomba.png")));
        nombreObjeto.setText("goomba.png");
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
       jLabel2.setIcon(new ImageIcon(getClass().getResource("koopa.png")));
       nombreObjeto.setText("koopa.png");
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
       jLabel2.setIcon(new ImageIcon(getClass().getResource("pared.png")));
       nombreObjeto.setText("pared.png");
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
       jLabel2.setIcon(new ImageIcon(getClass().getResource("ficha.png")));
       nombreObjeto.setText("ficha.png");
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        jLabel2.setIcon(new ImageIcon(getClass().getResource("suelo.png")));
        nombreObjeto.setText("suelo.png");
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        jLabel2.setIcon(new ImageIcon(getClass().getResource("piedra.png")));
        nombreObjeto.setText("piedra.png");
    }//GEN-LAST:event_Boton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String nombreImagen; //ruta de la imagen que se desea agregar
       String nombreElemento; //nombre nuevo dado al elemento, por el usuario
       
       int x = 250;
       int y = 0;
       int y1 = 0;
       nombreImagen = nombreObjeto.getText();
       nombreElemento = jTextField1.getText();
       
       lista.insertar(nombreImagen, nombreElemento);
       
       Nodo temp;
       temp = lista.ultimo;
       
       if(temp == null){
           System.out.println("esta vacia la lista");
       }
       else
       {
           String id = "ID: " + String.valueOf(temp.id);
           jLabel4.setIcon(new ImageIcon(getClass().getResource(temp.nombreImagen)));
           jLabel7.setText(id);
           jLabel6.setText("Nombre: "+temp.nombreElemento);
       }
       
       
       /*for(int i = 1; i <= lista.contadorNodos ; i++){
           JLabel label = new JLabel();
           
           y1+=100;
           
           if(y1 > 650){
               y1=100;
               x=x+100;
               if(x>1180){
                   
                   JScrollPane  barras = new JScrollPane(jPanel2);
                   jPanel2.add(barras);
                   
                   
               }
           }
           jPanel2.add(label);
           
           
           label.setVisible(true);
           label.setIcon(new ImageIcon(getClass().getResource(temp.nombreImagen)));
           String id = String.valueOf(temp.id);
           label.setText(id);
           label.setBounds(x,y1,100,100);
           //jScrollPane1.getViewport().add(label, i);
           temp = temp.siguiente;
           jTextField1.setText("");
           jTextField1.setCursor(null);
           //label.setLocation(x, y+100);
       }*/
       
        System.out.println("\n-------------------------Lista de Elementos-----------------------------------------------\n");
       lista.imprimir2();
      
       
       jTextField1.setText("");
       
       
             
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        CrearTablero crearTab = new CrearTablero();
        crearTab.lista = lista;
        crearTab.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Elementos verElementos = new Elementos();
        
        verElementos.lista = lista;
        verElementos.show();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nombreObjeto;
    // End of variables declaration//GEN-END:variables
}
