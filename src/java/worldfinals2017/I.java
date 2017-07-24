package worldfinals2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Node implements Comparable<Node>{
	char src,dst;
	boolean visited;
	
	Node(char src,char dst,boolean visited){
		this.src = src;
		this.dst = dst;
		this.visited = visited;
	}

	@Override
	public int compareTo(Node o) {
		return (src == o.src) && (dst == o.dst) ? 0 : 1;
	}
}

public class I {

	static HashMap<Character, LinkedList<Node>> pairsMap = new HashMap<Character, LinkedList<Node>>();
	static List<Character> passed;
	static int calls = 0;
	public static void main(String[] args) throws IOException {

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		String[] split = scan.readLine().split(" ");
		int numberTranslations = Integer.parseInt(split[0]);
		int wordPairs = Integer.parseInt(split[1]);

		for (int i = 0; i < numberTranslations; i++) {
			String[] pairInput = scan.readLine().split(" ");
			char src = pairInput[0].charAt(0);
			char dst = pairInput[1].charAt(0);
			
			Node node = new Node(src,dst,false);
			
			if (pairsMap.containsKey(src)) {
				pairsMap.get(src).add(node);
			} else {
				LinkedList<Node> list = new LinkedList<>();
				list.add(node);
				pairsMap.put(src, list);
			}
		}

		for (int i = 0; i < wordPairs; i++) {
			String output = "no";
			String[] wordInput = scan.readLine().split(" ");
			String word1 = wordInput[0];
			String word2 = wordInput[1];

			boolean isTurnable = false;

			if (word1.length() == word2.length()) {
				for (int j = 0; j < word1.length(); j++) {
					char src = word1.charAt(j); 
					char dst = word2.charAt(j);
					
					if (src == dst)
						isTurnable = true;
					else {
						LinkedList<Node> linkedList = pairsMap.get(src);
						if (linkedList != null && linkedList.size() > 0) {
							passed = new ArrayList<>();
//							System.out.print(src + " turns " + dst + ": ");
							isTurnable = searchNode(src,dst, linkedList.get(0));	
						}else{
							isTurnable = false;
						}
					}
//					System.out.println(isTurnable);
					if (!isTurnable)
						break;
				}
			}

			if (isTurnable)
				output = "yes";
			
			System.out.println("calls: "+ calls);
			System.out.println(output);
		}

		 for (Character character : pairsMap.keySet()) {
		 System.out.print(character + ": ");
		 LinkedList<Node> linkedList = pairsMap.get(character);
		 for (Node node2 : linkedList) { 
			System.out.print(node2.dst);
		}
		 System.out.println();
		 }

	}

//	private static Character searchNode(char dst, LinkedList<Node> characterList,Node node) {
//		calls++;
//		if (node.src == dst)
//			return 'S';
//
//		if (start == end)
//			return src;
//		
//		
//		if(passed.contains(src))
//			return searchNode(characterList.get(start), dst, characterList, ++start, end);;
//		
//		passed.add(src);
//		LinkedList<Character> list = pairsMap.get(src);
//		if (list != null && list.size() > 0){
//			int newStart = 0;
//			return searchNode(list.get(newStart), dst, list, newStart++, list.size());
//		}
//
//		return searchNode(characterList.get(++start), dst, characterList, start, end);
//	}
	
	private static boolean searchNode(char src, char dst,Node node) {
		calls++;
		if (node.src == dst)
			return true;
		
		LinkedList<Node> childrens = pairsMap.get(src);
		
		if(childrens == null)
			return false;
		
		for (Node node2 : childrens) {
			if(!node2.visited){
				node.visited = true;
				return searchNode(node2.dst,dst, node2);
			}
		}
		return false;
	}

}
