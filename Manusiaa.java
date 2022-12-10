/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package agregasi.manusiaa;

/**
 *
 * @author User
 */
public class Manusiaa {

   public String merk;
    public Komputer Mesin;
    
    public Manusiaa (Komputer e){
        Mesin = e;
    }


    public void powerON(){
        Mesin.powerON();
    }
    
    public void powerOFF(){
        Mesin.powerOFF();
    }
    
    public void run(){
        System.out.println("Komputer sedang menyala - aktive");
    }
