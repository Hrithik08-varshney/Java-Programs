import java.util.*;
public class RepeatingElementInArray {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j+=1){
                 if(arr[i]==arr[j]){
                 System.out.printf("%d ",arr[i]);
                 break;
                 } 
                 
            }
        }
        in.close();
    }
}
