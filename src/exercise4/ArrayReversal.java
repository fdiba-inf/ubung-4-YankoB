package exercise4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    char[] forw=new char[size];
    char [] backw=new char[size];
    int smht=forw.length-1;

    for(int i=0; i<forw.length; i++){
      forw[i]=input.next().charAt(0);
    }

    for(int j=0;j<backw.length;j++){
      backw[j]=forw[smht];
      smht--;
    }
    String result = Arrays.toString(backw);
    System.out.println("Reversed symbols: "+result);
  }
}