package singletonPattern;

public class Singleton {
	private static Singleton instance; 
	private String data; 
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	private Singleton(String data) {
		this.data = data; 
	}
	
	public static Singleton getInstance(String data) {
		
		if(instance==null) {
			instance = new Singleton(data); 
		}
		
		return instance;
	}
}
