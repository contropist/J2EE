package com.test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static long caculateSubs(int n, int[][] array) {
    	long count = 0;
    	for(int h=0;h<n;h++){
    		int[][] array1 = array;
    	for(int i=0;i<n-1;i++){
    		if(array1[h][i]==1){
    			for(int j=0;j<n-1;j++){
    				array1[j][i]=0;
    			}
    		}
    		if(array1[n-1][i]!=0){
        		count++;
        	}
    	}
    	
    	}	
    	return count;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long res;
            
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        int _array_rows = 0;
        int _array_cols = 0;
        _array_rows = _n;
        _array_cols = _n;
        
        int[][] _array = new int[_array_rows][_array_cols];
        for(int _array_i=0; _array_i<_array_rows; _array_i++) {
            for(int _array_j=0; _array_j<_array_cols; _array_j++) {
                _array[_array_i][_array_j] = in.nextInt();
                
            }
        }
        
        if(in.hasNextLine()) {
          in.nextLine();
        }
        

  
        res = caculateSubs(_n, _array);
        System.out.println(String.valueOf(res));  

    }
}