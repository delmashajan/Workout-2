import java.util.Scanner;
class Swap {
    int num1;
    int num2;


    static void swapnum(int x, int y){

        int temp = x;
        x =y;
        y= temp;

        System.out.println("After Swapping\n" + x + y);


    }
    void referswap(Swap m){

        int temp= m.num1;
        m.num1=m.num2;
        m.num2=temp;




        
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Numbers To Swap");
        int x= sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Before Swapping\n" + x + y);

        swapnum( x,  y);

        System.out.println("number to swap");
        Swap s = new Swap();
        s.num1 = sc.nextInt();
        s.num2 = sc.nextInt();


        s.referswap(s);
        System.out.println("After Swapping by call by reference");
        System.out.println("First number = "+ s.num1+ "Second number =" + s.num2);
    }



}
