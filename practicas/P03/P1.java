import java.util.*;
public class AdivinarNumero
{ 
    public static void main(String[] args)
    {

        int valorBuscar=0;
        EntradaDeTeclado teclado= new EntradaDeTeclado(); 
        Random cantidadDeNumero=new Random(); 
        boolean intentos=true;
        for(int i=0;i<=1;i++)
        {
            valorBuscar=cantidadDeNumero.nextInt((100-1+1)+1);
        }
        System.out.println("                 EMPECEMOS EL JUEGO                        ");
        System.out.println("SE HA GENERADO UN NUMERO ALEATORIO COMPRENDIDO ENTRE 1 Y 100\n");
        do
        {           
            System.out.println("INTRODUZCA EL VALOR HA BUSCAR: ");        
            teclado.pedirEntrada();
            int convertir=Integer.parseInt(teclado.getEntrada());
            if(convertir==(valorBuscar))
            {
                System.out.println("BIEN... HAS ACERTADO AMIGO  :)");
                intentos=false;
            }
            else if(convertir<=valorBuscar)
            {
                System.out.println(" NO HAS ACERTADO EL NUMERO ES MAYOR. INTENTALO DE NUEVO:\n");
                intentos=true;
            }
            else if(convertir>=valorBuscar)
            {
                System.out.println(" NO HAS ACERTADO EL NUMERO ES MENOR. INTENTALO DE NUEVO:\n");
                intentos=true;
            }
        } while(intentos);

    }
    }
