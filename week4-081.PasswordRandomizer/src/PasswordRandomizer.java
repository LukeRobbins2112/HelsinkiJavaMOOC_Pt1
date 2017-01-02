import java.util.Random;

public class PasswordRandomizer {
    private int length;
    Random ran = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String password = "";
        String symbol = "abcdefghijklmnopqrstuvwxyz";
        int i = 0;
        while (i < length){
            
        password+=symbol.charAt(ran.nextInt(26));
        i++;
        }
        return password;
    }
}
