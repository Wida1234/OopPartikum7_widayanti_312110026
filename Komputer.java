/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relasiclass.laptop;

/**
 *
 * @author User
 */

    
    
    
public class Komputer implements Laptop{
    public String merk,Processor;
    public int Keluaran;
    
    @Override
    public void powerON(){
        System.out.println("Start--Laptop dinyalakan...");
    }
    
    @Override
    public void powerOFF(){
        System.out.println("ShuttingDown--Laptop dimatikan...");
    }
}