//需求 身份证信息查询
package Day10.StringDemo;

public class StringDemo11 {
    public static void main(String[] args) {
        // 1.定义一个字符串
        String id = "456189632409052136";
        // 2.获取产生年月日
        String year = id.substring(6, 10);
        String moth = id.substring(10, 12);
        String day = id.substring(12, 14);
        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + year + "年" + moth + "月" + day + "日");
        // 3.获取性别
        char gender = id.charAt(16);
        // 利用ASCII码表 进行转换
        // '0' --> '48'
        // '1' --> '49'
        // '2' --> '50'
        // '3' --> '51'
        // '4' --> '52'
        // '5' --> '53'
        // '6' --> '54'
        // '7' --> '55'
        // '8' --> '56'
        // '9' --> '57'
        //拿着字符所对应的·数字 更48相减 相当于获取到的这个数字之间差值 差几刚好是这个字符所对应的数字
        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }

    }

}
