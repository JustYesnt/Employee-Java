/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee0;

import java.util.Scanner;

/**
 *
 * @author M Dzamir Al-Ayman
 */
class main {
    public static void main(String[] args) {
        System.out.println("---------         CAPTAIN          ----------");
        System.out.println("");
        boss Boss = new boss ();
        Boss.nama("Luffy");
        Boss.nip(1001);
        Boss.jamKerja(4);
        Boss.bossGaji(20000);
        Boss.boss();
        System.out.println("");
        System.out.println("---------        VICE-CAPT.        ----------");
        System.out.println("");
        manager Manager = new manager ();
        Manager.nama("Zoro");
        Manager.nip(2002);
        Manager.jamKerja(6);
        Manager.managerGaji(5000);
        Manager.manager();
        System.out.println("");
        System.out.println("---------     CLEANING SERVICE     ----------");
        System.out.println("");
        cleaningService cleaningService = new cleaningService ();
        cleaningService.nama("Sanji");
        cleaningService.nip(3003);
        cleaningService.jamKerja(15);
        cleaningService.cleaningGaji(900);
        cleaningService.cleaningService();
        System.out.println("");
        System.out.println("---------       INTERNSHIP         ----------");
        System.out.println("");
        internship internship = new internship ();  
        internship.nama("Sanji");
        internship.nip(4001);
        internship.jamKerja(2);
        internship.internshipGaji(500);
        internship.internship();
        
    }
        
}
