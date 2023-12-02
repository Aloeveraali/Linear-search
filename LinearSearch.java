import java.util.Scanner;

public class LinearSearch {

    // Method to perform linear search on a double array
    public static boolean findElement(double[] array, double target) {
        for (double element : array) {
            if (element == target) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }

    public static void main(String[] args) {
        // Sample array (Do not change this code)
        double[] sampleArray1 = {345.6, 678.954, 234.534, -89.23};

        // User input for the element to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search for: ");
        double searchElement = scanner.nextDouble();

        // Check if the element is found in the array
        boolean found = findElement(sampleArray1, searchElement);

        // Print the result
        if (found) {
            System.out.println(searchElement + " was found in the array");
        } else {
            System.out.println(searchElement + " was not found in the array");
        }

        // Close the scanner
        scanner.close();
    }
}
