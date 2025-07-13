/*
 
1. Zomeld:时区
方法名                     说明
static set<String> getAvailableZoneIds()  获取java中支持的所有时区
static ZoneId systemDefault()              获取系统默认时区
static ZoneId of (String zoneId)           获取一个指定的时区

 */
package Day19.jdk8datedemo02;

import java.time.ZoneId;

import java.util.Set;

public class DateDemo01 {
    public static void main(String[] args) {
        // 获取java中支持的所有时区
        Set<String> z0 = ZoneId.getAvailableZoneIds();
        System.out.println("---------------------------------------------------");
        System.out.println(z0.size());
        System.out.println(z0);

        System.out.println("---------------------------------------------------");
        // 获取系统默认时区
        ZoneId z = ZoneId.systemDefault();
        System.out.println(z);

        System.out.println("---------------------------------------------------");
        // 获取一个指定的时区

        ZoneId x = ZoneId.of("Europe/Monaco");
        System.out.println(x);

    }
}
