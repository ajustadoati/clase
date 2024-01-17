import java.util.Scanner;

public class TablasDeMultiplicar{
 public static void main(String args[]){

  int desde = 0, hasta = 0 ,error = 0;
  Scanner entrada = new Scanner(System.in);

  System.out.println("****************************************************************");
  System.out.println("*Hola Bienvenido al programa para ver las tablas de multiplicar*");
  System.out.println("****************************************************************");
  System.out.print("Ingrese desde que tabla quiere comensar: ");
  desde = entrada.nextInt();
  System.out.print("Ingrese en que tabla quiere terminar: ");

  hasta = entrada.nextInt();
  System.out.println();

  if(hasta < desde){
    error = desde;
    desde = hasta;
    hasta = error;
  }
  while(desde <= hasta){
   for(int i = 1; i < 11; i++){
     System.out.println(desde + " * " + i + " = " + (desde*i));
   }
   System.out.println("-----------");
   desde++;
  }
 }
}