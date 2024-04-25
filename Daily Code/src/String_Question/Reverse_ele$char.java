package String_Question;

public class Reverse_ele$char {
    public static void main(String[] args) {
        String s = "Life is beautiful";
        String result = "";

        for (int i = s.length()-1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        result = result + " ";
        System.out.println(result);
    }
}
