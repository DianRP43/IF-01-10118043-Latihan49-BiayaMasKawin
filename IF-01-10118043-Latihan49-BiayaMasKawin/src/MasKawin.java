/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MasKawin {
    private double berat;
    private final double harga = 570000;

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double total(double berat){
    return berat * harga;
            }
    
    public void cetak(double berat){
        System.out.println("Hendi");
        System.out.println("Berat Mas  : "+berat);
        System.out.println("Harga/gram : 570.000");
        System.out.println("Harga total: "+total(berat));
        
    }
    
}
