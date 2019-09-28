import java.io.*;
import java.util.*;


public class TestClass {
    private static int count;

    public static void main(String[] args) throws IOException {
        Triplet triplet = new Triplet();
        ArrayList<Integer> array = new ArrayList<>(4);
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(1);
        long result = triplet.good_triplets(array, 4);
    }


    private static Boolean checkForBooleanTriplet() {
        return true;
    }


}