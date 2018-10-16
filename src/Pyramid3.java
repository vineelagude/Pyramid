public class Pyramid3 {
    public static void main(String[] args) {
        int height = 5;
        char alphabet='A';

        for( int row = 0; row < height; row++){
            for(int column = 0; column < row+1; column++){
                System.out.print(alphabet);
            }
            ++alphabet;
            System.out.println();
        }
    }
}
