import java.util.Scanner;

class Faculty{

    int facultyid;
    int salary;

}
class FullTimeFaculty extends Faculty {

    int basic;
    int allowance;
    void acceptinput(int facultyid, int basic, int allowance){


        this.facultyid=facultyid;

        salary=basic + allowance;



    }

    void display(){
        System.out.println("Faculty ID ="+facultyid);
        System.out.println("Salary ="+ salary);
    }

}
class PartTimeFaculty extends Faculty{

    int hour;
    int rate;
    void acceptinput(int facultyid, int hour, int rate) {
        this.facultyid = facultyid;
        salary = hour * rate;

    }
    void display(){
        System.out.println("facultyid ="+facultyid);
        System.out.println("Salary ="+salary);
    }


}



public class DriverClass {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        FullTimeFaculty f1 = new FullTimeFaculty();
        f1.acceptinput(1,200,300);


        FullTimeFaculty f2 = new FullTimeFaculty();
        f2.acceptinput(2,500,600);





        PartTimeFaculty p1 = new PartTimeFaculty();
        p1.acceptinput(3,20,30);

        PartTimeFaculty p2 = new PartTimeFaculty();
        p2.acceptinput(4,50,60);
        f1.display();
        f2.display();
        p1.display();
        p2.display();




    }

}
