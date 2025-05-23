package Day08.Test06;

public class User {
    //属性 成员变量
    //用户名 密码 邮箱 性别 年龄
    //格式
    private String username;
    private String password;
    private String emil;
    private String  gander;
    private int age;

    //空参构造方法
    public User(){};

    //带全部参数的构造方法
    public User(String username,String password,String emil,String gander,int age){
        this.username = username;
        this.password = password;
        this.emil = emil;
        this.gander = gander;
        this.age = age;

    }

    //get//set
    //username
    public void setUsername(String username){
        this.username =  username;
    }
    public String getUsername(){
        return username;
    }

    //password
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    //emil
    public void setEmil(String emil){
        this.emil =emil; 
    }
    
    public String getEmil(){
        return emil;
    }

    //gannder
    public void setGander(String gander){
        this.gander = gander;
    }
    public String getGander(){
        return gander;
    }

    //age
    public void  serAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


}
