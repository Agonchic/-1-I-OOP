public class TeamLead extends Developer {
    private int teamCount;
    private int stress;
    private boolean onMeeting;

    public TeamLead(String name, int age, int experience, String language, String grade, int teamCount) {
        super(name, age, experience, language, grade);
        this.teamCount = teamCount;
        this.stress = 10;
        this.onMeeting = false;
    }

    public int getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(int teamCount) {
        this.teamCount = teamCount;
    }

    public int getStress() {
        return stress;
    }

    public void setStress(int stress) {
        this.stress = stress;
    }

    public boolean isOnMeeting() {
        return onMeeting;
    }

    public void setOnMeeting(boolean onMeeting) {
        this.onMeeting = onMeeting;
    }

    public void checkCode(Developer dev) {
        System.out.println(getName() + " смотрит код от " + dev.getName());
        if (dev.getBugs() > 0) {
            stress += 5;
            System.out.println("Код с ошибками, отправлен на переделку. Стресс: " + stress);
        } else {
            System.out.println("Код утвержден");
        }
    }

    public void startMeeting() {
        onMeeting = true;
        System.out.println(getName() + " зашел на созвон с командой из " + teamCount + " человек");
    }

    public void endMeeting() {
        onMeeting = false;
        stress += 2;
        System.out.println("Встреча закончилась. Стресс: " + stress);
    }
}
