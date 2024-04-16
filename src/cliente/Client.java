/**
 * 
 */
package cliente;

import java.io.*;
import java.rmi.*;

import servico.Operacao;

public class Client{
   public static void main(String args[])  { 

        System.setSecurityManager(new RMISecurityManager());
        System.setProperty("java.security.policy", "file:///C:/Users/botel/eclipse-workspace/unievaRMI/fabio.policy");

	try {   
          Operacao Opp = (Operacao)Naming.lookup("OppMathServer");

        System.out.println("Objeto Operações matemáticas localizado.");

// BufferedReader in = new BufferedReader(new   
//     InputStreamReader(System.in));
//     System.out.println("Operações Matemáticas Distribuídas!"); 
//     System.out.println(""); 

      
//	System.out.println("Entre com os argumentos "); 

//	System.out.print("> ");
	
	int tipoopp = Integer.parseInt(args[0]);
	
	int a = Integer.parseInt(args[1]);
	int b = Integer.parseInt(args[2]);
	int resultado = 0;

	if (tipoopp == 1) {
		resultado = Opp.Soma(a,b);
	  }
	
	if (tipoopp == 2) {
		resultado = Opp.Produto(a,b);
	  }

	System.out.println("Resultado = " + resultado);  
     
	
      
    } catch(Exception e){ System.err.println(e.getMessage()); }
      System.exit(0);
  } // fim public... main
} // fim class
