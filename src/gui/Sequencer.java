/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author stephan_wink
 */
public class Sequencer extends javax.swing.JDialog {
    
    private boolean running_bol = false;
    private int actualIndexToTable_i = 999;

    /**
     * Creates new form Sequencer
     */
    public Sequencer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        time_jl.setForeground(Color.red);
        DefaultTableModel model = (DefaultTableModel)table_jt.getModel();
        model.setValueAt("Test", 1, 1);
        System.out.println(model.getValueAt(1, 0));

        new DataCollector().execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table_jt = new javax.swing.JTable();
        load_jb = new javax.swing.JButton();
        save_jb = new javax.swing.JButton();
        mode_jtb = new javax.swing.JToggleButton();
        time_jl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        log_jtp = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        table_jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"00:00", null},
                {"00:15", null},
                {"00:30", null},
                {"00:45", null},
                {"01:00", null},
                {"01:15", null},
                {"01:30", null},
                {"01:45", null},
                {"02:00", null},
                {"02:15", null},
                {"02:30", null},
                {"02:45", null},
                {"03:00", null},
                {"03:15", null},
                {"03:30", null},
                {"03:45", null},
                {"04:00", null},
                {"04:15", null},
                {"04:30", null},
                {"04:45", null},
                {"05:00", null},
                {"05:15", null},
                {"05:30", null},
                {"05:45", null},
                {"06:00", null},
                {"06:15", null},
                {"06:30", null},
                {"06:45", null},
                {"07:00", null},
                {"07:15", "Text;text1;text2;text3"},
                {"07:30", null},
                {"07:45", null},
                {"08:00", null},
                {"08:15", null},
                {"08:30", null},
                {"08:45", null},
                {"09:00", null},
                {"09:15", null},
                {"09:30", null},
                {"09:45", null},
                {"10:00", null},
                {"10:15", null},
                {"10:30", null},
                {"10:45", null},
                {"11:00", null},
                {"11:15", null},
                {"11:30", null},
                {"11:45", null},
                {"12:00", null},
                {"12:15", null},
                {"12:30", null},
                {"12:45", null},
                {"13:00", null},
                {"13:15", null},
                {"13:30", null},
                {"13:45", null},
                {"14:00", null},
                {"14:15", null},
                {"14:30", null},
                {"14:45", null},
                {"15:00", null},
                {"15:15", null},
                {"15:30", null},
                {"15:45", null},
                {"16:00", null},
                {"16:15", null},
                {"16:30", null},
                {"16:45", null},
                {"17:00", null},
                {"17:15", null},
                {"17:30", null},
                {"17:45", null},
                {"18:00", null},
                {"18:15", null},
                {"18:30", null},
                {"18:45", null},
                {"19:00", null},
                {"19:15", null},
                {"19:30", null},
                {"19:45", null},
                {"20:00", null},
                {"20:15", null},
                {"20:30", null},
                {"20:45", null},
                {"21:00", null},
                {"21:15", null},
                {"21:30", null},
                {"21:45", null},
                {"22:00", null},
                {"22:15", null},
                {"22:30", null},
                {"22:45", null},
                {"23:00", null},
                {"23:15", null},
                {"23:30", null},
                {"23:45", null}
            },
            new String [] {
                "Time", "MQTT Msg"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_jt);

        load_jb.setText("load...");
        load_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_jbActionPerformed(evt);
            }
        });

        save_jb.setText("save...");
        save_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_jbActionPerformed(evt);
            }
        });

        mode_jtb.setText("run");
        mode_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mode_jtbActionPerformed(evt);
            }
        });

        time_jl.setFont(new java.awt.Font("LCD", 1, 36)); // NOI18N
        time_jl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time_jl.setText("22:00");
        time_jl.setToolTipText("");
        time_jl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setViewportView(log_jtp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(load_jb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_jb, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(mode_jtb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(time_jl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(time_jl)
                        .addGap(186, 186, 186)
                        .addComponent(load_jb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save_jb))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 124, Short.MAX_VALUE)
                        .addComponent(mode_jtb))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void load_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_jbActionPerformed
        loadButtonActionHandler();
    }//GEN-LAST:event_load_jbActionPerformed

    private void save_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_jbActionPerformed
        saveButtonActionHandler();
    }//GEN-LAST:event_save_jbActionPerformed

    private void mode_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mode_jtbActionPerformed
        modeButtonActionHandler();
    }//GEN-LAST:event_mode_jtbActionPerformed

    private void loadButtonActionHandler()
    {
    }
    
    private void saveButtonActionHandler()
    {
    }
    private void modeButtonActionHandler()
    {
       if(this.mode_jtb.isSelected())
       {
           actualIndexToTable_i = 999;
           this.running_bol = true;
           this.save_jb.setEnabled(false);
           this.load_jb.setEnabled(false);
           this.table_jt.setEnabled(false);
       }
       else
       {
           this.running_bol = false;
           this.save_jb.setEnabled(true);
           this.load_jb.setEnabled(true);
           this.table_jt.setEnabled(true);
       }
    }
    

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
            java.util.logging.Logger.getLogger(Sequencer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sequencer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sequencer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sequencer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sequencer dialog = new Sequencer(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    class DataCollector extends SwingWorker<Long, Object>
    {

        @Override
        protected Long doInBackground() throws Exception {
            try 
            { 
                Thread.sleep(1000);
            } catch ( InterruptedException e ) { }
            new DataCollector().execute();
            return (0L);
        }
        
        @Override protected void done()
        {
            try
            {
                UpdateTime();
                // if currently running
                if(true == running_bol)
                {
                    // calculate current index entry:
                    // actual time per day in secs -> actTime 
                    // index time slize in secs -> iSize = 15*60
                    // tableIndex = (int)actTime/iSize
                    Calendar rightNow_c = Calendar.getInstance();
                    int newIndexToTable_i = 
                            (int)((rightNow_c.get(Calendar.HOUR_OF_DAY) * 3600 + rightNow_c.get(Calendar.MINUTE) * 60 + 
                                rightNow_c.get(Calendar.SECOND)) 
                                / (15 * 60) + 0.5);
                    
                    // table index not equal lastTableIndex
                    if(actualIndexToTable_i != newIndexToTable_i)
                    {
                        // check entry of table
                        actualIndexToTable_i = newIndexToTable_i;
                        DefaultTableModel model = (DefaultTableModel)table_jt.getModel();
                        System.out.println("Index: " + actualIndexToTable_i + ", TimeSlot: " + model.getValueAt(actualIndexToTable_i, 0) + ", MQTT: " + model.getValueAt(actualIndexToTable_i, 1));                   
                        StringTokenizer mqttCmdList_st = new StringTokenizer((String)model.getValueAt(actualIndexToTable_i, 1), ";");
                        while(mqttCmdList_st.hasMoreTokens())
                        {
                            String nextMsg = mqttCmdList_st.nextToken();
                            System.out.println(nextMsg);
                            
                            Document doc = log_jtp.getDocument();
                            StyleContext sc = StyleContext.getDefaultStyleContext();
                            AttributeSet as = sc.addAttribute(sc.getEmptySet(), 
                            StyleConstants.Foreground, Color.BLACK);
                            doc.insertString(doc.getLength(), nextMsg + "\n", as);
                        }
                    }                   
                }
                    
                    
                    
                    // execute if entry is valid
                    // mark lastTableIndex = tableIndex
            }
            catch ( /* InterruptedException, ExecutionException */ Exception e ) { }
        }
    }
    
    public void UpdateTime()
    {
        Date d = new Date();
            
        SimpleDateFormat sdfmt = new SimpleDateFormat();
        if(time_jl.getText().contains(":")) sdfmt.applyPattern( "hh.mm" );
        else sdfmt.applyPattern( "hh:mm" );   
        time_jl.setText(sdfmt.format(d));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton load_jb;
    private javax.swing.JTextPane log_jtp;
    private javax.swing.JToggleButton mode_jtb;
    private javax.swing.JButton save_jb;
    private javax.swing.JTable table_jt;
    private javax.swing.JLabel time_jl;
    // End of variables declaration//GEN-END:variables
}