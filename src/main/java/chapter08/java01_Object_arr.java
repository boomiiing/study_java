package chapter08;

public class java01_Object_arr {
    public static void main(String[] args) {
        int row = 9;
        int col = row*2 - 1 ;
        String[][] arr = new String[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if(arr[i][j]==null){
//                    arr[i][j] = " ";
//                }
//                if((col/2) == j){
//                    arr[i][j] = "*";
//                    if(i != 0){
//                        for(int k = i; k > 0; k--){
//                            arr[i][j-k] = "*";
//                            arr[i][j+k] = "*";
//                        }
//                    }
//                }
//            }
//        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if((j >= (row - 1 - i))&&(j<=(row - 1 + i))){
                   arr[i][j] = "*";
                }else{
                    arr[i][j] = " ";
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
