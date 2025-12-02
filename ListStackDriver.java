// ListStackDriver.java
// Starter file for the Stack portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runS4_ReverseWord).

public class ListStackDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        //runS1_BrowserBackButton();
        //runS2_TextEditorUndo();
        //runS3_BalancedParentheses();
        //runS4_ReverseWord();
        //runS5_DirectoryNavigation();
        //runS6_CalculatorHistory();
        //runS7_PalindromeChecker();
        //runS8_FunctionCallStack();
        //runS9_StackOfPlates();
    }

    // S1 – Browser Back Button
    private static void runS1_BrowserBackButton() {
        // TODO: Implement task S1 here.
        System.out.println("=== S1 – Browser Back Button ===");

        ListStack<String> history = new ListStack<>();

        // Visit pages
        history.push("homepage.com");
        history.push("search.com");
        history.push("article.com");
        history.push("video.com");

        System.out.println("Current page: " + history.peek());

        // Go back
        while (!history.isEmpty()) {
            String current = history.pop();
            System.out.println("Back from: " + current);
            if (!history.isEmpty()) {
                System.out.println("Now at: " + history.peek());
            } else {
                System.out.println("No more history.");
            }
        }
    }

    // S2 – Undo in a Text Editor
    private static void runS2_TextEditorUndo() {
        // TODO: Implement task S2 here.
        System.out.println("=== S2 – Undo in a Text Editor ===");

        ListStack<String> history = new ListStack<>();

        String text = "";
        System.out.println("Start: \"" + text + "\"");
        history.push(text);

        text = "Hello";
        history.push(text);
        System.out.println("After typing: \"" + text + "\"");

        text = "Hello world";
        history.push(text);
        System.out.println("After typing: \"" + text + "\"");

        // Undo
        System.out.println("\nUndoing...");
        history.pop();
        text = history.peek();
        System.out.println("After undo 1: \"" + text + "\"");

        history.pop();
        text = history.peek();
        System.out.println("After undo 2: \"" + text + "\"");
    }

    // S3 – Checking Balanced Parentheses
    private static void runS3_BalancedParentheses() {
        // TODO: Implement task S3 here.
        System.out.println("=== S3 – Checking Balanced Parentheses ===");

        String[] tests = {
                "(a + b) * (c + d)",
                "((()))",
                "(()",
                "())(",
                "((a+b)"
        };

        for (String expr : tests) {
            boolean balanced = isBalanced(expr);
            System.out.println("\"" + expr + "\" → " + (balanced ? "BALANCED" : "NOT balanced"));
        }
    }

    private static boolean isBalanced(String expr) {
        ListStack<Character> stack = new ListStack<>();
        for (char c : expr.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    // S4 – Reversing a Word Using a Stack
    private static void runS4_ReverseWord() {
        // TODO: Implement task S4 here.
        System.out.println("=== S4 – Reversing a Word ===");

        String word = "datastructures";
        ListStack<Character> stack = new ListStack<>();

        // Push all characters
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        // Pop to reverse
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversed.toString());
    }

    // S5 – Directory Navigation (cd / cd ..)
    private static void runS5_DirectoryNavigation() {
        // TODO: Implement task S5 here.
        System.out.println("=== S5 – Directory Navigation ===");

        ListStack<String> path = new ListStack<>();

        cd(path, "home");
        cd(path, "user");
        cd(path, "documents");
        printPath(path);

        cdUp(path);
        printPath(path);

        cd(path, "downloads");
        printPath(path);
    }

    private static void cd(ListStack<String> path, String folder) {
        path.push(folder);
        System.out.println("cd " + folder);
    }

    private static void cdUp(ListStack<String> path) {
        if (!path.isEmpty()) {
            System.out.println("cd .. (leaving " + path.pop() + ")");
        } else {
            System.out.println("Already at root.");
        }
    }

    private static void printPath(ListStack<String> path) {
        java.util.List<String> list = new java.util.ArrayList<>();
        while (!path.isEmpty()) {
            list.add(0, path.pop());
        }
        for (String s : list) {
            path.push(s);
        }
        System.out.println("Current path: /" + String.join("/", list));
    }

    // S6 – History of Calculator Operations
    private static void runS6_CalculatorHistory() {
        // TODO: Implement task S6 here.
        System.out.println("=== S6 – Calculator History ===");

        ListStack<String> history = new ListStack<>();

        addOperation(history, "5 + 3 = 8");
        addOperation(history, "8 * 2 = 16");
        addOperation(history, "16 - 4 = 12");

        System.out.println("\nUndo last operation...");
        undoOperation(history);
        System.out.println("\nUndo last operation...");
        undoOperation(history);
    }

    private static void addOperation(ListStack<String> history, String op) {
        history.push(op);
        System.out.println("Operation performed: " + op);
    }

    private static void undoOperation(ListStack<String> history) {
        if (history.isEmpty()) {
            System.out.println("No operations to undo.");
            return;
        }
        String undone = history.pop();
        System.out.println("Undid: " + undone);
        System.out.println("Current top of history: " + (history.isEmpty() ? "none" : history.peek()));
    }

    // S7 – Palindrome Checker
    private static void runS7_PalindromeChecker() {
        // TODO: Implement task S7 here.
        System.out.println("=== S7 – Palindrome Checker ===");

        String[] words = {"racecar", "level", "hello", "madam", "noon"};

        for (String w : words) {
            boolean isPal = isPalindrome(w);
            System.out.println(w + " → " + (isPal ? "palindrome" : "not palindrome"));
        }
    }

    private static boolean isPalindrome(String word) {
        ListStack<Character> stack = new ListStack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return word.equals(reversed.toString());
    }

    // S8 – Function Call Stack Simulator
    private static void runS8_FunctionCallStack() {
        // TODO: Implement task S8 here.
        System.out.println("=== S8 – Function Call Stack Simulator ===");

        ListStack<String> callStack = new ListStack<>();

        call(callStack, "main");
        call(callStack, "f1");
        call(callStack, "f2");

        returnFrom(callStack);
        returnFrom(callStack);
        returnFrom(callStack);
    }

    private static void call(ListStack<String> stack, String funcName) {
        stack.push(funcName);
        System.out.println("Call " + funcName + " | Stack: " + stack);
    }

    private static void returnFrom(ListStack<String> stack) {
        if (stack.isEmpty()) {
            System.out.println("No function to return from.");
            return;
        }
        String func = stack.pop();
        System.out.println("Return from " + func + " | Stack: " + stack);
    }

    // S9 – Stack of Plates (Capacity-Limited Stack)
    private static void runS9_StackOfPlates() {
        // TODO: Implement task S9 here.
        System.out.println("=== S9 – Stack of Plates (Capacity-Limited) ===");

        int capacity = 3;
        ListStack<String> plates = new ListStack<>();

        pushPlate(plates, "Plate 1", capacity);
        pushPlate(plates, "Plate 2", capacity);
        pushPlate(plates, "Plate 3", capacity);
        pushPlate(plates, "Plate 4", capacity); // should be refused

        System.out.println("Current stack: " + plates);

        while (!plates.isEmpty()) {
            System.out.println("Removing " + plates.pop() + " from stack...");
        }
    }

    private static void pushPlate(ListStack<String> stack, String plate, int capacity) {
        if (stack.size() >= capacity) {
            System.out.println("Cannot push " + plate + " – stack at capacity (" + capacity + ")");
        } else {
            stack.push(plate);
            System.out.println("Pushed " + plate);
        }

    }
}