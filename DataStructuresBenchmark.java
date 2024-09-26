import java.util.*;

public class DataStructuresBenchmark {

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};

        for (int size : sizes) {
            System.out.println("\n===== Benchmark for size: " + size + " =====");
            benchmarkArray(size);
            benchmarkArrayList(size);
            benchmarkLinkedList(size);
            benchmarkHashSet(size);
        }
    }

    // Benchmark for Array (using ArrayList as we can't dynamically resize a primitive array)
    public static void benchmarkArray(int size) {
        ArrayList<Integer> array = new ArrayList<>(size);
        long startTime, endTime;

        // Insert at Tail
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            array.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Array (ArrayList) - Insert Tail Time: " + (endTime - startTime) + " ns");

        // Read by Index
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            array.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Array (ArrayList) - Read by Index Time: " + (endTime - startTime) + " ns");

        // Read by Value
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            array.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("Array (ArrayList) - Read by Value Time: " + (endTime - startTime) + " ns");

        // Insert at Head
        startTime = System.nanoTime();
        array.add(0, -1);
        endTime = System.nanoTime();
        System.out.println("Array (ArrayList) - Insert Head Time: " + (endTime - startTime) + " ns");

        // Insert at Mid
        startTime = System.nanoTime();
        array.add(size / 2, -1);
        endTime = System.nanoTime();
        System.out.println("Array (ArrayList) - Insert Mid Time: " + (endTime - startTime) + " ns");

        // Delete from Head
        startTime = System.nanoTime();
        array.remove(0);
        endTime = System.nanoTime();
        System.out.println("Array (ArrayList) - Delete Head Time: " + (endTime - startTime) + " ns");

        // Delete from Mid
        startTime = System.nanoTime();
        array.remove(size / 2);
        endTime = System.nanoTime();
        System.out.println("Array (ArrayList) - Delete Mid Time: " + (endTime - startTime) + " ns");

        // Delete from Tail
        startTime = System.nanoTime();
        array.remove(array.size() - 1);
        endTime = System.nanoTime();
        System.out.println("Array (ArrayList) - Delete Tail Time: " + (endTime - startTime) + " ns");
    }

    // Benchmark for ArrayList
    public static void benchmarkArrayList(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        long startTime, endTime;

        // Insert at Tail
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList - Insert Tail Time: " + (endTime - startTime) + " ns");

        // Read by Index
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList - Read by Index Time: " + (endTime - startTime) + " ns");

        // Read by Value
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList - Read by Value Time: " + (endTime - startTime) + " ns");

        // Insert at Head
        startTime = System.nanoTime();
        arrayList.add(0, -1);
        endTime = System.nanoTime();
        System.out.println("ArrayList - Insert Head Time: " + (endTime - startTime) + " ns");

        // Insert at Mid
        startTime = System.nanoTime();
        arrayList.add(size / 2, -1);
        endTime = System.nanoTime();
        System.out.println("ArrayList - Insert Mid Time: " + (endTime - startTime) + " ns");

        // Delete from Head
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        System.out.println("ArrayList - Delete Head Time: " + (endTime - startTime) + " ns");

        // Delete from Mid
        startTime = System.nanoTime();
        arrayList.remove(size / 2);
        endTime = System.nanoTime();
        System.out.println("ArrayList - Delete Mid Time: " + (endTime - startTime) + " ns");

        // Delete from Tail
        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() - 1);
        endTime = System.nanoTime();
        System.out.println("ArrayList - Delete Tail Time: " + (endTime - startTime) + " ns");
    }

    // Benchmark for LinkedList
    public static void benchmarkLinkedList(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        long startTime, endTime;

        // Insert at Tail
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList - Insert Tail Time: " + (endTime - startTime) + " ns");

        // Read by Index
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList - Read by Index Time: " + (endTime - startTime) + " ns");

        // Read by Value
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList - Read by Value Time: " + (endTime - startTime) + " ns");

        // Insert at Head
        startTime = System.nanoTime();
        linkedList.addFirst(-1);
        endTime = System.nanoTime();
        System.out.println("LinkedList - Insert Head Time: " + (endTime - startTime) + " ns");

        // Insert at Mid
        startTime = System.nanoTime();
        linkedList.add(size / 2, -1);
        endTime = System.nanoTime();
        System.out.println("LinkedList - Insert Mid Time: " + (endTime - startTime) + " ns");

        // Delete from Head
        startTime = System.nanoTime();
        linkedList.removeFirst();
        endTime = System.nanoTime();
        System.out.println("LinkedList - Delete Head Time: " + (endTime - startTime) + " ns");

        // Delete from Mid
        startTime = System.nanoTime();
        linkedList.remove(size / 2);
        endTime = System.nanoTime();
        System.out.println("LinkedList - Delete Mid Time: " + (endTime - startTime) + " ns");

        // Delete from Tail
        startTime = System.nanoTime();
        linkedList.removeLast();
        endTime = System.nanoTime();
        System.out.println("LinkedList - Delete Tail Time: " + (endTime - startTime) + " ns");
    }

    // Benchmark for HashSet
    public static void benchmarkHashSet(int size) {
        HashSet<Integer> hashSet = new HashSet<>();
        long startTime, endTime;

        // Insert at Tail (HashSet doesn't have order, so it's just adding)
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet - Insert Time: " + (endTime - startTime) + " ns");

        // Read by Value
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet - Read by Value Time: " + (endTime - startTime) + " ns");

        // Delete by Value
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet - Delete Time: " + (endTime - startTime) + " ns");
    }
}

