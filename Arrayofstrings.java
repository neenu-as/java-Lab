import java.util.Scanner;
import java.util.Arrays;
 
class Arrayofstrings {

public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the no:of strings:");
int size =sc.nextInt();
String[] strings=new String[size];
System.out.println("enter the strings:");
for(int i=0;i<size;i++)
{
strings[i]=sc.next();
}
System.out.println(" choose:\n 1.build in method \n 2.user defind method");
System.out.println(" option:");
int opt= sc.nextInt();
switch (opt)
{
case 1: // build in fuction to sort
        Arrays.sort(strings);
        break;
case 2:// user definf fuction
       String temp;
       for(int i=0;i<size-1;i++){
       for(int j=i+1;j<size;j++){
if(strings[i].compareTo(strings[j])>0) {
       // swapping strings [i] and string [j]
       temp=strings[i];
       strings[i]=strings[j];
       strings[j]=temp;
       }}}
       break;
default:System.out.println("invalid option");
       break;
       }
       for (int i=0;i<size;i++){
       System.out.println(strings[i]);
       }} }         
