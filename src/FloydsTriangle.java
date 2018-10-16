public class FloydsTriangle {
    public static void main(String[] args) {
        int height = 5, i = 1;
        for( int row = 1;row <= height; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
    }
}
