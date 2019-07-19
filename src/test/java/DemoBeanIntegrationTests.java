import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//SpringJUnit4ClassRunner在JUnit环境下提供Spring TestContext Framework的功能
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration用来加载配置ApplicationContext，其中classes属性用来加载配置类
@ContextConfiguration(classes = {testConfig.class})
//@ActiveProfiles用来声明活动
@ActiveProfiles("prod")
//@ActiveProfiles("dev") 不能通过

public class DemoBeanIntegrationTests {
    //可使用普通的Autowriter注入Bean.
    @Autowired
    private testBean testBean;
    //测试代码，通过JUnit的Assert来校验结果是否和预期一致。
    @Test
    public void prodBeanShouldInject(){
     String expected="from production profile";
     String actual=testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}
