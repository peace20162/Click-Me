/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickme;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;






public class Easy extends JFrame  {
    public static int score;
    JFrame f=new JFrame();
    Timer t;
    
    
    public Easy()  {
        initComponents();
        int moleX=(int)(Math.random()*560);
        int moleY=(int)(Math.random()*250);
        mole.setBounds(moleX,moleY,150,150);
        mole.setVisible(false);
       
        
        
    }
    public int sendScore(){
    return score;
}
    public void setZScore(){
    Easy.score=0;
}
    public void setZTime(){
    this.seconds=0;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jButton1 = new javax.swing.JButton();
        Score = new javax.swing.JLabel();
        Timer = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        scoreShow = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        mole = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ClickME");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("ClickME"); // NOI18N
        setPreferredSize(new java.awt.Dimension(748, 600));
        getContentPane().setLayout(null);

        Score.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Score.setText("Score:");
        getContentPane().add(Score);
        Score.setBounds(40, 40, 102, 39);

        Timer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Timer.setText("Timer:");
        getContentPane().add(Timer);
        Timer.setBounds(531, 31, 104, 31);

        time.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        time.setText("0");
        getContentPane().add(time);
        time.setBounds(560, 60, 42, 44);

        scoreShow.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        scoreShow.setText("0");
        getContentPane().add(scoreShow);
        scoreShow.setBounds(160, 40, 49, 44);

        startButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton);
        startButton.setBounds(290, 50, 83, 37);

        jPanel1.setBackground(new java.awt.Color(56, 27, 7));
        jPanel1.setLayout(null);

        mole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clickme/hit 150 with backg.png"))); // NOI18N
        mole.setMaximumSize(new java.awt.Dimension(150, 150));
        mole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moleActionPerformed(evt);
            }
        });
        jPanel1.add(mole);
        mole.setBounds(80, 20, 140, 140);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 140, 710, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int seconds=0;
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        
        t=new Timer(1000, (ActionEvent e) -> {
            mole.setVisible(true);
            startButton.setVisible(false);
            time.setText(String.valueOf(seconds));
            seconds++;//To change body of generated methods, choose Tools | Templates.
            if (seconds>31){t.stop();
            f.setVisible(false);
            dispose();
            Restart r=new Restart();
            r.setVisible(true);
            }
        });
         t.start();
    
    }//GEN-LAST:event_startButtonActionPerformed

    private void moleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moleActionPerformed
        int moleX=(int)(Math.random()*560);
        int moleY=(int)(Math.random()*250);
        score++;
        scoreShow.setText(Integer.toString(score));
        mole.setBounds(moleX,moleY,150,150);
    }//GEN-LAST:event_moleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(() -> {
            Easy e =new Easy();
            e.setVisible(true);
        });
    
        
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Score;
    private javax.swing.JLabel Timer;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mole;
    private java.awt.PopupMenu popupMenu1;
    public javax.swing.JLabel scoreShow;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
