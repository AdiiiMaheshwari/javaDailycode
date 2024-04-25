package String_Question;

public class Palindrome {
    public static  void main(String[] args) {
        String s="malam arora teaches malayalam";
        char[] ch=s.toCharArray();
        String temp="";
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]!=' '){
                temp=temp+ch[i];
            }else{
                String reverse="";
                for(int j=temp.length()-1;j>=0;j--){
                    reverse=reverse+temp.charAt(i);
                }
                if(reverse.equals(temp)){
                    System.out.println(reverse);
                    temp="";
                }else {
                    temp="";
                }
            }
            String reverse="";
            for(int k=temp.length()-1;k>=0;k--){
                reverse=reverse+temp.charAt(i);
            }
            if (reverse.equals(temp)){
                System.out.println(reverse);
            }               //WRONG CODE
        }

    }
}
