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
        jBtnUniformity = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTblStatisticMed = new javax.swing.JTable();
        jSldrMed = new javax.swing.JSlider();
        jTFSliderMed = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTAMed = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jBtnOpenFileFridman = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTblFridman = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTblStatistic = new javax.swing.JTable();
        jSldrFridman = new javax.swing.JSlider();
        jTFSliderFridman = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTAFridman = new javax.swing.JTextArea();
        jBtnFridman = new javax.swing.JButton();

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

        jBtnUniformity.setText("Проверить");
        jBtnUniformity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUniformityActionPerformed(evt);
            }
        });

        modelStatisticMed = new DefaultTableModel(5, 1);
        modelStatisticMed.setValueAt("Среднее", 0, 0);
        modelStatisticMed.setValueAt("Среднеквадратическое", 1, 0);
        modelStatisticMed.setValueAt("Коефициент ассиметрии", 2, 0);
        modelStatisticMed.setValueAt("Коефициент эксцессу", 3, 0);
        modelStatisticMed.setValueAt("Коефициент вариации", 4, 0);
        jTblStatisticMed.setModel(modelStatisticMed);
        jScrollPane7.setViewportView(jTblStatisticMed);

        jSldrMed.setMajorTickSpacing(10);
        jSldrMed.setMinorTickSpacing(5);
        jSldrMed.setPaintLabels(true);
        jSldrMed.setPaintTicks(true);
        jSldrMed.setValue(5);
        jSldrMed.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSldrMedMouseDragged(evt);
            }
        });

        jTFSliderMed.setText("0.05");

        jTAMed.setColumns(20);
        jTAMed.setRows(5);
        jScrollPane8.setViewportView(jTAMed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnOpenFile1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnOpenFile2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSldrMed, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFSliderMed, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnUniformity)))
                .addContainerGap(19, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jBtnUniformity, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTFSliderMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSldrMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
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

        jSldrFridman.setMajorTickSpacing(10);
        jSldrFridman.setMinorTickSpacing(5);
        jSldrFridman.setPaintLabels(true);
        jSldrFridman.setPaintTicks(true);
        jSldrFridman.setValue(5);
        jSldrFridman.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSldrFridmanMouseDragged(evt);
            }
        });

        jTFSliderFridman.setText("0.05");

        jTAFridman.setColumns(20);
        jTAFridman.setRows(5);
        jScrollPane9.setViewportView(jTAFridman);

        jBtnFridman.setText("Проверить");
        jBtnFridman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFridmanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBtnOpenFileFridman)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSldrFridman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFSliderFridman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnFridman, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnOpenFileFridman)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSldrFridman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTFSliderFridman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jBtnFridman, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jBtnUniformityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUniformityActionPerformed
        double U = first.getUniformityMed(modelThird);
        double Kv = Distributions.NormInv(1-Double.parseDouble(jTFSliderMed.getText())/2.0, 0, 1);
        String str = "U="+U+"\n";
        str+="Квантиль="+Kv+"\n";
        if(Math.abs(U)<=Kv){
            str+="Принимается";
        }else{
            str+="Не принимается";
        }
        jTAMed.setText(str);
    }//GEN-LAST:event_jBtnUniformityActionPerformed

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
            second.showStatistics(modelStatisticMed);
            modelThird=second.getMedians(modelThird, 2, third);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File has wrong information");
        }

    }//GEN-LAST:event_jBtnOpenFile2ActionPerformed

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
            first.showStatistics(modelStatisticMed);
            modelThird=first.getMedians(modelThird, 1, third);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File has wrong information");
        }

    }//GEN-LAST:event_jBtnOpenFile1ActionPerformed

    private void jSldrMedMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSldrMedMouseDragged
        jTFSliderMed.setText(""+jSldrMed.getValue()/(double)100);
    }//GEN-LAST:event_jSldrMedMouseDragged

    private void jSldrFridmanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSldrFridmanMouseDragged
        jTFSliderFridman.setText(""+jSldrFridman.getValue()/(double)100);
    }//GEN-LAST:event_jSldrFridmanMouseDragged

    private void jBtnFridmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFridmanActionPerformed
        ArrayList<ArrayList<Double>> ranks = Rank.countRanks(arrayOfX);
        double X = Rank.getUniformityFridman(ranks);
        double Kv = Distributions.ChiSquared(1-Double.parseDouble(jTFSliderFridman.getText()), ranks.get(0).size()-1);
        String text = "X^2="+X+"\n";
        text+="Квантиль="+Kv+"\n";
        if(X<=Kv){
            text+="Принимается";
        }else{
            text+="Не принимается";
        }
        jTAFridman.setText(text);
    }//GEN-LAST:event_jBtnFridmanActionPerformed

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
    private javax.swing.JButton jBtnFridman;
    private javax.swing.JButton jBtnOpenFile1;
    private javax.swing.JButton jBtnOpenFile2;
    private javax.swing.JButton jBtnOpenFileFridman;
    private javax.swing.JButton jBtnUniformity;
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
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSlider jSldrFridman;
    private javax.swing.JSlider jSldrMed;
    private javax.swing.JTextArea jTAFridman;
    private javax.swing.JTextArea jTAMed;
    private javax.swing.JTextField jTFSliderFridman;
    private javax.swing.JTextField jTFSliderMed;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTblFirst;
    private javax.swing.JTable jTblFridman;
    private javax.swing.JTable jTblSecond;
    private javax.swing.JTable jTblStatistic;
    private javax.swing.JTable jTblStatisticMed;
    private javax.swing.JTable jTblThird;
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
private DefaultTableModel modelStatisticMed;
private ArrayList<Vector<Struct>> arrayOfX = new ArrayList<>();
}

class Struct{
    Struct(){};
    Struct(double number, int position){
        this.number=number;
        this.position=position;
    }
    public String toString(){
        return ""+number;
    }
    double number;
    int position;
}