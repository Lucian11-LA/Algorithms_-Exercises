/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1err;

/**
 *
 * @author FORMAÇÃO
 */
import java.util.*;

public class Mavenproject1err {

    public static void main(String[] args) {
       int n1,n2,n3,n4;
       
       Scanner input = new Scanner(System.in);
       
       n1 = input.nextInt();
       n2 = input.nextInt();
       n3 = input.nextInt();
       n4 = input.nextInt();
       
       int media = (n1+n2+n3+n4)/4;
       
       System.out.println("Notas: "+n1+" "+n2+" "+n3+" "+n4);
       System.out.println("Media: "+media);
       
    }
}
