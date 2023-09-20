package Person;
/**
 * Main - driver class
 */
public class Main {

	public static void main(String[] args)
	{		
		Person person = new Person();
		person.setName("johnmark");
		person.setAge(23);
		System.out.println(person.getName());
		person.isSitting();
	}
}

class Person
{
	private String name;
	private int age;

	Person(){
		this.name = "(nil)";
		this.age = 0;
	}

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	Person(Person person)
	{
		this.name = person.name;
		this.age = person.age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return this.name;
	}

	public int getAge()
	{
		return this.age;
	}
	void isSpeaking()
	{
		System.out.println("is speaking");
	}
	void isSitting()
	{
		System.out.println("is sitting");
	}
}
