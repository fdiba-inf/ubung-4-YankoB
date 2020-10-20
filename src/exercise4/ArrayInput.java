package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int counter =input.nextInt();
    int[] Feld = new int[counter];
    
    for(int i=0; i<Feld.length ; i++){
      Feld[i] = input.nextInt();

    }
    String Text = Arrays.toString(Feld);
    System.out.println("Numbers: " + Text);


  }
}