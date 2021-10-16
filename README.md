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
```java
List<Person> list2 = new ArrayList<Person>();
list2.add(yamada2);
list2.add(new Person("鈴木", "次郎"));
list2.add(new Person("山中", "花子"));

// 読み出し
for (Person person : list2) {
    print(5, person.getName());
}
```

## 配列を List に
```java
String[] array1 = new String[] {"A","B","C","D","E"};
String[] array2 = {"F","G","H","I","J"};
var array3 = new String[] { "K", "L", "M", "N", "O" };

List<String[]> list5 = new ArrayList<String[]>();
list5.add(array1);
list5.add(array2);
list5.add(array3);

for (String[] strings : list5) {
    for (String data : strings) {
        print(14, data);
    }
}
```
