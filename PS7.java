import java.util.*;
import java.io.*;


class Student implements Comparable<Student> {
	public int id;
	public String name, email;

	public Student(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int compareTo(Student s) {
		if(id > s.id)
		{
			return 1;
		}
		else if(id < s.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}


public class PS7 {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);

		Set<Student> ts = new TreeSet<Student>();

		ts.add(new Student(1,"Student-1","student1@abc"));
		ts.add(new Student(2,"Student-2","student2@abc"));
		ts.add(new Student(3,"Student-3","student3@abc"));
		ts.add(new Student(4,"Student-4","student4@abc"));
		ts.add(new Student(5,"Student-5","student5@abc"));
		ts.add(new Student(5,"Student-6","student6@abc"));

		
		Iterator<Student> itr = ts.iterator();

		FileWriter fw = new FileWriter("students_data.csv");

		fw.write("ID" + "," + "NAME"+ "," + "EMAIL");
		fw.write("\n");

		while(itr.hasNext())
		{
			Student s = itr.next();

			System.out.println(s.id + " " + s.name + " " + s.email);

			fw.write(s.id + "," + s.name + "," + s.email);
			fw.write("\n");
		}

		fw.close();
	}	
}