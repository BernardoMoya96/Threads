class BubbleSortThread extends Thread {
    // Internal variables of the class
    private int[] Numbers; // array of integers
    private Thread t; // reference to the current string

    // Constructor. Receives two parameters:
    // - array of integers;
    // - the name of the current string.
    public BubbleSortThread(int[] Numbers, String threadName) {
        // Save external array
        this.Numbers = Numbers;
        // Create a new thread
        t = new Thread(this, threadName);
    }

    // Method that starts a thread for execution
    public void Start() {
        t.start();
    }

    // Method in which the thread is executed
    public void run() {
        // Bubble sorting
        // 1. Inform about the start of sorting
        System.out.println("Begin => " + t.getName());

        // 2. Declare the internal variables
        int i, j;
        String s;

        // 3. Sorting loop
        for (i=0; i<Numbers.length -1; i++) {
            // i - number of step

            for (j=0; j<Numbers.length -i -1; j++) {
                // internal loop
                // sorting by ascending
                if (Numbers[j] > (Numbers[j+1])) {
                    int temp = Numbers[j];
                    Numbers[j] = Numbers[j+1];
                    Numbers[j+1] = temp;
                }
            }
        }

        // 4. Report end of sort
        System.out.println("End => " + t.getName());
    }

    // Access method to the array AS
    public int[] get() { return Numbers; }

    // Access method to the thread t
    public Thread getThread() { return t; }

    // Method that prints the Numbers array to the screen
    public void Print() {
        System.out.print(t.getName() + " = [ ");
        for (int s : Numbers)
            System.out.print(s + " ");
        System.out.println("]");
    }
}