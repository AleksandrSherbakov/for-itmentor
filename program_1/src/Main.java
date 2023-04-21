import java.util.Scanner;

public class Main {
    public static String calc(String input) throws Exception {
        String[] input_split = input.split(" ");
        if (input_split.length != 3) {
            throw new Exception("Length Exceptions");
        }
        int a = Integer.parseInt(input_split[0]);
        int b = Integer.parseInt(input_split[2]);
        if(a>10||b>10||a<1||b<1)
        {
            throw new Exception("Format Exceptions");
        }
        int result = 0;
        switch (input_split[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default: throw new Exception("Sign Exception");

        }
        return Integer.toString(result);
        
    }
    public static void main(String[] args) throws Exception{

            Scanner in = new Scanner(System.in);
        while (true) {
            String str = in.nextLine();
            if (str=="") {
                break;
            }
            try {
                String out = calc(str);
                System.out.println(out);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}

