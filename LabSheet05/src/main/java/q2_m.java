/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class q2_m {
    public static void main(String args[]){
        int i=2;
        int sum=0;
        do{
            if(i%2==0){
                sum=sum+i;
            }
        i=i+1;
        }while(i<30);
            
        System.out.println(sum);
    }
}
