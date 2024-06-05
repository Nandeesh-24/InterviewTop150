package Medium;

import java.util.Arrays;

public class Hindex {
    /*
    Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

    According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
     */

    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{11,12}));
    }

    public static int hIndex(int[] citations) {
        if (citations.length == 1 && citations[0] > 0)
            return 1;
        citations = Arrays.stream(citations).sorted().toArray();//0,2,3,5
        int hindex = 0;
        for (int i = 0; i < citations.length; i++){
            if (citations[i] > 0 && citations[i] > hindex){
                if (citations[i] <= (citations.length - i))
                    hindex = citations[i];
                else if (hindex + 1 <= citations.length-i)
                    hindex++;

            }
        }
        return hindex;
    }
}
