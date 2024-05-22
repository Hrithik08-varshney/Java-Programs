//Write a program to find intersection of two sorted arrays in Java?
import java.util.*;
public class Intersection {
    public static void main(String args[]){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] arr1=new int[n];
       int[] arr2=new int[n];
       int[] arr3=new int[n];
       for(int i=0;i<n;i++){
           arr1[i]=in.nextInt();
       }
       for(int i=0;i<n;i++){
        arr2[i]=in.nextInt();
    }
    int k=0;
    for(int i=0;i<n;i++){
        for (int j=0;j<n;j++){
           if(arr1[i]==arr2[j]){
               arr3[k]=arr1[i];
               k+=1;
           }
        }
    }
    for(int i=0;i<=k-1;i++){
        System.out.printf("%d ", arr3[i]);
    }
    in.close();
        }
}
