//WAP to print odd numbers between 1-n.



import java.util.Scanner;
class ExampleLoop5{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
         System.out.println("Enter n value");
         int n=s.nextInt();   
         
         for(int i=1;i<=n;i++) {    
             
             if(i%2!=0){
                 System.out.print(i+" ");
             }
         }
    }
}