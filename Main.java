/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineattendancesystem;

import java.util.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.lang.Exception;

/**
 *
 * @author Soumen
 */

class invalidAttdncePercent extends Exception{
    String message;
    invalidAttdncePercent(String message){
            this.message = message;
    }
    public String toString(){
        return message;
    }
}

public class Main extends javax.swing.JFrame {
    public static void copy(String a, String b){
        try{
            String temp = "";
            BufferedReader br = new BufferedReader(new FileReader(a));
            BufferedWriter bw = new BufferedWriter(new FileWriter(b));
            while((temp = br.readLine()) != null){
                bw.write(temp);
                bw.newLine();
                bw.flush();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    /**
     * Creates new form Table
     */
    public Main() {
        initComponents();
        jButton2.enable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        op1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Students' Attendance System\n");

        jButton2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jButton2.setText("Calculate Attendance%");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "19Z201  AKASH", "19Z202  ANITA", "19Z203  ANUHARSHINI", "19Z204  ASHWIN", "19Z205  BALA", "19Z206  CHARANYA", "19Z207  CHIRAG", "19Z208  DARWIN", "19Z209  DEEPIKA", "19Z210  DEEPTI", "19Z211  DIVYA", "19Z212  SNEHA", "19Z213  RAJEEV", "19Z214  GOWTHAM", "19Z215  GUNAAL", "19Z216  HARINI", "19Z217  HEMA", "19Z218  JOHANNA", "19Z219  INDRA", "19Z220  JASWANTH", "19Z221  NARESH", "19Z222  KANISKA", "19Z223  KOUSHIKBALAJI", "19Z224  LOHITH", "19Z225  KEERTHNA", "19Z226  MANOJKUMAR", "19Z227  MONIRHITHIKKA", "19Z228  NANDHAKISHORE", "19Z229  NAVANEETH", "19Z230  PPREETHIKA", "19Z231  PAVITHRAL", "19Z232  PRANAV", "19Z233  PRANITHA", "19Z234  RAHULRAJ", "19Z235  RAKESH", "19Z236  RASWANTHE", "19Z237  BALASUBRAMANIAN", "19Z238  SAIRAM", "19Z239  SAMSITHA", "19Z240  SAMYUKTHA", "19Z241  SANJAIM", "19Z242  SANJAI", "19Z243  SARAYU", "19Z244  SIVASUBRAMANIAM", "19Z245  SOUMEN", "19Z246  SRIRAJA", "19Z247  SRIVATHSSAN", "19Z248  SUBASHINI", "19Z249  SUDHARSAN", "19Z250  SURIYA", "19Z251  SWETHA_D", "19Z252  SWETHA_G", "19Z253  KOUSIK_NIBITH", "19Z254  THARUN", "19Z255  VARSHITHAS", "19Z256  VARUN", "19Z257  VENIGALLA", "19Z258  VIGNESHM", "19Z259  VIKNESHWAR", "19Z260  VISHWAKJITH", "19Z261  VIVEKANANDHAN", "19Z262  YOGESH", "19Z263  MANOJ", "19Z264  MATHANA", "19Z265  SWATHIPRIYA", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setText("Select the Stutents present in the Class");

        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setText("Submit Attendance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter the Total No. of Working Hours ->");

        jLabel4.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ROLL/ID", "NAME", "PRESENT HOURS", "ATTENDANCE%"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Overall  Attendance");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton1)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(jButton2)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //List<String> allStuds = new ArrayList<>(65);
        List<String> absentees = new ArrayList<>(65);
        for(int i = 0; i<jList1.getModel().getSize(); i++){
            //allStuds.add(jList1.getModel().getElementAt(i));
            absentees.add(jList1.getModel().getElementAt(i));
        }
        //System.out.println(allStuds);
        List<String> presentStuds = new ArrayList<>(65);
        presentStuds = jList1.getSelectedValuesList();
        absentees.removeAll(presentStuds);
        Iterator<String> itr = absentees.iterator();
        
        jTextArea1.setText("");
        Date today = new Date();
        StringBuffer str = new StringBuffer("");
        for(int i = 0; i<28; i++){
            str.append(today.toString().charAt(i));
            if(i == 9)
                i = 22;
        }
        jLabel4.setText("Absentees on "+str+"\n");
        
        while(itr.hasNext()){
            String stud = itr.next();
            jTextArea1.append(stud+"\n");
        }

        try{
            File f1 = new File("C:\\Users\\SOUMEN\\Documents\\NetBeansProjects\\OnlineAttendanceSystem\\data1.txt");
            Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\Users\\SOUMEN\\Documents\\NetBeansProjects\\OnlineAttendanceSystem\\data.txt")));
            sc.nextLine();
            BufferedWriter wData = new BufferedWriter(new FileWriter(f1));
            wData.write("ROLL\tNAME\tHOURS OF PRESENCE\r\n");
            while(sc.hasNext()){
                String id = sc.next();
                String name = sc.next();
                int workHrs = sc.nextInt();
                if(presentStuds.contains(id+"  "+name)){
                    workHrs++;
                    wData.append(id+"  "+name+"\t"+ workHrs+"\r\n");
                }else{
                    wData.append(id+"  "+name+"\t"+ workHrs+"\r\n");
                }
                //System.out.println(str1.charAt(str1.length()-1));
            }
            wData.close();
            sc.close();
            
            Main.copy("data1.txt", "data.txt");
            if(f1.exists()){
                //System.out.println(Files.deleteIfExists(f1.toPath()));
                //System.out.println(f1.exists()+" "+f1.delete());
            }
            
        }catch(IOException e){
            System.out.println("An Error Occured");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Clear the existing table
        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        
        try{
            Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\Users\\SOUMEN\\Documents\\NetBeansProjects\\OnlineAttendanceSystem\\data.txt")));
            sc.nextLine();
            while(sc.hasNext()){
                String id = sc.next();
                String name = sc.next();
                int workHrs = sc.nextInt();
                try{
                    int totalHrs =Integer.parseInt(jTextField2.getText());
                    if(totalHrs < workHrs){
                        throw new invalidAttdncePercent("Invalid Input!!! Pls Enter Again...");
                    }
                    double percent = ((double)workHrs/totalHrs)*100;
                    percent = (double)Math.round(percent*100)/100;
                    if(percent < 75.00){
                        model.addRow(new Object[]{id, name, workHrs, percent+"  LOW!"});
                    }else{
                        model.addRow(new Object[]{id, name,workHrs, percent});
                    }
                }catch(NumberFormatException e){
                    op1.showMessageDialog(null,"Input is not a Int Value!!!");
                    break;
                }catch(invalidAttdncePercent e){
                    rows = model.getRowCount();
                    if (rows > 0) {
                        for (int i = 0; i < rows; i++) {
                            model.removeRow(0);
                        }
                    }
                    op1.showMessageDialog(jTextField2,e);
                    break;
                }
            }
            sc.close();
        }catch(IOException e){
            op1.showMessageDialog(jPanel1,"An Error Occured");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JOptionPane op1;
    // End of variables declaration//GEN-END:variables

}
