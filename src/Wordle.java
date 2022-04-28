import java.util.*;

public class Wordle {
    public static void wordlde(String word){
        Scanner sc= new Scanner(System.in);
        String guess;
        System.out.println("Enter first guess");
        guess = sc.nextLine();
        System.out.println(guess(guess, word));
        if(guess.equals(word)){
            System.out.println("You got the word!");
            System.exit(0);
        }
        System.out.println("Enter second guess");
        guess = sc.nextLine();
        System.out.println(guess(guess, word));
        if(guess.equals(word)){
            System.out.println("You got the word!");
            System.exit(0);
        }
        System.out.println("Enter third guess");
        guess = sc.nextLine();
        System.out.println(guess(guess, word));
        if(guess.equals(word)){
            System.out.println("You got the word!");
            System.exit(0);
        }
        System.out.println("Enter fourth guess");
        guess = sc.nextLine();
        System.out.println(guess(guess, word));
        if(guess.equals(word)){
            System.out.println("You got the word!");
            System.exit(0);
        }
        System.out.println("Enter fifth guess");
        guess = sc.nextLine();
        System.out.println(guess(guess, word));
        if(guess.equals(word)){
            System.out.println("You got the word!");
            System.exit(0);
        }
        System.out.println("Enter last guess");
        guess = sc.nextLine();
        System.out.println(guess(guess, word));
        if(guess.equals(word)){
            System.out.println("You got the word!");
            System.exit(0);
        }
        else{
            System.out.println("You did not get the word");
            System.exit(-1);
        }
    }

    public static String guess(String guess, String word) {
        String output = "";
        Boolean found = false;
        Boolean multiple = false;
        for (int i = 0; i < 5; i++) {
            found = false;
            char letter = word.charAt(i);
            if (guess.charAt(i) == letter) {
                output = output + letter;
                found = true;
                multiple = true;
            }
            else {
                for (int j = 0; j < 5; j++) {
                    if (guess.charAt(j) == letter && (i != j) && !multiple) {
                        output = output + '?';
                        found = true;
                    }
                }
            }
            if (!found) {
                output = output + 'x';
            }
        }
        return output;
    }

    public static void main(String[] args){
        Random rand = new Random();
        int i = rand.nextInt(10);
        String[] words = new String[]{"stare", "glare", "thank", "handy", "sheep", "brown",
                "flake", "brain", "party", "shape", "blame", "frame", "grain", "names", "house"};
        String word = words[i];
        wordlde(word);
        }
    }

