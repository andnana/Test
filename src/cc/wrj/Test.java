package cc.wrj;

public class Test {
    public static int asd(int number){
        return number + 1;
    }
    public static String str(String str){
        return str + "dfdf";
    }
    public static void main(String[] args){
        String numberstr = new String("234");
        String s = str(numberstr);
        System.out.println(s);
        System.out.println(numberstr);
//        int num1 = 1;
//        int num2 = asd(num1);
//        System.out.println(num1);
//        System.out.println(num2);
    }
}
