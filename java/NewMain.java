/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FORMA��O
 */
import java.util.*;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double temperatura,k,re,ra,f;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em Celsius>");
        String temp = input.nextLine();
        
        temperatura = Double.parseDouble(temp);
        
        k = temperatura + 273.15;
        re = temperatura * 0.8;
        ra = temperatura * 1.8 + 32 + 459.67;
        f = temperatura * 1.8 +32;
        
        System.out.println("EM KELVIN: "+String.valueOf(k));
        System.out.println("EM Reamur: "+String.valueOf(re));
        System.out.println("EM RANKINE: "+String.valueOf(ra));
        System.out.println("EM Farenheit: "+String.valueOf(f));
        
        
        
    
    }
    
}
