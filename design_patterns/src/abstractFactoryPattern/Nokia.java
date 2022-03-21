package abstractFactoryPattern;

public class Nokia extends Device {

	private String ram;
	private String processor; 
	
	public Nokia(String ramSize, String processor) {
		this.ram=ramSize;
		this.processor=processor;
	}
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Dell config is ram size:"+this.ram+" "+"processor is "+this.processor;
	}
}
