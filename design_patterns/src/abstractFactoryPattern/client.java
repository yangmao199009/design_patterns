package abstractFactoryPattern;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device dell = FactoryGenerator.getFactory(FactoryType.Laptop).getGadget(DeviceType.DELL);
		
		System.out.println(dell.getDetails());
	}

}
