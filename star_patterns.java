//Write a program to make star pattern using loops.
public class star_patterns {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
