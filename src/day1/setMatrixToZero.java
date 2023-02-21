package day1;

import java.util.Arrays;
import java.util.Scanner;

public class setMatrixToZero {
    public static void setZero(int matrix[][]){
        int col0=1, rows= matrix.length, cols=matrix[0].length;

        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0)col0=0;
            for(int j=1;j<cols;j++)
                if(matrix[i][j]==0)
                    matrix[i][0]=matrix[0][j]=0;
        }
        for(int i=rows-1;i>=0;i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
                if(col0==0) matrix[i][0]=0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //function calling
        setZero(matrix);
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
