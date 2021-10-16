public class Person {

    private String sei;
    private String mei;

    public Person(String sei, String mei) {
        super();
        this.sei = sei;
        this.mei = mei;
    }
    public Person() {
        super();
        this.sei = "";
        this.mei = "";
    }

    public String getName() {
        String result = String.format("%s %s", sei, mei);
        return result;
    }

}
