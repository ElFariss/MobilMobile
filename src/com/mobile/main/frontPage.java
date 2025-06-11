/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mobile.main;

import com.mobile.component.item;
import com.mobile.model.Mobil;
import com.mobile.event.EventItem;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;

/**
 *
 * @author parasite
 */
public class frontPage extends javax.swing.JFrame {

    /**
     * @param event the event to set
     */
    public void setEvent(EventItem event) {
        this.event = event;
    }
    /**
     * Creates new form frontPage
     */
    private EventItem event;
    Mobil[] listMobils = new Mobil[6];
    
    public frontPage() {
        initComponents();
        String test = "Lorem ipsum dolor itemsit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. ";
        listMobils[0] = new Mobil(1,1, "Toyota", test , 250_000_000, "Avanza", new ImageIcon(getClass().getResource("/com/mobile/image/Avanza.jpg")));
        listMobils[1] = new Mobil(2,2, "Honda", test , 200_000_000, "Brio", new ImageIcon(getClass().getResource("/com/mobile/image/Brio.jpg")));
        listMobils[2] = new Mobil(3,3, "Toyota", test , 100_000_000, "Calya", new ImageIcon(getClass().getResource("/com/mobile/image/Calya.jpg")));
        listMobils[3] = new Mobil(4,4, "Toyota", test , 500_000_000, "Innova", new ImageIcon(getClass().getResource("/com/mobile/image/Innova.jpg")));
        listMobils[4] = new Mobil(5,5, "Wuling", test , 200_000_000, "Wuling", new ImageIcon(getClass().getResource("/com/mobile/image/Wuling.jpg")));
        listMobils[5] = new Mobil(6,6, "Daihatsu", test , 200_000_000, "Xenia", new ImageIcon(getClass().getResource("/com/mobile/image/Xenia.jpg")));
        mockData();
    }

    public void addItem(Mobil data) {
        item Item = new item();
        Item.setData(data);
        Item.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    event.itemClick(Item, data);
                }
            }
        }); 
        panelItem1.add(Item);
        panelItem1.revalidate();
        panelItem1.repaint();
    }
    
    public void setSelected(Component Item) {
        for(Component com:panelItem1.getComponents()){
            item i=(item) com;
            if(i.isSelected()) {
                i.setSelected(false);
            }
        }
        ((item) Item).setSelected(true);
    }
    
    
    private Mobil selectedMobil;
    
    public void showItem(Mobil data) {
        pic.setImage(data.getImage());
        lbCar.setText(data.getCarName());
        lbBrand.setText(data.getmerek());
        lbQty.setText(String.format("Jumlah: %s",data.getStok()));
        lbDesc.setText(data.getDescription());
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        lbPrice.setText(formatter.format(data.getPrice()));
        
        this.selectedMobil = data;
    }
    
    
        private void mockData() {
        setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, Mobil item) {
                setSelected(com);
                showItem(item);
            }
        });
            addItem(listMobils[0]);
            addItem(listMobils[1]);
            addItem(listMobils[2]);
            addItem(listMobils[3]);
            addItem(listMobils[4]);
            addItem(listMobils[5]);
    }
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
            java.util.logging.Logger.getLogger(frontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frontPage().setVisible(true);
            }
        });
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        panelItem1 = new com.mobile.swing.PanelItem();
        btnTestDrive = new javax.swing.JButton();
        jpanel2 = new javax.swing.JPanel();
        lbCar = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        lbBrand = new javax.swing.JLabel();
        lbDesc = new javax.swing.JTextPane();
        lbQty = new javax.swing.JLabel();
        pic = new com.mobile.swing.PictureBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(854, 480));
        setPreferredSize(new java.awt.Dimension(854, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Futura T OT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MobilMobile");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        scroll.setViewportView(panelItem1);

        btnTestDrive.setBackground(new java.awt.Color(255, 255, 255));
        btnTestDrive.setFont(new java.awt.Font("Futura Bk BT", 0, 36)); // NOI18N
        btnTestDrive.setForeground(new java.awt.Color(0, 0, 0));
        btnTestDrive.setText("Test Drive");
        btnTestDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestDriveActionPerformed(evt);
            }
        });

        jpanel2.setOpaque(false);

        lbCar.setFont(new java.awt.Font("Futura ICG XBold", 0, 14)); // NOI18N
        lbCar.setForeground(new java.awt.Color(0, 0, 0));

        lbPrice.setFont(new java.awt.Font("Futura ICG", 0, 14)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(102, 102, 102));
        lbPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lbBrand.setFont(new java.awt.Font("Futura T OT", 0, 15)); // NOI18N
        lbBrand.setForeground(new java.awt.Color(0, 0, 0));

        lbDesc.setBackground(new java.awt.Color(255, 255, 255));
        lbDesc.setFocusable(false);

        lbQty.setFont(new java.awt.Font("Futura T OT", 0, 15)); // NOI18N
        lbQty.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpanel2Layout = new javax.swing.GroupLayout(jpanel2);
        jpanel2.setLayout(jpanel2Layout);
        jpanel2Layout.setHorizontalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addComponent(lbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbQty, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addComponent(lbDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addComponent(lbCar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116))
        );
        jpanel2Layout.setVerticalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lbDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBrand)
                    .addComponent(lbQty))
                .addGap(153, 153, 153))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTestDrive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnTestDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scroll)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnTestDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestDriveActionPerformed
        testDriveGUI testDrivePage = new testDriveGUI();
        testDrivePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTestDriveActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTestDrive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpanel2;
    private javax.swing.JLabel lbBrand;
    private javax.swing.JLabel lbCar;
    private javax.swing.JTextPane lbDesc;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbQty;
    private com.mobile.swing.PanelItem panelItem1;
    private com.mobile.swing.PictureBox pic;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

    private String toString(int stok) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
