import com.zhouyue.pojo.InvictusGaming;
import com.zhouyue.service.InvictusGamingServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        InvictusGamingServiceImpl service = context.getBean("InvictusGamingServiceImpl", InvictusGamingServiceImpl.class);
        List<InvictusGaming> invictusGamings = service.selectAll();
        for (InvictusGaming invictusGaming : invictusGamings) {
            System.out.println(invictusGaming);
        }
    }
}
