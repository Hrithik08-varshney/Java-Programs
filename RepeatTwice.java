//There is an array with every element repeated twice except one. Find that element?

import java.util.*;

public class RepeatTwice {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        Arrays.sort(arr);
        /*  for(int i=0;i<=n;i++){
            System.out.printf("%d ",arr[i]);
        }  */
        int flag=0,i=1;
        for(;i<n;i+=2){
            if(arr[i]!=arr[i+1]){
                flag=1;
                System.out.printf("\n%d", arr[i]);
            }
        }
        if(i==n && flag==0){
        System.out.printf("\n%d", arr[n]);
        }
        
    }
}
