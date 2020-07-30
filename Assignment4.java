import java.util.Scanner;


/**
 *
 */
public class Assignment4 {

    /**
     * @param args not used
     */
    public static void main(String[] args) {
        run();
    }

    /**
     *
     */
    public static void run() {

        Scanner sc = new Scanner(System.in);
        String user_input = "";
        Boolean quit = false;

        ArraysVocabulary ArraysVocabulary = new ArraysVocabulary();
        String[] swe_words = ArraysVocabulary.getSwe_words;
        String[] eng_words = ArraysVocabulary.getEng_words;


        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        
            while (!quit) {
                introduction();
                int j = 0;
                int index = 0;
                int score = 0;
                int eng_word_length = eng_words[j].length();
                double CloseToCorrectMargin = 0.75;

                //ahfhfhf
                for (j = 0; j == index; j++) {
                    System.out.println(swe_words[j] + ":");
                    user_input = sc.next().trim();

                    if (user_input.equalsIgnoreCase("Q")) {
                        System.out.println("Du svarade på totalt " + index + " glosor och hade " + score + " rätt. Välkommen åter!");
                        quit = true;

                        if (user_input.equalsIgnoreCase(eng_words[j])) {
                            index++;
                            score++;

                            if (index == eng_word_length) {
                                System.out.println(ANSI_GREEN + "Korrekt!" + ANSI_RESET + score + " rätt av " + index + " ord." + "\nDu svarade på totalt " + index + " och hade " + score + " rätt. Välkommen åter!");
                                quit = true;
                            } else {
                                System.out.println(ANSI_GREEN + "Korrekt!" + ANSI_RESET + score + " rätt av " + index + " ord.");
                            }
                        }
                        //blbl
                        else if (user_input.compareToIgnoreCase(eng_words[j].substring(0, eng_word_length)) >= (CloseToCorrectMargin * eng_word_length)) {
                            index++;
                            if (index == eng_word_length) {
                                System.out.println("Nästan rätt. Korrekt svar är " + eng_words);
                                System.out.println("Du svarade på totalt " + index + " glosor och hade " + score + " rätt. Välkommen åter!");
                            } else {
                                System.out.println("Nästan rätt. Korrekt svar är " + eng_words);
                            }


                        } else {
                            index++;
                            if (index == eng_word_length) ;
                            System.out.println(ANSI_RED + "Fel svar!" + ANSI_RESET + " Korrekt svar är " + eng_words);
                            System.out.println("Du svarade på totalt " + index + " och hade " + score + "rätt. Välkomen åter!");
                        } else{
                            System.out.println("Fel svar!. Rätt svar är " + eng_words + ".");


                        }

                    }
                }
        }
    }

    private static void introduction() {
        System.out.println("** GLOSÖVNING - ENGELSKA **");
        System.out.println("Skriv det engelska ordet. Avsluta programmet genom att skriva Q");
    }
}
     class ArraysVocabulary {

         public String[] getSwe_words;
         public String[] getEng_words;
         private String[] swe_words = {"bil", "hus","springa","blå","baka","hoppa","simma","måne","väg","snäll"};

         private String[] eng_words = {"car", "house","run","blue","bake","jump","swim","moon","road","kind"};

         public String [] getSwe_words () {
             return this.swe_words; }

         public String [] getEng_words () {
             return this.eng_words; }
     }






