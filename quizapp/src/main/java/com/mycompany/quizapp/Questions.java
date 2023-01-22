/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quizapp;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JRadioButton;

public class Questions extends javax.swing.JFrame {
    String q1 = "How often have you been upset because of something that happened unexpectedly?";
    String q2 = "How often have you felt that you were unable to control the important things in your life?";
    String q3 = "How often have you felt nervous and stressed?";
    String q4 = "How often have you felt confident about your ability to handle your personal problems?";
    String q5 = "How often have you felt that things were going your way?";
    String q6 = "How often have you found that you could not cope with all the things that you had to do?";
    String q7 = "How often have you been able to control irritations in your life?";
    String q8 = "How often have you felt that you were on top of things?";
    String q9 = "How often have you been angered because of things that happened that were outside of your control?";
    String q10 = "How often have you felt difficulties were piling up so high that you could not overcome them?";
		
    String questionArr[] = {q1, q2,  q3, q4, q5, q6, q7, q8, q9, q10};
    static int index = 0, totalScore = 0, questionScore=0;
    
    public void getSelectedOption(JRadioButton rbtn)
    {
        // get the selected value from the radiobutton
        // increment the index
        // disable the radiobuttons
        if(Question_txt.getText().equals(q4) || Question_txt.getText().equals(q5) || Question_txt.getText().equals(q7) || Question_txt.getText().equals(q8)){
            switch (rbtn.getText()) {
            case "Never":questionScore=4;
                break;
            case "Almost never": questionScore=3;
                break;
            case "Sometimes": questionScore=2;
                break;
            case "Fairly often": questionScore=1;
                break;
            default: questionScore=0;
                break;
            }
        }else{
            switch (rbtn.getText()) {
                case "Never":questionScore=0;
                    break;
                case "Almost never": questionScore=1;
                    break;
                case "Sometimes": questionScore=2;
                    break;
                case "Fairly often": questionScore=3;
                    break;
                default: questionScore=4;
                    break;
            }
        }
    }

    public Questions() {
        initComponents();
        Question_txt.setText(questionArr[index]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Question1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Question_txt = new javax.swing.JTextPane();
        Option2 = new javax.swing.JRadioButton();
        Option3 = new javax.swing.JRadioButton();
        Option1 = new javax.swing.JRadioButton();
        Option4 = new javax.swing.JRadioButton();
        Option5 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        Next = new javax.swing.JButton();
        End = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("In the LAST MONTH, how often have you:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Question_txt.setEditable(false);
        Question_txt.setText("Question");
        jScrollPane1.setViewportView(Question_txt);

        buttonGroup1.add(Option2);
        Option2.setText("Almost never");
        Option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Option3);
        Option3.setText("Sometimes");
        Option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Option1);
        Option1.setText("Never");
        Option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Option4);
        Option4.setText("Fairly often");
        Option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Option5);
        Option5.setText("Very often");
        Option5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Question1Layout = new javax.swing.GroupLayout(Question1);
        Question1.setLayout(Question1Layout);
        Question1Layout.setHorizontalGroup(
            Question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(Option1)
                .addGap(28, 28, 28)
                .addComponent(Option2)
                .addGap(28, 28, 28)
                .addComponent(Option3)
                .addGap(28, 28, 28)
                .addComponent(Option4)
                .addGap(28, 28, 28)
                .addComponent(Option5)
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(Question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Question1Layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(157, Short.MAX_VALUE)))
        );
        Question1Layout.setVerticalGroup(
            Question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question1Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(Question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option1)
                    .addComponent(Option2)
                    .addComponent(Option3)
                    .addComponent(Option4)
                    .addComponent(Option5))
                .addGap(170, 170, 170))
            .addGroup(Question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Question1Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(256, Short.MAX_VALUE)))
        );

        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        End.setText("End the test");
        End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(Next)
                .addGap(110, 110, 110)
                .addComponent(End)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(End, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Question1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(515, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Question1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(500, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        if((Option1.isSelected()||Option2.isSelected()||Option3.isSelected()||Option4.isSelected()||Option5.isSelected())==false){
            showMessageDialog(null, "Please choose an option.");
        }
        else if(!Question_txt.getText().equals(q10)){
            totalScore = totalScore+questionScore;
            index++;
            buttonGroup1.clearSelection(); 
            Question_txt.setText(questionArr[index]);
        }else
        {
            buttonGroup1.clearSelection(); 
            Question_txt.setText(questionArr[index]);
            Next.setEnabled(false);
        } 
    }//GEN-LAST:event_NextActionPerformed

    private void Option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option1ActionPerformed
        getSelectedOption(Option1);
    }//GEN-LAST:event_Option1ActionPerformed

    private void Option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option2ActionPerformed
        getSelectedOption(Option2);
    }//GEN-LAST:event_Option2ActionPerformed

    private void Option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option3ActionPerformed
        getSelectedOption(Option3);
    }//GEN-LAST:event_Option3ActionPerformed

    private void Option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option4ActionPerformed
        getSelectedOption(Option4);
    }//GEN-LAST:event_Option4ActionPerformed

    private void Option5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option5ActionPerformed
        getSelectedOption(Option5);
    }//GEN-LAST:event_Option5ActionPerformed

    private void EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndActionPerformed
        //if the user ends the test at last question
        if(Question_txt.getText().equals(q10)){
            if((Option1.isSelected()||Option2.isSelected()||Option3.isSelected()||Option4.isSelected()||Option5.isSelected())==false){
                showMessageDialog(null, "Please choose an option.");
            }
            else{
                totalScore = totalScore + questionScore;
                Result result = new Result();
                result.setScore(totalScore);
                this.setVisible(false);
                result.setVisible(true);
            }
        } else{
            int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to end the test?", "End the test",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                StartQuizPage startQuiz = new StartQuizPage();
                startQuiz.setVisible(true);
                this.setVisible(false);
            }
        } 
    }//GEN-LAST:event_EndActionPerformed

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
//            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Questions().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton End;
    private javax.swing.JButton Next;
    private javax.swing.JRadioButton Option1;
    private javax.swing.JRadioButton Option2;
    private javax.swing.JRadioButton Option3;
    private javax.swing.JRadioButton Option4;
    private javax.swing.JRadioButton Option5;
    private javax.swing.JPanel Question1;
    private javax.swing.JTextPane Question_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
