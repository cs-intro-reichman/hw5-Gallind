public class MyStringTest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a specific test to run: countChar, subsetOf, spacedString, randomStringOfLetters, or remove.");
            return;
        }
        // Run specific test based on argument
        switch (args[0]) {
            case "countChar": testCountChar(); break;
            case "subsetOf": testSubsetOf(); break;
            case "spacedString": testSpacedString(); break;
            case "randomStringOfLetters": testRandomStringOfLetters(); break;
            case "remove": testRemove(); break;
            default: System.out.println("Unknown test: " + args[0]);
        }
    }

    private static void testCountChar() {
        System.out.println("\nTesting countChar:");
        System.out.println("hello, l -> " + MyString.countChar("hello", 'l') + " (expected: 2)");
        System.out.println("hello, h -> " + MyString.countChar("hello", 'h') + " (expected: 1)");
        System.out.println("hello, z -> " + MyString.countChar("hello", 'z') + " (expected: 0)");
        System.out.println("empty string, a -> " + MyString.countChar("", 'a') + " (expected: 0)");
        System.out.println("aaa, a -> " + MyString.countChar("aaa", 'a') + " (expected: 3)");
    }

    private static void testSubsetOf() {
        System.out.println("\nTesting subsetOf:");
        System.out.println("sap in space -> " + MyString.subsetOf("sap", "space") + " (expected: true)");
        System.out.println("spa in space -> " + MyString.subsetOf("spa", "space") + " (expected: true)");
        System.out.println("pass in space -> " + MyString.subsetOf("pass", "space") + " (expected: false)");
        System.out.println("c in space -> " + MyString.subsetOf("c", "space") + " (expected: true)");
        System.out.println("empty string in anything -> " + MyString.subsetOf("", "anything") + " (expected: true)");
    }

    private static void testSpacedString() {
        System.out.println("\nTesting spacedString:");
        System.out.println("silent -> \"" + MyString.spacedString("silent") + "\" (expected: s i l e n t)");
        System.out.println("a -> \"" + MyString.spacedString("a") + "\" (expected: a)");
        System.out.println("empty string -> \"" + MyString.spacedString("") + "\" (expected: )");
        System.out.println("hi -> \"" + MyString.spacedString("hi") + "\" (expected: h i)");
    }

    private static void testRandomStringOfLetters() {
        System.out.println("\nTesting randomStringOfLetters:");
        System.out.println("length 5 -> " + MyString.randomStringOfLetters(5));
        System.out.println("length 10 -> " + MyString.randomStringOfLetters(10));
        System.out.println("length 0 -> \"" + MyString.randomStringOfLetters(0) + "\"");
    }

    private static void testRemove() {
        System.out.println("\nTesting remove:");
        System.out.println("committee - meet -> " + MyString.remove("committee", "meet") + " (expected: comit)");
        System.out.println("abc - abc -> " + MyString.remove("abc", "abc") + " (expected: )");
        System.out.println("abc - b -> " + MyString.remove("abc", "b") + " (expected: ac)");
        System.out.println("hello - empty string -> " + MyString.remove("hello", "") + " (expected: hello)");
    }
} 