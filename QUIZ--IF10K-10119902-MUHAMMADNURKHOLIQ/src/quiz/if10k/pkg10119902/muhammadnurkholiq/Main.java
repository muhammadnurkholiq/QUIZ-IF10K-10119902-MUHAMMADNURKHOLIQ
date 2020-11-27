/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10k.pkg10119902.muhammadnurkholiq;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     : Muhammad Nurkholiq
 * kelas    : IF10K
 * NIM      : 10119902
 *Deskripsi Program : Program Ini Berisi Program Untuk Menampilkan Program
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int serviceItem;
        boolean isMember;
        float price, discount;
        
        Scanner scanner = new Scanner(System.in);
        ServicePrice sp = new ServicePrice();
        Customer cst    = new Customer();
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name \t : ");
        cst.setNama(scanner.next());
        System.out.print("Customer Email \t : ");
        cst.setEmail(scanner.next());
        
        sp.displayService();
        serviceItem = scanner.nextInt();
        sp.setPriceService(sp.getPrice(serviceItem));
        
        System.out.print("Are you Member (yes/no) : ");
        isMember = sp.checkMemberStatus(scanner.next());
        
        discount = sp.getSale(isMember, sp.getPriceService());
        
        System.out.println("\n");
        System.out.println("#******************************#");
        System.out.println("#******************************#");
        System.out.println("Date Transaction : " + cst.currentTime());
        System.out.println("Service Price : " + sp.getPriceService());
        System.out.println("Discount : " + discount);
        System.out.println("Total Pay : " + sp.getTotalPay(sp.getPriceService(), discount));
    }
    
}