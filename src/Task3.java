import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    static ArrayList<Integer> list = new ArrayList<>(
            List.of(11, 3, 5, 17, 28, 34, 3, 10, 8, 44, 18, 7, 13, 61));

    public static void main(String[] args) {
        System.out.println(list);

        ArrayList<Integer> sortedList = heapSort(list, list.size());
        System.out.println(sortedList);
    }

    private static ArrayList<Integer> heapSort(ArrayList<Integer> list, int length) {

        if (length == 1) return list;


        int lastParent = findLastParentIndex(length);


        for (int parent = lastParent; parent >= 0; parent--) {
            int leftChild = parent * 2 + 1;
            int rightChild = parent * 2 + 2;

            if (leftChild == length - 1) rightChild = leftChild;

            int max = leftChild;
            if (list.get(rightChild) > list.get(max)) max = rightChild;

            if (list.get(parent) < list.get(max)) swapIndexes(list, max, parent);
        }
        swapIndexes(list, 0, length - 1);
        return heapSort(list, length - 1);
    }


    private static void swapIndexes(ArrayList<Integer> list, int i, int j) {
        Collections.swap(list, i, j);
    }


    private static int findLastParentIndex(int listSize) {
        int i;
        if (listSize % 2 == 0) {
            i = (listSize - 1) / 2;
        } else {
            i = (listSize - 2) / 2;
        }
        return i;
    }
}