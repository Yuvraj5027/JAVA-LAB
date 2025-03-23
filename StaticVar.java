class Simple {
    static int count = 0;
    Simple () {
        count++;
    }
    void displayCount() {
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {
        Simple obj1 = new Simple ();
        Simple obj2 = new Simple ();
        obj1.displayCount(); // Output: Count: 2
        obj2.displayCount(); // Output: Count: 2
    }
}