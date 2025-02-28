/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quizapp;

import java.awt.Cursor;
import static java.lang.String.valueOf;
import java.util.Random;
import static com.mycompany.quizapp.SignUp.conn;
import static com.mycompany.quizapp.SignUp.pst;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

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
        addRecord(score);
    }
    
    public static void displayMessages(int score){
        Random ran = new Random(System.currentTimeMillis());
        int y = ran.nextInt(3);
        if( score >= 27) {
            WarmMessage.setText(high[y]);
            StressLevel.setText("High");
	}else if(score >= 14) {
            WarmMessage.setText(moderate[y]);
            StressLevel.setText("Moderate");
        }else {
            WarmMessage.setText(low[y]);
            StressLevel.setText("Low");
        }
    }
    public static void addRecord (int score){
        try {
                String query = "INSERT INTO stress_records(RECORD_DATE,STRESS_SCORE,STRESS_LEVEL, USER_ID) VALUES (?,?,?,(SELECT USER_ID FROM users WHERE users.USERNAME = ?))";
                conn = DriverManager.getConnection("jdbc:mysql://localhost/cat201","root","pass123");
                java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
         
                pst = conn.prepareStatement(query);
                pst.setDate(1, sqlDate);
                pst.setInt(2, score);
                pst.setString(3,StressLevel.getText() );
                pst.setString(4, username);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Score added to stress_tracker");
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
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
        ScoreLabel = new javax.swing.JLabel();
        StressLevelLabel = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        MessagePSS = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        StressLevel = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        MiniFlower = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Copyright = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 247, 246));
        setResizable(false);
        setSize(new java.awt.Dimension(889, 651));

        Header.setBackground(new java.awt.Color(185, 198, 204));
        Header.setPreferredSize(new java.awt.Dimension(100, 33));

        TestName2.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        TestName2.setForeground(new java.awt.Color(255, 255, 255));
        TestName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TestName2.setText("Stress Test Result");

        Logo1.setToolTipText("");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TestName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logo1)
                .addGap(294, 294, 294))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(TestName2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Result.setBackground(new java.awt.Color(222, 228, 228));

        WarmMessage.setEditable(false);
        WarmMessage.setBackground(new java.awt.Color(238, 238, 238));
        WarmMessage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        WarmMessage.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        WarmMessage.setForeground(new java.awt.Color(47, 47, 79));
        WarmMessage.setText("A message to you:");
        WarmMessage.setInheritsPopupMenu(true);
        WarmMessage.setSelectionColor(new java.awt.Color(185, 198, 204));
        jScrollPane2.setViewportView(WarmMessage);

        ScoreLabel.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        ScoreLabel.setText("Your Score:");

        StressLevelLabel.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        StressLevelLabel.setText("Your Stress Level:");

        Username.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Username.setText("Username");

        MessagePSS.setFont(new java.awt.Font("Bahnschrift", 0, 8)); // NOI18N
        MessagePSS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MessagePSS.setText("This test uses the Perceived Stress Scale (PSS)");

        Score.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        Score.setText("?");

        StressLevel.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        StressLevel.setText("?");

        javax.swing.GroupLayout ResultLayout = new javax.swing.GroupLayout(Result);
        Result.setLayout(ResultLayout);
        ResultLayout.setHorizontalGroup(
            ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultLayout.createSequentialGroup()
                .addGroup(ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ScoreLabel)
                            .addComponent(StressLevelLabel)
                            .addComponent(Username))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Score)
                            .addComponent(StressLevel)))
                    .addGroup(ResultLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResultLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(MessagePSS)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        ResultLayout.setVerticalGroup(
            ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Username)
                .addGap(18, 18, 18)
                .addGroup(ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScoreLabel)
                    .addComponent(Score))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StressLevelLabel)
                    .addComponent(StressLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MessagePSS)
                .addGap(79, 79, 79))
        );

        Footer.setBackground(new java.awt.Color(222, 228, 228));

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

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MiniFlower)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterLayout.createSequentialGroup()
                .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(MiniFlower))
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );

        jPanel5.setBackground(new java.awt.Color(222, 228, 228));

        jLabel2.setBackground(new java.awt.Color(185, 198, 204));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(131, 148, 156));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mind Your Mind");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(185, 198, 204));

        Copyright.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        Copyright.setForeground(new java.awt.Color(255, 255, 255));
        Copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Copyright.setText("All rights reserved");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Copyright, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Copyright)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        StartQuizPage start = new StartQuizPage();
        start.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
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
    private javax.swing.JButton Back;
    private javax.swing.JLabel Copyright;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Logo1;
    private static javax.swing.JLabel MessagePSS;
    private javax.swing.JLabel MiniFlower;
    private javax.swing.JPanel Result;
    private static javax.swing.JLabel Score;
    private static javax.swing.JLabel ScoreLabel;
    private static javax.swing.JLabel StressLevel;
    private static javax.swing.JLabel StressLevelLabel;
    private javax.swing.JLabel TestName2;
    private javax.swing.JLabel Username;
    private static javax.swing.JTextPane WarmMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
