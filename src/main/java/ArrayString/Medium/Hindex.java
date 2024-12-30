package ArrayString.Medium;

import java.util.Arrays;

public class Hindex {
    /*
    Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

    According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
     */

    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{3,0,6,1,5}));
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);//0,1,3,5,6
        int h=0;
        for(int i=citations.length-1;i>=0;i--){
            // System.out.println(h+" - "+citations[i]);
            if(h+1 > citations[i]){
                return h;
            }
            h++;
        }
        return h;
    }
}
