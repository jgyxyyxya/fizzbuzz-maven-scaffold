public class Number2String {
    public String trans(int input) {
        if (input % 3 == 0 && input % 5 == 0) {
            return "fizzbuzz";
        }
        if (input % 3 == 0) {
            return "fizz";
        }
        if (input % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(input);
    }
}
