package Day02;
//定义包名，表示该类属于Java.day02包
public class vairableDemo03 {
    public static void main(String[] args) {
        //定义一个变量，记录名字
        String name = "小名"; // 变量名是name，数据类型是String，值是"小明"
        //定义一个变量，记录年龄
        int age = 20; // 变量名是age，数据类型是int，值是20
        //定义一个变量，记录性别
        char gender = '男'; // 变量名是gender，数据类型是char，值是'男'
        //定义一个变量，记录身高
        double height = 1.75; // 变量名是height，数据类型是double，值是1.75
        //定义一个变量，记录体重
        float weight = 60.5F; // 变量名是weight，数据类型是float，值是60.5F
        //定义一个变量，记录是否单身
        boolean isSingle = true; // 变量名是isSingle，数据类型是boolean，值是true
        //输出变量的值
        System.out.println("名字：" + '\t' + name); // 输出：名字：小明
        System.out.println("年龄：" + '\t' + age); // 输出：年龄：20
        System.out.println("性别" + '\t'  +gender);// 输出：性别：男
        System.out.println("身高：" + '\t' + height); // 输出：身高：1.75
        System.out.println("体重：" + '\t' +weight); // 输出：体重：60.5
        System.out.println("是否单身：" + '\t' + isSingle); // 输出：是否单身：true
            }
}


