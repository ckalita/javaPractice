package Thread;

class Printer{
	int n = 10;
	int count =1;
	
	public synchronized void printOdd() {
		while(count < n) {
			while(count%2 !=1) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" : "+count++);
			notify();
		}
	}
	
	public synchronized void printEven() {
		while(count < n) {
			while(count%2 !=0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" : "+count++);
			notify();
		}
	}
}


class PrintOddNum implements Runnable{
	Printer printer;
	
	public PrintOddNum(Printer printer){
		this.printer = printer;
	}
	
	public void run() {
		
		printer.printOdd();
	}
}

class PrintEvenNum implements Runnable{
	
	Printer printer;
	
	public PrintEvenNum(Printer printer){
		this.printer = printer;
	}
	
	public void run() {
		
		printer.printEven();
	}
}

public class PrintOddEven {
	

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		PrintEvenNum printEvenNum = new PrintEvenNum(printer);
		PrintOddNum printOddNum = new PrintOddNum(printer);
		
		Thread odd = new Thread(printOddNum);
		Thread even = new Thread(printEvenNum);
		
		odd.start();
		even.start();
	}

}
