package it.polito.tdp.quadratomagico.model;

import java.util.*;

public class Square {

	private ArrayList<Integer> griglia;
	private int N;
	private int N2;
	private int magicConst;

	//lista come struttura dati per il quadrato magico
	
	
	public Square(Square square) {
		
		griglia= new ArrayList<Integer>(square.getGriglia());
		this.N=square.getN();
		this.N2=square.getN2();
		this.magicConst=square.getMagicConst();
	
	}
	
	public Square(int dimension) {
		this.griglia = new ArrayList<Integer>();
		this.N = dimension;
		this.N2 = N * N;
		this.magicConst = N * (N * N + 1) / 2;
	}
	
	
	private int getMagicConst() {
		// TODO Auto-generated method stub
		return magicConst;
	}

	private int getN() {
		// TODO Auto-generated method stub
		return N;
	}

	private List<Integer> getGriglia() {
		// TODO Auto-generated method stub
		return griglia;
	}

	/**
	 * @return the n2
	 */
	public int getN2() {
		return N2;
	}
	
	public boolean checkMagicCostant()
	{
		if(griglia.size()!=N2)
		{
			return false;
		}
		
		//ctrl sum row
		if(!checkRows())
			{
			return false;
			}
		//ctrl sum col
		if(!checkColumns())
		{
			return false;
		}
		//ctrl sum diag
		if(!checkDiagonals())
		{
			
			return false;
		}
		
		return true;
	}

	private boolean checkDiagonals() {
		// TODO Auto-generated method stub
		
		int temp=0;
		
		//DIAGONALE PRINCIPALE
		for(int i=0; i<N; i++)
		{
			
			//corispondenza tra indici matrice e array
			//matrice[j][i]
			//array[j*n + i]
			
				temp+= griglia.get(i*N+ +i);
		}	
		
		if(temp!= magicConst)
		{
			return false;
		}
		
	 temp=0;
		//DIAGONALE SECONDARIA
		
		for(int i=N-1; i>=0; i--)
		{
			temp+=griglia.get((N-1-i)*N +i);
		}
		
		return true;
		
	}

	private boolean checkColumns() {
		// TODO Auto-generated method stub
		for(int i=0; i<N; i++)
		{
			//corispondenza tra indici matrice e array
			//matrice[j][i]
			//array[j*n + i]
			
			int temp=0;
			for(int j=0; j<N; j++)
			{
				temp+= griglia.get(j*N+ +i);
			}
			
			if(temp!= magicConst)
			{
				return false;
			}
		}
		return true;
		
	}

	private boolean checkRows() {
		// TODO Auto-generated method stub
		for(int i=0; i<N; i++)
		{
			//corispondenza tra indici matrice e array
			//matrice[i][j]
			//array[i*n + j]
			
			int temp=0;
			for(int j=0; j<N; j++)
			{
				temp+= griglia.get(i*N+ +j);
			}
			
			if(temp!= magicConst)
			{
				return false;
			}
		}
		return true;
	}

	public void add(int i) {
		// TODO Auto-generated method stub
		griglia.add(i);
		
	}

	public void remove(int step) {
		// TODO Auto-generated method stub
		griglia.remove(step);
		
	}

	public boolean contains(int i) {
		// TODO Auto-generated method stub
		return griglia.contains(i);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Square [griglia=" + griglia + "]";
	}
	
	

}
