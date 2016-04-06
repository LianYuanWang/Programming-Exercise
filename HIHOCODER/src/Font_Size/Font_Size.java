/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Font_Size;

import java.util.Scanner;

/**
 *
 * @author 连源
 */
public class Font_Size {
    public static void main(String[] args) {
       
           Scanner input=new Scanner(System.in);
           int count=input.nextInt();
           for (int i=0;i<count;i++){
            Scanner input1 = new Scanner(System.in);
            String[] str = input1.nextLine().split("\\s");
            int N = Integer.parseInt(str[0]);
            int P = Integer.parseInt(str[1]);
            int W = Integer.parseInt(str[2]);
            int H = Integer.parseInt(str[3]);
            String[] str1= input1.nextLine().split("\\s");
            int char_num=0;
            for (int n=0;n<str1.length;n++){
                char_num += Integer.parseInt(str1[n]); 
            }
            double output = Math.floor(Math.sqrt((double)(W*H)/((char_num)/P)));
            System.out.println(output);
        } 
    }
}
