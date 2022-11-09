import java.util.Scanner;

public class MathFunction {

    static float multiply(float firstnum, float secondnum)
    {
        return firstnum * secondnum;

    }
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter two integers");
        int firstinteger = sc.nextInt();
        int secondinteger = sc.nextInt();
        System.out.println(multiply(firstinteger,secondinteger));

        System.out.println("Enter two floats");
        float firstfloat = sc.nextFloat();
        float secondfloat = sc.nextFloat();

        System.out.println(multiply(firstfloat,secondfloat));

        System.out.println("Enter one float and  integer");
        float onefloat = sc.nextFloat();
        int oneint = sc.nextInt();
        System.out.println(multiply(onefloat,oneint));



    }
}
