public class NameInfo {

    private int year;
    private String name;
    private int count;
    private String sex;

    public NameInfo(int year, String name, int count, String sex) {
        this.year = year;
        this.name = name;
        this.count = count;
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
