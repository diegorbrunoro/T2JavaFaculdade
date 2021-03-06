/* FACULDADE DOM BOSCO DE PORTO ALEGRE
 *  Sistemas de Informação - Estrtura de Dados - Segundo T1
 * 
 * Objetivo do Programa: 
 * Dada uma lista simplesmente encadeada L, cujo primeiro nodo é apontado por L.prim e que 
 * armazena as idades dos indivíduos de uma determinada cidade.  
 * Faça um programa que percorre a lista, a partir do primeiro nodo, e informe a quantidade de 
 * indivíduos que estão aptos a receber a vacina da gripe pelo SUS. Considerando que apenas 
 * indivíduos com 60 anos ou mais podem receber a vacina.
 * Componentes do grupo: Diego Rodrigues Brunoro
 * Data da entrega do arquivo fonte: 01/05/2020
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

        Nodo nodoAtual = L.prim;
        
        int i=0;
        int idoso =0;
         
        
        for (i=0;i<10;i++){
            int valor = ler.nextInt();
            L.insereInicio(valor);
         }   
         nodoAtual = L.prim;

        while (nodoAtual != null)
		{
                     
                
                    if(nodoAtual.dado >=60){
                        idoso++;
                    }
                    nodoAtual = nodoAtual.next;  
                }
        System.out.println("Qtd de Pessoas com mais de 60 Anos:"+idoso);
        L.mostraLista();
        

    
    }
}
