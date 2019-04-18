
import backend.Hotel;
import backend.HotelRoom;
import backend.Show;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Hotel_page extends javax.swing.JFrame {
        String [] names= new String[10] ; Date ci ,co ; String rtype , c  , msg  ,bname ,nop,nor;  // ci is checkin and co is checck out   c is city and rtype is room type  msg is username 
    /**
     * Creates new form Hotel_page
     */
    public Hotel_page() {
        initComponents();
    }
    
     public Hotel_page(String Username , String Bookingname , String no_of_rooms , String no_of_people , String s,String city,Date checkin ,Date checkout ) throws Exception  {
         initComponents(); // s is roomType ...
         
         
         ci = checkin ; 
         co = checkout ; 
         rtype = s ; 
         c=city  ; 
         msg = Username ; 
         bname = Bookingname ; 
         nop=no_of_people ; 
         nor=no_of_rooms ; 
         
         
         jLabel17.setText(s);
         jLabel18.setText(s);
         jLabel19.setText(s);
         jLabel20.setText(s);
         jLabel21.setText(s);
         jLabel22.setText(s);
         jLabel23.setText(s);
         jLabel24.setText(s);
         jLabel25.setText(s);
         jLabel25.setText(s);
         jLabel26.setText(s);
         
         names=Show.findHotels(city,s) ; 
         
         jLabel6.setText(names[0]) ; 
         jLabel7.setText(names[1]) ; 
         jLabel8.setText(names[2]) ; 
         jLabel9.setText(names[3]) ; 
         jLabel10.setText(names[4]) ; 
         jLabel11.setText(names[5]) ; 
         jLabel12.setText(names[6]) ; 
         jLabel13.setText(names[7]) ; 
         jLabel14.setText(names[8]) ; 
         jLabel15.setText(names[9]) ; 
         
         int  prices[] = new int[10] ; 
         for(int  i=0 ; i<10 ;i++){
                  
             File file = new File("D:\\project\\cities\\"+city+"\\"+names[i]+"\\room1"+".txt") ;
                FileInputStream fos =new FileInputStream(file) ; 
                ObjectInputStream oos =new ObjectInputStream(fos) ; 
                HotelRoom temp = (HotelRoom)oos.readObject() ; 
                if(s.equals("SINGLE"))
                prices[i] = temp.price ;
                else if(s.equals("DOUBLE"))
                prices[i] = 2*temp.price ;
                  else
                prices[i] = 3* temp.price ; 
                
                 }
         
         jLabel28.setText((prices[0])+"") ; 
         jLabel29.setText((prices[1])+"") ; 
         jLabel30.setText((prices[2])+"") ; 
         jLabel31.setText((prices[3])+"") ; 
         jLabel32.setText((prices[4])+"") ;
         jLabel33.setText((prices[5])+"") ; 
         jLabel34.setText((prices[6])+"") ; 
         jLabel35.setText((prices[7])+"") ; 
         jLabel36.setText((prices[8])+"") ; 
         jLabel37.setText((prices[9])+"") ; 
         
         
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
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 900));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 54)); // NOI18N
        jLabel1.setText("HOTELS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(271, 0, 239, 87);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Hotel name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(73, 94, 165, 45);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Room Type");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(367, 94, 127, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Price (Rs)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(690, 94, 113, 40);

        jLabel5.setText("(/per night /per room)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(838, 97, 128, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(31, 186, 326, 34);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(31, 249, 414, 36);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(31, 326, 427, 33);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(31, 377, 427, 41);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(31, 438, 427, 47);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(31, 492, 427, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(31, 550, 241, 41);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(31, 611, 427, 48);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(31, 679, 343, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(31, 739, 341, 40);

        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(484, 186, 182, 34);

        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(484, 238, 182, 47);

        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(484, 317, 182, 42);

        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(484, 377, 127, 41);

        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(484, 443, 172, 40);

        jLabel22.setText("jLabel22");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(484, 492, 172, 40);

        jLabel23.setText("jLabel23");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(484, 552, 172, 41);

        jLabel24.setText("jLabel24");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(484, 613, 172, 48);

        jLabel25.setText("jLabel25");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(484, 681, 172, 40);

        jLabel26.setText("jLabel26");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(484, 741, 172, 40);

        jLabel28.setText("jLabel28");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(710, 186, 118, 26);

        jLabel29.setText("jLabel29");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(710, 253, 118, 16);

        jLabel30.setText("jLabel30");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(710, 317, 108, 16);

        jLabel31.setText("jLabel31");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(710, 389, 118, 16);

        jLabel32.setText("jLabel32");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(710, 455, 118, 16);

        jLabel33.setText("jLabel33");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(710, 504, 118, 16);

        jLabel34.setText("jLabel34");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(710, 562, 118, 16);

        jLabel35.setText("jLabel35");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(710, 629, 118, 16);

        jLabel36.setText("jLabel36");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(710, 693, 118, 16);

        jLabel37.setText("jLabel37");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(710, 753, 118, 16);

        jButton1.setText("check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(900, 190, 80, 25);

        jButton2.setText("check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(901, 249, 80, 25);

        jButton3.setText("check");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(901, 313, 80, 25);

        jButton4.setText("check");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(901, 385, 80, 25);

        jButton5.setText("check");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(901, 451, 80, 25);

        jButton6.setText("check");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(901, 500, 80, 25);

        jButton7.setText("check");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(901, 558, 80, 25);

        jButton8.setText("check");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(901, 625, 80, 25);

        jButton9.setText("check");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(901, 689, 80, 25);

        jButton10.setText("check");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(901, 749, 80, 25);

        jLabel16.setText("(selected)");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(501, 96, 86, 43);

        jButton11.setFont(new java.awt.Font("Tekton Pro", 3, 24)); // NOI18N
        jButton11.setText("Logout");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(858, 13, 108, 46);

        jButton12.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jButton12.setText("Back");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(741, 13, 87, 46);

        jLabel38.setText("jLabel38");
        jLabel38.setMaximumSize(new java.awt.Dimension(1000, 900));
        jLabel38.setMinimumSize(new java.awt.Dimension(1000, 900));
        jLabel38.setPreferredSize(new java.awt.Dimension(1000, 900));
        getContentPane().add(jLabel38);
        jLabel38.setBounds(0, 0, 1000, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         new MyRooms(msg ,bname ,nop ,nor,jLabel14.getText(),ci,co,rtype,c ).setVisible(true) ;
         this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          new MyRooms(msg ,bname ,nop ,nor,jLabel6.getText(),ci,co,rtype,c).setVisible(true) ; this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new MyRooms(msg ,bname ,nop ,nor,jLabel7.getText(),ci,co,rtype,c).setVisible(true) ;this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MyRooms(msg ,bname ,nop ,nor,jLabel8.getText(),ci,co,rtype,c).setVisible(true) ; this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         new MyRooms(msg ,bname ,nop ,nor,jLabel9.getText(),ci,co,rtype,c).setVisible(true) ;this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         new MyRooms(msg ,bname ,nop ,nor,jLabel10.getText(),ci,co,rtype,c).setVisible(true) ;this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         new MyRooms(msg ,bname ,nop ,nor,jLabel11.getText(),ci,co,rtype,c).setVisible(true) ;this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new MyRooms(msg ,bname ,nop ,nor,jLabel12.getText(),ci,co,rtype,c).setVisible(true) ;this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new MyRooms(msg ,bname ,nop ,nor,jLabel13.getText(),ci,co,rtype,c).setVisible(true) ; this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         new MyRooms(msg ,bname ,nop ,nor,jLabel15.getText(),ci,co,rtype,c).setVisible(true) ; this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
           new sign_in().setVisible(true) ;  
           this.dispose() ; // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
                 new NewBooking(msg,bname,nop,c ,rtype,ci,co,nor).setVisible(true) ;  
                 this.dispose() ;                                         // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(Hotel_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotel_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotel_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       try{ java.awt.EventQueue.invokeAndWait(new Runnable() {
            public void run() {
                new Hotel_page().setVisible(true);
            }
        });
        
       }
       catch(Exception e){
           System.out.println("error in Hotel_page") ; 
       }
       }
       
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}