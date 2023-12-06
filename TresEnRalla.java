import java.util.Scanner;

public class TresEnRalla{
  public static void main(String args[]){
  
  System.out.println("****************************************");
  System.out.println("*Hola bienvenido al juego tres en ralla*");
  System.out.println("****************************************\n");
  
  int s = 0, l = 0;
  String p[] = new String[9],m[] = new String[9], e = ";          ";
  String jugador_uno = "", jugador_dos = "";
  Scanner entradad = new Scanner(System.in);
  
  for(int i = 0; i < 9; i++){
    p[i] = "#";
  }
  System.out.print("Ingrese el nombre del primer jugador : ");
  jugador_uno = entradad.nextLine();
  System.out.print("Ingrese el nombre del segundo jugador : ");
  jugador_dos = entradad.nextLine();

  
  System.out.println();
  System.out.println("En la siquiente diagrama muestra en que posicion quieres asinar cada valor");
  System.out.println(e + "1 2 3     # # # \n" + e + "-----     -----");
  System.out.println(e + "4 5 6 ==> # # # \n" + e + "-----     -----");
  System.out.println(e + "7 8 9     # # # \n");
  
  while(s < 9){
    if(s%2 == 0){
      System.out.print("Turno de " + jugador_uno + " :");
      l = entradad.nextInt();
      System.out.println();
      if((l-1) >= 0 && (l-1) < 9 && p[l-1] == "#"){
        p[l-1] = "X";
        s++;
      } else {
        System.out.print("Esta posicion no existe\n");
      }
    } else {
      System.out.println("Turno de " + jugador_dos + " :");
      l = entradad.nextInt();
      System.out.println();
      if((l-1) >= 0 && (l-1) < 9 && p[l-1] == "#"){
        p[l-1] = "O";
        s++;
      } else {
        System.out.println("Esta posicion no existe\n");
      }
    }
    
    if(l == 100){
      s = l;
    }
    m[0] = p[0] + p[1] + p[2];
    m[1] = p[3] + p[4] + p[5];
    m[2] = p[6] + p[7] + p[8];
    m[3] = p[0] + p[3] + p[6];
    m[4] = p[1] + p[4] + p[7];
    m[5] = p[2] + p[5] + p[8];
    m[6] = p[0] + p[4] + p[8];
    m[7] = p[6] + p[4] + p[2];  

    System.out.println(e + p[0] + " " + p[1] + " " + p[2]);
    System.out.println(e + "-----");
    System.out.println(e + p[3] + " " + p[4] + " " + p[5]);
    System.out.println(e + "-----");
    System.out.println(e + p[6] + " " + p[7] + " " + p[8]);
    System.out.println();

    for(int i = 0;i < 8; i++){
      if(m[i].equals("XXX") ){ 
        System.out.println("!Felicidades " + jugador_uno + " as ganado!");
        s = 10;
        break;
      } else if(m[i].equals("OOO")){
        System.out.println("!Felicidades " + jugador_dos + " as ganado!");
        s = 10;
        break;
      }
    }
    if(s == 9){
     System.out.println(e + "Empate");
    }
  }
 }
}