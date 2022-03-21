package abstractFactoryPattern;

public class FactoryGenerator {
	public static AbstractDeviceFactory getFactory(FactoryType factorytype) {
		switch(factorytype){
			case Mobile:
				return new MobileFactory();
			case Laptop:
				return new LaptopFactory();
		}
		return null;
	}
}
