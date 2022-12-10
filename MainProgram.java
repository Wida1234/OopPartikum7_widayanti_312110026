/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi.manusiaa;

/**
 *
 * @author User
 */
public class MainProgram {
    public static void main(String[] args){
        
        // Membuat Object Mesin
        Komputer Mesin = new Komputer();
        
        /* Memanggil atribut dan nilai*/
        Mesin.merk = "with GT$ 5000 HD";
        Mesin.Processor = "Intel i9 12100 U";
        Mesin.Keluaran = 2021;
        
        Manusiaa Wida = new Manusiaa(Mesin);
        
        Wida.merk = "Asus ITX 100i";
        Wida.Mesin = Mesin;
        Wida.powerON();
        Wida.run();
        Wida.powerOFF();
    }
}
    

