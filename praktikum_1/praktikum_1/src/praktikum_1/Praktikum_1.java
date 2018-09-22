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
public class Praktikum_1 {

   
    public static void main(String[] args) {
     Rotiku rotienak = new Rotiku();
     Rotiku rotienak2 = new Rotiku();
     Rotiku rotienak3 = new Rotiku();
     
     
     rotienak.beriWarna("Cokelat");
     rotienak.beriRasa("Pisang COklat");
     rotienak.timbangBerat(50);
     rotienak.hargaJual(5000);
     rotienak.printInfo();
     
     rotienak2.beriWarna("Merah");
     rotienak2.beriRasa("Keju");
     rotienak2.timbangBerat(20);
     rotienak2.hargaJual(3000);
     rotienak2.printInfo();
     
     rotienak3.beriWarna("Kuning");
     rotienak3.beriRasa("blueberry");
     rotienak3.timbangBerat(50);
     rotienak3.hargaJual(4500);
     rotienak3.printInfo();
 
        
        
        
        
        
        
      Becak becak2 = new Becak();
      Becak becak3 = new Becak();
      
      becak2.changeCadance(50);
      becak2.speedUp(20);
      becak2.changeGear(2);
      becak2.printInfo();
      
      becak2.changeCadance(50);
      becak2.speedUp(20);
      becak2.changeGear(2);
      
      becak2.changeCadance(40);
      becak2.speedUp(10);
      becak2.changeGear(1);
      becak2.printInfo();
      
      
      kucing cat1 = new kucing();
      
      cat1.umurCat(5);
      cat1.meong("hijau");
      cat1.printInfo();
      
    }
    
}
