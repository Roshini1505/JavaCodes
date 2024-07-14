import java.util.*;
class SwapReq{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
  int h=n.nextInt();
  int arr[]=new int[h];
  for(int i=0;i<h;i++){
    arr[i]=n.nextInt();
  }
  int k=n.nextInt();
  int count=0;
  for(int i=0;i<h;i++){
    if(arr[i]<=k)
    count++;
  }
  int a=0;
  for(int i=0;i<count;i++){
    if(arr[i]>k)
    a++;
  }
    int swap=a;
    for(int i=0;i<h;i++){
      if(arr[i]>k)
      a--;
      if(arr[i]>k)
      a++;
    swap=Math.min(swap,a);}
    System.out.print(swap);
  }
}
