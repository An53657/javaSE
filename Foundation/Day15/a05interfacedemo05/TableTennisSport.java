package a05interfacedemo05;

public class TableTennisSport extends Sport implements English {
    public TableTennisSport() {
    }

    public TableTennisSport(String name, int age) {
        super(name, age);
    }

    @Override
    public void english() {
        System.out.println("乒乓球运动员在学英语");
    }

    @Override
    public void stundy() {
        System.out.println("乒乓球运动员在学怎么打乒乓球");
    }
}
