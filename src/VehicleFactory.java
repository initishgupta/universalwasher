
public class VehicleFactory {
	
	public static Vehicle getVehicle(String vehiclename)
	{
		if(vehiclename.equals("car"))
			return new Car();
		else if(vehiclename.equals("bus"))
			return new Bus();
		else if(vehiclename.equals("aeroplane"))
			return new Aeroplane();
		return null;
		
	}

}
