package classes2;

public class StaticClass {
    private static int num1;

    public void addValue(int numParam){
        num1 =numParam;
    }

    public int getNum(){
        return num1;
    }

}
