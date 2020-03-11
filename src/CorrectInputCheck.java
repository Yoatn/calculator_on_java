public class CorrectInputCheck {
    public boolean correctInputCheck(String inputString) {
        boolean result;
        if (inputString.matches("^([0-9]|10)\\s[\\-|\\+|\\*|\\/]\\s([0-9]|10)$|" +
                "^(I|II|III|IV|V|VI|VII|VIII|IX|X)\\s[\\-|\\+|\\*|\\/]\\s" +
                "(I|II|III|IV|V|VI|VII|VIII|IX|X)$")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}