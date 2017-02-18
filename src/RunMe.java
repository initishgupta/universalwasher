
public class RunMe {

	public static void main(String[] args)
	{
		Vehicle vehicle = VehicleFactory.getVehicle("car");
		vehicle.wash();
		vehicle = VehicleFactory.getVehicle("bus");
		vehicle.wash();
		vehicle = VehicleFactory.getVehicle("aeroplane");
		vehicle.wash();
	}
	
}
