
public class Student {

int roll_no;
String name;
void insertRecord(int r,String n){
	roll_no=r;
	name=n;

}

void displayInformation(){System.out.println(roll_no+" "+name);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
s.insertRecord(2, "John");
s.displayInformation();
	}

}
