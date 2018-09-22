/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author LAB-RPL
 */
public class akunBank {
    
    double saldo;
    int norek;
    String nama;
    int tabung;
    int tarik;
    int transfer;
    
    void namaAnda(String yv){
        nama = yv;
    }
    
    void sisaSaldo(int t){
        saldo = t;
    }
    
    void cobaTabung(int l){
        tabung = l;
    }
    
    void cobaTarik(int n){
        tarik = n;
    }
    
    void cobaTransfer(int k){
        transfer = k;
    }
    
    void infoNorek(int p){
        norek = p;
    }
    void printInfo(){
        System.out.println(
        "Nama Anda : "+nama+"\n"+
        "Saldo Anda : "+saldo+"\n"+
        "No Rekening Anda : "+norek+"\n"+
        "Anda menabung : "+"Rp. "+tabung+"\n"+
        "Anda mengambil uang : "+"Rp. "+tarik+"\n"+
        "Anda Transfer : "+"Rp. "+transfer+"\n"
        );
         
    }
    

    
}
