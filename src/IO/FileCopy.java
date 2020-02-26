package IO;

import java.io.*;
import java.util.Scanner;

/**
 * @Classname FileCopy
 * @Description TODO
 * @Date 2020/2/10 18:04
 * @Created by 张兴旺
 */
public class FileCopy {
    public static void main(String[] args) {
        //从控制台获取输入的文件目录路径
      /*  System.out.println("请输入一个文件路径");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();*/

        //输出目录下所有文件
       /* File file = new File(s);
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    */
        //将指定目录下的 .java 文件复制到 D:/java 文件夹中
        Reader reader = null;
        Writer writer = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            reader = new FileReader("D:\\test\\inner\\inner.java");
            writer = new FileWriter("D:/test/copy.java");
            bufferedReader = new BufferedReader(reader);
            bufferedWriter = new BufferedWriter(writer);

            String str = null;
            while ((str=bufferedReader.readLine()) != null) {
                bufferedWriter.newLine();
                bufferedWriter.write(str);
            }
            System.out.println("写入完成");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
                writer.close();
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
