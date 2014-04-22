
package com.rmuti.datastructure;

import java.util.Stack;


public class ArrayListStack {

	public static void main(String[] args) {
		Stack <String> s = new Stack<String>();
		 s.add("[a]");
		 s.add("[b]");
 
		while (!s.isEmpty()){
		 System.out.println(s.pop()) ;
		 }
	}

	public static int Pop(Stack<Integer> s){
		Stack <Integer> Backup = new Stack <Integer>();
		int ValuePop = s.pop();
		Backup.push(ValuePop);
		
		while (!s.isEmpty()){
			 int next = s.pop();
			 Backup.push(next);
			 ValuePop = Math.max(ValuePop, next);
		 }
		while (!Backup.isEmpty()){
			s.push(Backup.pop());
	}
	return ValuePop;
}
}

