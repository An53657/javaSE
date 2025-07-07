package Day13.a02extendsdemo02.demo02;

public class ChineseDog extends Dog {

    // 所以父类中的方法不能满足我们的需求了，所以重写
    // //中华田园犬完全用不到父类里的代码，所以不需要super调用
    @Override
    public void eat() {
        System.out.println("在吃剩饭");
    }

}
