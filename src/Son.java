public final class Son extends Dad{

    private String schoolName;

    public Son(int age, String name, String carName, Hebits hebits, House house, String job, String schoolName) {
        super(age, name, carName, hebits, house, job);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public void makeVoice(String voice) {
        super.makeVoice(voice);
    }

    public String getInfo() {
        return "Son{" +
                "schoolName='" + getSchoolName() + '\'' +
                " carName='" + getCarName() + '\'' +
                ", hebits=" + getHebits() +
                ", house=" + getHouse() +
                ", job='" + getJob() + '\'' +
                '}';
    }
}
