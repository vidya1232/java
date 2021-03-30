class VVV
{
public static void main(String args[])
{

VVV a = new VVV();
a.condition();
}
int Output = 10;
boolean b1 = false;
public void condition()
{
if((b1== true) && ((Output += 10) == 20))
{
System.out.println("We are equal " + Output);
}
else
{
System.out.println("Not equal! " + Output);
}
}
}