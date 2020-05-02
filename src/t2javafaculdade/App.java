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
         
        
        for (i=0;i<10;i++){
            int valor = ler.nextInt();
            L.insereInicio(valor);
         
        //Com o While abaixo ele percorre verificando se o prim é diferente de null
        //No If ele guarda a cada interação no idoso e no final exibe essa contagem.
        while (L.prim != null)
		{
		    if(valor >=60){
                        idoso++;
                    }
                    L.prim = L.prim.next;
		}
        }
        System.out.println("Qtd de Pessoas com mais de 60 Anos:"+idoso);
        L.mostraLista();
        

    }
}

