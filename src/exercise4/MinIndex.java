package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MinIndex{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    double[] Feld = new double[size];

    for(int i = 0; i<Feld.length; i++){
      Feld[i] = input.nextInt();
    }
    int index = 0;
    double Min = Feld[0];
    for(int j = 0; j<Feld.length; j++){
      if(Min>Feld[j]){
        index=j;
        Min=Feld[j];
      }
    }
    System.out.println("Min index: " + index);
  }
}