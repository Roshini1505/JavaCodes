import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Helloworld{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String s = scanner.next();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
