/*练习 File类相相关API练习题
需求
    在当前文件夹下的aaa文件夹中创建a.txt
 */
package Day26.a03filedemo03;

import java.io.File;
import java.io.IOException;

public class TestDemo01 {
    public static void main(String[] args) throws IOException {

        // 创建a.txt的父级路径
        File file = new File("Foundation\\Day26\\a03iledemo03\\aaa");

        // 创建父级路径
        file.mkdirs();

        // 拼接父级路径和子级路径
        File src = new File(file, "a.tct");

        // 创建新的空白文件
        boolean b = src.createNewFile();

        // 判断文件是否创建成功
        if (b) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }

    }

}
