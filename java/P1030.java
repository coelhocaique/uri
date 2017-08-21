package br.com.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1030 {

	public static void main(String[] args) throws IOException {

		  BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(scan.readLine());

      int count = 1;

      while(count++ <= m){
        String[] split = scan.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        int result = josephus(n,k);
        System.out.println("CASE " + count + ": " + result);
      }
	}

  public static int josephus(int n,int k){
    if(n == 1)
      return 1;
    else
      return (josephus(n-1,k) + k-1) % n+1;
  }
}
