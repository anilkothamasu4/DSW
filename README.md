# DSW

Project Setup : 

1. Clone this project using "git clone https://github.com/anilkothamasu4/DSW.git into your machine"
2. Import the cloned repo into Eclipse/IntellJ as a maven project
3. Open the LargestWord.java present in the src/test/java directory
4. Run the File LargestWord.java
5. If you want to test with different file data, give the data in the FileInput.txt present in src/main/resources folder

Note : Java version should be 1.8 and above

Below are the test cases that are handled by the program

Positive test cases : 

1. Input file having data contains only strings
2. Input file having words length >128 characters
3. Input file contains words of same length, then it should display multiple word outputs

Negative Test cases : 

1. Input file contain special characters, numbers and strings
2. Input file contain only special characters
3. Input file contain only Numbers
4. Input file is empty 
5. Input file contains only spaces
6. Input file contains multiple words with same value , then only one word is displayed in output
