package ArrayString.Hard;

public class Candy {
    /*
    There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

    You are giving candies to these children subjected to the following requirements:

    Each child must have at least one candy.
    Children with a higher rating get more candies than their neighbors.
    Return the minimum number of candies you need to have to distribute the candies to the children.
     */
    public static void main(String[] args) {
        System.out.println(candy(new int[]{1,0,2,1}));
    }

    public static int candy(int[] ratings) {
        int[] arr = new int[ratings.length];

        for (int i = 0; i < ratings.length; i++){
            arr[i] = 1;
        }

        for (int i = 1; i < ratings.length; i++){
            if (ratings[i-1] < ratings[i]){
                arr[i] = arr[i-1] + 1;
            }
        }

        for (int i = arr.length-2; i >= 0; i--){
            if (ratings[i] > ratings[i+1]){
                arr[i] = Integer.max(arr[i],arr[i+1]+1);
            }
        }

        int sum = 0;

        for (int i : arr){
            sum += i;
        }

        return sum;
    }
}
