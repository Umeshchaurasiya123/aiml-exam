
import java.io.*;
import java.util.*;

public class Nquuen {

    public static boolean isqueensafe(int [][] chess, int row, int col){

        // check in upword direction // vertically

    for (int i = row - 1, j = col; i >= 0; i--) {
      if (chess[i][j] == 1) {
        return false;
      }
    }


    // now  check left diagonaly 

    for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){

        if(chess[i][j]==1){

            return false;

        }

    }


    // check right diagonaly

    for(int i=row-1, j=col+1;i>=0&&j<chess.length;i--,j++){

        if(chess[i][j]==1){

            return false;
        }
    
    }

    for (int i = row, j = col - 1; j >= 0; j--) {
      if (chess[i][j] == 1) {
        return false;
      }
    }



    return true;

    }




    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]chess =new  int[n][n];
        printNQueens(chess, "", 0);


    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        
        
        // base case 
        if(row==chess.length){
            System.out.println(qsf+".");
            return;
        }

        for(int col=0;col<chess.length;col++){

          boolean ans= isqueensafe(chess,row,col);

          if(ans==true&&chess[row][col]==0){

             chess[row][col]=1;
             // queen added here

            printNQueens(chess,qsf+row+"-"+col+", ",row+1);

          }

            // edge post 

            chess[row][col]=0;

        }



    }
}
