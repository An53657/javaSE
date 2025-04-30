package Day02;
public class vairableDemo04 {
    public static void main(String[] args) {
        //定义一个变量，记录电影名称，用字符串类型String
        String mpviename = "流浪地球2"; // 电影名称
        //定义一个变量，记录电影主演，用字符串类型String
        String moviestar = "吴京"; // 电影主演
        //定义一个变量，记录电影类型年份，用整数类型int
        int movietime = 2023; // 电影年份
        //定义一个变量，记录电影评分，用浮点数类型double
        double moviegrade = 9.5; // 电影评分
        //输出电影名称、主演、年份、评分
        System .out.println("电影名称：" + mpviename); // 输出：电影名称：流浪地球2t
        System.out.println(mpviename + "的主演是：" + moviestar); // 输出：流浪地球2的主演是：吴京
        System.out.println(mpviename + "的年份是：" + movietime); // 输出：流浪地球2的年份是：2023      
        System.out.println(mpviename + "的评分是：" + moviegrade); // 输出：流浪地球2的评分是：9.5
    }
}
