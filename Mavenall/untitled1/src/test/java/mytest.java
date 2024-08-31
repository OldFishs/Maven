import org.example.seriver.hello;
import org.junit.Test;

public class mytest {
    //测试类：所有测试功能的实现
    //规范：
    //1.访问权限public
    //2.方法没有返回值
    //3. 方法名称自定义，推荐Test结尾
    //4.方法没有参数

    @Test
    public void Testsum(){
        hello hello1 = new hello();
        System.out.println(hello1.sum(2,6) + "");
    }

    @Test
    public void Testmul(){
        hello hello1 = new hello();
        System.out.println(hello1.mul(2,6) + "");
    }

}
