/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_1;

/**
 *
 * @author LAB-RPL
 */
public class Rotiku {
   String warna;
   String rasa;
   int berat;
   double harga;
   
    
    void beriWarna(String w){
        warna = w;
    }
    void beriRasa(String c){
        rasa = c;
    }
    void timbangBerat(int e){
        berat = e;
    }
    void hargaJual(double s){
        harga = s;
    }
    void printInfo(){
        System.out.println(
        "Warna Roti : "+warna+"\n"+
        "Rasa Roti : "+rasa+"\n"+
        "Berat Roti : "+berat+"\n"+
        "Harga Roti : "+harga+"\n");
        
    }
}
