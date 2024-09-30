public class Main
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Bartek", "Kołakowski", 30);
        Person.Pet pet1 = person1.new Pet("Reksio");
        pet1.introduce();
    }
}