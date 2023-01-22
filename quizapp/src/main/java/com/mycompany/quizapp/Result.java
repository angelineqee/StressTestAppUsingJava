/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quizapp;

import java.awt.Cursor;
import static java.lang.String.valueOf;
import java.util.Random;

public class Result extends javax.swing.JFrame {
    static String username = "";
    static String high1 = "“Faith is the bird that feels the light when the dawn is still dark.” – Rabindranath Tagore";
    static String high2 = "“Our anxiety does not come from thinking about the future, but from wanting to control it.” – Kahlil Gibran";
    static String high3 = "“Many a calm river begins as a turbulent waterfall, yet none hurtles and foams all the way to the sea.” – Mikhail Lermontov";
    static String moderate1 = "“Sometimes the most productive thing you can do is relax.” – Mark Black";
    static String moderate2 = "“You can do anything—but not everything.” – David Allen";
    static String moderate3 = "“Setting goals is the first step in turning the invisible into the visible.” — Tony Robbins";
    static String low1="“To fall in love with yourself is the first secret to happiness.” – Robert Morely";
    static String low2="“There is inestimable blessing in a cheerful spirit.” — Orison Swett Marden";
    static String low3="“Believe you can and you're halfway there.”―Theodore Roosevelt";
    
    static String high[] = {high1, high2, high3};
    static String moderate[] = {moderate1, moderate2, moderate3};
    static String low[] = {low1, low2, low3};
    
    public static void setUsername(String name){
        username=name;
    }
    
    public static void setScore(int score){
        Score.setText(valueOf(score));
        displayMessages(score);
    }
    
    public static void displayMessages(int score){
        Random ran = new Random();
        int y = ran.nextInt(3);
        if( score >= 27) {
            WarmMessage.setText(high[y]);
            MessagePSS.setText("Stress Level: High");
	}else if(score >= 14) {
            WarmMessage.setText(moderate[y]);
            MessagePSS.setText("Stress Level: Moderate");
        }else {
            WarmMessage.setText(low[y]);
            MessagePSS.setText("Stress Level: Low");
        }
    }
    private boolean b;
    
    /**
     * Creates new form Result
     */
    public Result() {
        initComponents();
        Username.setText("Hi, " + username);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        TestName2 = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        Result = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        WarmMessage = new javax.swing.JTextPane();
        Score = new javax.swing.JLabel();
        StressLevel1 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        MessagePSS = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Copyright = new javax.swing.JLabel();
        Flower = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        MiniFlower = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        AppName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 247, 246));
        setResizable(false);

        Header.setBackground(new java.awt.Color(185, 198, 204));
        Header.setPreferredSize(new java.awt.Dimension(100, 33));

        TestName2.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        TestName2.setForeground(new java.awt.Color(47, 47, 79));
        TestName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TestName2.setText("Stress Test Result");

        Logo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angel\\Downloads\\Untitled design (5).png")); // NOI18N
        Logo1.setToolTipText("");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(494, Short.MAX_VALUE)
                .addComponent(Logo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TestName2)
                .addGap(30, 30, 30))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(TestName2)
                .addGap(23, 23, 23))
        );

        Result.setBackground(new java.awt.Color(222, 228, 228));

        WarmMessage.setEditable(false);
        WarmMessage.setBackground(new java.awt.Color(238, 238, 238));
        WarmMessage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        WarmMessage.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        WarmMessage.setForeground(new java.awt.Color(47, 47, 79));
        WarmMessage.setText("A message to you:");
        WarmMessage.setInheritsPopupMenu(true);
        WarmMessage.setSelectionColor(new java.awt.Color(185, 198, 204));
        jScrollPane2.setViewportView(WarmMessage);

        Score.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        Score.setText("Your Score:");

        StressLevel1.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        StressLevel1.setText("Your Stress Level:");

        Username.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Username.setText("Username");

        MessagePSS.setFont(new java.awt.Font("Bahnschrift", 0, 8)); // NOI18N
        MessagePSS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MessagePSS.setText("This test uses the Perceived Stress Scale (PSS)");

        javax.swing.GroupLayout ResultLayout = new javax.swing.GroupLayout(Result);
        Result.setLayout(ResultLayout);
        ResultLayout.setHorizontalGroup(
            ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultLayout.createSequentialGroup()
                .addGroup(ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Score)
                            .addComponent(StressLevel1)))
                    .addGroup(ResultLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(Username))
                    .addGroup(ResultLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResultLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(MessagePSS)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        ResultLayout.setVerticalGroup(
            ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Score)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StressLevel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MessagePSS)
                .addGap(79, 79, 79))
        );

        Footer.setBackground(new java.awt.Color(222, 228, 228));

        Copyright.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        Copyright.setText("All rights reserved");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(Copyright)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(Copyright))
        );

        Flower.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angel\\Downloads\\Untitled design (4).png")); // NOI18N
        Flower.setText("jLabel3");

        Back.setBackground(new java.awt.Color(238, 238, 238));
        Back.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        MiniFlower.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angel\\Downloads\\#B9C6CC (2).png")); // NOI18N

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(Flower, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MiniFlower)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterLayout.createSequentialGroup()
                .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(MiniFlower))
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Flower, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        AppName.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        AppName.setText("Mind Your Mind");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Angel\\Downloads\\#B9C6CC (3).png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(AppName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(AppName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(130, 130, 130)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(460, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        StartQuizPage start = new StartQuizPage();
        start.setVisible(b:true);
        this.setVisible(b:false);
    }//GEN-LAST:event_BackActionPerformed

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back.setCursor(new Cursor(type:Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back.setCursor(new Cursor(type:Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_BackMouseExited

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Result().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppName;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Copyright;
    private javax.swing.JLabel Flower;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Logo1;
    private static javax.swing.JLabel MessagePSS;
    private javax.swing.JLabel MiniFlower;
    private javax.swing.JPanel Result;
    private static javax.swing.JLabel Score;
    private static javax.swing.JLabel StressLevel1;
    private javax.swing.JLabel TestName2;
    private javax.swing.JLabel Username;
    private static javax.swing.JTextPane WarmMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
