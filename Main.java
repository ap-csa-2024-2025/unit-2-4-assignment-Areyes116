public class Main
{

    // Method to return the last n letters of s1 and the first n letters of s2
    public static String lastFirstN(String s1, String s2, int n)
    {
        // Extract the last n characters from s1
        String lastPart = s1.substring(s1.length() - n);
        // Extract the first n characters from s2
        String firstPart = s2.substring(0, n);
        // Return the concatenated result
        return lastPart + firstPart;
    }

    public static void main(String[] args)
    {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input string s1
        System.out.print("Enter the first string (s1): ");
        String s1 = scanner.nextLine();
        
        // Input string s2
        System.out.print("Enter the second string (s2): ");
        String s2 = scanner.nextLine();
        
        // Input integer n
        System.out.print("Enter the integer value (n): ");
        int n = scanner.nextInt();
        
        // Call the lastFirstN method and print the result
        String result = lastFirstN(s1, s2, n);
        System.out.println("Output: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
