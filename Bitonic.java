import java.util.*;
class   Bitonic{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
   int h=n.nextInt();
   int arr[]=new int[h];
   for(int i=0;i<h;i++){
     arr[i]=n.nextInt();
   }
    boolean is=check(arr,h);
    if(is)
    System.out.print("Bitonic");
    else
    System.out.print("Not Bitonic");
  }public static boolean check(int[] arr,int h){
    int i=1;
    while(i<h&&arr[i]>arr[i-1]){
      i++;
    }if(i==1||i==h){
      return false;
    }
    while(i<h&&arr[i]<arr[i-1]){
      i++;
    }
    return i==h;
  }}
