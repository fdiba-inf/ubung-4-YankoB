package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int size = input.nextInt();
      int[] Feld = new int[size];

      for(int i=0; i<Feld.length; i++){
        Feld[i]=input.nextInt();
      }
      String space="";
      for(int j=0; j<Feld.length; j++){
        System.out.println(space + Feld[j]);
        space = space + " ";
      }
   }
}