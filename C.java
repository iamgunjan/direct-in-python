import java.util.Scanner;
class C
{
String mname,mtype,mbrach;

void getdata()
{
Scanner ob=new Scanner(System.in);
System.out.println("enter the machine name ");
mname=ob.nextLine();
System.out.println("enter the machine type ");
mtype=ob.nextLine();
System.out.println("enter the machine branch");
mbrach=ob.nextLine();
}
void display()
{
System.out.println("the machine name is "+mname+" machine type is "+mtype+" machine branch "+mbrach);
}
}
class D extends C
{
int mprice,mresell,mmp;
void getdata1()
{
Scanner ob1=new Scanner(System.in);
System.out.println("enter the price of the machine brought");
mprice=ob1.nextInt();
System.out.println("enter the resell value ");
mresell=ob1.nextInt();
System.out.println("enter the market price");
mmp=ob1.nextInt();
}
}
class E extends D
{
String status;
void cal()
{
Scanner ob2=new Scanner(System.in);
System.out.println(" enter the status");
status=ob2.nextLine();
if(status=="good")
{
System.out.println(" no need to sell");
}
else
{ 
System.out.println("the price brought is ="+mprice+" the re sell value is "+mresell+" the selling price is = "+mmp);
 }
}
}

