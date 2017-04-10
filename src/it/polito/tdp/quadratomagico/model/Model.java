package it.polito.tdp.quadratomagico.model;

import java.util.*;

public class Model {

	private ArrayList<Square> solutions =null;

	public List<Square> findMagicSquares(int dim ) {
		
		solutions  = new ArrayList<Square>();
		
		// Creo un oggetto Square
		
		Square square = new Square(dim);
		
		//Chiamo la funzione ricorsiva
		
		int step=0;
		recursive(square,step);
		
		// ritorno tutte le soluz. trovate
		return solutions;
	}

	private void recursive(Square square, int step) {
	
		// A condizione di terminazione
		if (step>=square.getN2()) {
		
			//valuto la soluzione completa trovata
			if(square.checkMagicCostant())
				{
					solutions.add(new Square(square));
				}
			
			return;
		}
		
		// B - Generazione di una nuova soluzione candidata
		for (int i=1; i<=square.getN2();i++) 
	{
			
		
		
		//C-Filtro
			
		if (!square.contains(i)) { 
			

			// B genero la PARZIALE
			square.add(i);
		recursive (square, step+1);
		
		// D- BACKTRACKING ("undo")
		square.remove(step);
		}
		
		
		}
	}
		
		//ATTENZIONE ADD E REMOVE SONO SIMMETRICHE: O SI METTONO TUTTE E DUE DENTRO L'IF O TUTTE E DUE FUORI.
		
	
	
	
	


}
