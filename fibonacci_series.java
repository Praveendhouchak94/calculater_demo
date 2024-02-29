import java.util.Scanner;
public class fibonacci_series{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the number:");
        int num = input.nextInt();
        // define the propeties
        int i=0;
        int j=1;
        int f=0;
        System.out.print(i+" ");
        System.out.print(j+" ");
        // define the for loop
        for(int k =2;k<num;k++){
            f = i+j;
            System.out.print(f+" ");
            i = j;
            j = f;
        }
        input.close();
    }
}