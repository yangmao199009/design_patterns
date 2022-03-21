package abstractFactoryPattern;

public class LaptopFactory extends AbstractDeviceFactory{

	@Override
	Device getGadget(DeviceType deviceType) {
		// TODO Auto-generated method stub
	switch(deviceType) {
		case DELL:
			return new Dell("8gb", "Intel");
		case HP:
			return new HP("8gb","Samsung","GPU 3.0");
	}
	return null;
	
	}

}
