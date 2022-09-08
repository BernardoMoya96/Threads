public class Threads {


    public static void main(String[] args) {

        // Demonstration of sorting an array of integers in a stream
        int[] Numbers = { 5, 10, 8, 4, 3, 2, 7, 1, 6, 9};

        // 2. Declare an instance of a thread class
        BubbleSortThread t1 = new BubbleSortThread(Numbers, "t1:BubbleSort");

        // 3. Run thread t1
        t1.Start();

        // 4. Wait for the end of thread t1 to get the correct result
        try {
            t1.getThread().join();
        }
        catch (InterruptedException e) {
            // If there is an error, then display the message
            System.out.println("Error: " + e.getMessage());
            return;
        }

        // 5. Display sorted array to screen
        t1.Print();
    }
}