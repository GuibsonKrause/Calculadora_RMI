package newpackage;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Guibson Krause
 */
public class CalculadoraClient 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Efetuando as Operações Aritiméticas");
            Registry myRegistry = LocateRegistry.getRegistry("localhost", 1099);
            Calculadora misuma = (Calculadora) myRegistry.lookup("Matematicas");
            System.out.println("10 + 20 = " + misuma.somar(10, 20));
            
            System.out.println("40 - 30 = " + misuma.subtrair(40, 30));
            
            System.out.println("5 * 6 = " + misuma.multiplicar(5, 6));
            
            System.out.println("100 / 2 = " + misuma.dividir(100, 2));
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }    
}
