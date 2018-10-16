public class Pyramid {
    public static void main(String[] args) {
        int height = 5;
        for(int row = 1; row <= height; row++){
            for(int space = 1;space <= height - row ; space++){
                System.out.print(" ");
            }
            for(int column = 1; column <= row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
