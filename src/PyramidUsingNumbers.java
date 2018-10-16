public class PyramidUsingNumbers {
    public static void main(String[] args) {
        int height = 5;
        int i=1;
        for(int row = 1; row <= height ;row++){
            for(int space = 1; space <= height-row-1; space++){
                System.out.print(" ");
            }
            for(int num = 1; num <= row; num++){
                System.out.print(i+" ");
            }
            i++;
            System.out.println();
        }
    }
}
