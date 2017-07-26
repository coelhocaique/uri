package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P1279 {

	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		int i = 0;
 		while(true){
			
			String x = scan.readLine();
			
			if(x == null)
				break;
			
			BigInteger n = new BigInteger(x);
			
			
			String output;
			
			if(i != 0)
				output = "\n";
			else 
				output = "";
			
			if((Integer.parseInt(n.remainder(BigInteger.valueOf(4L)).toString()) == 0 
			&& Integer.parseInt(n.remainder(BigInteger.valueOf(100L)).toString()) != 0) 
			   || Integer.parseInt(n.remainder(BigInteger.valueOf(400L)).toString()) == 0){
				
				output+="This is leap year.";
				if(Integer.parseInt(n.remainder(BigInteger.valueOf(15L)).toString()) == 0)
				    output+= "\nThis is huluculu festival year.";
				if(Integer.parseInt(n.remainder(BigInteger.valueOf(55L)).toString()) == 0)
					output+= "\nThis is bulukulu festival year.";
			}else {
				if(Integer.parseInt(n.remainder(BigInteger.valueOf(15L)).toString()) == 0)
				    output+= "This is huluculu festival year.";
				else 
					output+= "This is an ordinary year.";
			}
			
			System.out.println(output);
			if(i == 0)
				i++;
		}
	}
}
