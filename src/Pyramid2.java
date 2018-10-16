public class Pyramid2 {
    public static void main(String[] args) {
        int height = 5;
        for( int row = 0; row < height; row++){
            int j=1;
            for(int column = 0; column < row+1; column++){
                System.out.print(j);
                j++;
            }
            System.out.println();
        }
    }
}
