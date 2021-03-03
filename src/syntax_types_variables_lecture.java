public class syntax_types_variables_lecture {

    public static void main(String[] args) {

        {
            System.out.println("Sabrina");
        }

        byte bite = 127;
        System.out.println(
                ((Object) bite)
                        .getClass()
                        .getName());


        {
            int myInt = 2147483647;
            System.out.println(myInt + 1);

            int maxvalue = Integer.MAX_VALUE;
            System.out.println(maxvalue + 3);

        }
    }
}
