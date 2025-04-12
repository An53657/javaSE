 package Day03;

class LogicaloperatorDemo03 {
  public static void main(String[] args) {
    //短路与&&
    //运行效果是一样的
    //表示两边的表达式都为true，结果才为true
    System.out.println(true && true); //true
    System.out.println(true && false); //false
    //只要有一个为false，结果就是false 
  }
    
}