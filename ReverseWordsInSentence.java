import java.util.Scanner;
public class ReverseWordsInSentence {
public static void main(String[] args) {
// Create a Scanner object to read user input
Scanner scanner = new Scanner(System.in);
// Prompt the user to enter a sentence
System.out.print("Enter a sentence: ");
String inputSentence = scanner.nextLine();
// Close the scanner to prevent resource leak
scanner.close();
// Split the sentence into words using space as the delimiter
String[] words = inputSentence.split(" ");
// Initialize an empty string to store the reversed sentence
String reversedSentence = "";
// Iterate through the words in reverse order and build the reversed sentence
for (int i = words.length - 1; i >= 0; i--) {
reversedSentence += words[i];
// Add a space after each word except the last one
if (i > 0) {
reversedSentence += " ";
}
}
  // Print the reversed sentence
System.out.println("Reversed sentence: " + reversedSentence);
}
}
