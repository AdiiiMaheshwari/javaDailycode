package String_Question;

public class Count_numWithoutSplit {
    public static void main(String[] args) {
        String s="life is beautiful";
        char[]ch= s.toCharArray();
        int total=0;
        for(int i=0;i<=ch.length-1;i++){
            if(ch[i]==' '){
                total++;
            }
        }
        System.out.println(total);
    }
}
