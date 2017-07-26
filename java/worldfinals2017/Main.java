package worldfinals2017;

public class Main {
	public static void main(String[] args) {
		int c = 'a';
		
		
		
		int count = 0,count2 = 25;
		for (int i = c; i <= c + 25; i++) {
			for (int j = c ; j <= (c + 25); j++) {
				count++;
				if(i != j)
					System.out.println((char)i + " " + (char)j);
			}
			count2--;
			if(count == 500)
				break;
		}
		StringBuilder s = new StringBuilder("abcdefghijklmnopqrstuvxz");
		System.out.println(s.reverse());
	}
}
