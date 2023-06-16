import java.util.Scanner;
class Fibonacci implements Runnable{
int limit,n1=1,n2=0,n3;
Fibonacci(int limit){
this.limit=limit;
}
public void run(){
try{
for(int i=0;i<=limit;i++){
n3=n1+n2;
System.out.println("Fibonacci number:"+n3);
n1=n2;
n2=n3;
Thread.sleep(500);
}
}
catch(InterruptedException e){
System.out.println("Fibonacci thread interrupted");
}
}
}
class EvenNumbers implements Runnable{
int lowerLimit,upperLimit;
EvenNumbers(int lower,int upper){
this.lowerLimit=lower;
this.upperLimit=upper;
}
public void run(){
try{
for(int i=lowerLimit;i<=upperLimit;++i){
if(i%2==0)
System.out.println("even numbers:"+i);
Thread.sleep(500);
}
}
catch(InterruptedException e){
System.out.println("Evennumbers thread interrupted");
}
}
}
class Threads{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the no:of fibonacci numbers:");
int f1=sc.nextInt();
Fibonacci fib=new Fibonacci(f1);
System.out.print("enter the range of even numbers:-\n Lower limit:");
int ll=sc.nextInt();
System.out.print("upper limit");
int ul=sc.nextInt();
EvenNumbers en=new EvenNumbers(ll,ul);
Thread f=new Thread(fib);
Thread e=new Thread(en);
f.start();
e.start();
}
}

