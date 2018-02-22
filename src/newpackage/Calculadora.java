package newpackage;

import java.rmi.Remote;

/**
 *
 * @author Guibson Krause
 */
public interface Calculadora extends Remote
{
    public int somar(int a, int b) throws Exception;
    
    public int subtrair(int a, int b) throws Exception;
    
    public int multiplicar(int a, int b) throws Exception;
    
    public int dividir(int a, int b) throws Exception;
}
