/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.Car;
import Model.CarList;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sharanya Maryada
 */
public class ViewSearchCar extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    CarList carsList;
    int selectedRow;
    public ViewSearchCar(CarList cc) {
        initComponents();
        selectedRow=0;
        this.carsList=cc;
        populateTable();
    }
    
       public void populateTable(){
        
        DefaultTableModel dtm= (DefaultTableModel) viewCarsJTable.getModel();
        
        dtm.setRowCount(0);
        
        for(Car c : carsList.getCarSearchCatalogue()){
            
            Object [] row= new Object[4];
            row[0]= c;
            row[1]=c.getManufacturer();
            row[2]=c.getModelNumber();
            String name = c.getIsAvailable()?"Yes":"No";
            row[3]=name;
            dtm.addRow(row);
        }
        
    }
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isAvalButtonGroup = new javax.swing.ButtonGroup();
        manCertButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCarsJTable = new javax.swing.JTable();
        manTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        serNumTxtField = new javax.swing.JTextField();
        modTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        manYearTxtField = new javax.swing.JTextField();
        noOfSeatsTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cityTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        viewDetailsJBtn = new javax.swing.JButton();
        updateDetailsBtn = new javax.swing.JButton();
        deleteDetailsBtn = new javax.swing.JButton();
        yesJRadioButton = new javax.swing.JRadioButton();
        noJRadioButton = new javax.swing.JRadioButton();
        expiredJRadioButton = new javax.swing.JRadioButton();
        validJRadioButton = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("View Search Result");

        viewCarsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Manufacturer", "Model Number", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewCarsJTable);

        manTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manTxtFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("ManuFacturer");

        jLabel3.setText("Serial Number");

        jLabel4.setText("Model Number");

        jLabel5.setText("Manufacturer Year");

        jLabel6.setText("No Of Seats");

        jLabel7.setText("City");

        jLabel8.setText("Available");

        jLabel9.setText("Manufacturing Certificate");

        viewDetailsJBtn.setText("View Car Details");
        viewDetailsJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJBtnActionPerformed(evt);
            }
        });

        updateDetailsBtn.setText("Update Details");
        updateDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDetailsBtnActionPerformed(evt);
            }
        });

        deleteDetailsBtn.setText("Delete Car Details");
        deleteDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDetailsBtnActionPerformed(evt);
            }
        });

        isAvalButtonGroup.add(yesJRadioButton);
        yesJRadioButton.setSelected(true);
        yesJRadioButton.setText("Yes");

        isAvalButtonGroup.add(noJRadioButton);
        noJRadioButton.setText("No");

        manCertButtonGroup.add(expiredJRadioButton);
        expiredJRadioButton.setText("Expired");

        manCertButtonGroup.add(validJRadioButton);
        validJRadioButton.setSelected(true);
        validJRadioButton.setText("Valid");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(viewDetailsJBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(updateDetailsBtn)
                        .addGap(134, 134, 134)
                        .addComponent(deleteDetailsBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(noOfSeatsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yesJRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(noJRadioButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(validJRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(expiredJRadioButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(161, 161, 161)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serNumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manYearTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewDetailsJBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(manTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(serNumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(modTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(manYearTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(noOfSeatsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7))
                    .addComponent(cityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(yesJRadioButton)
                    .addComponent(noJRadioButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(validJRadioButton)
                        .addComponent(expiredJRadioButton))
                    .addComponent(jLabel9))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateDetailsBtn)
                    .addComponent(deleteDetailsBtn))
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manTxtFieldActionPerformed

    private void viewDetailsJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJBtnActionPerformed
        // TODO add your handling code here:
        
        selectedRow= viewCarsJTable.getSelectedRow();
        if(selectedRow>=0){
            
            Car c= (Car) viewCarsJTable.getValueAt(selectedRow, 0);
            cityTxtField.setText(c.getCity());
            String isAval= c.getIsAvailable()?"Yes":"No";
           // isAvalTxtField.setText(isAval);
           if(isAval.equals("No")){
               isAvalButtonGroup.clearSelection();
               noJRadioButton.setSelected(true);
           }
              else{
                isAvalButtonGroup.clearSelection();
               yesJRadioButton.setSelected(true);
           }
           
           String manCert= c.getMainCert();
           
           if(manCert.equalsIgnoreCase("Expired")){
               manCertButtonGroup.clearSelection();
               expiredJRadioButton.setSelected(true);
           }
           else{
               manCertButtonGroup.clearSelection();
               validJRadioButton.setSelected(true);
               
           }
           
          //  manCertField.setText(car.getMainCert());
            manTxtField.setText(c.getManufacturer());
            manYearTxtField.setText(String.valueOf(c.getManYear()));
            modTxtField.setText(c.getModelNumber());
            noOfSeatsTxtField.setText(String.valueOf(c.getNoOfSeats()));
            serNumTxtField.setText(c.getSerialNum());
                    
            
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Please select a row to view.");
        }
      
    }//GEN-LAST:event_viewDetailsJBtnActionPerformed

    private void deleteDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDetailsBtnActionPerformed
        // TODO add your handling code here:
        
            int selectedRow= viewCarsJTable.getSelectedRow();
            if(selectedRow>=0){
                
           //JOptionPane.showMessageDialog(null, "Do you really want to delete the selected records?");
           
             int dialogButton = JOptionPane.YES_NO_OPTION;
             int dialogResult = JOptionPane.showConfirmDialog (null, "Do you really want to delete the selected entry?","Warning",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION)

                {
            
            Car c= (Car) viewCarsJTable.getValueAt(selectedRow, 0);
            carsList.removeCar(c);
            carsList.removeSearchCar(c);
            JOptionPane.showMessageDialog(null, "Car successfully deleted.");
            populateTable();
            
                manTxtField.setText("");
    manYearTxtField.setText("");
    serNumTxtField.setText("");
    noOfSeatsTxtField.setText("");
    modTxtField.setText("");
    cityTxtField.setText("");
 //   manCertField.setText("");
   // isAvalTxtField.setText("");
           
                }  
            
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
        
        
    }//GEN-LAST:event_deleteDetailsBtnActionPerformed

    private void updateDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDetailsBtnActionPerformed
        // TODO add your handling code here:
       // int selectedRow= viewCarsJTable.getSelectedRow();
        if(selectedRow>=0){
            
      Car car= (Car) viewCarsJTable.getValueAt(selectedRow, 0);
      
       if(cityTxtField.getText().equals("")||modTxtField.getText().equals("")||manTxtField.getText().equals("")||serNumTxtField.getText().equals("")
               ||manYearTxtField.getText().equals("")||noOfSeatsTxtField.getText().equals("")){
           
           JOptionPane.showMessageDialog(null, "Please view details first. No Fields can be blank");
           
       }
       else{     
    String manufacturer= manTxtField.getText();
    int manYear=0, countError=0;
     try{
    manYear= Integer.parseInt(manYearTxtField.getText());
    
    }catch(NumberFormatException E){
       JOptionPane.showMessageDialog(null, "Please enter a numeric value for Manufacturing Year." ); 
       countError++;
    }
    
    
    String serialNum= serNumTxtField.getText();
    int noOfSeats = 0;
    
       try{
    noOfSeats = Integer.parseInt(noOfSeatsTxtField.getText());
    }catch(NumberFormatException E){
        JOptionPane.showMessageDialog(null, "Number of Seats should be between numeric and can't be blank." ); 
        countError++;

    }
    String modelNumber= modTxtField.getText();
    String city= cityTxtField.getText();
    String mainCert= null;
   // String isAval= isAvalTxtField.getText();
    Boolean isAvailable=false;
 //   if(isAval.equalsIgnoreCase("YES"))isAvailable=true;
    String isAval = null;
    
              for (Enumeration<AbstractButton> buttons = isAvalButtonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                isAval= button.getText();
            }
            
        }
              
      for (Enumeration<AbstractButton> buttons = manCertButtonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                mainCert= button.getText();
            }
            
        }
              
              
              
    
   // Boolean isAvailable=false;
    if(isAval.equalsIgnoreCase("YES"))isAvailable=true;
    
    
    
    if(countError==0){
        
        if(viewCarsJTable.getSelectedRow()!=selectedRow){
            JOptionPane.showMessageDialog(null, "Please view details of current selected row first.");
            
                manTxtField.setText("");
    manYearTxtField.setText("");
    serNumTxtField.setText("");
    noOfSeatsTxtField.setText("");
    modTxtField.setText("");
    cityTxtField.setText("");
            
        }
        
        else{
    
    car.setCity(city);
    car.setIsAvailable(isAvailable);
    car.setMainCert(mainCert);
    car.setManYear(manYear);
    car.setManufacturer(manufacturer);
    car.setModelNumber(modelNumber);
    car.setNoOfSeats(noOfSeats);
    car.setSerialNum(serialNum);
    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
    
    carsList.setUpdateTime(timeStamp);
    
    JOptionPane.showMessageDialog(null, "Car info Updated " );
          
    populateTable();
                  
                  
                  
    manTxtField.setText("");
    manYearTxtField.setText("");
    serNumTxtField.setText("");
    noOfSeatsTxtField.setText("");
    modTxtField.setText("");
    cityTxtField.setText("");
   // manCertField.setText("");
  //  isAvalTxtField.setText("");
        }
    }
       }     
         
            
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Please view info first.");
        }
        
    }//GEN-LAST:event_updateDetailsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityTxtField;
    private javax.swing.JButton deleteDetailsBtn;
    private javax.swing.JRadioButton expiredJRadioButton;
    private javax.swing.ButtonGroup isAvalButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup manCertButtonGroup;
    private javax.swing.JTextField manTxtField;
    private javax.swing.JTextField manYearTxtField;
    private javax.swing.JTextField modTxtField;
    private javax.swing.JRadioButton noJRadioButton;
    private javax.swing.JTextField noOfSeatsTxtField;
    private javax.swing.JTextField serNumTxtField;
    private javax.swing.JButton updateDetailsBtn;
    private javax.swing.JRadioButton validJRadioButton;
    private javax.swing.JTable viewCarsJTable;
    private javax.swing.JButton viewDetailsJBtn;
    private javax.swing.JRadioButton yesJRadioButton;
    // End of variables declaration//GEN-END:variables
}
