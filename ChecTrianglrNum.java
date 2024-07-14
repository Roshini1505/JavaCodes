import java.util.*;
class ChecTrianglrNum{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int h=n.nextInt();
    int  i=0;
   while(h>0){
      h=h-i;
      i++;
    }
    if(h==0)
    System.out.print("Triangular Number");
    else
    System.out.print("Not a Triangular Number");
  }
}