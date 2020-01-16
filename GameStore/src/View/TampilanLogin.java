/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AkunPelanggan;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ACHMAD LUTFI
 */
public class TampilanLogin implements ActionListener {
    JFrame frame=new JFrame();
    JButton bSignUp=new JButton("SIGN UP");
    JLabel judulLogin=new JLabel("LOGIN");
    JPanel panelLogin=new JPanel();
    JLabel lEmail=new JLabel("Email        :");
    JTextField isiEmail=new JTextField();
    JLabel lPassword=new JLabel("Password :");
    JPasswordField isiPassword=new JPasswordField();
    JButton bLogin=new JButton("LOGIN");
    AkunPelanggan akunPelanggan=new AkunPelanggan();
    
    
    TampilanLogin(){
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setTitle("Game Store");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void TampilkanLogin(){
        judulLogin.setBounds(150,10,100,30);
        judulLogin.setFont(new Font("Arial",Font.BOLD,22));
        judulLogin.setForeground(new Color(244,162,97));
        bSignUp.setBounds(250, 10, 100, 40);
        bSignUp.setBackground(new Color(244,162,97));
        bSignUp.setForeground(new Color(38,70,83));
        bSignUp.addActionListener(this);
        lEmail.setBounds(10, 70, 200, 30);
        lEmail.setFont(new Font("Arial",Font.BOLD,17));
        lEmail.setForeground(new Color(244,162,97));
        isiEmail.setBounds(110, 70, 200, 30);
        isiEmail.setFont(new Font("Arial",Font.BOLD,17));
        isiEmail.setForeground(new Color(244,162,97));
        lPassword.setBounds(10, 110, 200, 30);
        lPassword.setFont(new Font("Arial",Font.BOLD,17));
        lPassword.setForeground(new Color(244,162,97));
        isiPassword.setBounds(110, 110, 200, 30);
        isiPassword.setFont(new Font("Arial",Font.BOLD,17));
        isiPassword.setForeground(new Color(244,162,97));
        bLogin.setBounds(150, 200, 100, 40);
        bLogin.setBackground(new Color(244,162,97));
        bLogin.setForeground(new Color(38,70,83));
        bLogin.addActionListener(this);
        panelLogin.add(judulLogin);
        panelLogin.add(bSignUp);
        panelLogin.add(lEmail);
        panelLogin.add(isiEmail);
        panelLogin.add(lPassword);
        panelLogin.add(isiPassword);
        panelLogin.add(bLogin);
        panelLogin.setBackground(new Color(38,70,83));
        panelLogin.setLayout(null);
        panelLogin.setVisible(true);
        frame.add(panelLogin);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bLogin){
           String email=isiEmail.getText().trim();
           String password=isiPassword.getText().trim();
           boolean isEmptyFields = false;
           if (email.isBlank()){
               isEmptyFields = true;
               JOptionPane.showMessageDialog(frame,"Email tidak boleh kosong");
           }
           if (password.isBlank()){
               isEmptyFields = true;
               JOptionPane.showMessageDialog(frame,"Password tidak boleh kosong");
           }
           if (isEmptyFields==false){
               Boolean[] cek;
               cek=akunPelanggan.Login(email,password);
               if ((cek[0]==true)&&(cek[1]==true)){
                        panelLogin.setVisible(false);
                        frame.setVisible(false);
                        TampilanUtama utama=new TampilanUtama();
                        utama.MenuUtama();
                }else if((cek[0]==true)&&(cek[1]==false)){
                       JOptionPane.showMessageDialog(frame,"Password yang anda masukkan salah");
                }else if((cek[0]==false)&&(cek[1]==false)){
                   JOptionPane.showMessageDialog(frame,"Email dan Password yang anda masukkan salah");
               }
           }
        }else if(e.getSource()==bSignUp){
            panelLogin.setVisible(false);
            frame.setVisible(false);
            TampilanRegister regis=new TampilanRegister();
            regis.TampilkanRegis();
        }
    }
    
}
