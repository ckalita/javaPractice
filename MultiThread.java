class Printer{
	int x=10;
	boolean isProduced = false;
	
	int counter=1;
	
	public synchronized void producedEven() throws InterruptedException {
		while(counter <= x) {
			while(counter%2 !=0) {
				wait();
			}
			System.out.println(Thread.currentThread().getName()+": producedEven : "+counter++);
			notify();
		}
	}
	
	public synchronized void producedOdd() throws InterruptedException {
		while(counter <= x) {
			while(counter%2 !=1) {
				wait();
			}
			System.out.println(Thread.currentThread().getName()+": producedOdd : "+counter++);
			notify();
		}
	}
}

class Producer1 implements Runnable{
	Printer printer;
	
	public Producer1(Printer printer) {
		this.printer = printer;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			try {
				printer.producedEven();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


class Consumer1 implements Runnable{
	Printer printer;
	
	public Consumer1(Printer printer) {
		this.printer = printer;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				printer.producedOdd();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer printer = new Printer();
		
		Producer1 producer = new Producer1(printer);
		Consumer1 consumer = new Consumer1(printer);
		
		Thread producerTh = new Thread(producer);
		Thread consumerTh = new Thread(consumer);
		
		producerTh.start();
		consumerTh.start();
		
	}

}
