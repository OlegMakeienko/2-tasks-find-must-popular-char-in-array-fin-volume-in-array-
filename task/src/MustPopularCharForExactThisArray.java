public class MustPopularCharForExactThisArray {
    private static char[] letters = {'a', 'a', 'a', 'b', 'b', 'c', 'f', 'a', 'a'};

    private static char getCandidate() {
        int candidateRepeatCount = 0;
        char candidate = '-';
        for (char letter : letters) {
            if(candidateRepeatCount == 0) {
                candidate = letter;
            } if(letter == candidate) {
                candidateRepeatCount++;
            } else candidateRepeatCount--;
        }
        return candidate;
    }

    private static boolean validate(char[] letters, char aChar) {
        int count = 0;
        for (char someChar : letters) {
            if(someChar == aChar) {
                count++;
            }
        }
        return count >= letters.length / 2;
    }

    public static void findMustPopularChar() {
        char candidate = getCandidate();
        if(candidate == '-') {
            System.out.println('-');
        }
        if(validate(letters, candidate)){
            System.out.println(candidate);
        } else System.out.println('-');
    }
}
