import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int j = 0;
        int[] arrfin = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arrfin[j] = arr[i];
            j++;
        }
        return arrfin;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int n = arr.length;
        int largest = 0, secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[largest]) {
                if (secondLargest == -1) {
                    secondLargest = i;
                }
                else if (arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
            }
        }
        return arr[secondLargest];
    }


    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the", "of", "and", "a", "to", "in", "is", "you", "that", "it", "he", "was", "for", "on", "are", "as", "with", "his", "they", "I", "at", "be", "this", "have", "from", "or", "one", "had", "by", "word", "but", "not", "what", "all", "were", "we", "when", "your", "can", "said", "there", "use", "an", "each", "which", "she", "do", "how", "their", "if", "will", "up", "other", "about", "out", "many", "then", "them", "these", "so", "some", "her", "would", "make", "like", "him", "into", "time", "has", "look", "two", "more", "write", "go", "see", "number", "no", "way", "could", "people", "my", "than", "first", "water", "been", "call", "who", "oil", "its", "now", "find", "long", "down", "day", "did", "get", "come", "made", "may", "cat", "dog", "cats", "dogs"};
        for (String i : dictionary) {
            if (word.equals(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(secondLargest(arr));
        System.out.println(spellCheck("the"));
    }
}
