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
public class kucing {
    int umur;
    String warnaBulu;
    
    void umurCat(int umKu){
        umur = umKu;
    }
    void meong(String col){
        warnaBulu = col;
    }
    void printInfo(){
        System.out.println(
        "Umur kucing : "+umur+" tahun"+"\n"+
        "Warna bulu kucing : "+warnaBulu+"\n");
         
    }
    }
