package program;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


import Lexico.compi;
import Lexico.Token;
import Lexico.compiConstants;
import Lexico.compiTokenManager;

public class Program {
    public static void main(String[] args) {
	try {
		List<String> tabla = new ArrayList();

	    File file = new File("file.txt");
		compi lexical = new compi(new FileInputStream(file));
		//Tabla de simbolos
		/*
	    Token token = compi.getNextToken();
	    String kind = compiConstants.tokenImage[token.kind];
	    String image = token.image;
	    
	    while (token.kind != compiTokenManager.EOF)
	    {
	    	if(token.kind == compiTokenManager.IDENTIFICADOR)
	    	{
	    		if (tabla.indexOf(token.image) < 0)
	    		{
	    			tabla.add(token.image);
	    		}
	    		int indice = tabla.indexOf(token.image);
	    		System.out.println(String.format(compiConstants.tokenImage[token.kind] + "  -->  " + (indice) + "\r\n" ));
	    	}

	    	token = compi.getNextToken();
		}*/
		
		lexical.Inicio();
	} catch (Exception exception) {
	    System.out.println("Error al leer el archivo.");
	}
    }
}
