public class JavaIIIWarmUp {

    public static void main(String[] args) {

        System.out.println(sameFirstAndLast("Bob"));
        System.out.println(sameFirstAndLast("Steve"));
        System.out.println(sameFirstAndLast("refrigerator"));
        System.out.println(sameFirstAndLast("q2kdj3vq"));

    }

    public static boolean sameFirstAndLast(String str) {

        int n = str.length();
        char first = Character.toLowerCase(str.charAt(0));
        char last = Character.toLowerCase(str.charAt(n - 1));

        if (first == last) {
            return true;
        }
        return false;
    }

}
