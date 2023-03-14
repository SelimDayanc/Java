
package mayintarlasi;

import java.util.Random;
import java.util.Scanner;

public class mayin {
    int rowNumber,colNumber,size;
   int[][] map;
   int[][] board;
   
   Random rand = new Random();
   Scanner scan = new Scanner(System.in);
   
   mayin(int rowNumber,int colNumber){
       this.rowNumber = rowNumber ;
       this.colNumber = colNumber ;
       this.map = new int[rowNumber][colNumber];
       this.board = new int[rowNumber][colNumber];
       this.size = rowNumber*colNumber;
   }
   public void run(){
        prepareGame();
        print(map);
   }
   public void prepareGame(){
       int randRow,randCol,count =0;
       while(count !=(size/4)){
           randRow = rand.nextInt(rowNumber);
           randCol= rand.nextInt(rowNumber);
           if(map[randRow][randCol] != -1){
               map[randRow][randCol] = -1;
               count++;
           }
       }
   }
   public void print(int[][] arr ){
       for(int i=0; i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
               if(arr[i][j]>=0){
                   System.out.print(" ");
               }
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
   }
}
