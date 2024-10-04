/**
* Documentation and API can be found here
* https://coderunner.projectstem.org/docs/shapes/index.html
*/
public class StringManipulation
{

    // Method that manipulates and prints the strings
    public static void stringManip(String s1, String s2)
    {
        // Convert the first string (s1) to upper case
        String upperS1 = s1.toUpperCase();

        // Convert the second string (s2) with the first letter in upper case and the rest in lower case
        String firstLetterUpper = s2.substring(0, 1).toUpperCase();
        String restLower = s2.substring(1).toLowerCase();
        String capitalizedS2 = firstLetterUpper + restLower;

        // Print the results
        System.out.println("First string in upper case: " + upperS1);
        System.out.println("Second string with first letter upper case: " + capitalizedS2);
    }

    public static void main(String[] args)
    {
        // Example usage of the stringManip method
        String str1 = "hello";
        String str2 = "world";
        
        // Call the method to manipulate and print the strings
        stringManip(str1, str2);
    }
}
