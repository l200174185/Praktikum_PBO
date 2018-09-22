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
public class Becak {
    int speed;
    int cadance;
    int gear;
    String becak;
    
    void speedUp(int speedBi){
        speed = speedBi;
    }
    void changeCadance(int cadanceBi){
        cadance = cadanceBi;
    }
    void changeGear(int gearBi){
        gear = gearBi;
    }
    void printInfo(){
        System.out.println(
        "Kecepatan sepeda : "+speed+"\n"+
        "Cadance speda : "+cadance+"\n"+
         "Gear speda : "+gear+"\n");
        
    }
}
