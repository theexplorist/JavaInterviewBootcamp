package Stair1;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // System.out.println("Hello World!");
        mazePathCountTD(0,0,2,2,new int [3][3],"");
    }
    public static int mazePathCountTD(int sr, int sc, int er, int ec, int[][] strg, String res)
    {
        int count=0;
        if(sr==er && sc == ec)
        {
            count++;
            System.out.println(res);
            return count;
        }
        else if(sr>er || sc>ec)
        {
            return 0;
        }
        else if(strg[sr][sc]!=0){
            System.out.println(res);
            return strg[sr][sc];
        }
        else{
            count+= mazePathCountTD(sr+1,sc,er,ec,strg,res+"v")+mazePathCountTD(sr,sc+1,er,ec,strg,res+"h");
        }
        strg[sr][sc]=count;
        return strg[sr][sc];
    }
}
