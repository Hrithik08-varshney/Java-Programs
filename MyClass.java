import java.util.*;
class MyClass{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        if(a>0){
            for (int i = 1; i <= a; ++i) {

                // if a is divided by i
                // i is the factor
                if (a % i == 0) {
                  System.out.print(i + " ");
                }
              }
        }
        else{
            System.out.print("Negative Number");
        }
        sc.close();
    }
}