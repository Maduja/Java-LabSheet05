/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class q2_n {
    public static void main(String args[]){
        int i=1;
        int product=1;
        do{
            if(i%2==1){
                product=product*i;
           
            }
        i=i+1;
        }while(i<=15);
           
        System.out.println(product);
    }
}
