public class Counter {
    static int count = 0;
    static int count1 = 0;
    Counter(){
        count++;
    }
    public static void main(String args[]){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("Object Created :" +count);
        c1 = null;
        c2 = null;
        Runtime.getRuntime().gc();
    }


    protected void finalize(){
        count1++;
        System.out.println("Object destroyed : "+count1);
        System.out.println("Object alive :"+(count -count1));

    }
}
