package Day16;

import javax.swing.JFrame;

public class Test {
       public static void main(String[] args) {
        //创建一个游戏主界面
        JFrame gameJFrame = new JFrame();
        //设置大小,单位像素
        gameJFrame.setSize(603,680);
        //显示窗口 false表是隐藏 true表示显示
        gameJFrame.setVisible(true);

        //创建一个游戏登录界面
        JFrame loginJFrame = new JFrame();
        //设置大小,单位像素
        loginJFrame.setSize(488,430);
        //显示窗口 false表是隐藏 true表示显示
        loginJFrame.setVisible(true);

        //创建一个游戏注册界面
        JFrame registerJFrame = new JFrame();
        //设置大小,单位像素
        registerJFrame.setSize(488,500);
        //显示窗口 false表是隐藏 true表示显示
        registerJFrame.setVisible(true);
    }
}
