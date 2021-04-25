import java.io.File;
import java.io.FileNotFoundException;
import java.net.SecureCacheResponse;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LargestWord {

	/*
	 * Main block executes and provide the longest word in a file and it's transposed
	 */
	public static void main(String[] args) {

		try {
			String current;
			int longestWordLength = 0;
			//File path , where the file is located
	        ClassLoader classLoader = LargestWord.class.getClassLoader();
			String fileName = "FileInput.txt";
			File file = new File(classLoader.getResource(fileName).getFile());
			Scanner scan = new Scanner(file);
			Set<String> words = new HashSet<String>();
			while (scan.hasNext()) {
				current = scan.next();
				
				/*if the previous word length is greater than the current word length and the word does not contain any 
				special characters and numbers */
				if ((!current.matches(".*[^a-zA-Z].*"))) {
					words.add(current);
					longestWordLength = (current.length()>=longestWordLength) ? current.length() : longestWordLength;
				}
			}

			if(words.size()==0)
			{
				/* if the file has no words or having words contains numbers,special characters. Then the output is empty*/
				System.out.println("There are no correct words in the file, so transposed word doesn't exists");
			} else {
				for(String word : words) { 
					//printing all the words having highest word length
					if(word.length() == longestWordLength) {
					//printing the longest word
					System.out.println(word);
					//printing the transposed longest word
					System.out.println(transposeWord(word));
					}
				}
			}
			

			//if the file is not found at the location, then this catch block will handle the exception
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	/*
	 * used for the transposing of the word 
	 * input : word - String
	 */
	public static String transposeWord(String word)

	{
		StringBuffer sbr = new StringBuffer(word);
		sbr.reverse();
		return sbr.toString();
	}

}
