/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2javafaculdade;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class App {
        
       
    
    public static void main(String[] args) {
        // Biblioteca Scanner
        Scanner ler = new Scanner(System.in);
        
        Lista L = new Lista();
        int i=0;
        int idoso =0;
         
        System.out.println("Informe o Tamanho da Lista:");
        int t = ler.nextInt();
        
        for (i=0;i<t;i++){
            System.out.println("Informe a idade: " + "Essa sera a inercao: " + (i+1) + " de:" + (t-i));
            int valor = ler.nextInt();
            L.insereInicio(valor);
        if(valor >=60){
            idoso++;
        }
        }
        System.out.println("Qtd de Pessoas com mais de 60 Anos:"+idoso);
        L.mostraLista();
        

    }
}

