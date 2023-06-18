package testPackage;

import org.testng.annotations.Test;

import pck1.RecentlyPlayed;

public class Test1 {
	@Test
	public void tc1() throws Exception {
		RecentlyPlayed rp=new RecentlyPlayed(3);
		rp.addSong("s1");
		rp.addSong("s2");
		rp.addSong("s3");
		rp.peekQueue();
	}
	@Test
	public void tc2() throws Exception {
		RecentlyPlayed rp=new RecentlyPlayed(3);
		rp.addSong("s1");
		rp.addSong("s2");
		rp.addSong("s3");
		rp.addSong("s4");
		rp.peekQueue();
	}
	@Test
	public void tc3() throws Exception {
		RecentlyPlayed rp=new RecentlyPlayed(-1);
		rp.peekQueue();
	}

}
