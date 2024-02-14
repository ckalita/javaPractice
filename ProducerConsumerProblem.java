class Item{
	private int x;
	boolean produced = false;
	
	public synchronized void put(int x) {
		while(produced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Produced : "+x);
		this.x = x;
		produced = true;
		notify();
	}
	
	public synchronized void get() {
		while(!produced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("consumed : "+x);
		produced = false;
		notify();
	}
}

class Producer implements Runnable {
	Item item;
	
	Producer(Item item){
		this.item = item;
	}
	
	public void run() {
		for(int i = 0; i<=10; i++) {
			item.put(i);		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	Item item;
	
	Consumer(Item item){
		this.item = item;
	}
	
	public void run() {
		while(true) {
			item.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Item item = new Item();
		Producer producer = new Producer(item);
		Consumer consumer = new Consumer(item);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);

		t1.start();
		t2.start();
	}
}
