public class VowelConsonant{

public static void main(String [] args) {

Scanner input = new Scanner(System.in);




let vowel = 0;
let consonant = 0;

System.out.println("Enter a word");

for (count = 0; count < word.length; count++){


int letter = word[count].toLowerCase();


if (letter === "a" || letter === "e" || letter === "i" || letter "o" || letter "u") {

		vowel++;

} 

else if (letter >=a && letter <= "z"){
			consonant++;

}
}

System.out.println("Vowels" + vowel);
System.out.println("Consonant" + consonant);
