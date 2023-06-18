package pck1;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class RecentlyPlayed{
	private int capacity;
	private Queue<String> q;
	public RecentlyPlayed(int capacity) {
		this.capacity=capacity;
		q=new ArrayBlockingQueue<String>(this.capacity);
	}
	public void addSong(String song) {
		if(q.size()==this.capacity) {
			q.remove();
		}
		q.add(song);
		
	}
	public void peekQueue() throws Exception {
		System.out.println(q);
	}
	
}
