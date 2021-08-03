/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author Dell
 */import java.util.Scanner;
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=input.nextInt();
        revers(num);
        // TODO code application logic here
    }
    public static void revers(int n){
        int reversed =0;
        while(n>0){
            reversed=n%10;
            System.out.print(+reversed);
            n=n/10;
        }
    }
}
