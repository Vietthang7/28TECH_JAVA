

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import static javafx.scene.input.KeyCode.T;


public class HocLapTrinh {
         
         
         public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         int i=0;
         while(i<s.length()){
             char c=s.charAt(i);
             i++;
             String fre="";
             while(i<s.length() && Character.isDigit(s.charAt(i))){
                 fre+=s.charAt(i);
                 i++;
             }
             int freNum=Integer.parseInt(fre);
            StringBuilder sb=new StringBuilder("");
             for(int j=0;j<freNum;j++){
                 sb.append(c);
             }
             System.out.print(sb.toString());

         }
 } 
} 

   