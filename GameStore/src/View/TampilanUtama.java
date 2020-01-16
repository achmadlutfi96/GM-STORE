/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
/**
 *
 * @author ACHMAD LUTFI
 */
public class TampilanUtama implements ActionListener{
    JFrame frame=new JFrame();
    JLabel judul=new JLabel("GAME STORE");
    JPanel panelGame=new JPanel();
    JCheckBox Cpubg=new JCheckBox("PUBG");
    JCheckBox Ccod=new JCheckBox("COD");
    JCheckBox Cgta=new JCheckBox("GTA");
    JCheckBox Cdota=new JCheckBox("DOTA");
    JCheckBox Cfifa=new JCheckBox("FIFA");
    JCheckBox Cpes=new JCheckBox("PES");
    JLabel hpubg=new JLabel("Rp 230.000,-");
    JLabel hcod=new JLabel("Rp 190.900,-");
    JLabel hgta=new JLabel("Rp 123.000,-");
    JLabel hdota=new JLabel("Rp 430.000,-");
    JLabel hfifa=new JLabel("Rp 345.000,-");
    JLabel hpes=new JLabel("Rp 576.000,-");
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JPanel panel4=new JPanel();
    JPanel panel5=new JPanel();
    JPanel panel6=new JPanel();
    JButton Bbeli=new JButton("BELI");
    
    Border whiteline = BorderFactory.createLineBorder(Color.WHITE,2);
    String[] pilihan=new String[6];
    TampilanPembayaran bayar;
    
    
    TampilanUtama(){
        frame.setSize(600,500);
        frame.setVisible(true);
        
        frame.setTitle("Game Store");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    public void MenuUtama(){
        judul.setBounds(250,10,200,50);
        judul.setFont(new Font("Arial",Font.BOLD,24));
        judul.setForeground(new Color(244,162,97));
        Cpubg.setBackground(new Color(233,196,106));
        Cpubg.setForeground(new Color(38,70,83));
        Cpubg.setFont(new Font("Arial",Font.BOLD,20));
        hpubg.setBackground(new Color(233,196,106));
        hpubg.setForeground(new Color(38,70,83));
        hpubg.setFont(new Font("Arial",Font.BOLD,20));
        panel1.add(Cpubg);
        panel1.add(hpubg);
        panel1.setBorder(whiteline);
        panel1.setBounds(10, 80, 150, 100);
        panel1.setBackground(new Color(233,196,106));
        Ccod.setBackground(new Color(233,196,106));
        Ccod.setForeground(new Color(38,70,83));
        Ccod.setFont(new Font("Arial",Font.BOLD,20));
        hcod.setBackground(new Color(233,196,106));
        hcod.setForeground(new Color(38,70,83));
        hcod.setFont(new Font("Arial",Font.BOLD,20));
        panel2.add(Ccod);
        panel2.add(hcod);
        panel2.setBorder(whiteline);
        panel2.setBounds(210, 80, 150, 100);
        panel2.setBackground(new Color(233,196,106));
        Cgta.setBackground(new Color(233,196,106));
        Cgta.setForeground(new Color(38,70,83));
        Cgta.setFont(new Font("Arial",Font.BOLD,20));
        hgta.setBackground(new Color(233,196,106));
        hgta.setForeground(new Color(38,70,83));
        hgta.setFont(new Font("Arial",Font.BOLD,20));
        panel3.add(Cgta);
        panel3.add(hgta);
        panel3.setBorder(whiteline);
        panel3.setBounds(410, 80, 150, 100);
        panel3.setBackground(new Color(233,196,106));
        Cdota.setBackground(new Color(233,196,106));
        Cdota.setForeground(new Color(38,70,83));
        Cdota.setFont(new Font("Arial",Font.BOLD,20));
        hdota.setBackground(new Color(233,196,106));
        hdota.setForeground(new Color(38,70,83));
        hdota.setFont(new Font("Arial",Font.BOLD,20));
        panel4.add(Cdota);
        panel4.add(hdota);
        panel4.setBorder(whiteline);
        panel4.setBounds(10, 200, 150, 100);
        panel4.setBackground(new Color(233,196,106));
        Cfifa.setBackground(new Color(233,196,106));
        Cfifa.setForeground(new Color(38,70,83));
        Cfifa.setFont(new Font("Arial",Font.BOLD,20));
        hfifa.setBackground(new Color(233,196,106));
        hfifa.setForeground(new Color(38,70,83));
        hfifa.setFont(new Font("Arial",Font.BOLD,20));
        panel5.add(Cfifa);
        panel5.add(hfifa);
        panel5.setBorder(whiteline);
        panel5.setBounds(210, 200, 150, 100);
        panel5.setBackground(new Color(233,196,106));
        Cpes.setBackground(new Color(233,196,106));
        Cpes.setForeground(new Color(38,70,83));
        Cpes.setFont(new Font("Arial",Font.BOLD,20));
        hpes.setBackground(new Color(233,196,106));
        hpes.setForeground(new Color(38,70,83));
        hpes.setFont(new Font("Arial",Font.BOLD,20));
        panel6.add(Cpes);
        panel6.add(hpes);
        panel6.setBorder(whiteline);
        panel6.setBounds(410, 200, 150, 100);
        panel6.setBackground(new Color(233,196,106));
        
        Bbeli.setBounds(450,400,100,50);
        Bbeli.setFont(new Font("Arial",Font.BOLD,17));
        Bbeli.setBackground(new Color(244,162,97));
        Bbeli.setForeground(new Color(38,70,83));
        Bbeli.addActionListener(this);
       
        panelGame.add(panel1);
        panelGame.add(panel2);
        panelGame.add(panel3);
        panelGame.add(panel4);
        panelGame.add(panel5);
        panelGame.add(panel6);
        panelGame.add(judul);
        panelGame.add(Bbeli);
       
        panelGame.setBackground(new Color(38,70,83));
        panelGame.setLayout(null);
        panelGame.setVisible(true);
        //panelGame.setBorder(border);
        frame.add(panelGame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Bbeli){
            if(Cpubg.isSelected()){
                pilihan[0]=Cpubg.getText();
            }
            if(Ccod.isSelected()){
                pilihan[1]=Ccod.getText();
            }
            if(Cgta.isSelected()){
                pilihan[2]=Cgta.getText();
            }
            if(Cdota.isSelected()){
                pilihan[3]=Cdota.getText();
            }
            if(Cfifa.isSelected()){
                pilihan[4]=Cfifa.getText();
            }
            if(Cpes.isSelected()){
                pilihan[5]=Cpes.getText();
            }
            panelGame.setVisible(false);
            frame.setVisible(false);
            bayar=new TampilanPembayaran();
            bayar.jumlahTotal(pilihan);
            bayar.MenuPembayaran();
            
        }
       
    }


}
