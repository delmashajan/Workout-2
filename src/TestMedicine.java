import java.util.Random;

class Medicine{

    String name = " company  name";
    String address = "company address";
    void displayLabel(){
        System.out.println("Name :"+name);
        System.out.println("Address:"+address);
    }
}
class Tablet extends Medicine{
    void displayLabel() {

        System.out.println("as directed by the physician");
    }
}
class Syrup extends Medicine{


    void displayLabel() {

        System.out.println("Store in dry cool place");
    }
}
class  Ointment extends Medicine{


    void displayLabel() {
        System.out.println("for external use only");
    }
}




public class TestMedicine {
    public static void main(String[] args){

        Random random = new Random();
        int rand = random.nextInt(3) + 1;

        switch (rand){
            case 1 -> {
                Medicine medicine1 = new Medicine();
                Tablet tablet = new Tablet();
                medicine1.displayLabel();
                tablet.displayLabel();
                break;
            }
            case 2 -> {
                Medicine medicine2 = new Medicine();
                Syrup s = new Syrup();
                medicine2.displayLabel();
                s.displayLabel();

            }
            case 3 -> {
                Medicine medicine3 = new Medicine();
                Ointment o = new Ointment();
                medicine3.displayLabel();
                o.displayLabel();
         }
     }

    }
}
