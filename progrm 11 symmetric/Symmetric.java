import java.util.Scanner;
class Symmetric{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the size of the squre matrix:");
int s = sc.nextInt();
int[][] mat1 = new int[s][s];
System.out.println("enter the matrix:");
for(int i=0;i<s;i++){
for(int j=0; j<s;j++){
mat1[i][j]=sc.nextInt();
}
}
System.out.println("matrix:");
for(int i=0;i<s;i++){
for(int j=0;j<s;j++){
System.out.print(mat1[i][j]+"\t");
}
System.out.println();
}
for(int i=0;i<s;i++){
for(int j=0;j<s;j++){
if(mat1[i][j]!=mat1[j][i]){
System.out.println("matrices are not Symmetric:");
return;
}
}
}
System.out.println("matrices are Symmetric:");
}
}

