import java.util.Scanner;

/**
 * Created by sidney on 13.04.17.
 */
public class Mark {
    public char first;
    public char second;
    public char now;

    public void input(){
        Scanner input  = new Scanner(System.in);
        System.out.print(">>> ");
        String str = input.next();
        str = str.toLowerCase();
        switch (str) {
            case "крестик":
            case "крест":
            case "cross":
            case "x":
            case "х":
                this.first = 'x';
                this.second = 'o';
                break;
            case "нолик":
            case "ноль":
            case "zero":
            case "naught":
            case "o":
            case "о":
            case "0":
                this.first = 'o';
                this.second = 'x';
                break;
            default:
                this.input();
        }
    }
}
