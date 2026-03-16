package queue;

import java.util.PriorityQueue;

public class TaskMain {

	public static void main(String[] args) {
		
		PriorityQueue<Task> priorityQueue = new PriorityQueue<Task>();
		
		priorityQueue.add(new Task("Task 1", 1));
		
		priorityQueue.add(new Task("Task 2", 3));
		
		priorityQueue.add(new Task("Task 3", 2));
		
		
		while(!priorityQueue.isEmpty()) {
			
			Task task = priorityQueue.poll();
			
			System.out.print("Task name: "+task.getName()+" Priority: "+task.getPriority()+"\n");
		}
	}

}
