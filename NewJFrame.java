/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assistant;
import java.io.IOException;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.lang.Iterable;
import java.net.URLDecoder;
import java.net.URLEncoder;
import static java.time.Instant.now;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.lang.model.util.Elements;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import javax.swing.text.Element;
import org.jsoup.Jsoup;
class GoogleResults {

    private ResponseData responseData;
    public ResponseData getResponseData() { return responseData; }
    public void setResponseData(ResponseData responseData) { this.responseData = responseData; }
    public String toString() { return "ResponseData[" + responseData + "]"; }

    static class ResponseData {
        private List<Result> results;
        public List<Result> getResults() { return results; }
        public void setResults(List<Result> results) { this.results = results; }
        public String toString() { return "Results[" + results + "]"; }
    }

    static class Result {
        private String url;
        private String title;
        public String getUrl() { return url; }
        public String getTitle() { return title; }
        public void setUrl(String url) { this.url = url; }
        public void setTitle(String title) { this.title = title; }
        public String toString() { return "Result[url:" + url +",title:" + title + "]"; }
    }

}
/**
 *
 * @author Programming-learning
 */
public class NewJFrame extends javax.swing.JFrame {

//    private JLabel jLabel1;
//    private JLabel jLabel2;
//    private JTextField quest;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quest = new javax.swing.JTextField();
        ask = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        name = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        namaste = new javax.swing.JButton();
        whoru = new javax.swing.JButton();
        time = new javax.swing.JButton();
        date = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        time1 = new javax.swing.JButton();
        david = new javax.swing.JRadioButton();
        zira = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assistant");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(88, 236, 179));
        setIconImages(null);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Text To Voice");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("Voice Data");

        quest.setBackground(new java.awt.Color(153, 255, 204));
        quest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questActionPerformed(evt);
            }
        });

        ask.setBackground(new java.awt.Color(102, 255, 153));
        ask.setForeground(new java.awt.Color(153, 0, 102));
        ask.setText("ok");
        ask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                askActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        answer.setEditable(false);
        answer.setBackground(new java.awt.Color(204, 204, 255));
        answer.setColumns(20);
        answer.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        answer.setRows(5);
        answer.setAutoscrolls(false);
        answer.setFocusable(false);
        jScrollPane1.setViewportView(answer);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Actions");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(51, 0, 204));
        name.setText("By Sijan Bhandari");

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setForeground(new java.awt.Color(153, 0, 102));
        jButton1.setText("Corona Broadcast");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        namaste.setBackground(new java.awt.Color(204, 255, 204));
        namaste.setForeground(new java.awt.Color(102, 0, 102));
        namaste.setText("Say Namaste");
        namaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namasteActionPerformed(evt);
            }
        });

        whoru.setBackground(new java.awt.Color(204, 255, 204));
        whoru.setForeground(new java.awt.Color(102, 0, 0));
        whoru.setText("Who are you");
        whoru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoruActionPerformed(evt);
            }
        });

        time.setBackground(new java.awt.Color(204, 255, 204));
        time.setForeground(new java.awt.Color(153, 51, 0));
        time.setText("Time");
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        date.setBackground(new java.awt.Color(204, 255, 204));
        date.setForeground(new java.awt.Color(153, 0, 51));
        date.setText("Date");
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 204));
        jLabel4.setText("Quick Start");

        time1.setBackground(new java.awt.Color(204, 255, 204));
        time1.setForeground(new java.awt.Color(153, 51, 0));
        time1.setText("Speak Nepali");
        time1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1ActionPerformed(evt);
            }
        });

        david.setText("Male");
        david.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                davidActionPerformed(evt);
            }
        });

        zira.setText("Female");
        zira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ziraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reset)
                .addGap(119, 119, 119)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(quest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ask)
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(david)
                .addGap(18, 18, 18)
                .addComponent(zira)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(whoru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaste, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zira)
                    .addComponent(david))
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ask)
                    .addComponent(quest, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whoru)
                    .addComponent(namaste)
                    .addComponent(date)
                    .addComponent(time)
                    .addComponent(jButton1)
                    .addComponent(time1))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(reset))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void questActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_questActionPerformed

    private void askActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_askActionPerformed
        // TODO add your handling code here:
        if("".equals(quest.getText()))
        {
            answer.setText("enter data and press ok.\n");
            Voicespeaker vbs=new Voicespeaker("enter data and press ok.");
        }
        else if("hi".equals(quest.getText()))
        {
            Voicespeaker vbs=new Voicespeaker("hello nice to meet you, you said hi.");
        }
        else if("hello".equals(quest.getText()))
        {
            Voicespeaker vbs=new Voicespeaker("hi nice to meet you, you said hello.");
        }
        else{
            
            Voicespeaker vbs=new Voicespeaker(quest.getText());
        }
    }//GEN-LAST:event_askActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        Voicespeaker vp=new Voicespeaker("reset -ttv");
        
    }//GEN-LAST:event_resetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String str="Corona is respiratory novel virus which spreads through contact of infected person so please stay home and wash your hands frequently. use mask and don't make contact with any person. Let's keep our earth safe. thank you.";
        Voicespeaker vp=new Voicespeaker(str);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void whoruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoruActionPerformed
        // TODO add your handling code here:
        Voicespeaker vsps=new Voicespeaker("I am automated text to voice converter with little automation, created by season vaandaari");
        
    }//GEN-LAST:event_whoruActionPerformed

    private void namasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namasteActionPerformed
        // TODO add your handling code here:
        Voicespeaker bdd=new Voicespeaker("namaste. stay safe");
    }//GEN-LAST:event_namasteActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
       Date date1 = new Date();
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
       LocalDateTime now = LocalDateTime.now();  
       Voicespeaker bdd1=new Voicespeaker("today is "+dtf.format(now));
    }//GEN-LAST:event_dateActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
        Date date1 = new Date();
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
       LocalDateTime now = LocalDateTime.now();  
       Voicespeaker bdd1=new Voicespeaker("time is "+dtf.format(now));
    }//GEN-LAST:event_timeActionPerformed

    private void time1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1ActionPerformed
        // TODO add your handling code here:
        Voicespeaker vms=new Voicespeaker("naamaastee nepal tapaae aahhilee sundae hununchha nepali khabar dhhanyebaad.");
    }//GEN-LAST:event_time1ActionPerformed

    private void davidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_davidActionPerformed
        // TODO add your handling code here:
        if(zira.isSelected())
        {
            zira.doClick();
        }
    }//GEN-LAST:event_davidActionPerformed

    private void ziraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ziraActionPerformed
        // TODO add your handling code here:
        if(david.isSelected())
        {
            david.doClick();
        }
    }//GEN-LAST:event_ziraActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answer;
    private javax.swing.JButton ask;
    private javax.swing.JButton date;
    private javax.swing.JRadioButton david;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton namaste;
    private java.awt.Label name;
    private javax.swing.JTextField quest;
    private javax.swing.JButton reset;
    private javax.swing.JButton time;
    private javax.swing.JButton time1;
    private javax.swing.JButton whoru;
    public javax.swing.JRadioButton zira;
    // End of variables declaration//GEN-END:variables
class Voicespeaker
{
    String gender="0";
    int reset=0;
    Voicespeaker(String vv){
        if(zira.isSelected())
        {
            gender="1";
        }
        
        if(vv.equals("what is computer"))
        {
            vv="it's me, haha joking. computer is a electronic device which processes given input and gives you final output.";
            
        }
        if(vv.equals("reset -ttv"))
        {
            reset=1;
            vv="reset action completed.";
        }
    FileWriter f8;
        try{
            File f6 = new File("D:\\voice.txt");
            File f7 = new File("D:\\voice.vbs");
            boolean b = f6.delete();
            boolean a = f7.delete();
            answer.append("opened file\n");
            f8 = new FileWriter("D:\\voice.txt");
         //   BufferedWriter br = new BufferedWriter(f2);
            f8.flush();
            
            answer.append("cleaned previous data\n");
            f8.append("Set Sapi = Wscript.CreateObject(\"SAPI.SpVoice\")\nSet sapi.Voice = sapi.GetVoices.Item("+gender+")\nSapi.speak \""+vv+"\"");f8.close();
            
            File f = new File("D:\\voice.txt");
            File fg = new File("D:\\voice.vbs");
            f.renameTo(fg);
            answer.append("Playing voice\n");
              Runtime.getRuntime().exec( "wscript D:\\voice.vbs" );
               answer.append("exiting action\n***\n");
               if(reset==1)
               {
                   quest.setText("");
                    answer.setText("reset completed successfully :)");
               }
            
        }
        catch(Exception e){
            answer.setText("error accured");
        }
}}

}
