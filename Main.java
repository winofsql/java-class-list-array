import java.util.*;

public class Main {

    private static Scanner pause = new Scanner(System.in);

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

    private static void print(int no, String out) {
        System.out.print(String.format("%d : %s", no, out));
        pause.nextLine();
    }

    public Main() {
        super();
    }

    public static void main(String[] args) {

        // 基本となるこの Main クラスのインスタンスを作成
        Main main = new Main();
        print(1, main.toString());

        // 内部にあるクラスの作成
        InnerMain yamada1 = main.new InnerMain("山田", "太郎");
        print(2, yamada1.toString());

        // 内部にあるクラス用の List
        List<InnerMain> list1 = new ArrayList<InnerMain>();
        list1.add(yamada1);
        list1.add(main.new InnerMain("鈴木", "次郎"));
        list1.add(main.new InnerMain("山中", "花子"));
        // 山田太郎
        print(3, list1.get(0).getName());

        // 外部にある通常クラスの作成
        Person yamada2 = new Person("山田", "太郎");
        print(4, yamada2.toString());

        // 外部にあるクラス用の List
        List<Person> list2 = new ArrayList<Person>();
        list2.add(yamada2);
        list2.add(new Person("鈴木", "次郎"));
        list2.add(new Person("山中", "花子"));

        // 読み出し
        for (Person person : list2) {
            print(5, person.getName());
        }

        // 山田 太郎の Person オブジェクト で存在チェック
        if (list2.contains(list2.get(0))) {
            print(6, "山田さん居てます");
        }

        // 山田 太郎の Person オブジェクト の一致
        if (list2.get(0).equals(yamada2)) {
            print(7, "山田さんです");
        }

        // Person オブジェクトの配列を List から固定的に作成
        var pArray = new Person[] { list2.get(2), list2.get(1), list2.get(0) };
        for (Person person : pArray) {
            print(8, person.getName());
        }

        List<String> list3 = new ArrayList<String>();
        list3.add("Java");
        list3.add("csharp");
        list3.add("PHP");
        print(9, list3.get(0).getClass().getSimpleName());

        List list4 = new ArrayList();
        list4.add("Java");
        list4.add("csharp");
        list4.add("PHP");
        print(10, list4.get(0).getClass().getSimpleName());

        String[] array1 = new String[] {"A","B","C","D","E"};
        String[] array2 = {"F","G","H","I","J"};
        var array3 = new String[] { "K", "L", "M", "N", "O" };

        for (int i = 0; i < array3.length; i++) {
            print(11, array3[i]);
        }

        for (String string : array3) {
            if (string.equals("M")) {
                print(12, "真ん中");
            } else {
                print(13, "その他");
            }
        }

        List<String[]> list5 = new ArrayList<String[]>();
        list5.add(array1);
        list5.add(array2);
        list5.add(array3);

        for (String[] strings : list5) {
            for (String data : strings) {
                print(14, data);
            }
        }

    }

}