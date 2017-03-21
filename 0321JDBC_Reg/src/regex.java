import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher("112311");
        if(isNum.matches()) {
            System.out.println("全部是数字");
        } else {
            System.out.println("有汉字");
        }
    }
}