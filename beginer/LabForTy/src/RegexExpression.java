import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("truongsonsoftwareengineer", Pattern.CASE_INSENSITIVE);
        Matcher matchFound = pattern.matcher("hôm nay tôi sẽ giới thiệu tôi là truongsonsoftwareengineer "); //
        boolean isFound = matchFound.find();
        if (isFound) {
            System.out.println("đã tìm thấy trong chuỗi");
        } else {
            System.out.println("không tìm thấy chuỗi");
        }
    }
}