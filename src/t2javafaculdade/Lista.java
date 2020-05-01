package t2javafaculdade;
public class Lista
{
	public Nodo prim;
	
	public Lista()
	{
		this.prim = null;
	}
	
	public boolean isEmpty()
	{
		if (this.prim == null)
		    return true;
		else
			return false;
	}
	
	public void insereInicio(int elemento)
	{
		Nodo novoNodo = new Nodo(elemento);
		novoNodo.next = prim;
		prim          = novoNodo;
	}
	
	public Nodo removeInicio()
	{
		Nodo nodoAux = prim;
		prim = nodoAux.next;
		
		return nodoAux;
	}
	
	public void mostraLista()
	{
		System.out.println ("mostra do primeiro ao ultimo");
		
		Nodo nodoAtual = prim;
		
		while (nodoAtual != null)
		{
			nodoAtual.mostraNodo();
			nodoAtual = nodoAtual.next;
		}
	}
        
        	public void insereFim(int elemento)
	{
	
		    Nodo nodoUltimo = prim;
		    
		    if (prim != null)
		    {
		        while (nodoUltimo.next != null)
	      	    {   
		    	     nodoUltimo = nodoUltimo.next;
		        }
		        
		    }
		
			Nodo novoNodo = new Nodo (elemento);
						
			if (prim == null)	
				prim = novoNodo;
			else
				nodoUltimo.next  = novoNodo;

	}
	
	public Nodo removeFim ()
	{
		Nodo nodoUltimo = prim;
		Nodo nodoAux    = prim;
		
		while (nodoUltimo.next != null)
		{
			nodoAux = nodoUltimo;
			nodoUltimo = nodoUltimo.next;
		}
		
		if (nodoUltimo != nodoAux)
		    nodoAux.next = null;
		else
			prim = null;
		
		return nodoUltimo;
	}
	
	public void insere (int elemento, int pos) 
	{
		if ((pos == 1) || (prim == null))
			insereInicio (elemento);
		else
		{
			int cont = 1;
		    Nodo nodoAux = prim;
			while (nodoAux.next != null)
			{
				cont++;
				nodoAux = nodoAux.next;
			}
		
			if (pos > cont)
				insereFim(elemento);
			else
			{
				cont = 1;
				nodoAux = prim;
				while (cont < (pos - 1))
				{
					cont ++;
					nodoAux = nodoAux.next;	
				}
				
				Nodo novoNodo = new Nodo(elemento);
				
				novoNodo.next = nodoAux.next;
				
				nodoAux.next = novoNodo;
				
				
			}
		}
	}
	
	public Nodo remove (int pos)
	{
		Nodo nodoRetorno = null;
		
		if (pos == 1)
			nodoRetorno = removeInicio();
		else
		{
			int cont = 1;
			Nodo nodoAux = prim;
			while (nodoAux.next != null)			
			{
				cont ++;
				nodoAux = nodoAux.next;
			}
			
			if (pos >= cont)
				nodoRetorno = removeFim();
			else
			{
				cont = 1;
				nodoAux = prim;
				Nodo nodoAnt = prim;
				while (cont < pos )
				{
					cont ++;
					nodoAnt = nodoAux;
					nodoAux = nodoAux.next;	
				}
				
				nodoAnt.next = nodoAux.next;
	
				nodoRetorno  = nodoAux;
			}
			
			
		}
			
		
		return nodoRetorno;
	}
	
        
}