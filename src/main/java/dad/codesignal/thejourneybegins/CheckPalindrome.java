package dad.codesignal.thejourneybegins;

public class CheckPalindrome {
    public boolean solution(String inputString) {
        int izquierda = 0;
        int derecha = inputString.length() - 1;

        while (izquierda < derecha) {
            if (inputString.charAt(izquierda) != inputString.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        } return true;
    }


}
