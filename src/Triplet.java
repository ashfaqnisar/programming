import java.util.ArrayList;

public class Triplet {
    private int count = 0;
    private ArrayList<ArrayList<Integer>> triplet_elements;

    long good_triplets(ArrayList arr, int n) {
        triplet_elements = new ArrayList<>(arr.size());
        findTriplets(arr);

        System.out.println(triplet_elements);

        for (ArrayList<Integer> triplet : triplet_elements) {
            if (checkForGoodTriplet(triplet)) {
                printIndexesCount(triplet);
            }
        }
        System.out.println(count);

        return 1;
    }

    private void printIndexesCount(ArrayList<Integer> goodTripletArray) {
        count += findFactorial(goodTripletArray.size());
    }

    private void findTriplets(ArrayList arr) {
        int i;
        for (i = 0; i + 2 < arr.size(); i++) {
            ArrayList<Integer> element = new ArrayList<>(3);
            element.add((Integer) arr.get(i));
            element.add((Integer) arr.get(i + 1));
            element.add((Integer) arr.get(i + 2));
            triplet_elements.add(i, element);
        }
    }

    private boolean checkForGoodTriplet(ArrayList arrayWithTriplets) {
        int sum = 0, divisible = 0;
        for (Object array : arrayWithTriplets) {
            sum += (Integer) array;
        }
        for (Object array : arrayWithTriplets) {
            if ((sum % (Integer) array) == 0) {
                divisible++;
            }
        }
        return divisible == 1;
    }

    private int findFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }
        return factorial;
    }
}
