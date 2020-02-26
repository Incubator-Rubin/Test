package CollectionsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Classname TestSort
 * @Description TODO
 * @Date 2020/2/23 10:27
 * @Created by 张兴旺
 */
public class TestSort {
    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan", 25);
        Student stu2 = new Student("lisi", 18);
        Student stu3 = new Student("wangba", 20);
        Student stu4 = new Student("tiaqi", 17);
        Student stu5 = new Student("zhaoliui", 30);
        Student stu6 = new Student("aaaauu", 30);

        List<Student> stus = new ArrayList<Student>();
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        stus.add(stu4);
        stus.add(stu5);
        stus.add(stu6);
/*        System.out.println("原始数据:");
        for (ComparatorStudent stu : stus) {
            System.out.println(stu);
        }*/
        System.out.println("进行排序........自定义比较器................");
        ComparatorStudent comparatorStudent = new ComparatorStudent();
        Collections.sort(stus, comparatorStudent);
        for (Student stu : stus) {
            System.out.println(stu);
        }

        /*
         System.out.println("进行排序.........默认升序................");
         Collections.sort(stus);
        for (Student stu : stus) {
            System.out.println(stu);
        }
        //传入Collections.reverseOrder()可以实现元素倒序
        System.out.println("传入Collections.reverseOrder()可以实现元素倒序");
        Collections.sort(stus, Collections.reverseOrder());
        System.out.println("排序后的数据:");
        for (Student stu : stus) {
            System.out.println(stu);
        }*/
    }
}
