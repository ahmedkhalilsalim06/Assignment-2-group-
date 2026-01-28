public class main {

    public static int findMinimum(int[] Array) {
        int minimum = 101; // Define minimum with default value

        // Iterate through the entire array and find the minimum element
        for (int i = 0; i < Array.length; i++) {
            // Get current element
            int currentElement = Array[i]; 

            // if current element is less than minimum, set minimum to currentElement
            if ( currentElement < minimum) {
                minimum = currentElement;
            }
        }

        return minimum;
    }

    public static int findMaximum(int[] Array) {
        int maximum = 0; // Define minimum with default value

        // Iterate through the entire array and find the minimum element
        for (int i = 0; i < Array.length; i++) {
            // Get current element
            int currentElement = Array[i];

            // if current element is less than minimum, set minimum to currentElement
            if ( currentElement < maximum) {
                maximum = currentElement;
            }
        }

        return maximum;
    }
}