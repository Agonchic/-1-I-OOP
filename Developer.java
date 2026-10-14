public class Developer extends Person {
    private String language;
    private String grade;
    private int bugs;

    public Developer(String name, int age, int experience, String language, String grade) {
        super(name, age, experience);
        this.language = language;
        this.grade = grade;
        this.bugs = 0;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getBugs() {
        return bugs;
    }

    public void setBugs(int bugs) {
        this.bugs = bugs;
    }

    public void writeCode(int lines) {
        System.out.println(getName() + " написал " + lines + " строк на " + language);
        if (lines > 100) {
            bugs += 2;
        } else {
            bugs++;
        }
    }

    public void fixBug() {
        if (bugs > 0) {
            bugs--;
            System.out.println("Баг исправлен. Осталось: " + bugs);
        } else {
            System.out.println("Багов нет");
        }
    }

    public void upgradeGrade(String newGrade) {
        grade = newGrade;
        System.out.println(getName() + " повышен до " + grade);
    }
}
