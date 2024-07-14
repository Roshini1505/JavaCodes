import java.util.*;
class Anagram{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
  String  h=n.nextLine();
  String h1=n.nextLine();
  char[] c1=h.toCharArray();
  char[] c2=h1.toCharArray();
  Arrays.sort(c1);
  Arrays.sort(c2);
  if(Arrays.equals(c1,c2))
  System.out.print("Anagram");
  else
  System.out.print("Not");
  }
}