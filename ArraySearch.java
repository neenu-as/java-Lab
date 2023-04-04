    import java.util.*;
    import java.util.Arrays;
    import java.util.Scanner;
    class ArraySearch
    {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements :");
    int size=sc.nextInt();
    int numbers[]=new int[size];
    System.out.print("\nEnter elements\n");
    for(int i=0;i<size;i++)
    {
    numbers[i]=sc.nextInt();
    }
    ArraySearch as=new ArraySearch();
    System.out.print("\nEnter the elements to search\n");
    int se=sc.nextInt();
    System.out.print("\n Choose search option");
    System.out.print("\n1.Linear Search\n2.Simple Binary Search\n3.Recursive Binary Search\n4.Built-in Binary Search method");
    System.out.print("\n Enter your option :");
    int opt=sc.nextInt();
    int result=-1;
    switch(opt)
     {
    case 1: result=as.linearSearch(se,numbers);
              break;
    case 2: Arrays.sort(numbers);
            result=as.simpleBinarySearch(se,numbers);
              break;
    case 3: Arrays.sort(numbers);
            result=as.recursiveBinarySearch(numbers,0,size-1,se);
              break;
    case 4: Arrays.sort(numbers);
            result=Arrays.binarySearch(numbers,se);
              break;          
     default:System.out.print("\nInvalid option!");
               break;
    }
    if(result>-1){
    System.out.println(se+"found:");
    }
    else{
    System.out.println(se+" not found:");
    }
    }
    //linear search function
     
    int linearSearch(int n,int[]numbers)
    {
    for(int i=0;i<numbers.length;i++)
    {
    if(numbers[i]==n)
    {
    return i;
    }
    }
    return -1;
    }
    //simple binary search function
     
    int simpleBinarySearch(int n,int[]numbers)
    {
    int first=0;
    int last=numbers.length -1;
    int mid=(first+last)/2;
    while(first<=last)
    {
    if(numbers[mid]<n)
    {
    first=mid+1;
    }
    else if(numbers[mid]>n)
    {
    last=mid-1;
    }
    else
    {
    return mid;
    }
    mid=(first+last)/2;
    }
    return -1;
    }
    //recursive binary search function
         
    int recursiveBinarySearch(int[]numbers,int first,int last,int x)
    {
    if(first<=last && first<numbers.length -1)
    {
    int mid=first+(last-first)/2;
    if(numbers[mid]<x)
     {
    return recursiveBinarySearch(numbers,mid+1,last,x);
     }
    if(numbers[mid]>x)
    {
    return recursiveBinarySearch(numbers,first,mid-1,x);
    }
    return mid;
    }
    return -1;
    }
    }


