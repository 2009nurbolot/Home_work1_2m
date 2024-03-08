public class Dad extends GrandFather{
    private String carName;
    private Hebits hebits ;
    private House house ;
    private String job;

    public Dad(int age, String name, String carName, Hebits hebits, House house, String job) {
        super(age, name);
        this.carName = carName;
        this.hebits = hebits;
        this.house = house;
        this.job = job;
    }

    public String getCarName() {
        return carName;
    }

    public Hebits getHebits() {
        return hebits;
    }

    public House getHouse() {
        return house;
    }

    public String getJob() {
        return job;
    }
    public final void makeVoice(){
        System.out.println("Hello World");
    }

    public void makeVoice(String voice){
        System.out.println(voice);
    }

    public String getInfo() {
        return "Dad{" +
                "carName='" + getCarName() + '\'' +
                ", hebits=" + getHebits() +
                ", house=" + getHouse() +
                ", job='" + getJob() + '\'' +
                '}';
    }
}
