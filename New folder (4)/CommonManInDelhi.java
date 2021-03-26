package india.newDelhi;
public class CommonManInDelhi implements TrafficRulesChennai,TrafficRulesChennai
{
	public static void main(String args[])
{
CommonManInDelhi cmd = new CommonManInDelhi();
cmd.dontgoByDieselVehicle();
cmd.goByBicycle();
cmd.goByDieselVehicle();
}
void dontgoByDieselVehicle()
{
System.out.println("hi");
}
void goByBicycle()
{
System.out.println("trafficCommissioner");	
}
public void goByDieselVehicle()
{
System.out.println("4 wheeler");
}

}
