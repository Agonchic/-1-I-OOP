public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Артем", 21, 1, "Java", "Junior");
        TeamLead lead = new TeamLead("Максим", 28, 6, "Java", "Senior", 4);

        dev.printInfo();
        lead.printInfo();

        dev.writeCode(150);
        lead.checkCode(dev);

        dev.fixBug();
        dev.fixBug();
        lead.checkCode(dev);

        lead.startMeeting();
        lead.endMeeting();
    }
}
