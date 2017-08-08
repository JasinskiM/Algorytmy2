package Algorithms;

import java.util.Stack;

/**
 * Created by RENT on 2017-08-08.
 */
public class Notacja2 extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        Stack<String> stack = new Stack<>();
        String myInput = "( a + b ) * c =";
        String[] myInputArr = myInput.split(" ");
        String helper = "";

        for (String element : myInputArr) {
            switch (element) {
                case "=":
                    while (!stack.empty()) {
                        System.out.println(stack.pop());
                    }
                    break;
                case "(":
                    stack.push(element);
                case ")":
                    helper = stack.pop();
                    while (!helper.equals("(")) {
                        System.out.println(helper);
                        helper = stack.pop();
                    }
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    while (!stack.empty()) {
                        if (GetOperatorPriority(element) == 3 || GetOperatorPriority(element) >= GetOperatorPriority(stack.peek())) {
                            break;
                        }else {
                            System.out.println(stack.pop());
                        }
                    }
                    stack.push(element);
                    break;
                default:
                    System.out.printf("%s",element);
                    break;
            }
        }

    }

    public int GetOperatorPriority(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
            default:
                return -1;

        }
    }
}
