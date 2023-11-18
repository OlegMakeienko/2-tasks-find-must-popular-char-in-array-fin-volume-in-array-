public class MustPopularCharForExactThisArray {
    private char[] letters = {'a', 'a', 'a', 'b', 'b', 'c', 'f', 'a', 'a'};

    public MustPopularCharForExactThisArray() {
    }

    private char getCandidate() {
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

    private boolean validate(char[] letters, char aChar) {
        this.letters = letters;
        int count = 0;
        for (char someChar : letters) {
            if(someChar == aChar) {
                count++;
            }
        }
        return count >= letters.length / 2;
    }

    public void findMustPopularChar() {
        char candidate = getCandidate();
        if(candidate == '-') {
            System.out.println('-');
        }
        if(validate(letters, candidate)){
            System.out.println(candidate);
        } else System.out.println('-');
    }
}
