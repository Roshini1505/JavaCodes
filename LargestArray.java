import java.util.Scanner;
public class LargestArray {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int[] number={24,15,10,16,11};
        int largest = number[4];
        for(int i=0;i<number.length;i++){
            if(number[i] > largest){
                largest= number[i];
            }
        }
        System.out.print("The largest array is:" +largest);
    }
}
