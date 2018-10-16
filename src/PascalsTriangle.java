public class PascalsTriangle {
    public static void main(String[] args) {
        int height = 5,coef = 1;
        for(int row = 1; row <= height; row++){
            for(int space = 1; space <= height - row ;space ++ ){
                System.out.print(" ");
            }
            for(int number = 1; number <= row; number++){
                if(row == 1 || number == 1){
                    coef = 1;
                }
                else{
                    coef = coef+(row-number+1)/number;
                }
                System.out.print(coef+" ");
            }
            System.out.println();
        }
    }
}
