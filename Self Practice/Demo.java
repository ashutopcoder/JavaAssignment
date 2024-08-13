//Producer Consumer 

class Company{
	int x;
	boolean f=false;
	//f = false chance Producer
	//f = true chance consumer
	
	synchronized public void Produce_item(int x){
		if(f){
			try{
			wait();}catch(Exception e){}
		}
			this.x=x;
			System.out.println("Produced : "+x);
			f=true;
			notify();
	}
	synchronized public void Consume_item(){
		if(!f){
			try{
			wait();}catch(Exception e){}
		}
		System.out.println("Consume : "+x);
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
			obj.Consume_item();
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
			obj.Produce_item(i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
			i++;
		}
	}
}

class Demo{
	public static void main(String args[]){
		Company comp=new Company();
		Producer p=new Producer(comp);
		Consumer c=new Consumer(comp);
		p.start();
		c.start();
	}
}