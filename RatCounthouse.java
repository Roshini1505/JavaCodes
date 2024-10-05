import java.util.Scanner;
public class RatCounthouse {
        public static int food(int r,int unit, int arr[], int n){
            if(arr==null)
                return -1;
            int res=r*unit;
            int sum=0;
            int count = 0;
            for(int i=0;i<n;i++){
                sum=sum+arr[i];
                count++;
                if(sum>=res){
                    break;
                }
            }
            if(sum<res)
                return 0;
            else
                return count;
        }
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
                    System.out.println("Enter the number of rats: ");
                    int rats = scanner.nextInt();

                    System.out.println("Enter the amount of food required by each rat (units): ");
                    int unit = scanner.nextInt();

                    System.out.println("Enter the number of houses: ");
                    int n = scanner.nextInt();

                    int[] arr = new int[n];
                    System.out.println("Enter the food available in each house (units): ");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    int result = food(rats, unit, arr, n);

                    if (result == 0) {
                        System.out.println("Not enough food for all the rats.");
                    } else {
                        System.out.println("The rats can get enough food from " + result + " house(s).");
                    }

                    scanner.close();
                }
            }



        

