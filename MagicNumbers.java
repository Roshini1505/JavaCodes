import java.util.*;
class MagicNumbers{
  public static int add(int y){
    int u=0,g=0;
    while(y!=0){
      u=y%10;
      g=g+u;
      y=y/10;
    }
    return g;
  }
  public static int rev(int r){
    int e=0,m=0;
    while(r!=0){
      m=r%10;
      e=(e*10)+m;
      r=r/10;
    }
    return e;
  }
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int j=n.nextInt();
    int i=add(j);
    int o=rev(i);
    if(j==(i*o))
    System.out.print("YES");
    else
    System.out.print("NO");
  }
}