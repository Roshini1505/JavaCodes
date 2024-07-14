import java.util.*;
class FindFrequency{
  public static void  main(String[] args){
    Scanner n=new Scanner(System.in);
    long h=n.nextLong();
    long arr[]=new long[10];
    long u=0;int r=0;
    while(h!=0){
      u=h%10;
      r=(int)u;
    arr[r]++;
      h=h/10;
  }
  for(int j=0;j<10;j++){
    System.out.println(j+" occurs "+arr[j]+" times ");
  }
}}
