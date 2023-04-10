class Publisher{
String PubName;
Publisher(String PubName){
this.PubName=PubName;
}
void display(){
System.out.println("publisher\t:"+PubName);
}
}
class Book extends Publisher{
String title;
String author;
Book(String PubName,String title,String author){
super(PubName);
this.title=title;
this.author=author;
}
void display(){
super.display();
System.out.println("title\t\t:"+title);
System.out.println("author\t\t:"+author);
}
}
class Literature extends Book{
String type;
Literature(String PubName, String title,String author,String type){
super(PubName,title,author);
this.type=type;
}
void display(){
super.display();
System.out.println("type:\t\t:"+type);
}
}
class Fiction extends Book{
String genre;
Fiction(String PubName,String title,String author,String genre){
super(PubName,title,author);
this.genre=genre;
}
void display(){
super.display();
System.out.println("genre \t\t:"+genre);
}
}
class Books{
public static void main(String[]args){
Literature[]l=new Literature[2];
Fiction[]f=new Fiction[2];
l[0]=new Literature("harpercollins","the alchemist","paulo coelho","drama");
l[1]=new Literature("D.C Books","aarachaar","K.R meera","drama");
f[0]=new Fiction("casel","macbeth","willean shakspere","tragedy");
f[1]=new Fiction("penguin books","the legend of books","vijayan","magical realism");
System.out.println("\t Literature");
for(int i=0;i<l.length;i++)
{
System.out.println("###"+(i+1));
l[i].display();
}
System.out.println("\t fiction ");
for(int i=0;i<f.length;i++)
{
System.out.println("###"+(i+1));
f[i].display();
}
}
}

