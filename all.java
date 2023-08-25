import java.util.Scanner;
public class all{
public static void main(String[]args){
 Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter username");
String name = myObj.nextLine();
int sum = 0;

int avg = 0;
for(int i=0;i<5;i++){
System.out.println("Enter marks");
int mark = myObj.nextInt();
sum = sum+mark;
avg = sum/5;
}
System.out.println("Sum:"+sum);
System.out.println( "Avg:"+avg);
if(avg>90){
System.out.println("A");
}
else if(avg>80){
System.out.println("B");
}
else if(avg>70){
System.out.println("C");
}
else if(avg>60){
System.out.println("D");
}
else if(avg>50){
System.out.println("E");
}
else if(avg>40){
System.out.println("F");
}
else{
System.out.println("fail");
} 
}