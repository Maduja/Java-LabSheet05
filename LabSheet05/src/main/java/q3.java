/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class q3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your number: ");
        int n = scan.nextInt();
        int i=1;
        double sum=0;
        while(i<=n){
            sum = sum + (1.0/(i*i));
            i=i+1;
        }
        
        System.out.println(sum);
        
    }
}
