/*File相关的API的练习题
需求 
    统计一个文件夹中每中文件的个数并打印(考虑子文件夹)
 */
package Day26.a03filedemo03;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestDemo06 {
    public static void main(String[] args) {
        // 创建File对象
        File file = new File("E:\\test\\aaa");
        // 调用方法并打印
        System.out.println(getCount(file));
    }

    /*
     * 作用
     * 统计一个文件夹中每种文件夹的个数
     * 参数
     * 要统计哪个的文件夹
     * 
     * 返回值
     * 用来统计Map集合
     * 键 后缀名 值 次数
     */
    public static HashMap<String, Integer> getCount(File src) {
        // 1.定义集合用于统计
        HashMap<String, Integer> hm = new HashMap<>();
        // 2. 进入文件夹
        File[] files = src.listFiles();
        // 3. 遍历数组
        for (File file : files) {
            // file依次表示 src每一个文件或者是文件夹
            // 4. 判断 如果是文件 统计
            if (file.isFile()) {
                // 获取文件夹名
                String name = file.getName();
                // 文件切割
                String[] arr = name.split("\\.");
                // 长度进行判断，如果这个文件没有后缀名的，这个数组的长度是1，对数组进行判断
                if (arr.length >= 2) {
                    // 如果>=2 那么就认为最后一位上的索引上的元素才是后缀名
                    String endName = arr[arr.length - 1];
                    // 拿着后缀名跟集合中是否存在
                    if (hm.containsKey(endName)) {
                        // 存在 已经出现的次数进行自增，然后在添加进去
                        // 获取已经存在次数
                        int count = hm.get(endName);    
                        // 表示当前类型的文件有出现了一次
                        count++;
                        // 表示将自增之后的结果在添加进去
                        hm.put(endName, count);
                    } else {
                        // 不存在 表示当前文件第一次出现
                        hm.put(endName, 1);
                    }
                }
            } else {
                // 5. 判断如果是文件夹 递归 就是自己调自己
                // soMap里面是子文件夹中 每一种文件的个数
                HashMap<String, Integer> soMap = getCount(file);
                // 将soMap里面的数据同步到hm里面
                Set<Map.Entry<String, Integer>> entries = soMap.entrySet();
                // 遍历soMap 遍历soMap把里面的值累加到hm中
                for (Map.Entry<String, Integer> entry : entries) {
                    // 获取有键
                    String key = entry.getKey();
                    // 获取每一个值
                    int value = entry.getValue();
                    // 拿着key去到hm里面判断是否存在，如果当前遍历key在hm里已经存在
                    // 那么就把value跟hm里面的value进行累加
                    // 那么这个key在hm里面不存在 那么直接添加进去
                    if (hm.containsKey(key)) {
                        // 存在
                        // 表示在hm里面出现的次数
                        int count = hm.get(key);
                        // 然后拿着count + value 把这个结果在赋值给count
                        // 第二个count是从hm里面获取里面的值
                        // value是soMap里面的值
                        count = count + value;
                        // 添加的集合中
                        hm.put(key, count);
                    } else {
                        // 不存在
                        hm.put(key, value);
                    }
                }
            }
        }
        // 返回
        return hm;
    }
}
