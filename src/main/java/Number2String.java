public class Number2String {
    public String trans(int input) {
        String actOutput = "";
        if (input % 3 == 0) {
            actOutput = "fizz";
        }
        if (input % 5 == 0) {
            actOutput = "buzz";
        }
        if (input % 3 == 0 && input % 5 == 0) {
            actOutput = "fizzbuzz";
        }
        if (!"".equals(actOutput)) {
            return actOutput;
        }
        return String.valueOf(input);
    }
}
