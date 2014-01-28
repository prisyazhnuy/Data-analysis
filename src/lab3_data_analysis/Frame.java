package lab3_data_analysis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFileChooser2 = new javax.swing.JFileChooser();
        jFileChooser3 = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jBtnOpenFile1 = new javax.swing.JButton();
        jBtnOpenFile2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblFirst = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblSecond = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTblThird = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBtnOpenFileFridman = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTblFridman = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTblStatistic = new javax.swing.JTable();

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
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnOpenFile1.setText("Загрузить первую выборку");
        jBtnOpenFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpenFile1ActionPerformed(evt);
            }
        });

        jBtnOpenFile2.setText("Загрузить вторую выборку");
        jBtnOpenFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpenFile2ActionPerformed(evt);
            }
        });

        modelFirst = new DefaultTableModel(null, new Object[]{"i","x","n(i)","f(i)","Fn(i)"});
        jTblFirst.setModel(modelFirst);
        jScrollPane1.setViewportView(jTblFirst);

        modelSecond = new DefaultTableModel(null, new Object[]{"i","x","n(i)","f(i)","Fn(i)"});
        jTblSecond.setModel(modelSecond);
        jScrollPane2.setViewportView(jTblSecond);

        modelThird = new DefaultTableModel(null, new Object[]{"Выборка","< медианы","> медианы","Вместе"});
        modelThird.addRow(new Object[]{"Первая","","",""});
        modelThird.addRow(new Object[]{"Вторая","","",""});
        modelThird.addRow(new Object[]{"Вместе","","",""});
        jTblThird.setModel(modelThird);
        jScrollPane4.setViewportView(jTblThird);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnOpenFile1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jBtnOpenFile2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOpenFile1)
                    .addComponent(jBtnOpenFile2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Медианный критерий", jPanel1);

        jBtnOpenFileFridman.setText("Загрузить выборку");
        jBtnOpenFileFridman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpenFileFridmanActionPerformed(evt);
            }
        });

        modelFridman = new DefaultTableModel();
        jTblFridman.setModel(modelFridman);
        jScrollPane5.setViewportView(jTblFridman);

        modelStatistic = new DefaultTableModel(5, 1);
        modelStatistic.setValueAt("Среднее", 0, 0);
        modelStatistic.setValueAt("Среднеквадратическое", 1, 0);
        modelStatistic.setValueAt("Коефициент ассиметрии", 2, 0);
        modelStatistic.setValueAt("Коефициент эксцессу", 3, 0);
        modelStatistic.setValueAt("Коефициент вариации", 4, 0);
        jTblStatistic.setModel(modelStatistic);
        jScrollPane6.setViewportView(jTblStatistic);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBtnOpenFileFridman)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnOpenFileFridman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Критерий Фридмана", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOpenFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpenFile1ActionPerformed
        first = new OrderedSeries();
        jFileChooser1.showDialog(null, "Open first file");
        try {
            first.loadFromFile(jFileChooser1.getSelectedFile().getPath());
            if(third==null){
                third = new OrderedSeries();
                third.loadFromFile(jFileChooser1.getSelectedFile().getPath());
            }
            else{
                third.loadFromFile(jFileChooser1.getSelectedFile().getPath());
            }
            first.showOrderedSeries(modelFirst);
            modelThird=first.getMedians(modelThird, 1);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File has wrong information");
        }
        
    }//GEN-LAST:event_jBtnOpenFile1ActionPerformed

    private void jBtnOpenFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpenFile2ActionPerformed
        second = new OrderedSeries();
        jFileChooser2.showDialog(null, "Open second file");
        try {
            second.loadFromFile(jFileChooser2.getSelectedFile().getPath());
            if(third==null){
                third = new OrderedSeries();
                third.loadFromFile(jFileChooser2.getSelectedFile().getPath());
            }
            else{
                third.loadFromFile(jFileChooser2.getSelectedFile().getPath());
            }
            second.showOrderedSeries(modelSecond);
            modelThird=second.getMedians(modelThird, 2);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File has wrong information");
        }
        
    }//GEN-LAST:event_jBtnOpenFile2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText(""+first.odnorodnost2(modelThird));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnOpenFileFridmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpenFileFridmanActionPerformed
        series = new OrderedSeries();
        jFileChooser3.showDialog(null, "Open file");
        try {
            series.loadFromFile(jFileChooser3.getSelectedFile().getPath());
            series.showArray(modelFridman);
            arrayOfX.add(series.getArray());
            series.showStatistics(modelStatistic);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File has wrong information");
        }
    }//GEN-LAST:event_jBtnOpenFileFridmanActionPerformed

    public static void start() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnOpenFile1;
    private javax.swing.JButton jBtnOpenFile2;
    private javax.swing.JButton jBtnOpenFileFridman;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFileChooser jFileChooser3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTblFirst;
    private javax.swing.JTable jTblFridman;
    private javax.swing.JTable jTblSecond;
    private javax.swing.JTable jTblStatistic;
    private javax.swing.JTable jTblThird;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
private OrderedSeries first = null;
private OrderedSeries second = null;
private OrderedSeries third = null;
private OrderedSeries series = null;
private DefaultTableModel modelFirst;
private DefaultTableModel modelSecond;
private DefaultTableModel modelThird;
private DefaultTableModel modelFridman;
private DefaultTableModel modelStatistic;
private ArrayList<Vector<Double>> arrayOfX = new ArrayList<>();
}
