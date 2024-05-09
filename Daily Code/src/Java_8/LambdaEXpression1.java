package Java_8;
interface  star{
	public void sho(int a,int b);
}

public class LambdaEXpression1 {

	public static void main(String[] args) {
		
		star s1=(a,b)->{
			System.out.println(a*b);
		};
		s1.sho(19, 7);
	
	}

}
