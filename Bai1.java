package CodePTIT;

import java.util.Scanner;

public class Bai1 {
    public static Scanner ip = new Scanner(System.in);
    
    public static int test(int n){
        while(n>0){
            int x=n%10;
            if(x!=0 || x!=2 || x!=1) return 0;
            n/=10;
        }
        return 1;
    }
    
    public static void main(String[] args) {
        int t=ip.nextInt();
        while(t-- >0){
            int n=ip.nextInt();
            if(test(n)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}