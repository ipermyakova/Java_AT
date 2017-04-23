/**
 * Created by Ирина on 19.04.17.
 */
public class Console {
    public static void main(String[] args) {
        int random = (int) (5 + Math.random() * 46);
        System.out.println(random);
        System.out.println(Math.random() * 46);
        StringBuilder strb = new StringBuilder();
        for(int i = 0; i < random; i++) {
            strb.append("!");
        }
        System.out.println("Hello, world!\n"
                + "And hi again!\n"
                + strb);
    }

}
