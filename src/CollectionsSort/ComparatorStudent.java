package CollectionsSort;

import java.util.Comparator;

/**
 * @Classname ComparatorStudent
 * @Description TODO
 * @Date 2020/2/23 10:36
 * @Created by 张兴旺
 */
public class ComparatorStudent implements Comparator<Student> {

    @Override
    public int compare(Student stu1, Student stu2) {
        //根据不同的业务需求给不同的属性做比较
        int i = stu1.getAge() - stu2.getAge();
        if (i == 0){
            return stu1.getName().compareTo(stu2.getName());
        }else {
        return i;
        }
    }

}
