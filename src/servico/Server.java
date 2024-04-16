package servico;

import java.rmi.*;
import java.rmi.server.*;

public class Server {

 public static void main(String args[]) {
	 System.setProperty("java.security.policy", "file:///C:\tmp\fabio.policy");

      System.setSecurityManager(new RMISecurityManager());
      
   try{

      ImplServer obj = new ImplServer("OppMathServer");
      Naming.rebind("OppMathServer", obj);
// URL "rmi:\\host:porta\teste"

      System.out.println("Servidor de Operações Matemáticas Registrado com Sucesso!");

    } catch (Exception e){ System.out.println(e.getMessage());}
                                
  }
}
