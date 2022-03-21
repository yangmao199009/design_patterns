package abstractFactoryPattern;

public class HP extends Device{
	private String ram;
	private String processor; 
	private String GPU; 
	
	public HP(String ramSize, String processor, String GPU) {
		this.ram=ramSize;
		this.processor=processor;
		this.GPU=GPU;
	}
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Dell config is ram size:"+this.ram+" "+"processor is "+this.processor;
	}

}
