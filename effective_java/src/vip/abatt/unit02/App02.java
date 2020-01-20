package vip.abatt.unit02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author yixue
 */

/**
 * Author:yankai1101
 * Desc: JDK 7引入 try-with-resource 语法糖
 * try-with-resource 模型
 * try-case-finally 模型
 **/
public class App02 {
    public static void main(String[] args) throws Exception {
        System.out.println(getFirstLine01());
        System.out.println(getFirstLine02());
    }

    /**
     * try-with-resource 模型:因为BufferedReader（extends Reader）implements Closeable接口，所以BufferedReader流不需要自动关闭
     *
     * @return
     * @throws Exception
     */
    public static String getFirstLine01() throws Exception {
        String filePath = App02.class.getResource("/file.txt").getPath();

        // 在 BufferedReader.close() 打断点，查看在 try代码块执行后，是否自动执行close方法
        try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
            return br.readLine();
        }
    }

    /**
     * try-case-finally 模型:传统
     *
     * @return
     * @throws Exception
     */
    public static String getFirstLine02() throws Exception {
        String filePath = App02.class.getResource("/file.txt").getPath();

        // 在 BufferedReader.close() 打断点，查看在 try代码块执行后，是否自动执行close方法
        BufferedReader br = null;
        String result = "";
        try {
            br = new BufferedReader(new FileReader(new File(filePath)));
            result = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            result = "";
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return result;
    }
}
