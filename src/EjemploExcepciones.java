import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class EjemploExcepciones
{
    public static void main(String[] args) throws FileNotFoundException
    {
        try {
            File archivo = new File("entrada.txt");
            Scanner teclado = new Scanner(archivo);
            System.out.print("Dame el primer numero: ");
            int num1 = teclado.nextInt();
            System.out.print("Dame el primer numero: ");
            int num2 = teclado.nextInt();
            System.out.print("la division es: " + num1 / num2);
            // Correr el programa y probarlo con diferentes valores.
            // ¿Qué ocurre cuando num2 es 0? ¿Como se llama la excepción? ArithmeticException
            // Buscar la excepción en la documentación de Java. Das click derecho en la excepción y lo buscas en Google.
            // y revisar de quien es subclase la excepción. RuntimeException
            // Cuando ingresas letras, la excepción es InputMismatchException.
        }
        catch(ArithmeticException excepcionAritmetica)
        {
            System.out.print("Division por cero");
        }
        catch (InputMismatchException excepcionEntrada)
        {
            System.out.println("Entrada Incorrecta");
        }
        /*catch (FileNotFoundException e)
        {
            System.out.println("No Existe el Archivo");
        }*/


    }
}
