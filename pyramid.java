import java.util.*;
public class pyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of Row's in pyramid");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
