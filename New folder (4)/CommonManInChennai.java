package tamilnadu.chennai;
public class CommonManInChennai implements TrafficRulesChennai

{
public static void main(String args[])
{
CommonManInChennai cc = new CommonManInChennai();
cc.trafficCommissioner();
cc.goByBicycle();
cc.goByDieselVehicle();
}
public void trafficCommissioner()
{
System.out.println("trafficCommissioner");
}
public void goByDieselVehicle()
{
System.out.println("4 wheeler");
}

public void goByBicycle()
{
System.out.println("ecofriendly");
}
}