public class Person
{
    public static int nextId = 0;
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        nextId++;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public class Pet
    {
        private String nickname;

        public Pet(String nickname)
        {
            this.nickname = nickname;
        }

        public void introduce()
        {
            System.out.println("My nickname is " + nickname + " and my owner's name is " + name + " and his ID is " + nextId);
        }
    }
}