public class checksum {
    public static boolean bet(int bet){
        return bet > 0 && Main.money >= bet && balance();
    }

    public static boolean balance() {
        return Main.money > 0;
    }



}
