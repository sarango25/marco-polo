package model;

public class Threads implements Runnable {
	
	Thread t;

	public Threads() {
		
		t = new Thread(this,"Hilo 1");
		t.start();
	}
	

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("valor:" + i);
		}

	}

}
