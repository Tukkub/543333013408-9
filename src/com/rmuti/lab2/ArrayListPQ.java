package com.rmuti.lab2;


import java.util.ArrayList;
import java.util.PriorityQueue;

public class ArrayListPQ {
	
private ArrayList<Object> lst;

public ArrayListPQ() {
lst = new ArrayList<Object>();
 }

public void enqueue(Object e) {
lst.add(lst.size(), e);
 }

 public Object dequeue() {
  int maxIndex = maxIndex();
  Object maxObj = lst.get(maxIndex);
  lst.remove(maxIndex);
  return maxObj;
  }

  public Object peek() {
   return lst.get(maxIndex());
   }

  private int maxIndex() {
  int max = 0;
  for (int i = 0; i < lst.size(); i++) {
   Comparable<Object> d = (Comparable<Object>) lst.get(i);
    	Object maxObj = lst.get(max);
   if (d.compareTo(maxObj) > 0) {
    max = i;
    }
    }
  
    return max;

 }


	public static void main(String[] args) {
		Car a1 = new Car("Porsche",3,15400000 );
		Car b2 = new Car("Bugatti ",2,41721995 );
		Car c3 = new Car("Lamborghini",1,45000000);
		
		
		PriorityQueue<Car> Way = new PriorityQueue<Car> ();
		Way.add(a1);
		Way.add(b2);
		Way.add(c3);
		
		int count = 1;
		
		while (!Way.isEmpty()){		
			System.out.println("PQ"+ count +"-->"+Way.remove());
			count++;	
			System.out.println();
		}
			
	}
	}
	