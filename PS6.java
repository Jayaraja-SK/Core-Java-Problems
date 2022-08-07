import java.util.*;


class Student {
	public String name, email;

	public Student(String name, String email) {
		this.name = name;
		this.email = email;
	}
}




public class PS6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer,Student> map = new HashMap<Integer,Student>();

		map.put(1,new Student("Student-2","student2@abc"));
		map.put(2,new Student("Student-1","student1@abc"));
		map.put(3,new Student("Student-3","student3@abc"));
		map.put(4,new Student("Student-4","student4@abc"));
		map.put(5,new Student("Student-5","student5@abc"));

		System.out.println("SEARCH BY KEY\n");

		System.out.print("ENTER KEY = ");

		int key = sc.nextInt();

		if(map.containsKey(key))
		{
			System.out.println("VALUE = " + map.get(key).name + " " + map.get(key).email);
		}
		else
		{
			System.out.println("KEY NOT FOUND");
		}


		System.out.println("\nSEARCH BY NAME\n");

		System.out.print("ENTER NAME = ");

		String name = sc.next();

		System.out.println();

		for(Map.Entry<Integer,Student> m:map.entrySet())
		{
			Student s = m.getValue();

			if(s.name.equals(name))
			{
				System.out.println(m.getKey() + " " + s.name + " " + s.email);
			}
		}



		System.out.println("\nSEARCH BY EMAIL\n");

		System.out.print("ENTER EMAIL = ");

		String email = sc.next();

		System.out.println();

		for(Map.Entry<Integer,Student> m:map.entrySet())
		{
			Student s = m.getValue();

			if(s.email.equals(email))
			{
				System.out.println(m.getKey() + " " + s.name + " " + s.email);
			}
		}


		System.out.println("\nSORT BY NAME\n");

		Comparator<Map.Entry<Integer, Student>> valueComparator1 = new Comparator<Map.Entry<Integer, Student>>() 
		{ 
			public int compare(Map.Entry<Integer, Student> e1, Map.Entry<Integer, Student> e2)
			{ 
				Student v1 = e1.getValue();
				Student v2 = e2.getValue();

				return v1.name.compareTo(v2.name); 
			}
		};

		Set<Map.Entry<Integer, Student>> byName = map.entrySet();

		List<Map.Entry<Integer, Student>> byNameEntries = new ArrayList<Map.Entry<Integer, Student>>(byName);

		Collections.sort(byNameEntries, valueComparator1);


		for(Map.Entry<Integer,Student> m:byNameEntries)
		{
			Student s = m.getValue();

			System.out.println(m.getKey() + " " + s.name + " " + s.email);
		}


		System.out.println("\nSORT BY EMAIL\n");

		Comparator<Map.Entry<Integer, Student>> valueComparator2 = new Comparator<Map.Entry<Integer, Student>>() 
		{ 
			public int compare(Map.Entry<Integer, Student> e1, Map.Entry<Integer, Student> e2)
			{ 
				Student v1 = e1.getValue();
				Student v2 = e2.getValue();

				return v1.email.compareTo(v2.email); 
			}
		};

		System.out.println();

		Set<Map.Entry<Integer, Student>> byEmail = map.entrySet();

		List<Map.Entry<Integer, Student>> byEmailEntries = new ArrayList<Map.Entry<Integer, Student>>(byEmail);

		Collections.sort(byEmailEntries, valueComparator2);


		for(Map.Entry<Integer,Student> m:byEmailEntries)
		{
			Student s = m.getValue();

			System.out.println(m.getKey() + " " + s.name + " " + s.email);
		}
	}	
}