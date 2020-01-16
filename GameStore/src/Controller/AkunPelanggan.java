/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pelanggan;
import java.util.ArrayList;

/**
 *
 * @author ACHMAD LUTFI
 */
public class AkunPelanggan {
    private final ArrayList<Pelanggan> pelangganArr=new ArrayList<>();
    private final Pelanggan pelanggan=new Pelanggan();

    public void Register(String email, String password){
        pelanggan.setEmail(email);
        pelanggan.setPassword(password);
        
        pelangganArr.add(pelanggan);
        System.out.print("pelanggan size:"+pelangganArr.size());
    }

    public Boolean[] Login(String email, String password){
        Boolean[] cek = new Boolean[2];
        cek[0] = false;
        cek[1] = false;
        System.out.print("pelanggan size:"+pelangganArr.size());
        if(!pelangganArr.isEmpty()){
            for (int i=0;i<pelangganArr.size();i++){
                if(email.equalsIgnoreCase(pelangganArr.get(i).getEmail())){
                    cek[0]=true;
                    if(password.equalsIgnoreCase(pelangganArr.get(i).getPassword())){
                        cek[1]=true;
                    }else{
                        cek[1]=false;
                    }
                }
            }
        }
        return cek;
    }

}
