class OneBHK {
    int roomArea;
    int hallArea;
    int price;

    OneBHK(){

    }
    OneBHK(int roomArea, int hallArea, int price){
        this.roomArea= roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }

    void show(){
        System.out.println("One BHK data members information");
        System.out.println(roomArea + " " + hallArea + " " + price);
    }

}
class TwoBHK extends OneBHK{
    int room2Area;

    TwoBHK(){

    }
    TwoBHK(int room2Area, int hallArea, int roomArea, int price){
        this.room2Area=room2Area;
        this.hallArea=hallArea;
        this.roomArea=roomArea;
        this.price=price;
    }
    void show(int number){
        System.out.println("Two BHK data member information");
        System.out.println("Room2Area" +room2Area+  "\nhallArea" + hallArea + "\nroomArea" + roomArea+ "\nprice"+ price);

    }


}
public class DriverclassBHK {
    public static void main(String args[]) {

        TwoBHK twobhk1 = new TwoBHK(140, 10, 20, 36);
        TwoBHK twobhk2 = new TwoBHK(130,13,78,56);
        TwoBHK twobhk3 = new TwoBHK(150,23,34,45);
        twobhk1.show(1);
        twobhk2.show(2);
        twobhk3.show(3);

        float totalprice = twobhk1.price+twobhk2.price+twobhk3.price;
        System.out.println("Total amount :" +totalprice);
    }
}
