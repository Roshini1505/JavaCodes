import java.util.*;
public class ReplaceLetter {
        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            String str=scanner.nextLine();
            char ch1=scanner.next().charAt(0);
            char ch2=scanner.next().charAt(0);
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch==ch1)
                    System.out.print("P");
                else if(ch==ch2)
                    System.out.print("a");
                else
                    System.out.printf("%c",ch);
            }
        }
    }

