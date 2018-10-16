public class InvertPyramid {
    public static void main(String[] args) {
        int height =5;
        for(int row = 0; row <height; row++){
            int i=1;
            for(int column = 0; column <= height-row-1;column++){
                System.out.print(i);
                i++;
            }
            System.out.println();
        }
    }
}
