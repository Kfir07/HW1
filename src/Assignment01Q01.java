public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i=0; i<args.length; i++) {
            String checked = args[i];
            if (checked.length() > 0) {
                char firstChar = checked.charAt(0);
                if (firstChar % 5 == 0) {
                    System.out.println(firstChar);
                }
            }
        }
    }
}
