/* 
 * - Số CCCD : chỉ gồm ký tự số, chứa 12 ký tự, không chứa ký tự là chữ số hoặc ký tự đặc biệt.
    Ví dụ hợp lệ: 099145697413
    không hợp lệ: 09914569741a (chứa ký tự là chữ số)
    - Mật khẩu: có ít nhất 6 ký tự
    ví dụ hợp lệ: 123456
    không hợp lệ: 12345 (chứa 5 ký tự)
    - Email : cần có ký tự @ và dấu chấm (.)
    ví dụ hợp lệ: truongsondev@fstack.com.vn
    không hợp lệ: abc#blabla (không chứa @ và dấu chấm)
 * 
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabForty {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]{12}");
        Matcher matcher = pattern.matcher("23243234534535345435");
        System.out.println("Check Regex :" + matcher.matches());
    }
}
