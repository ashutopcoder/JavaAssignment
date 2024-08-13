//Producer Consumer Question :

 
class Company{
	int n;
	boolean f=false;
	//f=false chance for Producer...
	//f=true chance consumer...
	synchronized public void produce_item(int n){
		if(f){
			try{wait();}catch(Exception e){}
		}
		this.n=n;
		System.out.println("Produced : "+n);
		f=true;
		notify();
	}
	synchronized public void consume_item(){
		if(!f){
			try{wait();}catch(Exception e){}
		}
		System.out.println("Consumed : "+n);
		f=false;
		notify();
	}
}
class Consumer extends Thread{
	private Company obj;
	Consumer(Company obj){
		this.obj=obj;
	}
	public void run(){
		while(true){
			obj.consume_item();
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
		}
	}
}

class Producer extends Thread{
	private Company obj;
	Producer(Company obj){
		this.obj=obj;
	}
	public void run(){
		int i=1;
		while(true){
			obj.produce_item(i);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){}
			i++;
		}
	}
}
class Main{
	public static void main(String args[]){
		Company comp=new Company();
		Producer p=new Producer(comp);
		Consumer c=new Consumer(comp);
		p.start();
		c.start();
	}
}