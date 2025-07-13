/*DateTimeFormatter 用于时间的格式化和解析
方法名                                          说明
static DateTimeFormatter ofPttern(格式)         获取格式对象
String format(时间对象)                         按照指定格式格式化
 */
package Day19.jdk8datedemo02;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.ZoneId;

public class DateDemo04 {
    public static void main(String[] args) {
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        // 解析/格式化
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss EE a ");

        // 格式化
        System.out.println(sdf.format(time));

    }
}
