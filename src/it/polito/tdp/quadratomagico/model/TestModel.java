package it.polito.tdp.quadratomagico.model;

import java.util.*;

public class TestModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Model model= new Model();
		List <Square> solutions = model.findMagicSquares(3);
		
		if(solutions!=null)
		{
			System.out.println("TROVATA ALMENO UNA SOLUZIONE");
			
			for(Square s: solutions)
			{
				System.out.println(s.toString());
			}
		}
		else
		{
			System.out.println("NESSUNA SOLUZIONE TROVATA");
		}
		
	
		

		
	}

}
