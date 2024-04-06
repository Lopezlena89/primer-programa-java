import java.util.Random;
import java.util.Scanner;

public class Adivinar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int aleatorio = new Random().nextInt(100);
        int numero = 0;
        int intentos = 0;

        while(intentos < 10 ){
            System.out.println("Adivina un numero del 1 al 100");
            numero = teclado.nextInt();
            if(numero == aleatorio){
                System.out.println("Adivinaste el numero!!!");
                break;
            }else if (numero > aleatorio){
                System.out.println("El numero es menor que " + numero);
            }else{
                System.out.println("El numero es mayor que " + numero);
            }
            intentos++;
            System.out.println( aleatorio);
        }
        if(intentos >= 5){
            System.out.println("Se acabaron tus 5 intentos");
        }



    }

}
