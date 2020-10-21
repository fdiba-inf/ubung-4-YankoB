package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MaxElement{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    double[] Feld = new double[size];

    for(int i = 0; i<Feld.length; i++){
      Feld[i] = input.nextInt();
    }
    double check = 0;
    for(int j = 0; j<Feld.length; j++){
      if(check<Feld[j]){
        check=Feld[j];
      }
    }
    System.out.println("Max number: " + check);
  }
}