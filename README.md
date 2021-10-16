# java-class-list-array

## 1 : Class 内の Class
```java
public class Main {

    private class InnerMain {
        private String sei;
        private String mei;

        public InnerMain(String sei, String mei) {
            super();
            this.sei = sei;
            this.mei = mei;
        }

        public String getName() {
            String result = String.format("%s %s", sei, mei);
            return result;
        }

    }

}
```
### Main main = new Main();
### InnerMain yamada1 = main.new InnerMain("山田", "太郎");

## 2 : 普通の Class : Person.java
```java
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
```
### Person yamada2 = new Person("山田", "太郎");
