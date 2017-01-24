
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aeons
 */
public class RotaryClubMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Rotary.Club Garage");
        garage g = new garage();
        vehiculeToMod v = new vehiculeToMod();
        
        int choix;
        do{
        System.out.println("---] MENU [---");
        System.out.println("------------");
        System.out.println("->[1]Tous les vehicules.");
        System.out.println("->[2]Les vehicules à modifier.");
        System.out.println("->[3]Les vehicules prets.");
        System.out.println("------------");
        System.out.print("Votre choix ? ");
        Scanner reader = new Scanner(System.in);
        choix = reader.nextInt();
        String menurep1 = "Tous les vehicules";
        String menurep2 = "Les vehicules à modifier";
        String menurep3 = "Les vehicules prets";
        
        
        switch(choix){
            case 1:
            System.out.println(menurep1);
                break;
            case 2:
            System.out.println(menurep2);
                break;
            case 3:
            System.out.println(menurep3);
                break;
            default :
                System.out.println("["+choix+"] n'est pas une entrée valide.");
        }
        }while( choix != 0);
    }
    
}
///reader.nextLine()   ->->-> chaine de char