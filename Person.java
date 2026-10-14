public class Person {
    private String name;
    private int age;
    private int experience;

    public Person(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void printInfo() {
        System.out.println(name + ", возраст: " + age + ", стаж: " + experience + " г.");
    }

    public void haveBirthday() {
        age++;
        System.out.println(name + " отметил др, теперь ему " + age);
    }

    public void addExperience(int years) {
        experience += years;
        System.out.println("Стаж увеличен на " + years + ". Всего: " + experience);
    }
}
