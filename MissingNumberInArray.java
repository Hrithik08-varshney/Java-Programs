import java.util.Scanner;
public class MissingNumberInArray {
    public static void main(String args[]){
           Scanner in=new Scanner(System.in);
           int n=in.nextInt();
           int[] numbers= new int[n];
           int sum=0;
           for(int i=1;i<=n;i++){
             sum+=i;
           }
           System.out.printf("Put zero at missing element\n");
           int new_sum=0;
           for(int i=0;i<n;i++){
              numbers[i]=in.nextInt();
                new_sum+=numbers[i]; 
           }
           System.out.printf("%d",sum-new_sum);
           in.close();
    }
}
