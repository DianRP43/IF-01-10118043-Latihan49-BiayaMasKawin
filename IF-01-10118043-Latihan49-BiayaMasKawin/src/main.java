
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double b;
        Scanner input = new Scanner(System.in);
        MasKawin m = new MasKawin();
        System.out.println("Masukan Berat Mas : ");
        b = input.nextDouble();
        System.out.println("");
        m.total(b);
        m.cetak(b);
        
    }
    
}
