public class CharClass {

    public static void main(String[] args) {
        char char1 = 'b';
        char char2 = 'b';
        char char3 = 'B';

        System.out.println(char1 == char3);
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        } else return false;
    }
}
