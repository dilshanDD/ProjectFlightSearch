/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AirportGUI;

/**
 *
 * @author Dilshan
 */
public class FlightDetails extends javax.swing.JFrame {
public boolean dataset;

private void GetData()
{
   /* try{
        java.sql.Connection conn=(java.sql.Connection)AirportGUI.dbcon
        
    }catch(Exception e)
    {
        
        
    }
    
    
    
    */
    
}
    
    /**
     * Creates new form FlightDetails
     */
    public FlightDetails() {
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

        jPanelHeading = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelcode1 = new javax.swing.JLabel();
        TxtCode1 = new javax.swing.JTextField();
        jLabelCountryname1 = new javax.swing.JLabel();
        jLabelCity1 = new javax.swing.JLabel();
        jLabelAirportName1 = new javax.swing.JLabel();
        TxtAirport1 = new javax.swing.JTextField();
        BtnNew1 = new javax.swing.JButton();
        BtnSave1 = new javax.swing.JButton();
        BtnDelete1 = new javax.swing.JButton();
        jComboBoxOrigin = new javax.swing.JComboBox();
        jComboBoxDestination = new javax.swing.JComboBox();
        jPanelInfor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInformation = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHeading.setBackground(new java.awt.Color(153, 255, 255));

        jLabel2.setBackground(new java.awt.Color(204, 51, 255));
        jLabel2.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("flight Details");

        javax.swing.GroupLayout jPanelHeadingLayout = new javax.swing.GroupLayout(jPanelHeading);
        jPanelHeading.setLayout(jPanelHeadingLayout);
        jPanelHeadingLayout.setHorizontalGroup(
            jPanelHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeadingLayout.setVerticalGroup(
            jPanelHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeadingLayout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Flight Details"));

        jLabelcode1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelcode1.setText("Flight Code");

        TxtCode1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCountryname1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCountryname1.setText("Origine");

        jLabelCity1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCity1.setText("Destination");

        jLabelAirportName1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelAirportName1.setText("Duration");

        TxtAirport1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnNew1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        BtnNew1.setText("New");
        BtnNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNew1ActionPerformed(evt);
            }
        });

        BtnSave1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        BtnSave1.setText("Save");
        BtnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSave1ActionPerformed(evt);
            }
        });

        BtnDelete1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        BtnDelete1.setText("Delete");
        BtnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDelete1ActionPerformed(evt);
            }
        });

        jComboBoxOrigin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxDestination.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelCountryname1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxOrigin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxDestination, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelAirportName1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtAirport1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(BtnNew1)
                        .addGap(12, 12, 12)
                        .addComponent(BtnSave1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnDelete1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcode1)
                    .addComponent(TxtCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCountryname1)
                    .addComponent(jComboBoxOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCity1)
                    .addComponent(jComboBoxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAirportName1)
                    .addComponent(TxtAirport1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNew1)
                    .addComponent(BtnSave1)
                    .addComponent(BtnDelete1))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jPanelInfor.setBackground(new java.awt.Color(153, 255, 153));
        jPanelInfor.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));

        jTableInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Flight Code", "Origine", "Destination", "Duration"
            }
        ));
        jScrollPane2.setViewportView(jTableInformation);

        javax.swing.GroupLayout jPanelInforLayout = new javax.swing.GroupLayout(jPanelInfor);
        jPanelInfor.setLayout(jPanelInforLayout);
        jPanelInforLayout.setHorizontalGroup(
            jPanelInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        jPanelInforLayout.setVerticalGroup(
            jPanelInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNew1ActionPerformed
        // TODO add your handling code here:
   /*     int itemNo = Integer.parseInt(TxtCode.getText());
        String itemName = txt_Name.getText();
        String date = txt_Date.getText();
        int quantity = Integer.parseInt(txt_Quantity.getText());
        String catagory = jComboBoxOrigin.getSelectedItem().toString();
        String voucher = txt_Voucher.getText();
        String fwr = txt_FWR.getText();
        String tic = txt_TIC.getText();
        String status = txt_Status.getText();
        if ((TxtCode.getText().equals("")) || (txt_Name.getText().equals("")) || (txt_Date.getText().equals("")) || (txt_Quantity.getText().equals("")) || (jComboBoxOrigin.getSelectedItem().toString().equals("")) || (txt_FWR.getText().equals("")) || (txt_TIC.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Please fill all the Fields..!!", "Add_Items", WIDTH);
        } else {
            Item_Details d = new Item_Details(itemNo, itemName, date, quantity, catagory, voucher, fwr, tic, status);
//            JOptionPane.showMessageDialog(null, "Data Successfully Inserted..!!");


            Item_Detail_Handler idh = new Item_Detail_Handler();
            try {
                idh.addItems(d);

            } catch (SQLException ex) {


                Logger.getLogger(Add_Items.class.getName()).log(Level.SEVERE, null, ex);



            }
        }
        loadTable();
        
        */
    }//GEN-LAST:event_BtnNew1ActionPerformed

    private void BtnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSave1ActionPerformed

    private void BtnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDelete1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FlightDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FlightDetails().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete1;
    private javax.swing.JButton BtnNew1;
    private javax.swing.JButton BtnSave1;
    private javax.swing.JTextField TxtAirport1;
    private javax.swing.JTextField TxtCode1;
    private javax.swing.JComboBox jComboBoxDestination;
    private javax.swing.JComboBox jComboBoxOrigin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAirportName1;
    private javax.swing.JLabel jLabelCity1;
    private javax.swing.JLabel jLabelCountryname1;
    private javax.swing.JLabel jLabelcode1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelHeading;
    private javax.swing.JPanel jPanelInfor;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableInformation;
    // End of variables declaration//GEN-END:variables
}
