import java.util.*;


class Student {
	public String f_name, l_name;

	public Student(String f_name, String l_name) {
		this.f_name = f_name;
		this.l_name = l_name;
	}
}

public class PS5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int i,j;

		System.out.print("ENTER NUM OF ELEMENTS IN LIST-A = ");

		int len_a = sc.nextInt();

		ArrayList<Student> list_a = new ArrayList<Student>();

		System.out.println("LIST - A\n");

		for(i=0;i<len_a;i++)
		{
			System.out.print("ENTER FIRST-NAME = ");
			String f_name = sc.next();

			System.out.print("ENTER LAST-NAME = ");
			String l_name = sc.next();

			list_a.add(new Student(f_name,l_name));

			System.out.println();
		}

		System.out.print("ENTER NUM OF ELEMENTS IN LIST-B = ");

		int len_b = sc.nextInt();

		ArrayList<Student> list_b = new ArrayList<Student>();

		System.out.println("LIST - B\n");

		for(i=0;i<len_b;i++)
		{
			System.out.print("ENTER FIRST-NAME = ");
			String f_name = sc.next();

			System.out.print("ENTER LAST-NAME = ");
			String l_name = sc.next();

			list_b.add(new Student(f_name,l_name));

			System.out.println();
		}


		System.out.println("UNION OF TWO LISTS");

		ArrayList<Student> list_c = new ArrayList<Student>();

		for(i=0;i<list_a.size();i++)
		{
			Student item=list_a.get(i);

			int flag=0;

			for(j=0;j<list_c.size();j++)
			{
				if(list_c.get(j).f_name.equals(item.f_name) && list_c.get(j).l_name.equals(item.l_name))
				{
					flag=1;
					break;
				}
			}

			if(flag==0)
			{
				list_c.add(item);
			}
		}
		for(i=0;i<list_b.size();i++)
		{
			Student item=list_b.get(i);

			int flag=0;

			for(j=0;j<list_c.size();j++)
			{
				if(list_c.get(j).f_name.equals(item.f_name) && list_c.get(j).l_name.equals(item.l_name))
				{
					flag=1;
					break;
				}
			}

			if(flag==0)
			{
				list_c.add(item);
			}
		}

		for(i=0;i<list_c.size();i++)
		{
			Student item=list_c.get(i);

			System.out.println("FIRST NAME = " + item.f_name + " LAST NAME = " + item.l_name);
		}


		System.out.println("\nSEARCHING IN LIST\n");

		System.out.print("ENTER FIRST-NAME = ");

		String f_name = sc.next();

		System.out.print("ENTER LAST-NAME = ");

		String l_name = sc.next();

		Iterator itr = list_c.iterator();

		/*while(itr.hasNext()) {
			System.out.println(itr.next().f_name);
		}*/

		System.out.println();

		for(i=0;i<list_c.size();i++)
		{
			Student item=list_c.get(i);

			if(item.f_name.equals(f_name) || item.l_name.equals(l_name))
			{
				System.out.println("FIRST NAME = " + item.f_name + " LAST NAME = " + item.l_name);
			}
		}
	}	
}