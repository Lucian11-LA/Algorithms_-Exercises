
package com.mycompany.lucianoalfredo20221102;

import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Scanner;



/**
 *
 * @author Luciano Alfredo
 * @hidden ID: 20221102
 * @hidden Turma: T3
 * @hidden 20221102@isptec.co.ao
 * @hidden lucianalfred60@gmail.co.ao
 *
 */

public class LucianoAlfredo20221102 {
    public static boolean EMultiplo(int a,int b){
      
       if(a%b == 0 || b%a==0)
           return true;
       return false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op = ' ';
        
        do{
            System.out.println("1. Múltiplos ");
            System.out.println("2. Dodoi ");
            System.out.println("3. Promoção ");
            System.out.println("4. Ricci ");
            System.out.println("5. Sair");
            
            op = input.nextInt();
            
           
            
            switch (op) {
                /*Multiplos*/
                case 1:
                     System.out.println("\n\n");
                     System.out.println("Múltiplos");
                     
                     System.out.print("Digita o primeiro numero: ");
                     int n1 = input.nextInt();
                     
                     System.out.print("Digita o segundo numero: ");
                     int n2 = input.nextInt();
                     
                     if(EMultiplo(n1, n2)){
                         System.out.println("Os números são múltiplos!");
                     }else{
                         System.out.println("Os números não são múltiplos!");
                     }
                     
                    break;
                case 2:
                    
                    /*Dodoi*/
                    System.out.println("\n\n");
                    System.out.println("Dodoi");
                     
                 
                    System.out.print("Digite a idade: ");
                    int idade = input.nextInt();
                    
                    System.out.print("Digite o sexo(Femenino/Masculino): ");
                    String sexo = input.next();
                    
                    sexo = sexo.toLowerCase();
                    String estado = "não";
                    
                    if(sexo.equals("femenino")){
                        System.out.println("Estás gravida? (Sim/Não): ");
                        estado  = input.next();
                        estado = estado.toLowerCase();
                        
                       
                    }
                    
                        
                    if(idade<18 || idade>60 || estado.equals("sim") ){
                        System.out.println("Prioridade Urgente!");
                    }else{
                        String resp = " ";
                        int cont = 0;
                        System.out.println("Responda Sim ou não as seguintes questões: ");
                            
                        System.out.println("a. Tem febre ? ");
                        resp = input.next();
                        resp = resp.toLowerCase();
                            
                        if(resp.equals("sim"))
                            cont++;
                        
                        System.out.println("b. Tem Dor de cabeça ?");
                        resp = input.next();
                        resp = resp.toLowerCase();
                            
                        if(resp.equals("sim"))
                           cont++;
                            
                        System.out.println("c. Tem Tonturas ou enjoos?  ");
                        resp = input.next();
                        resp = resp.toLowerCase();
                            
                        if(resp.equals("sim"))
                            cont++;
                            
                        System.out.println("d. Tem Vómitos ou disenteria ? ");
                        resp = input.next();
                        resp = resp.toLowerCase();
                            
                        if(resp.equals("sim"))
                            cont++;
                            
                        System.out.println("e. Tem ferimentos expostos ?");
                        resp = input.next();
                        resp = resp.toLowerCase();
                            
                        if(resp.equals("sim"))
                            cont++;
                            
                        if(cont>3)
                            System.out.println("Prioridade Urgente!");
                        else if(cont>=2)
                            System.out.println("Prioridade Grave!");
                        else
                            System.out.println("Prioridade Menos Grave!");
            
                    }
                   
                    break;
                     
                case 3:
                    
                    /*Stock*/
                    System.out.println("\n\n");
                    System.out.println("Stock");
                     
                    boolean continuar = true;
                    double total;
                    int qtd1=0;
                    int qtd2=0;
                    int qtd3=0;
                    
                    int total1 = 0;
                    int total2 = 0;
                    int total3 = 0;
                    double totalPagar = 0;
                    double totalDesconto = 0;
                    
                    System.out.println("Nome do operador: ");
                    String nome = input.next();
                    
                    do{
                        
                    
                        System.out.println("Produtos");
                        System.out.println("A");
                        System.out.println("B");
                        System.out.println("C");
                       
                        String resp = input.next();
                        resp = resp.toUpperCase();
                        
                        switch (resp) {
                            case "A":
                                System.out.println("Quantidade do Produtos");
                                int n = input.nextInt();
                                qtd1 +=n;
                                
                                total1 +=  (12000*n);
                                totalPagar += total1;
                                totalDesconto += ((12000*n)*0.15);
                                
                                break;
                            case "B":
                                System.out.println("Quantidade do Produtos");
                                n = input.nextInt();
                                qtd2 +=n;
                                
                                total2 +=  (25000*n);
                                totalPagar += total2;
                                totalDesconto += ((25000*n)*0.25);
                                
                                break;
                            case "C":
                                System.out.println("Quantidade do Produtos");
                                n = input.nextInt();
                                qtd3 +=n;
                                
                                total3 +=  (18000*n);
                                totalPagar += total3;
                                totalDesconto += ((18000*n)*0.20);
                                
                                break;
                            default:
                                System.out.println("Produto invalido!");
                                break;
                                
                           
                            
                        }
                        System.out.print("\n");
                        System.out.println("Quer continuar Vender? Sim/Não ");
                        
                        String c = input.next();
                        c = c.toLowerCase();
                        
                        if(c.equals("sim"))
                            continuar  = true;
                        else
                            continuar = false;
                    }while(continuar);    
                    
                    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date dt = new Date();
                    System.out.println("---------Recibo------------");
                    System.out.println("Data: "+df.format(dt));
                    
                    System.out.println("Operador: "+nome);
                    
                    total = totalPagar-totalDesconto;
                    
                    System.out.println("Produto     Preco   Quantidadde   total ");
                    if(total1!=0){
                        System.out.println("     A         12000   "+qtd1+"     "+total1);
                    }
                    if(total2!=0){
                        System.out.println("     B         25000    "+qtd2+"     "+total2);
                    }
                    if(total3!=0){
                        System.out.println("     C         18000    "+qtd3+"      "+total3);
                    }
                    System.out.println("Valor total: "+totalPagar);
                    System.out.println("Valor total de desconto: "+totalDesconto);
                    System.out.println("Valor A pagar : "+total);
                    
                    System.out.println("-----------------------------");
                    break;
                case 4:
                    /*Ricci*/
                    System.out.println("Serie de Ricci");
                    System.out.print("Digite o primeiro termo: ");
                    int t1 = input.nextInt();
                    
                    System.out.print("Digite o segundo termo: ");
                    int t2 = input.nextInt();
                    
                    System.out.print("Digite N: ");
                    int N = input.nextInt();
                    
                    int cont = 0;
                   
                    System.out.print("Série de Ricci: ");
                    System.out.print(t1+" ");
                    System.out.print(t2+" ");
                    
                    N = N-2;
                    while(cont<N){
                        int valor = t1+t2;
                        System.out.print(valor+" ");
                        
                        t1 = t2;
                        t2 = valor;
                        
                        cont++;
                    }
                    break;
                case 5:
                    
                    break;
                
                default:
                    throw new AssertionError();
            }
            
             System.out.println("\n\n");
        }while(op!=5);
    }
}
