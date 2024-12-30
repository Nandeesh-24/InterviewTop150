package ArrayString.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandom {
    /*
    Implement the RandomizedSet class:

RandomizedSet() Initializes the RandomizedSet object.
bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
You must implement the functions of the class such that each function works in average O(1) time complexity.
     */

    public static void main(String[] args) {

    }

    HashSet<Integer> set;

    public InsertDeleteGetRandom() {
        this.set = new HashSet<>();
    }

    public boolean insert(int val) {
        return this.set.add(val);
    }

    public boolean remove(int val) {
        return this.set.remove(val);
    }

    public int getRandom() {
        Random random = new Random();
        return this.set.stream().toList().get(random.nextInt(this.set.size()));
    }
}
