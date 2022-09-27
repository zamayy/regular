import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Proverka {
    public void proverka(String slovo){
        Pattern pattern = Pattern.compile("zamay (\\w*)");
        Matcher matcher = pattern.matcher(slovo);
        if(matcher.find())
            System.out.println("Слово найдено");
        else
            System.out.println("Слово не найдено");
    }

    public void clocks(String predl){
        Pattern pattern = Pattern.compile("([01][0-9]|2[0-3]\\d):[0-5]\\d");
        Matcher matcher = pattern.matcher(predl);
        if (matcher.find())
            System.out.println("Время указано");
        else
            System.out.println("Время не указано или указано неверно");
    }
}
