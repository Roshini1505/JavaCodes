import java.util.Scanner;
public class Difference {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        System.out.print(Diffsum(n,m));
    }
    public static int Diffsum(int n, int m){
        int sum=0;
        int cap=0;
        for(int i=1;i<=m;i++){
            if(1%n==0){
                sum+=i;
            }
            else{
                cap+=i;
            }
        }
        return cap-sum;
    }
}
