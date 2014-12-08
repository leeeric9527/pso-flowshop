package particleswarm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author saadel
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private int nbTaches = 0;
    private int nbMachines = 0;
    private String ordre = "";

    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableOfInput = new javax.swing.JTable();
        nbMachinesField = new javax.swing.JTextField();
        nbTachesField = new javax.swing.JTextField();
        betaField = new javax.swing.JTextField();
        omegaField = new javax.swing.JTextField();
        c1Field = new javax.swing.JTextField();
        c2Field = new javax.swing.JTextField();
        nbIterationsField = new javax.swing.JTextField();
        tempsMinLabel = new javax.swing.JLabel();
        ordreTachesLabel = new javax.swing.JLabel();
        lireDepuisCsv = new javax.swing.JLabel();
        valider = new javax.swing.JLabel();
        genererResultat = new javax.swing.JLabel();
        genereDiagramme = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableOfInput.setFont(new java.awt.Font("Bitter", 0, 12)); // NOI18N
        tableOfInput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ));
        tableOfInput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(tableOfInput);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 330, 160));

        nbMachinesField.setColumns(12);
        nbMachinesField.setFont(new java.awt.Font("Bitter", 0, 13)); // NOI18N
        nbMachinesField.setBorder(null);
        nbMachinesField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nbMachinesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbMachinesFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nbMachinesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 73, 130, 20));

        nbTachesField.setColumns(12);
        nbTachesField.setFont(new java.awt.Font("Bitter", 0, 13)); // NOI18N
        nbTachesField.setBorder(null);
        nbTachesField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nbTachesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbTachesFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nbTachesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 136, 120, 20));

        betaField.setColumns(8);
        betaField.setFont(new java.awt.Font("Bitter", 0, 13)); // NOI18N
        betaField.setText("0.975");
        betaField.setToolTipText("");
        betaField.setBorder(null);
        betaField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        betaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(betaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 380, 40, 20));

        omegaField.setColumns(8);
        omegaField.setFont(new java.awt.Font("Bitter", 0, 13)); // NOI18N
        omegaField.setText("1.2");
        omegaField.setBorder(null);
        omegaField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        omegaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omegaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(omegaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 418, 30, 10));

        c1Field.setColumns(8);
        c1Field.setFont(new java.awt.Font("Bitter", 0, 13)); // NOI18N
        c1Field.setText("2");
        c1Field.setBorder(null);
        c1Field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        c1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1FieldActionPerformed(evt);
            }
        });
        getContentPane().add(c1Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 20, 10));

        c2Field.setColumns(8);
        c2Field.setFont(new java.awt.Font("Bitter", 0, 13)); // NOI18N
        c2Field.setText("2");
        c2Field.setBorder(null);
        c2Field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        c2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2FieldActionPerformed(evt);
            }
        });
        getContentPane().add(c2Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 20, 20));

        nbIterationsField.setColumns(8);
        nbIterationsField.setFont(new java.awt.Font("Bitter", 0, 13)); // NOI18N
        nbIterationsField.setText("10");
        nbIterationsField.setBorder(null);
        nbIterationsField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nbIterationsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbIterationsFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nbIterationsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 30, -1));

        tempsMinLabel.setFont(new java.awt.Font("Bitter", 0, 14)); // NOI18N
        tempsMinLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tempsMinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 130, 40));

        ordreTachesLabel.setFont(new java.awt.Font("Bitter", 0, 14)); // NOI18N
        ordreTachesLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ordreTachesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 130, 40));

        lireDepuisCsv.setToolTipText("a");
        lireDepuisCsv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lireDepuisCsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lireDepuisCsvMouseClicked(evt);
            }
        });
        getContentPane().add(lireDepuisCsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 202, 190, 30));

        valider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        valider.setName(""); // NOI18N
        valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validerMouseClicked(evt);
            }
        });
        getContentPane().add(valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 70, 30));

        genererResultat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        genererResultat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genererResultatMouseClicked(evt);
            }
        });
        getContentPane().add(genererResultat, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 140, 20));

        genereDiagramme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(genereDiagramme, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 140, 20));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/particleswarm/images/pso.png"))); // NOI18N
        bg.setText(" ");
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nbMachinesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbMachinesFieldActionPerformed
        
        
    }//GEN-LAST:event_nbMachinesFieldActionPerformed

    private void betaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_betaFieldActionPerformed

    private void nbTachesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbTachesFieldActionPerformed
        
    }//GEN-LAST:event_nbTachesFieldActionPerformed

    public double[][] getTableData (JTable table) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        double Matrice[][] = new double[nbTaches][nbMachines];
        int itr=0;
        for (int i = 0 ; i<nbMachines ; i++)
        {
            for (int j = 0 ; j <nbTaches ; j++)
            {
                if (dtm.getValueAt(itr,2)==null) return null;
                Matrice[j][i] = Double.parseDouble(dtm.getValueAt(itr,2).toString());
                itr++;
            }

        }
        return Matrice;
    }
        
    private void nbIterationsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbIterationsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbIterationsFieldActionPerformed

    private void omegaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omegaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_omegaFieldActionPerformed

    private void c1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1FieldActionPerformed

    private void lireDepuisCsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lireDepuisCsvMouseClicked
        String csvFile = "data.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
        
        double matr[][] = new double[nbTaches][nbMachines];
	
        try {
                
		br = new BufferedReader(new FileReader(csvFile));
                int j = 0;
                while ((line = br.readLine()) != null) {
                    String[] split = line.split(cvsSplitBy);
//                    System.out.println(split[0] + split[1] + split.length);
                    for (int i = 0; i < split.length; i++) {
                        matr[j][i] = Double.parseDouble(split[i]);
                        System.out.println(matr[j][i]);
                    }
                    j++;
		}
 
	} catch (FileNotFoundException e) {
		JOptionPane.showMessageDialog(this, "Fichier Inexistant", "Erreur", JOptionPane.ERROR_MESSAGE);
	} catch (IOException e) {
		JOptionPane.showMessageDialog(this, "Erreur de lecture", "Erreur", JOptionPane.ERROR_MESSAGE);
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "Erreur de lecture", "Erreur", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

        DefaultTableModel model = new DefaultTableModel();  
        for (int i=0; i<nbMachines ; i++)
            for (int j=0; j<nbTaches ; j++)
            {
                String Jb = "T" + (j+1);
                String Mc = "M" + (i+1);
                String temps = matr[j][i] + "";
                model.addRow(new Object[]{Mc,Jb,temps});
            }
        tableOfInput.setModel(model);
    }//GEN-LAST:event_lireDepuisCsvMouseClicked

    private void validerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerMouseClicked
         try {
            nbTaches = Integer.parseInt(nbTachesField.getText());
            nbMachines = Integer.parseInt(nbMachinesField.getText());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Veuillez entrer un numéro valide", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
//        System.out.println(nbMachines + "  " + nbTaches);
        
        DefaultTableModel model = new DefaultTableModel();  
        model.addColumn(""); 
        model.addColumn("");
        model.addColumn("");
        for (int i=1; i<=nbMachines ; i++)
            for (int j=1; j<=nbTaches ; j++)
            {
                String Jb = "T"+j;
                String Mc = "M"+i;
                model.addRow(new Object[]{Mc,Jb});
            }
        tableOfInput.setModel(model);
    }//GEN-LAST:event_validerMouseClicked

    private void genererResultatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genererResultatMouseClicked
         
        double omega = 1.2;
        double beta = 0.975;
        double c1 = 2;
        double c2 = 2;
        int nbIterations = 0;
        
        try {
            omega = Double.parseDouble(omegaField.getText());
            beta = Double.parseDouble(betaField.getText());
            c1 = Double.parseDouble(c1Field.getText());
            c2 = Double.parseDouble(c2Field.getText());
            nbIterations = Integer.parseInt(nbIterationsField.getText());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Veuillez entrer un numéro valide", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        
        PSO pso= new PSO(nbTaches, nbMachines);
        
        pso.setBetha(beta);
        pso.setC1(c1);
        pso.setC2(c2);
        pso.setW0(omega);
        
        

        double mat[][] = getTableData(tableOfInput);
   
        pso.setInitialJobs(mat);
        pso.initialise();
        pso.findPermutaion();
        pso.initialiseBestP();
        pso.findPersonaleBest();
        pso.findGloabalBest();

        for(int i=0;i<nbIterations;i++)
        {
            pso.generateXV();
            pso.findPermutaion();
            pso.completionTime();
            pso.findPersonaleBest();
            pso.findGloabalBest();  
        }
        DecimalFormat df = new DecimalFormat("#");

        for(int i=0;i<pso.getN();i++)
            ordre += df.format(pso.getG()[i]) + " ";
        
        this.tempsMinLabel.setText(" " + pso.getFg());        
        this.ordreTachesLabel.setText(" " + ordre);
    }//GEN-LAST:event_genererResultatMouseClicked

    private void c2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2FieldActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField betaField;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField c1Field;
    private javax.swing.JTextField c2Field;
    private javax.swing.JLabel genereDiagramme;
    private javax.swing.JLabel genererResultat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lireDepuisCsv;
    private javax.swing.JTextField nbIterationsField;
    private javax.swing.JTextField nbMachinesField;
    private javax.swing.JTextField nbTachesField;
    private javax.swing.JTextField omegaField;
    private javax.swing.JLabel ordreTachesLabel;
    private javax.swing.JTable tableOfInput;
    private javax.swing.JLabel tempsMinLabel;
    private javax.swing.JLabel valider;
    // End of variables declaration//GEN-END:variables
}
