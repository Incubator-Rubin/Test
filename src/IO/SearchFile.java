package IO;

import java.io.File;
import java.io.FilenameFilter;

public class SearchFile {
    public static void main(String[] args) {
        File file = new File("D:\\test");
        findFile(file);
    }

    //写一个递归方法  查找 以 .java 结尾的文件 并打印路径
    public static void findFile(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){ //判断 file1 是否为文件夹
                findFile(file1);
            }else if (file1.isFile()){
                MyFileFilter myFileFilter = new MyFileFilter();
                boolean accept = myFileFilter.accept(file1, file1.getName());
                if (accept){
                    System.out.println(file1);
                }
            }
        }
    }
}
/*
 工具类，判断文件后缀是否是以 .java 结尾
 */
class MyFileFilter implements FilenameFilter{
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".java");
    }
}
