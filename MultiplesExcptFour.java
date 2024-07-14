import java.util.*;
class MultiplesExcptFour{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int h=n.nextInt();
    for(int i=1;i<=h;i++){
      if(i%4==0)
      continue;
      else
      System.out.print(i+" ");      
    }
  }
}
