package Comp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	
		System.out.println("wajih/mahmoud compilateur version 0.0");
		System.out.println();
		
		System.out.print("donner le nom de fichier qui contient le code à compilé : ");
		Scanner s=new Scanner(System.in);
		String f=s.next();
		
		A_syn a_syn=new A_syn();
		a_syn.analyzeSLnew(f);
		/*  System.out.println("remplissage du tableaullll");
		for( int i=0; i<anaLex.fluxCaracteres.size();i++)
			
			System.out.println(" " + 
					anaLex.fluxCaracteres.get(i));*/
		
		/*
	System.out.println("***********************Analyse lexical*************************");
		int taille= anaLex.fluxCaracteres.size();
	String tab[]= new String[taille];
	String ss=" ";
		for( int i=0; i<anaLex.fluxCaracteres.size();i++)
		// if (!tab[i].equals(ss))
			tab[i]= anaLex.fluxCaracteres.get(i);
		
		for( int i=0; i<taille;i++)
			
			System.out.println(tab[i]);
		System.out.println("***********************Analyse Syntaxique*************************");	 
		
		parsernew test22 = new parserIF3();
	
        
        test22.analyzeSLnew(tab);
        */
    }
}

