
package SopaDeLetras;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 * Interfaz gr&aacute;fica del programa.
 */
public final class UsaGrafo extends javax.swing.JFrame {
    Grafo sopa = new Grafo();
    String solucion = "";
    File fichero = null;
    String parteDic = "";
    String parteTab = "";
    
    /**
     * Constructor de la interfaz gr&aacute;fica.
     * 
     */
    public UsaGrafo() {
        initComponents();
        transparencia(false);
        this.setLocationRelativeTo(null);
        
    }
    
    /**
     * Muestra u oculta los botones de la interfaz gr&aacute;fica
     * 
     * @param x Determina la visivilidad de los botones
     */
    public void transparencia(boolean x){
    jButton0.setOpaque(x);
    jButton0.setContentAreaFilled(x);
    jButton0.setBorderPainted(x);
    jButton0.setEnabled(x);

    jButton1.setOpaque(x);
    jButton1.setContentAreaFilled(x);
    jButton1.setBorderPainted(x);
    jButton1.setEnabled(x); 

    jButton2.setOpaque(x);
    jButton2.setContentAreaFilled(x);
    jButton2.setBorderPainted(x);
    jButton2.setEnabled(x);

    jButton3.setOpaque(x);
    jButton3.setContentAreaFilled(x);
    jButton3.setBorderPainted(x);
    jButton3.setEnabled(x);

    jButton4.setOpaque(x);
    jButton4.setContentAreaFilled(x);
    jButton4.setBorderPainted(x);
    jButton4.setEnabled(x);

    jButton5.setOpaque(x);
    jButton5.setContentAreaFilled(x);
    jButton5.setBorderPainted(x);
    jButton5.setEnabled(x);

    jButton6.setOpaque(x);
    jButton6.setContentAreaFilled(x);
    jButton6.setBorderPainted(x);
    jButton6.setEnabled(x);

    jButton7.setOpaque(x);
    jButton7.setContentAreaFilled(x);
    jButton7.setBorderPainted(x);
    jButton7.setEnabled(x); 

    jButton8.setOpaque(x);
    jButton8.setContentAreaFilled(x);
    jButton8.setBorderPainted(x);
    jButton8.setEnabled(x);

    jButton9.setOpaque(x);
    jButton9.setContentAreaFilled(x);
    jButton9.setBorderPainted(x);
    jButton9.setEnabled(x); 

    jButton10.setOpaque(x);
    jButton10.setContentAreaFilled(x);
    jButton10.setBorderPainted(x);
    jButton10.setEnabled(x);

    jButton11.setOpaque(x);
    jButton11.setContentAreaFilled(x);
    jButton11.setBorderPainted(x);
    jButton11.setEnabled(x); 

    jButton12.setOpaque(x);
    jButton12.setContentAreaFilled(x);
    jButton12.setBorderPainted(x);
    jButton12.setEnabled(x); 

    jButton13.setOpaque(x);
    jButton13.setContentAreaFilled(x);
    jButton13.setBorderPainted(x);
    jButton13.setEnabled(x); 

    jButton14.setOpaque(x);
    jButton14.setContentAreaFilled(x);
    jButton14.setBorderPainted(x);
    jButton14.setEnabled(x);

    jButton15.setOpaque(x);
    jButton15.setContentAreaFilled(x);
    jButton15.setBorderPainted(x);
    jButton15.setEnabled(x);


    Reiniciar.setOpaque(x);
    Reiniciar.setContentAreaFilled(x);
    Reiniciar.setBorderPainted(x);
    Reiniciar.setEnabled(x);
    if(x==false){
        
        Reiniciar.setText("");
    }else{
        Reiniciar.setText("Quitar Seleccion");
    }
    Comprobar.setOpaque(x);
    Comprobar.setContentAreaFilled(x);
    Comprobar.setBorderPainted(x);
    Comprobar.setEnabled(x);
    if(x==false){
        
        Comprobar.setText("");
    }else{
        Comprobar.setText("Comprobar");
    }
    
        SolucionDFS.setOpaque(x);
        SolucionDFS.setContentAreaFilled(x);
        SolucionDFS.setBorderPainted(x);
        SolucionDFS.setEnabled(x);
        if (x == false) {

            SolucionDFS.setText("");
        } else {
            SolucionDFS.setText("Buscar todas las palabras DFS");
        }
        
        SolucionBFS.setOpaque(x);
        SolucionBFS.setContentAreaFilled(x);
        SolucionBFS.setBorderPainted(x);
        SolucionBFS.setEnabled(x);
        if (x == false) {

            SolucionBFS.setText("");
        } else {
            SolucionBFS.setText("Buscar todas las palabras BFS");
        }
        BusquedaBFS.setOpaque(x);
        BusquedaBFS.setContentAreaFilled(x);
        BusquedaBFS.setBorderPainted(x);
        BusquedaBFS.setEnabled(x);
        if (x == false) {

            BusquedaBFS.setText("");
        } else {
            BusquedaBFS.setText("Buscar una palabra");
        }
        
        ActualizarDiccionario.setOpaque(x);
        ActualizarDiccionario.setContentAreaFilled(x);
        ActualizarDiccionario.setBorderPainted(x);
        ActualizarDiccionario.setEnabled(x);
        if (x == false) {

            ActualizarDiccionario.setText("");
        } else {
            ActualizarDiccionario.setText("Actualizar Diccionario");
        }
    
    jButton0.setBackground(Color.WHITE);
    jButton1.setBackground(Color.WHITE);
    jButton2.setBackground(Color.WHITE);
    jButton3.setBackground(Color.WHITE);
    jButton4.setBackground(Color.WHITE);
    jButton5.setBackground(Color.WHITE);
    jButton6.setBackground(Color.WHITE);
        jButton7.setBackground(Color.WHITE);
        jButton8.setBackground(Color.WHITE);
        jButton9.setBackground(Color.WHITE);
        jButton10.setBackground(Color.WHITE);
        jButton11.setBackground(Color.WHITE);
        jButton12.setBackground(Color.WHITE);
        jButton13.setBackground(Color.WHITE);
        jButton14.setBackground(Color.WHITE);
        jButton15.setBackground(Color.WHITE);
        LeerArchivo.setBackground(Color.WHITE);
        Comprobar.setBackground(Color.WHITE);
        Reiniciar.setBackground(Color.WHITE);
        SolucionDFS.setBackground(Color.WHITE);
        SolucionBFS.setBackground(Color.WHITE);
        BusquedaBFS.setBackground(Color.WHITE);
        ActualizarDiccionario.setBackground(Color.WHITE);
        Salida.setVisible(x);
        Salida.setEditable(false);
        Salida.setEnabled(x);
        Nombres.setEditable(false);
        Nombres.setText("Diego Moreno, Daniel Echenique, Samuel Trujillo");
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        LeerArchivo = new javax.swing.JButton();
        Reiniciar = new javax.swing.JButton();
        Comprobar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextPane();
        SolucionDFS = new javax.swing.JButton();
        ActualizarDiccionario = new javax.swing.JButton();
        SolucionBFS = new javax.swing.JButton();
        BusquedaBFS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Nombres = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jButton0.setAlignmentY(0.0F);
        jButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButton1.setAlignmentY(0.0F);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setAlignmentY(0.0F);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setAlignmentY(0.0F);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setAlignmentY(0.0F);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setAlignmentY(0.0F);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton12.setAlignmentY(0.0F);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setAlignmentY(0.0F);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton2.setAlignmentY(0.0F);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setAlignmentY(0.0F);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setAlignmentY(0.0F);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setAlignmentY(0.0F);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton10.setAlignmentY(0.0F);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setAlignmentY(0.0F);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton14.setAlignmentY(0.0F);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setAlignmentY(0.0F);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        LeerArchivo.setText("Leer Archivo");
        LeerArchivo.setAlignmentY(0.0F);
        LeerArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LeerArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerArchivoActionPerformed(evt);
            }
        });

        Reiniciar.setText("Quitar Seleccion");
        Reiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });

        Comprobar.setText("Comprobar");
        Comprobar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarActionPerformed(evt);
            }
        });

        jCheckBox1.setText("jCheckBox1");

        jScrollPane1.setViewportView(Salida);

        SolucionDFS.setText("Buscar Todas las Palabras DFS");
        SolucionDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolucionDFSActionPerformed(evt);
            }
        });

        ActualizarDiccionario.setText("Actualizar Diccionario");
        ActualizarDiccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarDiccionarioActionPerformed(evt);
            }
        });

        SolucionBFS.setText("Buscar Todas las Palabras BFS");
        SolucionBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolucionBFSActionPerformed(evt);
            }
        });

        BusquedaBFS.setText("Buscar palabra");
        BusquedaBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaBFSActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(Nombres);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(Reiniciar)
                                .addGap(135, 135, 135)
                                .addComponent(Comprobar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton4))
                                                .addGap(5, 5, 5)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton1))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton6)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton12))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(5, 5, 5)
                                                        .addComponent(jButton13)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton14)))
                                            .addComponent(LeerArchivo, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton7)
                                            .addComponent(jButton3)
                                            .addComponent(jButton11)
                                            .addComponent(jButton15)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(SolucionBFS))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SolucionDFS))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(BusquedaBFS)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ActualizarDiccionario)
                                .addGap(23, 23, 23)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Reiniciar)
                            .addComponent(Comprobar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LeerArchivo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton0)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton14))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton13)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton12))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton15)))
                                .addGap(72, 72, 72))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SolucionDFS)
                                    .addComponent(SolucionBFS))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarDiccionario)
                    .addComponent(BusquedaBFS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        botones(0);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       botones(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        botones(4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        botones(5);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        botones(8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        botones(9);

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        botones(12);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        botones(13);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        botones(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       botones(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       botones(6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      botones(7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
     botones(10);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       botones(11);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
     botones(14);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        botones(15);
    }//GEN-LAST:event_jButton15ActionPerformed

    /**
     * Permite al usuario cargar un archivo txt de su computadora con la
     * informaci&oacute;n de la sopa de letras.
     *
     */
    private void LeerArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerArchivoActionPerformed
        // TODO add your handling code here:
        if(!archivoLeido()){
            JFileChooser fc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
            fc.setFileFilter(filtro);
        
        int seleccion = fc.showOpenDialog(this);
        
        if(seleccion== JFileChooser.APPROVE_OPTION) {
            fichero = fc.getSelectedFile();
            
            try (FileReader fr = new FileReader(fichero)){
                String cadena = "";
                int valor = fr.read();
                
                while(valor!= -1){
                    cadena = cadena + (char) valor;
                    valor = fr.read();
                }
                if(cadena.contains("/dic")){
                    parteDic = cadena.substring(cadena.indexOf("dic") + 3, cadena.indexOf("/dic"));
                    parteTab = cadena.substring(cadena.indexOf("tab") + 3, cadena.indexOf("/tab"));
                    String[] letras = parteTab.split(",");
                    int i = 0;
                    int l = 0;
                    for (String letra : letras) {

                        String letra2 = letra.replaceAll("\\s", "");

                        if(sopa.existeVertice(letra2)){
                            sopa.nuevoNodo(letra2 + l, i);
                            l++;
                        }else{

                            sopa.nuevoNodo(letra2, i);
                        }
                        i++;
                    }
                    Salida.setText(parteDic);
                    transparencia(true);
                    jButton0.setText(sopa.recorrerDatos(0).replaceAll("[0-9]",""));
                    jButton1.setText(sopa.recorrerDatos(1).replaceAll("[0-9]",""));
                    jButton2.setText(sopa.recorrerDatos(2).replaceAll("[0-9]",""));
                    jButton3.setText(sopa.recorrerDatos(3).replaceAll("[0-9]",""));
                    jButton4.setText(sopa.recorrerDatos(4).replaceAll("[0-9]",""));
                    jButton5.setText(sopa.recorrerDatos(5).replaceAll("[0-9]",""));
                    jButton6.setText(sopa.recorrerDatos(6).replaceAll("[0-9]",""));
                    jButton7.setText(sopa.recorrerDatos(7).replaceAll("[0-9]",""));
                    jButton8.setText(sopa.recorrerDatos(8).replaceAll("[0-9]",""));
                    jButton9.setText(sopa.recorrerDatos(9).replaceAll("[0-9]",""));
                    jButton10.setText(sopa.recorrerDatos(10).replaceAll("[0-9]",""));
                    jButton11.setText(sopa.recorrerDatos(11).replaceAll("[0-9]",""));
                    jButton12.setText(sopa.recorrerDatos(12).replaceAll("[0-9]",""));
                    jButton13.setText(sopa.recorrerDatos(13).replaceAll("[0-9]",""));
                    jButton14.setText(sopa.recorrerDatos(14).replaceAll("[0-9]",""));
                    jButton15.setText(sopa.recorrerDatos(15).replaceAll("[0-9]",""));
                    enlacesDerecha(0);
                    enlacesDerecha(4);
                    enlacesDerecha(8);
                    enlacesDerecha(12);
                    enlacesIzquierda(3);
                    enlacesIzquierda(7);
                    enlacesIzquierda(11);
                    enlacesIzquierda(15);
                    enlacesArriba(12);
                    enlacesArriba(8);
                    enlacesArriba(4);
                    enlacesAbajo(3);
                    enlacesAbajo(7);
                    enlacesAbajo(11);
                    enlacesSureste(0);
                    enlacesSureste(4);
                    enlacesSureste(8);
                    enlacesNoroeste(15);
                    enlacesNoroeste(11);
                    enlacesNoroeste(7);
                    enlacesSuroeste(3);
                    enlacesSuroeste(7);
                    enlacesSuroeste(11);
                    enlacesNoreste(12);
                    enlacesNoreste(8);
                    enlacesNoreste(4);

                    LeerArchivo.setOpaque(false);
                    LeerArchivo.setContentAreaFilled(false);
                    LeerArchivo.setBorderPainted(false);
                    LeerArchivo.setEnabled(false);
                    LeerArchivo.setText("");
                    
                }else{
                JOptionPane.showMessageDialog(null, "Archivo invalido");
                    
                }
                
            } catch (IOException el){
                JOptionPane.showMessageDialog(null, "Archivo invalido");
            }
        }
                
        }else{
                
                  JOptionPane.showMessageDialog(null, "Ya se ha cargado un archivo");
                }
        
    }//GEN-LAST:event_LeerArchivoActionPerformed

    /**
     * Deshace la selecci&oacute;n de letras.
     *
     */
    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        // TODO add your handling code here:
        solucion = "";
        if (jButton0.getBackground().equals(Color.BLUE)) {
                    jButton0.setBackground(Color.WHITE);
                }

                if (jButton1.getBackground().equals(Color.BLUE)) {
                    jButton1.setBackground(Color.WHITE);
                }

                if (jButton2.getBackground().equals(Color.BLUE)) {
                    jButton2.setBackground(Color.WHITE);
                }

                if (jButton3.getBackground().equals(Color.BLUE)) {
                    jButton3.setBackground(Color.WHITE);
                }

                if (jButton4.getBackground().equals(Color.BLUE)) {
                    jButton4.setBackground(Color.WHITE);
                }

                if (jButton5.getBackground().equals(Color.BLUE)) {
                    jButton5.setBackground(Color.WHITE);
                }

                if (jButton6.getBackground().equals(Color.BLUE)) {
                    jButton6.setBackground(Color.WHITE);
                }

                if (jButton7.getBackground().equals(Color.BLUE)) {
                    jButton7.setBackground(Color.WHITE);
                }

                if (jButton8.getBackground().equals(Color.BLUE)) {
                    jButton8.setBackground(Color.WHITE);
                }

                if (jButton9.getBackground().equals(Color.BLUE)) {
                    jButton9.setBackground(Color.WHITE);
                }

                if (jButton10.getBackground().equals(Color.BLUE)) {
                    jButton10.setBackground(Color.WHITE);
                }

                if (jButton11.getBackground().equals(Color.BLUE)) {
                    jButton11.setBackground(Color.WHITE);
                }

                if (jButton12.getBackground().equals(Color.BLUE)) {
                    jButton12.setBackground(Color.WHITE);
                }

                if (jButton13.getBackground().equals(Color.BLUE)) {
                    jButton13.setBackground(Color.WHITE);
                }

                if (jButton14.getBackground().equals(Color.BLUE)) {
                    jButton14.setBackground(Color.WHITE);
                }

                if (jButton15.getBackground().equals(Color.BLUE)) {
                    jButton15.setBackground(Color.WHITE);
                }
            
    }//GEN-LAST:event_ReiniciarActionPerformed

    /**
     * Comprueba si la palabra seleccionada est&aacute; en el diccionario.
     * Si est&aacute;, los botones cambian de color.
     */
    private void ComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarActionPerformed
        
        if(!"".equals(solucion)){
            String regex = "[0-9]";
            
            String palabraE = solucion.replaceAll(regex, "");
            String[] listaPalabras = parteDic.split("\\s");
            for (String palabraDicc : listaPalabras) {
                if (palabraE.equals(palabraDicc)) {
                    parteDic = parteDic.replaceAll(palabraE, palabraDicc);
                    if (jButton0.getBackground().equals(Color.BLUE)) {
                        jButton0.setBackground(Color.GREEN);
                    }

                    if (jButton1.getBackground().equals(Color.BLUE)) {
                        jButton1.setBackground(Color.GREEN);
                    }

                    if (jButton2.getBackground().equals(Color.BLUE)) {
                        jButton2.setBackground(Color.GREEN);
                    }

                    if (jButton3.getBackground().equals(Color.BLUE)) {
                        jButton3.setBackground(Color.GREEN);
                    }

                    if (jButton4.getBackground().equals(Color.BLUE)) {
                        jButton4.setBackground(Color.GREEN);
                    }

                    if (jButton5.getBackground().equals(Color.BLUE)) {
                        jButton5.setBackground(Color.GREEN);
                    }

                    if (jButton6.getBackground().equals(Color.BLUE)) {
                        jButton6.setBackground(Color.GREEN);
                    }

                    if (jButton7.getBackground().equals(Color.BLUE)) {
                        jButton7.setBackground(Color.GREEN);
                    }

                    if (jButton8.getBackground().equals(Color.BLUE)) {
                        jButton8.setBackground(Color.GREEN);
                    }

                    if (jButton9.getBackground().equals(Color.BLUE)) {
                        jButton9.setBackground(Color.GREEN);
                    }

                    if (jButton10.getBackground().equals(Color.BLUE)) {
                        jButton10.setBackground(Color.GREEN);
                    }

                    if (jButton11.getBackground().equals(Color.BLUE)) {
                        jButton11.setBackground(Color.GREEN);
                    }

                    if (jButton12.getBackground().equals(Color.BLUE)) {
                        jButton12.setBackground(Color.GREEN);
                    }

                    if (jButton13.getBackground().equals(Color.BLUE)) {
                        jButton13.setBackground(Color.GREEN);
                    }

                    if (jButton14.getBackground().equals(Color.BLUE)) {
                        jButton14.setBackground(Color.GREEN);
                    }

                    if (jButton15.getBackground().equals(Color.BLUE)) {
                        jButton15.setBackground(Color.GREEN);
                    }
                }
                
            }

            Salida.setText(parteDic);
            solucion = "";
            
            if (jButton0.getBackground().equals(Color.BLUE)) {
                jButton0.setBackground(Color.WHITE);
            }

            if (jButton1.getBackground().equals(Color.BLUE)) {
                jButton1.setBackground(Color.WHITE);
            }

            if (jButton2.getBackground().equals(Color.BLUE)) {
                jButton2.setBackground(Color.WHITE);
            }

            if (jButton3.getBackground().equals(Color.BLUE)) {
                jButton3.setBackground(Color.WHITE);
            }

            if (jButton4.getBackground().equals(Color.BLUE)) {
                jButton4.setBackground(Color.WHITE);
            }

            if (jButton5.getBackground().equals(Color.BLUE)) {
                jButton5.setBackground(Color.WHITE);
            }

            if (jButton6.getBackground().equals(Color.BLUE)) {
                jButton6.setBackground(Color.WHITE);
            }

            if (jButton7.getBackground().equals(Color.BLUE)) {
                jButton7.setBackground(Color.WHITE);
            }

            if (jButton8.getBackground().equals(Color.BLUE)) {
                jButton8.setBackground(Color.WHITE);
            }

            if (jButton9.getBackground().equals(Color.BLUE)) {
                jButton9.setBackground(Color.WHITE);
            }

            if (jButton10.getBackground().equals(Color.BLUE)) {
                jButton10.setBackground(Color.WHITE);
            }

            if (jButton11.getBackground().equals(Color.BLUE)) {
                jButton11.setBackground(Color.WHITE);
            }

            if (jButton12.getBackground().equals(Color.BLUE)) {
                jButton12.setBackground(Color.WHITE);
            }

            if (jButton13.getBackground().equals(Color.BLUE)) {
                jButton13.setBackground(Color.WHITE);
            }

            if (jButton14.getBackground().equals(Color.BLUE)) {
                jButton14.setBackground(Color.WHITE);
            }

            if (jButton15.getBackground().equals(Color.BLUE)) {
                jButton15.setBackground(Color.WHITE);
            }
        }
        
        
        
    }//GEN-LAST:event_ComprobarActionPerformed

    /**
     * Inicia la b&uacute;squeda por DFS.
     * Busca las palabras del diccionario en la sopa de letras por DFS
     * 
     */
    private void SolucionDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolucionDFSActionPerformed

        long startTime = System.currentTimeMillis();
        for(int i = 0; i<16; i++){
            sopa.dfs(sopa, sopa.recorrerNodos(i), parteDic);   
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        
        String palabrasE = sopa.getPalabrasE();
        String[] cadena = palabrasE.split(" ");
        String[] palabrasUnicas = new String[cadena.length];
        int contador = 0;

        for (String palabra : cadena) {
            if (!existePalabra(palabrasUnicas, palabra)) {
                palabrasUnicas[contador] = palabra;
                contador++;
            }
        }
        
        String[] palabrasUnicasSinNull = new String[contador];
        for (int i = 0; i < contador; i++) {
            palabrasUnicasSinNull[i] = palabrasUnicas[i];
        }
        
        String resultado = String.join(" ", palabrasUnicasSinNull);
        sopa.palabrasE = "";
        JOptionPane.showMessageDialog(null, resultado + "\n Se demoro " + executionTime + " milisegundos");
            

        
        
        
        
       
    }//GEN-LAST:event_SolucionDFSActionPerformed

    /**
     * Agrega una palabra al diccionario.
     * Al darle click al boton "Actualizar diccionario", permite al usuario
     * agregar una palabra al diccionario.
     */
    private void ActualizarDiccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarDiccionarioActionPerformed


        String newWord = JOptionPane.showInputDialog(null, "Escribe la palabra que quieras incluir en el diccionario");
        if(newWord != null){
            String newWordUppercase = newWord.toUpperCase();
            String[] cadena = parteDic.split("\\s");
            if (!existePalabra(cadena, newWordUppercase)) {
                parteDic = parteDic + newWordUppercase + "\n";
            }
        }

        Salida.setText(parteDic);

        
    }//GEN-LAST:event_ActualizarDiccionarioActionPerformed

    
    /**
     * Muestra el tiempo que tom&oacute; la funcion en realizarse.
     * 
     */
    private void SolucionBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolucionBFSActionPerformed
        
        long startTime = System.currentTimeMillis();
        String palabraActual = "";
        sopa.bfsRecursivo(sopa.recorrerNodos(0).dato.toString(), parteDic, palabraActual);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
                
        sopa.contadorIteraciones = 0;
        JOptionPane.showMessageDialog(null, sopa.palabrasBFS + "\n Se demoro " + executionTime +" milisegundos");
        sopa.palabrasE = "";
        sopa.palabrasBFS = "";
    }//GEN-LAST:event_SolucionBFSActionPerformed

    /**
     * Inicia la b&uacute;squeda por BFS.
     * Busca las palabras del diccionario en la sopa de letras por BFS
     * Si no se consigue ninguna, env&iacute;a un mensaje diciendo que
     * no se encontr&oacute; ninguna
     */
    private void BusquedaBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaBFSActionPerformed
        String input = JOptionPane.showInputDialog(null, "Ingrese la palabra a buscar");
        String inputMayus = input.toUpperCase();
        try{
        String palabraActual = "";
        String letra = inputMayus.substring(0, 1);
        sopa.bfsRecursivo(letra, parteDic, palabraActual);
        String[] palabrasEncontradas = sopa.palabrasBFS.split(", ");
        String palabrasLetra = "";
        for(String inicial : palabrasEncontradas){
            if (inicial.equals(inputMayus)){
                palabrasLetra += inicial;
            }
        }

        if(!"".equals(palabrasLetra)){
            JOptionPane.showMessageDialog(null, palabrasLetra + "\n SE HA ENCONTRADO\n EN LA SOPA DE LETRAS");
        }else{
             JOptionPane.showMessageDialog(null,"NO SE HA ENCONTRADO\n EN LA SOPA DE LETRAS");
        }
        sopa.contadorIteraciones = 0;
        sopa.palabrasE = "";
        sopa.palabrasBFS = "";
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "No se encontraron palabras");
        }
        
    /**
     * Comprueba si se ha le&iacute;do un archivo previamente.
     *
     * @return 'true' si se ha le&iacute;do un archivo, 'false' en caso contrario.
     */
    }//GEN-LAST:event_BusquedaBFSActionPerformed
    
    /**
     * Verifica si el archivo ya fue le&iacute;do.
     * 
     * @return 'true' si el archivo fue le&iacute;do, 'false' de lo contrario
     */
    public boolean archivoLeido(){
        return !"".equals(jButton0.getText());
    }
    
    /**
     * Verifica si una palabra existe en el diccionario.
     * 
     * @param cadena El diccionario.
     * @param palabra La palabra que se busca en el diccionario.
     * @return true si la palabra existe en el diccionario, false en caso contrario.
     */
    private static boolean existePalabra(String[] cadena, String palabra) {
        for (String p : cadena) {
            if (p != null && p.equals(palabra)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Crea enlaces hacia la derecha en el grafo a partir de un
     * &iacute;ndice inicial.
     * Este m&eacute;todo crea aristas entre nodos hacia la derecha.
     *
     * @param i El &iacute;ndice inicial desde el que se crean los enlaces.
     */
    public void enlacesDerecha(int i){
        
        for(int j = i+3; j>i; i++) {
            sopa.nuevaArista(sopa.recorrerDatos(i), sopa.recorrerDatos(i+1));
            
        } 
    }
    
    /**
     * Crea enlaces hacia la izquierda en el grafo a partir de un
     * &iacute;ndice inicial.
     * Este m&eacute;todo crea aristas entre nodos hacia la derecha.
     *
     * @param i El &iacute;ndice inicial desde el que se crean los enlaces.
     */
    public void enlacesIzquierda(int i){
        for(int j = i-3; j<i; i--) {
            if(i!=0){
                sopa.nuevaArista(sopa.recorrerDatos(i), sopa.recorrerDatos(i-1));
            }
        } 
    }
    
    /**
     * Crea enlaces hacia arriba en el grafo a partir de un
     * &iacute;ndice inicial.
     * Este m&eacute;todo crea aristas entre nodos hacia la derecha.
     *
     * @param i El &iacute;ndice inicial desde el que se crean los enlaces.
     */
    public void enlacesArriba(int i){
        for(int j = i+4; j>i; i++) {
                sopa.nuevaArista(sopa.recorrerDatos(i), sopa.recorrerDatos(i-4));
            
        } 
    }
    
    /**
     * Crea enlaces hacia abajo en el grafo a partir de un
     * &iacute;ndice inicial.
     * Este m&eacute;todo crea aristas entre nodos hacia la derecha.
     *
     * @param i El &iacute;ndice inicial desde el que se crean los enlaces.
     */
    public void enlacesAbajo(int i){
        for(int j = i-4; j<i; i--) {
                
                sopa.nuevaArista(sopa.recorrerDatos(i), sopa.recorrerDatos(i+4));
            
        } 
    }
    
    /**
     * Crea enlaces en diagonal hacia abajo a la derecha en el grafo a partir
     * de un &iacute;ndice inicial.
     * Este m&eacute;todo crea aristas entre nodos hacia la derecha.
     *
     * @param i El &iacute;ndice inicial desde el que se crean los enlaces.
     */
    public void enlacesSureste(int i){
        for(int j = i+3; j>i; i++) {
                
                sopa.nuevaArista(sopa.recorrerDatos(i), sopa.recorrerDatos(i+5));
            
        } 
    }
    
    /**
     * Crea enlaces en diagonal hacia arriba a la derecha en el grafo a partir
     * de un &iacute;ndice inicial.
     * Este m&eacute;todo crea aristas entre nodos hacia la derecha.
     *
     * @param i El &iacute;ndice inicial desde el que se crean los enlaces.
     */
    public void enlacesNoroeste(int i){
        for(int j = i-3; j<i; i--) {
                
                sopa.nuevaArista(sopa.recorrerDatos(i), sopa.recorrerDatos(i-5));
            
        } 
    }
    
    /**
     * Crea enlaces en diagonal hacia abajo a la izquierda en el grafo a partir
     * de un &iacute;ndice inicial.
     * Este m&eacute;todo crea aristas entre nodos hacia la derecha.
     *
     * @param i El &iacute;ndice inicial desde el que se crean los enlaces.
     */
    public void enlacesSuroeste(int i){
        for(int j = i-3; j<i; i--) {
                
                sopa.nuevaArista(sopa.recorrerDatos(i), sopa.recorrerDatos(i+3));
            
        } 
    }
    
    /**
     * Crea enlaces en diagonal hacia arriba a la derecha en el grafo a partir
     * de un &iacute;ndice inicial.
     * Este m&eacute;todo crea aristas entre nodos hacia la derecha.
     *
     * @param i El &iacute;ndice inicial desde el que se crean los enlaces.
     */
    public void enlacesNoreste(int i){
        for(int j = i+3; j>i; i++) {
                
                sopa.nuevaArista(sopa.recorrerDatos(i), sopa.recorrerDatos(i-3));
            
        } 
    }
    
    /**
     * Maneja la interacci&oacute;n con los botones de la interfaz gr&aacute;fica.
     *
     * @param i El &iacute;ndice del bot&oacute;n presionado.
     * @throws NullPointerException Si no se ha le&iacute;do ning&uacute;n
     * archivo y se intenta acceder a la variable 'solucion'.
     */
    public void botones(int i){
        if(!archivoLeido()){
        
            JOptionPane.showMessageDialog(null, "No se ha leido ningun archivo");
        }else{
            
            
            
            if("".equals(solucion)){
                switch(i){
                    case 0 -> {
                        if (!jButton0.getBackground().equals(Color.BLUE)) {
                            jButton0.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(0);
                        }
                    }
                    case 1 -> {
                        if (!jButton1.getBackground().equals(Color.BLUE)) {
                            jButton1.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(1);
                        }
                    }
                    case 2 -> {
                        if (!jButton2.getBackground().equals(Color.BLUE)) {
                            jButton2.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(2);
                        }
                    }
                    case 3 -> {
                        if (!jButton3.getBackground().equals(Color.BLUE)) {
                            jButton3.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(3);
                        }
                    }
                    case 4 -> {
                        if (!jButton4.getBackground().equals(Color.BLUE)) {
                            jButton4.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(4);
                        }
                    }
                    case 5 -> {
                        if (!jButton5.getBackground().equals(Color.BLUE)) {
                            jButton5.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(5);
                        }
                    }
                    case 6 -> {
                        if (!jButton6.getBackground().equals(Color.BLUE)) {
                            jButton6.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(6);
                        }
                    }
                    case 7 -> {
                        if (!jButton7.getBackground().equals(Color.BLUE)) {
                            jButton7.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(7);
                        }
                    }
                    case 8 -> {
                        if (!jButton8.getBackground().equals(Color.BLUE)) {
                            jButton8.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(8);
                        }
                    }
                    case 9 -> {
                        if (!jButton9.getBackground().equals(Color.BLUE)) {
                            jButton9.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(9);
                        }
                    }
                    case 10 -> {
                        if (!jButton10.getBackground().equals(Color.BLUE)) {
                            jButton10.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(10);
                        }
                    }
                    case 11 -> {
                        if (!jButton11.getBackground().equals(Color.BLUE)) {
                            jButton11.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(11);
                        }
                    }
                    case 12 -> {
                        if (!jButton12.getBackground().equals(Color.BLUE)) {
                            jButton12.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(12);
                        }
                    }
                    case 13 -> {
                        if (!jButton13.getBackground().equals(Color.BLUE)) {
                            jButton13.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(13);
                        }
                    }
                    case 14 -> {
                        if (!jButton14.getBackground().equals(Color.BLUE)) {
                            jButton14.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(14);
                        }
                    }
                    case 15 -> {
                        if (!jButton15.getBackground().equals(Color.BLUE)) {
                            jButton15.setBackground(Color.BLUE);
                            solucion = solucion + sopa.recorrerDatos(15);
                        }
                    }
                }
            }
            
            else{
                
            String ultimoCaracter = solucion.substring(solucion.length() - 1);
            if(Character.isDigit(ultimoCaracter.charAt(0))){

                ultimoCaracter = solucion.substring(solucion.length() - 2);


                if(solucion.length() > 1 && Character.isDigit(solucion.charAt(solucion.length() - 2))){
                    ultimoCaracter = solucion.substring(solucion.length() - 3);
                }
            }
                switch(i){
                    case (0) -> {
                        if (!jButton0.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(0).lista.adyacente(ultimoCaracter)) {
                                jButton0.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(0);
                            }
                        }
                    }
                    case (1) -> {
                        if (!jButton1.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(1).lista.adyacente(ultimoCaracter)) {
                                jButton1.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(1);
                            }
                        }
                    }
                    case (2) -> {
                        if (!jButton2.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(2).lista.adyacente(ultimoCaracter)) {
                                jButton2.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(2);
                            }
                        }
                    }
                    case (3) -> {
                        if (!jButton3.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(3).lista.adyacente(ultimoCaracter)) {
                                jButton3.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(3);
                            }
                        }
                    }
                    case (4) -> {
                        if (!jButton4.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(4).lista.adyacente(ultimoCaracter)) {
                                jButton4.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(4);
                            }
                        }
                    }
                    case (5) -> {
                        if (!jButton5.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(5).lista.adyacente(ultimoCaracter)) {
                                jButton5.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(5);
                            }
                        }
                    }
                    case (6) -> {
                        if (!jButton6.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(6).lista.adyacente(ultimoCaracter)) {
                                jButton6.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(6);
                            }
                        }
                    }
                    case (7) -> {
                        if (!jButton7.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(7).lista.adyacente(ultimoCaracter)) {
                                jButton7.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(7);
                            }
                        }
                    }
                    case (8) -> {
                        if (!jButton8.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(8).lista.adyacente(ultimoCaracter)) {
                                jButton8.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(8);
                            }
                        }
                    }
                    case (9) -> {
                        if (!jButton9.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(9).lista.adyacente(ultimoCaracter)) {
                                jButton9.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(9);
                            }
                        }
                    }
                    case (10) -> {
                        if (!jButton10.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(10).lista.adyacente(ultimoCaracter)) {
                                jButton10.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(10);
                            }
                        }
                    }
                    case (11) -> {
                        if (!jButton11.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(11).lista.adyacente(ultimoCaracter)) {
                                jButton11.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(11);
                            }
                        }
                    }
                    case (12) -> {
                        if (!jButton12.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(12).lista.adyacente(ultimoCaracter)) {
                                jButton12.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(12);
                            }
                        }
                    }
                    case (13) -> {
                        if (!jButton13.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(13).lista.adyacente(ultimoCaracter)) {
                                jButton13.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(13);
                            }
                        }
                    }
                    case (14) -> {
                        if (!jButton14.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(14).lista.adyacente(ultimoCaracter)) {
                                jButton14.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(14);
                            }
                        }
                    }
                    case (15) -> {
                        if (!jButton15.getBackground().equals(Color.BLUE)) {
                            if (sopa.recorrerNodos(15).lista.adyacente(ultimoCaracter)) {
                                jButton15.setBackground(Color.BLUE);
                                solucion = solucion + sopa.recorrerDatos(15);
                            }
                        }
                    }
                        
                }
            }
        }
    }
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarDiccionario;
    private javax.swing.JButton BusquedaBFS;
    private javax.swing.JButton Comprobar;
    private javax.swing.JButton LeerArchivo;
    private javax.swing.JTextPane Nombres;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JTextPane Salida;
    private javax.swing.JButton SolucionBFS;
    private javax.swing.JButton SolucionDFS;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
