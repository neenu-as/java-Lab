interface Student {
int score =10;
void displayscore();
}
interface Sports{
int score=25;
void displaySportscore();
}
class Result implements Student,Sports{
public void displayscore (){
System.out.println("ACADEMIC SCORE:"+Student.score);
}
public void displaySportscore(){
System.out.println("Sports score:"+Sports.score);
}
}
class SportStudent{
public static void main(String[]args){
Result r=new Result();
r.displayscore();
r.displaySportscore();
}
}

