package cc.wrj;

public class PrintHandstandTriange {
    public static void main(String[] args) {
        int line = 4;
        for(int i = line; i > 0; i--){
            for(int j = 1; j <= line - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
