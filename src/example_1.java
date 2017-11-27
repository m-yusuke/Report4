public class example_1 {
    public static void main(String[] args){
        try {
            String str = "3．14";
            double value = Double.parseDouble(str);
        } catch (NullPointerException e) {
            System.out.println("ぬるぽ");
            System.out.println(e.getMessage());
        }
    }
}
