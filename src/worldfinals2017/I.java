package worldfinals2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class I {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		String[] split = scan.readLine().split(" ");
		int numberTranslations = Integer.parseInt(split[0]);
		int wordPairs = Integer.parseInt(split[1]);
		
		HashMap<Character, LinkedList<Character>> pairsMap = new HashMap<Character, LinkedList<Character>>();

		for (int i = 0; i < numberTranslations; i++) {
			String[] pairInput = scan.readLine().split(" ");
			char src = pairInput[0].charAt(0);
			char dst = pairInput[1].charAt(0);
						
			 if(pairsMap.containsKey(src)){
				 pairsMap.get(src).add(dst);
			 }else{
				 LinkedList<Character> list = new LinkedList<>();
				 list.add(dst);
				 pairsMap.put(src,list);
			 }	 
		}
		
		for (int i = 0; i < wordPairs; i++) {
			String output = "no";
			String[] wordInput = scan.readLine().split(" ");
			String word1 = wordInput[0];
			String word2 = wordInput[1];
			
			boolean isTurnable = false;
			
			if(word1.length() == word2.length()){
				for (int j = 0; j < word1.length(); j++) {
					char src = word1.charAt(i);
					char dst = word2.charAt(i);
					
					if(src == dst){
						isTurnable = true;
					}else{
						
						List<Character> firstChars = new ArrayList<>();
						firstChars.addAll(pairsMap.get(src));
						
						//start from the top , and derive by letter
						for (Character character : firstChars) {
							
							char ch = character; 
							LinkedList<Character> currentChars = pairsMap.get(ch);
							while(currentChars != null){
								
							}
						}
					}
				}
			}
			
			if(isTurnable)
				output = "yes";
			
			System.out.println(output);
		}
		
//		for (Character character : pairsMap.keySet()) {
////			LinkedList<Character> linkedList = ;
//			System.out.print("Lyric " + character + ": ");
//			
//			System.out.println(pairsMap.get(character));
//		}
	}
}
