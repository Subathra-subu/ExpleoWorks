package queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
		
		priorityQueue.add("k");
		priorityQueue.add("h");
		priorityQueue.add("f");
		priorityQueue.add("d");
		priorityQueue.add("a");
		priorityQueue.add("q");
		priorityQueue.add("t");
		
		System.out.print(priorityQueue);
		
		priorityQueue.remove("q");
		
		while(!priorityQueue.isEmpty()) {
			System.out.print(priorityQueue.poll()+" ");
		}
		
		System.out.print(priorityQueue);

	}

}
