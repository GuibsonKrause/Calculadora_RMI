package newpackage;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Guibson Krause
 */
public class CalculadoraServer 
{
    public static void main(String[] args) 
    {
        try
        {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("Matematicas", new CalculadoraImpl());
            System.out.println("Servidor Iniciado");
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }    
}
