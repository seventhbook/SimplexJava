/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Calculo.MetodoSimplex;
import java.util.Random;
import com.sun.awt.AWTUtilities;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Seventh
 */
public class Principial extends javax.swing.JFrame {

    private String[] arrayNombresC;
    private String[][] datosTabla;
    private Random rnd=new Random();
    private boolean listoParaCalcular=false;
    /**
     * Creates new form Principial
     */
    public Principial() {
        this.setUndecorated(true); 
        initComponents();
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
        AWTUtilities.setWindowShape(this, forma);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setTitle("Investigación de Operaciones y Sistemas");
            
        rbtnGrupo.add(rBtnMaximizar);
        rbtnGrupo.add(rBtnMinimizar);
        
        jcbNoVariable.setSelectedIndex(-1);
        jcbRestric.setSelectedIndex(-1);
        
        
    }
    
        //metodo para crear el modelo
    public DefaultTableModel crearModelo(String[] nomColums,String[][] datos){
        DefaultTableModel modelo= new DefaultTableModel(datos, nomColums);
        return modelo;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnGrupo = new javax.swing.ButtonGroup();
        panelPrincipal = new Grafico.panelImagen("/Recursos/text1.jpg");
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        etqTitulo = new javax.swing.JLabel();
        etqFunRealizar = new javax.swing.JLabel();
        rBtnMaximizar = new javax.swing.JRadioButton();
        rBtnMinimizar = new javax.swing.JRadioButton();
        etqNoVariables = new javax.swing.JLabel();
        jcbNoVariable = new javax.swing.JComboBox<>();
        btnRellenar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        etqRestric = new javax.swing.JLabel();
        jcbRestric = new javax.swing.JComboBox<>();
        btnAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar.png"))); // NOI18N
        btnCerrar.setOpaque(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/minimizar.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        etqTitulo.setBackground(new java.awt.Color(255, 255, 255,150));
        etqTitulo.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        etqTitulo.setText("       Programación Lineal ( Método Simplex )");
        etqTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etqTitulo.setOpaque(true);

        etqFunRealizar.setBackground(new java.awt.Color(255, 255, 255,150));
        etqFunRealizar.setText("   Funcion a realizar:  ");
        etqFunRealizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etqFunRealizar.setOpaque(true);

        rBtnMaximizar.setText("Maximizar");

        rBtnMinimizar.setText("Minimizar");

        etqNoVariables.setBackground(new java.awt.Color(255, 255, 255,150));
        etqNoVariables.setText("  Número de Variables:");
        etqNoVariables.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etqNoVariables.setOpaque(true);

        jcbNoVariable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));

        btnRellenar.setText("Rellenar");
        btnRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRellenarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,150));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnCalcular.setText("Calcular Simplex");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(33, 33, 33))
        );

        etqRestric.setBackground(new java.awt.Color(255, 255, 255,150));
        etqRestric.setText("  Restricciones:");
        etqRestric.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etqRestric.setOpaque(true);

        jcbRestric.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/preg.png"))); // NOI18N
        btnAyuda.setText("Manual");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(etqFunRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rBtnMaximizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rBtnMinimizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqNoVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbNoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqRestric, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbRestric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRellenar)
                                .addGap(0, 71, Short.MAX_VALUE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMinimizar)
                            .addComponent(btnCerrar))))
                .addGap(31, 31, 31)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqFunRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rBtnMaximizar)
                    .addComponent(rBtnMinimizar)
                    .addComponent(etqNoVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbNoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqRestric, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRellenar)
                    .addComponent(jcbRestric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);//minnimiza la ventana
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRellenarActionPerformed
        // TODO add your handling code here:
        if(jcbNoVariable.getSelectedIndex()!=-1 && jcbRestric.getSelectedIndex()!=-1){
            char aux;
            
                    //empezamos con el modelo
                arrayNombresC=new String[1+jcbNoVariable.getSelectedIndex()+2+jcbRestric.getSelectedIndex()+2+1];
                for (int i = 0; i < arrayNombresC.length; i++) {
                    
                    if(i==0){
                        arrayNombresC[i]="";
                    }
                    if(i>0 && i<=jcbNoVariable.getSelectedIndex()+2){
                        aux=(char)(i+64);
                        arrayNombresC[i]=aux+"";
                    }
                    if(i>jcbNoVariable.getSelectedIndex()+2 && i<arrayNombresC.length-1){
                        arrayNombresC[i]="S"+String.valueOf(i-jcbNoVariable.getSelectedIndex()-2);
                    }
                    if(i==arrayNombresC.length-1){
                        arrayNombresC[i]="LD";
                    }
                }
                datosTabla=new String[jcbRestric.getSelectedIndex()+2+1][arrayNombresC.length];
                //rellenamos la parte de los datos
                for (int i = 0; i < jcbRestric.getSelectedIndex()+2+1 ; i++) {
                    for (int j = 0; j < arrayNombresC.length ; j++) {
                        if(j==0){
                            if(i==0){
                                datosTabla[i][j]="Z";
                            }
                            if(i>0){
                                datosTabla[i][j]="S"+String.valueOf(i);
                            }
                        }
                        if(j>0){
                            if(i>0 && j==i+jcbNoVariable.getSelectedIndex()+2){
                                datosTabla[i][j]="1";
                            }else{
                                datosTabla[i][j]="0";
                            }
                            if(i==0 && j<=jcbNoVariable.getSelectedIndex()+2){
                                datosTabla[i][j]=String.valueOf(-rnd.nextInt(100));//Rellenar con randoms funcion z
                            }
                            if(i>0 && j<=jcbNoVariable.getSelectedIndex()+2){
                                datosTabla[i][j]=String.valueOf(rnd.nextInt(200));//Rellenar con randoms
                            }
                            if(i>0 && j==datosTabla[i].length-1){
                                datosTabla[i][j]=String.valueOf(rnd.nextInt(777)+333);//Rellenar con randoms
                            }
                            
                        }
                    }
                }
                jTable1.setModel(crearModelo(arrayNombresC,datosTabla));
                jTable1.repaint();
                listoParaCalcular=true;
        }
    }//GEN-LAST:event_btnRellenarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        // TODO add your handling code here:
        StringBuffer mensaje=new StringBuffer();
        mensaje.append("Manual de Uso\n");
        mensaje.append("Este programa es una simulación básica de programación Lineal, para su uso deberas seguir los siguientes pasos: \n");
        mensaje.append("1.-Elige si sera maximizar o minimizar\n");
        mensaje.append("2.-Elige el numero de variables y restricciones\n");
        mensaje.append("3.-Presiona el boton Rellenar, este boton rellenara con datos aleatoriamente la tabla inicial del simplex\n");
        mensaje.append("#Nota: Si quieres otros valores vuelve a presionar Rellenar, o puedes cambiarlos manualmente\n");
        mensaje.append("#Nota2: Si editaste los valores manualmente revisa que se hallan guardado en la tabla (No debe estar editandose la celda)\n");
        mensaje.append("4.-Presiona el Boton Resolver Simplex para que inicie el proceso\n");
        JOptionPane.showMessageDialog(rootPane,mensaje.toString(),"Manual de Uso",1);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
    if(listoParaCalcular){
        
        for (int i = 0; i <= this.jcbRestric.getSelectedIndex()+2; i++) {
            for (int j = 0; j < arrayNombresC.length; j++) {
               datosTabla[i][j]=(String)jTable1.getValueAt(i, j);
            }
        }
        
        MetodoSimplex simplex=new MetodoSimplex(arrayNombresC, datosTabla, (DefaultTableModel)jTable1.getModel(),
                this.jcbNoVariable.getSelectedIndex()+2,this.jcbRestric.getSelectedIndex()+2);
       
        
        if(rBtnMaximizar.isSelected()){
                System.out.println("maximizar");
                simplex.Maximizacion();
                for (DefaultTableModel modelo:simplex.getTablas()) {
                   Resultados result=new Resultados(this, true, modelo,simplex.tablaInicial,0);
                    result.setVisible(true); 
                }
        }else{
                System.out.println("Minimizar");
                simplex.Minimizacion();
                for (DefaultTableModel modelo:simplex.getTablas()) {
                   Resultados result=new Resultados(this, true, modelo,simplex.tablaInicial,0);
                    result.setVisible(true); 
                }
                
            }
    }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Principial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new Principial().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRellenar;
    private javax.swing.JLabel etqFunRealizar;
    private javax.swing.JLabel etqNoVariables;
    private javax.swing.JLabel etqRestric;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbNoVariable;
    private javax.swing.JComboBox<String> jcbRestric;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton rBtnMaximizar;
    private javax.swing.JRadioButton rBtnMinimizar;
    private javax.swing.ButtonGroup rbtnGrupo;
    // End of variables declaration//GEN-END:variables
}