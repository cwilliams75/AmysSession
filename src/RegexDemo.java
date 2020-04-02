
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {

    public static void main(String[] args) {
        String re = "\\s";
        String text = " ";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        Boolean result = mt.matches();
        System.out.println(result);
    }
}
// Matching Characters
// . = Any Character except newline.
// \w = word  character (a-z, A-Z, 0-9, _)
// \W = Not a word character
// \s = White spaced character. Same as to [\t\n\r\f]
// \S = Non-white space
// \d = any digit. Same as to [0-9]
// \D = Non digits