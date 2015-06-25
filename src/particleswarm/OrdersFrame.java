/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package particleswarm;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zianwar
 */
public class OrdersFrame extends javax.swing.JFrame {

    private int nbTaches;
    private int nbMachines;
    
    /**
     * Creates new form OrdersFrame
     */
    public OrdersFrame(int nbTaches, int nbMachines) {
        initComponents();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        this.nbTaches = nbTaches;
        this.nbMachines = nbMachines;
    }
    
    // not done yet
     public double[][] getOrdersTableData(JTable table) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        double Matrice[][] = new double[nbTaches][nbMachines];
        int itr = 0;
        for (int i = 0; i < nbMachines; i++) {
            for (int j = 0; j < nbTaches; j++) {
                if (dtm.getValueAt(itr, 2) == null) {
                    return null;
                }
                Matrice[j][i] = Double.parseDouble(dtm.getValueAt(itr, 2).toString());
                itr++;
            }

        }
        return Matrice;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        validerOrders = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOfOrdersInput = new javax.swing.JTable();
        bgOrders = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        validerOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        validerOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validerOrdersMouseClicked(evt);
            }
        });
        getContentPane().add(validerOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 100, 40));

        tableOfOrdersInput.setFont(new java.awt.Font("Bitter", 0, 12)); // NOI18N
        tableOfOrdersInput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ));
        tableOfOrdersInput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(tableOfOrdersInput);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 160));

        bgOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/particleswarm/images/order.png"))); // NOI18N
        getContentPane().add(bgOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validerOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerOrdersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_validerOrdersMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgOrders;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableOfOrdersInput;
    private javax.swing.JLabel validerOrders;
    // End of variables declaration//GEN-END:variables
}
