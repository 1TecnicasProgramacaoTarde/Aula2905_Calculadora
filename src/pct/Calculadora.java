/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author B1-08
 */
public class Calculadora {
    public static void main(String[] args) {
        //Declaração de variáveis
        int n1, n2, total;
        
        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\t\t\t -- Calculadora --\n");
        //Entrada
        System.out.println("Soma Simples");
        System.out.print("Informe n1: ");
        n1 = entrada.nextInt();
        System.out.print("Informe n2: ");
        n2 = entrada.nextInt();
        
        //Processamento
        total = n1 + n2;
        
        
        //Saída
        System.out.println("\n\t " + n1 + " + " + n2 + " = " + total);
        
        
        //Gustavo Multiplicação
        
        //Jéssica Subtração
        //Acho que repetir o título é desnecessario - D. Ps:D = Douglas :)
        System.out.println("\n\t\t\t -- Calculadora --\n");
        //Entrada
        System.out.println("Subtracao Simples");
        System.out.print("Informe n1: ");
        n1 = entrada.nextInt();
        System.out.print("Informe n2: ");
        n2 = entrada.nextInt();
        
        //Processamento
        total = n1 - n2;
        
        
        //Saída
        System.out.println("\n\t " + n1 + " - " + n2 + " = " + total);
        
        //Douglas Resto da Divisão
       
        //Entrada
        System.out.println("Resto da divisão");
        System.out.print("Informe n1: ");
        n1 = entrada.nextInt();
        System.out.print("Informe n2: ");
        n2 = entrada.nextInt();
        
        //Processamento
        total = n1 % n2;
        
        //Saida
        System.out.println("\n\t " + n1 + " % " + n2 + " = " + total);
        
                
        
        
        
        
        
        
    }
    
    
}
