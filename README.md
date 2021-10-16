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
