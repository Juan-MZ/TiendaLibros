/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tiendalibros.presentacion;

import co.unicauca.tiendalibros.modelo.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class AgregarLibro extends javax.swing.JFrame {

    File Archivo;  //objeto tipo file para contener el archivo
    private final Lista<Autor> autores;
    private final Lista<Libro> catalogo;

    /**
     * Creates new form AgregarLibro
     */
    public AgregarLibro() {
        autores = new Lista<Autor>();
        catalogo = new Lista<Libro>();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        isbn = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        edicion = new javax.swing.JTextField();
        anio = new javax.swing.JTextField();
        editorial = new javax.swing.JTextField();
        idioma = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        resumen = new javax.swing.JTextPane();
        categoria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ruta = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        agrAutor = new javax.swing.JToggleButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar libro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 240, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Portada:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 90, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Titulo: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 70, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Edición: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 70, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Idioma: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 70, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Año: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 70, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ISBN: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 70, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Editorial:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 70, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Resumen:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 20));

        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText(Consola.Fecha());
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Autores:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 90, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Categoría:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 90, 20));

        imagen.setOpaque(true);
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 140, 190));

        error.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 533, 410, 20));

        Cancelar.setBackground(new java.awt.Color(255, 0, 0));
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cerrar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 120, 30));

        Agregar.setBackground(new java.awt.Color(51, 255, 102));
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 120, 30));
        getContentPane().add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 150, -1));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 220, -1));
        getContentPane().add(edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, -1));
        getContentPane().add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 60, -1));
        getContentPane().add(editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 220, -1));

        idioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Ingles" }));
        idioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idiomaActionPerformed(evt);
            }
        });
        getContentPane().add(idioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, -1));

        jScrollPane2.setFocusTraversalPolicyProvider(true);

        resumen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(resumen);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 300, 80));

        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programación", "sistemas operativos", "ingeniería de software", "redes", "seguridad informática", "gestión de proyectos informáticos", "otra" }));
        getContentPane().add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 180, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Examinar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 90, -1));

        ruta.setEditable(false);
        getContentPane().add(ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 280, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 140, -1));

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 140, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Apellido");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 140, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nombre");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 140, 20));

        agrAutor.setBackground(new java.awt.Color(0, 0, 0));
        agrAutor.setForeground(new java.awt.Color(255, 255, 255));
        agrAutor.setText("Agregar autor");
        agrAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrAutorActionPerformed(evt);
            }
        });
        getContentPane().add(agrAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Fondo.setOpaque(true);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idiomaActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        Libro libro = new Libro(
            Long.parseLong(isbn.getText()),
            titulo.getText(),
            edicion.getText(),
            idioma.getSelectedItem().toString(),
            anio.getText(),
            editorial.getText(),
            categoria.getSelectedItem().toString(),
            Consola.codificarImagen(Archivo),
            resumen.getText());
        libro.setListaAutores(autores);
        try {
            catalogo.insertar(libro, 0);
        } catch (PosicionIlegalException ex) {
            Logger.getLogger(AgregarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Catalogo.agregarLibro(catalogo, rootPane);
        } catch (PosicionIlegalException ex) {
            Logger.getLogger(AgregarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_AgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int resultado;

        Examinar Buscador = new Examinar();

        FileNameExtensionFilter formato = new FileNameExtensionFilter("JPG, PNG Y GIF", "jpg", "png", "gif");

        Buscador.Busq.setFileFilter(formato);

        resultado = Buscador.Busq.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == resultado) {

            Archivo = Buscador.Busq.getSelectedFile();

            ruta.setText(Archivo.getAbsolutePath());

            try {

                ImageIcon ImgIcon = new ImageIcon(Archivo.toString());

                Icon icono = new ImageIcon(ImgIcon.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));

                imagen.setIcon(icono);

            } catch (Exception ex) {
                error.setText("Error al abrir: " + ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void agrAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrAutorActionPerformed
        // TODO add your handling code here:
        Autor autor = new Autor(nombre.getText(), apellido.getText());
        this.autores.agregar(autor);
        nombre.setText("");
        apellido.setText("");
        JOptionPane.showMessageDialog(null, "Autor creado con exito.", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_agrAutorActionPerformed

    /**
     * @return Datos
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JToggleButton agrAutor;
    private javax.swing.JTextField anio;
    private javax.swing.JTextField apellido;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JTextField edicion;
    private javax.swing.JTextField editorial;
    private javax.swing.JLabel error;
    private javax.swing.JLabel fecha;
    private javax.swing.JComboBox<String> idioma;
    private javax.swing.JLabel imagen;
    private javax.swing.JTextField isbn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextPane resumen;
    private javax.swing.JTextField ruta;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
