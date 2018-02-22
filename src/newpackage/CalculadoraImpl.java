package newpackage;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guibson Krause
 */
public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora
{
    public CalculadoraImpl() throws RemoteException
    {
        super();        
    }

    @Override
    public int somar(int a, int b) throws RemoteException 
    {
        return a + b;
    }

    @Override
    public int subtrair(int a, int b) throws RemoteException 
    {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) throws RemoteException 
    {
        return a * b;
    }

    @Override
    public int dividir(int a, int b) throws RemoteException 
    {
        return a / b;
    }   
    
}
