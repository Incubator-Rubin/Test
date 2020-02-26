package String;

/**
 * @Classname StringIntern
 * @Description TODO
 * @Date 2020/2/23 9:20
 * @Created by 张兴旺
 */
public class StringIntern {
    public static void main(String[] args) {
        /* 调用intern() 方法时，"计算机软件" 对象是首次出现(字符串常量池中是没有的) 于是
        将堆中由StringBuilder创建的字符串实例引用 记录到 字符串常量池中 并返回
        这个由StringBuilder创建的字符串实例引用
        也就是 "计算机软件" 首次出现 所以 str2 和 str2.intern() 是同一个引用 所以为true
        * */
        String str2 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str2.intern() == str2);
    }
}

