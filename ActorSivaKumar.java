public class ActorSivaKumar implements Actor
{
 static String address = "coimbatore";
int age;
String car;
public ActorSivaKumar()
{
	System.out.println("hi");
}
public ActorSivaKumar(int age, String car)
{
this.age = age;
this.car = car;	
}
public static void main(String args[])
{
ActorSivaKumar as = new ActorSivaKumar(65,"Audicar");
//as.act();
//as.dance();
//as.sing();
as.address();
Actor ac = new ActorSivaKumar();
ac.address();
as.act();
as.dance();
as.sing();

}
 public void act()
{
System.out.println("acting");
}
public void dance()
{
System.out.println("dance is avgerage ");
}
public void sing()
{
System.out.println("no singing");
}
public void speaking()
{
	
}
public void address()
{
System.out.println(Actor.address);
System.out.println(address);	
}


}
