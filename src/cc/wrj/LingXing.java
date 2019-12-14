package cc.wrj;

public class LingXing {
    public static void main(String[] args) {
        int line = 4;
        for(int k = 1; k <= line; k++){

            for(int i = 1; i <= line - k; i++){
                System.out.print(" ");
            }
            for(int j = 1; j <= k * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int line2 = line - 1;
        for(int i = line2; i >= 1; i--){
            for(int j = 1; j <= line - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
