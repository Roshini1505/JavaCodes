import java.util.*;
class Monotonic{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int h=n.nextInt();
    boolean t=false;
    int arr[]=new int[h];
    for(int i=0;i<h;i++){
      arr[i]=n.nextInt();
    }
    if(arr[0]>arr[1]){
      for(int j=1;j<h;j++){
  if(arr[j-1]>arr[j]){
  t=true;
  }
  else{
  t=false;
    break;
  }
    }}
    else{
      for(int y=1;y<h;y++){
   if(arr[y-1]<arr[y]){
     t=true;
   }else{
     t=false;break;
   }
    }}
    if(t){
      System.out.print("Monotonic");
    }
    else{
      System.out.print("Not Monotonic");
    }
  }
}
