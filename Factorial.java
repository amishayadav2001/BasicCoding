import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int number,fact=1;
        number=sc.nextInt();
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of a number is"+ fact);
    }
}

	 