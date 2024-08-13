//

import java.util.LinkedList;
class PandC{
	private static final int range = 5;
	private static final LinkedList<Integer> buffer = new LinkedList<>();
	static class Producer implements Runnable{
		public void run(){
			int x = 1;
			while(true){
				synchronized(buffer){
					while(buffer.size() == range){
						try{
							buffer.wait();
						}catch(Exception e){}
					}
					System.out.println("Produced Product : "+x);
					buffer.add(x++);
					buffer.notify();
					try{Thread.sleep(1000);}catch(Exception e){}
				}
			}
		}
	}
	static class Consumer implements Runnable{
		public void run(){
			while(true){
				synchronized(buffer){
					while(buffer.isEmpty()){
						try{
							buffer.wait();
						}catch(Exception e){}
					}
					int x = buffer.poll();
					System.out.println("Consumed Product : "+x);
					buffer.notify();
					try{Thread.sleep(1000);}catch(Exception e){}
				}
			}
		}
	}
	public static void main(String[] args){
		Thread PT = new Thread(new Producer());
		Thread CT = new Thread(new Consumer());
		PT.start();
		CT.start();
	}
}