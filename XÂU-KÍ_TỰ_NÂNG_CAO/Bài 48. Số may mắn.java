

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
         public static int tcs(String s){
             int sum=0;
             for(int i=0;i<s.length();i++){
                 sum+=s.charAt(i)-'0';
             }
             return sum;
         }
         public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         int n=tcs(s);
         while(n>=10){
             String k=n+"";
             n=tcs(k);
         }
         if(n==9){
             System.out.println("YES");
         }
         else {
             System.out.println("NO");
         }
         
         
         
    }
       
} 

   