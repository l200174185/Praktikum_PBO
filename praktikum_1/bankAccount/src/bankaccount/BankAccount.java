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
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        akunBank hai = new akunBank();
        
        hai.sisaSaldo(50000000);
        hai.cobaTabung(1000000);
        hai.cobaTarik(500000);
        hai.cobaTransfer(700000);
        hai.printInfo();
    }
    
}
