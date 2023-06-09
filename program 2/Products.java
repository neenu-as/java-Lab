import java.util.Scanner;
class Product {
int pcode,price;
String pname;
Product(int pcode,String pname, int price){
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
}
class Products {
public static void main (String [] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the product code");
int pcode= sc.nextInt();
System.out.println(" enter the product name");
String pname=sc.next();
System.out.println("enter the price ");
int price=sc.nextInt();
Product[]ps=new Product[3];
ps[0]=new Product(pcode,pname,price);
ps[1]= new Product(160,"book",200);
ps[2]=new Product(101,"box",250);
int minprice=ps[0].price;
System.out.println("\n pcode \t pname \t price");
System.out.println("\n..................");
for(Product p:ps)
{
System.out.println(p.pcode + "\t" + p.pname +"\t" + p.price);
if(minprice > p.price)
{
minprice =p.price;
}
}
System.out.println("\n..................");
System.out.println("lowest cost product");
System.out.println("\n..................");
for(Product p:ps)
{
if(minprice==p.price)
{
System.out.print("\n productcode:"+p.pcode);
System.out.print("\n productname:"+ p.pname);
System.out.print("\n price:"+p.price);
}
}
}
}





