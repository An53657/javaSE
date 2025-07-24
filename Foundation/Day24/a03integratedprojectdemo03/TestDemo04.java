/*Map集合案例 省和市 集合嵌套
需求
定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。
添加完毕后，遍历结果格式如下：
江苏省=南京市，扬州市，苏州市，无锡市，常州市
湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
河北省＝石家庄市，唐山市，邢台市，保定市，张家口市
*/
package Day24.a03integratedprojectdemo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringJoiner;

public class TestDemo04 {
    public static void main(String[] args) {
        // 创建Map集合
        HashMap<String, ArrayList<String>> hs = new HashMap<>();

        // 创建ArrayList用于添加市
        ArrayList<String> city1 = new ArrayList<>();
        Collections.addAll(city1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");

        ArrayList<String> city2 = new ArrayList<>();
        Collections.addAll(city2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");

        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        // 添加到Map集合
        hs.put("江苏省", city1);
        hs.put("湖北省", city3);
        hs.put("河北省", city3);

        // 集合嵌套
        // 遍历Map集合
        Set<Map.Entry<String, ArrayList<String>>> entries = hs.entrySet();
        for (Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",", "", "");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }
    }
}
