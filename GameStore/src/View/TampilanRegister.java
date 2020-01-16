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

/**
 *
 * @author ACHMAD LUTFI
 */
public class TampilanRegister extends TampilanLogin{
    JPanel panelRegis=new JPanel();
    JLabel judulRegis=new JLabel("SIGN UP");
    JButton bregis=new JButton("SIGN UP");
    
    public void TampilkanRegis(){
        judulRegis.setBounds(150,10,100,30);
        judulRegis.setFont(new Font("Arial",Font.BOLD,22));
        judulRegis.setForeground(new Color(244,162,97));
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
        bregis.setBounds(150, 200, 100, 40);
        bregis.setBackground(new Color(244,162,97));
        bregis.setForeground(new Color(38,70,83));
        bregis.addActionListener(this);
        panelRegis.add(judulRegis);
        panelRegis.add(lEmail);
        panelRegis.add(isiEmail);
        panelRegis.add(lPassword);
        panelRegis.add(isiPassword);
        panelRegis.add(bregis);
        panelRegis.setBackground(new Color(38,70,83));
        panelRegis.setLayout(null);
        panelRegis.setVisible(true);
        frame.add(panelRegis);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bregis){
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
               akunPelanggan.Register(email, password);
               panelRegis.setVisible(false);
               frame.setVisible(false);
               TampilanLogin awal=new TampilanLogin();
               awal.TampilkanLogin();
           }
        }
    }

}
