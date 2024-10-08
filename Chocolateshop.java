import java.util.*;
public class ChocolateShop {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        int buying= scanner.nextInt();
        System.out.print(shop(size,arr,buying));
    }
    public static int shop(int size,int arr[],int buying){
        if(size<buying){
            return -1;
        }
        Arrays.sort(arr);
        int total=0;
        for(int i=0;i<buying;i++){
            total+=arr[i];
        }
        return total;
    }
}
