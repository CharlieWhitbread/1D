/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Charlie
 */
public class userInterface extends javax.swing.JFrame {
    
    int count = 1;
    ArrayList<TableEntry> listOfTasks = new ArrayList <TableEntry>();
            
    public userInterface() {
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

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        tableControls = new javax.swing.JPanel();
        removeTask = new javax.swing.JButton();
        addNewTask = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        indentButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TimeLine");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        header.setBackground(new java.awt.Color(89, 209, 151));
        header.setAlignmentX(0.0F);
        header.setAlignmentY(0.0F);
        header.setSize(new java.awt.Dimension(1280, 100));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        rightPanel.setBackground(new java.awt.Color(255, 0, 0));
        rightPanel.setPreferredSize(new java.awt.Dimension(640, 620));
        rightPanel.setSize(new java.awt.Dimension(640, 620));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setAlignmentX(0.0F);
        jScrollPane1.setAlignmentY(0.0F);
        jScrollPane1.setAutoscrolls(true);

        mainTable.setAutoCreateRowSorter(true);
        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "01 01 2015", "01 01 2015"}
            },
            new String [] {
                "Task Name", "Start Date", "End Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        mainTable.setAlignmentX(0.0F);
        mainTable.setAlignmentY(0.0F);
        mainTable.setBounds(new java.awt.Rectangle(0, 0, 640, 390));
        mainTable.setDragEnabled(true);
        mainTable.setRowSelectionAllowed(false);
        mainTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mainTableFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mainTableFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(mainTable);
        if (mainTable.getColumnModel().getColumnCount() > 0) {
            mainTable.getColumnModel().getColumn(0).setResizable(false);
            mainTable.getColumnModel().getColumn(1).setResizable(false);
            mainTable.getColumnModel().getColumn(2).setResizable(false);
        }

        tableControls.setPreferredSize(new java.awt.Dimension(640, 30));

        removeTask.setText("Remove Task");
        removeTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTaskActionPerformed(evt);
            }
        });

        addNewTask.setText("Add New Task");
        addNewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewTaskActionPerformed(evt);
            }
        });

        jButton2.setText("Import");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tableControlsLayout = new javax.swing.GroupLayout(tableControls);
        tableControls.setLayout(tableControlsLayout);
        tableControlsLayout.setHorizontalGroup(
            tableControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableControlsLayout.createSequentialGroup()
                .addComponent(removeTask)
                .addGap(0, 0, 0)
                .addComponent(addNewTask)
                .addGap(0, 0, 0)
                .addComponent(jButton2)
                .addGap(0, 0, 0)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tableControlsLayout.setVerticalGroup(
            tableControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableControlsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(tableControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeTask)
                    .addComponent(addNewTask)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
        );

        indentButton.setText("Indent");
        indentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(header, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tableControls, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(indentButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tableControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indentButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewTaskActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) mainTable.getModel(); //Gets the DefaultTableModel from the main table and
        tableModel.addRow(new Object[]{"", "01 01 2015", "01 01 2015"});         //adds a row to it.
    }//GEN-LAST:event_addNewTaskActionPerformed

    private void removeTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTaskActionPerformed
        try{
        DefaultTableModel tableModel = (DefaultTableModel) mainTable.getModel(); //Gets the DefaultTableModel from the main table and
        tableModel.removeRow(mainTable.getSelectedRow());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Select Task to remove.");
        }
    }//GEN-LAST:event_removeTaskActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int count = 0;
        String name = "",start = "",end = "";
           
        try {
            BufferedReader br = new BufferedReader(
            new InputStreamReader(new FileInputStream("/Users/Charlie/Documents/Year 2/ADPROC/testData.txt")));
            String line;
            Boolean isChild = false;
            while ((line = br.readLine()) != null) {
                if(!"".equals(line)){
                    
                    if (count == 0){
                        if (line.startsWith("$")){
                            isChild = true;
                        }
                        name = line;
                        count = 1;
                    }else if(count == 1){
                        start = line;
                        count = 2;
                    }else{
                        end = line;
                        count = 3;
                    }}
                if (count == 3 && isChild){
                    DefaultTableModel tableModel = (DefaultTableModel) mainTable.getModel();
                    tableModel.addRow(new Object[]{"    "+name.substring(1), start, end}); //Child starts with tab
                    count = 0;
                    isChild = false;
                }else if (count ==3){
                    DefaultTableModel tableModel = (DefaultTableModel) mainTable.getModel();
                    tableModel.addRow(new Object[]{name, start, end});
                    count = 0;
                }
            }
            br.close();        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error inporting from file." + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) mainTable.getModel(); //Gets the model from the outputTable
        int rowCount = model.getRowCount();
        for (int i = 0; i<(rowCount-1);i++){     try {
            //for every row do...
            DateFormat format = new SimpleDateFormat("dd MM yyyy");
            Date start = format.parse((String) model.getValueAt(i, 1));
            Date end = format.parse((String) model.getValueAt(i, 2));
            Task t = new Task(model.getValueAt(i, 0).toString(),start,end);
            listOfTasks.add(t);
            System.out.println(t.title+t.endDate+t.startDate);
            } catch (ParseException ex) {
                Logger.getLogger(userInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        //TEST FOR CHART
        GanttChart chart = new GanttChart(listOfTasks);
        rightPanel.add(chart);
        this.repaint();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mainTableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mainTableFocusLost

    }//GEN-LAST:event_mainTableFocusLost

    private void mainTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mainTableFocusGained
                if(count == 1){
            rightPanel.setBackground(Color.red);
            count = 2;
        }else if (count == 2){
            rightPanel.setBackground(Color.blue);
            count = 3;
        }else{
            rightPanel.setBackground(Color.yellow);
            count = 1;
            
        }
    }//GEN-LAST:event_mainTableFocusGained

    private void indentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indentButtonActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) mainTable.getModel();
        int selectedRow = mainTable.getSelectedRow();
        TableEntry entry = listOfTasks.get(selectedRow-1);
       
    }//GEN-LAST:event_indentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewTask;
    private javax.swing.JPanel header;
    private javax.swing.JButton indentButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mainTable;
    private javax.swing.JButton removeTask;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel tableControls;
    // End of variables declaration//GEN-END:variables
}
