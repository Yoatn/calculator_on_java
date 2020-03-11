package src_temp;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

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


// ^\d{1,2}\s[\-|\+|\*|\/]\s\d{1,2} arabic
// ^(I|II|III|IV|V|VI|VII|VIII|IX|X)\s[\-|\+|\*|\/]\s(I|II|III|IV|V|VI|VII|VIII|IX|X)$ rome
// ^([0-9]|10)\s[\-|\+|\*|\/]\s([0-9]|10)$|^(I|II|III|IV|V|VI|VII|VIII|IX|X)\s[\-|\+|\*|\/]\s(I|II|III|IV|V|VI|VII|VIII|IX|X)$