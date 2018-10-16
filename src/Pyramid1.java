public class Pyramid1 {
    public static void main(String[] args) {
        int height=4;
        for(int row = 0;row <= height; row++){
            for(int star = 1;star < row+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
