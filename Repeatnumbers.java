import java.util.*;
public class Repeatnumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        int c = scanner.nextInt();
        int result = RepeatNumber(a,b,c);
        System.out.println(result);
        }
        public static int RepeatNumber(int a, int b, int c){
        HashSet<Character> A = new HashSet<>();
        for(char digit : String.valueOf(a).toCharArray()){
            A.add(digit);
        }
        HashSet<Character> RepeatNumber = new HashSet<>();
            for(char digit : String.valueOf(b).toCharArray()){
                if(A.contains(digit)){
                    RepeatNumber.add(digit);
                }
            }
            int commoncount = 0;
            for(char digit : String.valueOf(c).toCharArray()){
                if(RepeatNumber.contains(digit)){
                    commoncount++;
                }
            }
            return commoncount > 0 ? commoncount:1;
    }
}
