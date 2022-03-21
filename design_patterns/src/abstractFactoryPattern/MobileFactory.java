package abstractFactoryPattern;

public class MobileFactory extends AbstractDeviceFactory {

	@Override
	Device getGadget(DeviceType deviceType) {
		// TODO Auto-generated method stub
		switch(deviceType) {
		case NOKIA:
			return new Dell("8gb", "NOKIA");
		 
		}
	return null;
	}

}
