import java.util.Scanner;

public class Employee {
    char Name;
    int EmpID;
    char result;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the assessment values (0-100)");
        float ass1 = sc.nextFloat();
        float ass2 = sc.nextFloat();
        float ass3 = sc.nextFloat();

        if(ass1>75 && ass2>75 && ass3>75){

            System.out.println("Promoted");
        }
        else{
            System.out.println("Demoted");
        }
        float total = ass1 + ass2 + ass3;
        float perecentage =(total/300)*100;
        System.out.println("Total\t" +total);
        System.out.print("Percentage of the Employee\t" + perecentage);

    }
}
