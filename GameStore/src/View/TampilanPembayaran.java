/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ACHMAD LUTFI
 */
public class TampilanPembayaran extends TampilanUtama {
    String game="";
    int[] harga={230000,190900,123000,430000,345000,576000};
    int jumlah=0;
    int banyakGame=0;
    int diskon;
    double total=0;
    JPanel panelPembayaran=new JPanel();
    JLabel ljudul2=new JLabel("PEMBAYARAN");
    JLabel lnamagame=new JLabel("Game yang Dipilih      :");
    JLabel lisigame=new JLabel();
    JLabel lbanyak=new JLabel("Banyaknya Game       :");
    JLabel lisibanyak=new JLabel();
    JLabel lnamaharga=new JLabel("Harga Total               :");
    JLabel lisiharga=new JLabel();
    JLabel lnamadiskon=new JLabel("Diskon                       :");
    JLabel lisidiskon=new JLabel();
    JLabel lnamatotal=new JLabel("Pembayaran Total     :");
    JLabel lisitotal=new JLabel();
    JLabel lnamabayar=new JLabel("Jumlah Pembayaran :");
    JTextField tisibayar=new JTextField();
    JButton Bbayar=new JButton("BAYAR");
    JButton Bkembali=new JButton("KEMBALI");
    TampilanUtama kembali;
    
    public void MenuPembayaran(){
        Diskon();
        ljudul2.setBounds(200,10,200,30);
        ljudul2.setFont(new Font("Arial",Font.BOLD,22));
        ljudul2.setForeground(new Color(244,162,97));
        lnamagame.setBounds(10, 70, 200, 30);
        lnamagame.setFont(new Font("Arial",Font.BOLD,17));
        lnamagame.setForeground(new Color(244,162,97));
        lisigame.setBounds(200, 70, 300, 30);
        lisigame.setFont(new Font("Arial",Font.BOLD,17));
        lisigame.setForeground(new Color(244,162,97));
        lisigame.setText(this.game);
        lbanyak.setBounds(10, 100, 200, 30);
        lbanyak.setFont(new Font("Arial",Font.BOLD,17));
        lbanyak.setForeground(new Color(244,162,97));
        lisibanyak.setBounds(200, 100, 300, 30);
        lisibanyak.setFont(new Font("Arial",Font.BOLD,17));
        lisibanyak.setForeground(new Color(244,162,97));
        lisibanyak.setText(Integer.toString(this.banyakGame));
        lnamaharga.setBounds(10, 140, 200, 30);
        lnamaharga.setFont(new Font("Arial",Font.BOLD,17));
        lnamaharga.setForeground(new Color(244,162,97));
        lisiharga.setBounds(200, 140, 150, 30);
        lisiharga.setFont(new Font("Arial",Font.BOLD,17));
        lisiharga.setForeground(new Color(244,162,97));
        lisiharga.setText(Integer.toString(this.jumlah));
        lnamadiskon.setBounds(10, 180, 200, 30);
        lnamadiskon.setFont(new Font("Arial",Font.BOLD,17));
        lnamadiskon.setForeground(new Color(244,162,97));
        lisidiskon.setBounds(200, 180, 150, 30);
        lisidiskon.setFont(new Font("Arial",Font.BOLD,17));
        lisidiskon.setForeground(new Color(244,162,97));
        lisidiskon.setText(Integer.toString(this.diskon)+"%");
        lnamatotal.setBounds(10, 220, 200, 30);
        lnamatotal.setFont(new Font("Arial",Font.BOLD,17));
        lnamatotal.setForeground(new Color(244,162,97));
        lisitotal.setBounds(200, 220, 150, 30);
        lisitotal.setFont(new Font("Arial",Font.BOLD,17));
        lisitotal.setForeground(new Color(244,162,97));
        lisitotal.setText(Double.toString(this.total));
        lnamabayar.setBounds(10, 260, 200, 30);
        lnamabayar.setFont(new Font("Arial",Font.BOLD,17));
        lnamabayar.setForeground(new Color(244,162,97));
        tisibayar.setBounds(200, 260, 150, 30);
        tisibayar.setFont(new Font("Arial",Font.BOLD,17));
        tisibayar.setBackground(new Color(244,162,97));
        tisibayar.setForeground(new Color(38,70,83));
        Bbayar.setBounds(250, 400, 100, 50);
        Bbayar.setBackground(new Color(244,162,97));
        Bbayar.setForeground(new Color(38,70,83));
        Bbayar.addActionListener(this);
        Bkembali.setBounds(10,400,100,50);
        Bkembali.setBackground(new Color(244,162,97));
        Bkembali.setForeground(new Color(38,70,83));
        Bkembali.addActionListener(this);
        panelPembayaran.add(ljudul2);
        panelPembayaran.add(lnamagame);
        panelPembayaran.add(lisigame);
        panelPembayaran.add(lbanyak);
        panelPembayaran.add(lisibanyak);
        panelPembayaran.add(lnamaharga);
        panelPembayaran.add(lisiharga);
        panelPembayaran.add(lnamadiskon);
        panelPembayaran.add(lisidiskon);
        panelPembayaran.add(lnamatotal);
        panelPembayaran.add(lisitotal);
        panelPembayaran.add(lnamabayar);
        panelPembayaran.add(tisibayar);
        panelPembayaran.add(Bbayar);
        panelPembayaran.add(Bkembali);
        panelPembayaran.setBackground(new Color(38,70,83));
        panelPembayaran.setLayout(null);
        panelPembayaran.setVisible(true);
        frame.add(panelPembayaran);
    }
    public void jumlahTotal(String[] pilihan){
      for(int i=0;i<=5;i++){
         if(pilihan[i]!=null){
             if(this.banyakGame>=1){
                 this.game+=",";
             }
             this.jumlah=jumlah+harga[i];
             this.game=game+pilihan[i];
             this.banyakGame=banyakGame+1;
         }
      }
    }
    public int Diskon(){
        if(jumlah>=500000){
            this.diskon=20;
            this.total=jumlah-(jumlah*0.2);
        }else if((jumlah>=250000)&&(jumlah<500000)){
            this.diskon=10;
            this.total=jumlah-(jumlah*0.1);
        }else{
            this.diskon=0;
            this.total=jumlah;
        }
        return diskon;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Bbayar){
            if(tisibayar.getText().equals("")){
                JOptionPane.showMessageDialog(frame,"Transaksi Gagal\n Jumlah Pembayaran Belum terisi" );
            }else{
                int jumlahbayar=Integer.parseInt(tisibayar.getText());
                if(jumlahbayar<total){
                    JOptionPane.showMessageDialog(frame,"Transaksi Gagal\n Jumlah Pembayaran Kurang "+(total-jumlahbayar) );
                }else{
                    JOptionPane.showMessageDialog(frame,"Transaksi Sukses\nGame yang dibeli:"+game+"\nBanyaknya Game:"+banyakGame
                            +"\nHarga Total:"+jumlah+"\nDiskon:"+diskon+"%\nPembayaran Total:"+total
                            +"\nJumlahPembayaran:"+jumlahbayar+"\nKembali:"+(jumlahbayar-total));
                    
                }
            }
        }else if(e.getSource()==Bkembali){
            panelPembayaran.setVisible(false);
            this.game=null;
            this.jumlah=0;
            frame.setVisible(false);
            kembali=new TampilanUtama();
            kembali.MenuUtama();
        }
    }
}
