class Counter{
    static int count = 0;
    Counter(){
        count++;
    }
    static int getCount() {
        return count;
    }
}
public class Main{
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();

        System.out.println("Count: "+Counter.getCount());
    }
}