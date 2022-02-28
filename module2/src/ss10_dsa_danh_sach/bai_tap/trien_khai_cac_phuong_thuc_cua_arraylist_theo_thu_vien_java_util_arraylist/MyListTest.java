package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien_java_util_arraylist;

public class MyListTest {
    private int id;

    private String name;

    public MyListTest() {
    }

    public MyListTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        MyListTest myListTest1 = new MyListTest(1,"Nguyễn Văn Thông");
        MyListTest myListTest2 = new MyListTest(2,"Nguyễn Văn A");
        MyListTest myListTest3 = new MyListTest(3,"Nguyễn Văn B");
        MyListTest myListTest4 = new MyListTest(4,"Nguyễn Văn V");
        MyListTest myListTest5 = new MyListTest(5,"Nguyễn Văn E");
        MyListTest myListTest6 = new MyListTest(6,"Nguyễn Văn Thông2");

        MyList<MyListTest> myListTestMyList = new MyList<>();
        myListTestMyList.add(myListTest1);
        myListTestMyList.add(myListTest2);
        myListTestMyList.add(myListTest3);
        myListTestMyList.add(myListTest4);
        myListTestMyList.add(myListTest5);
        myListTestMyList.add(myListTest6, 0);
        myListTestMyList.size();
        System.out.println(myListTestMyList.size());

//        for (int i = 0; i < myListTestMyList.size() ; i++) {
//            MyListTest myListTest = (MyListTest) myListTestMyList.elements[i];
//            System.out.println(myListTest.getId());
//            System.out.println(myListTest.getName());
//        }
    }
}

