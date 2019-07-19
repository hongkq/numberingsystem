import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 测试代码
 * @author hkq
 */
@Configuration
public class testConfig {
    @Bean
    @Profile("dev")
    public testBean deTestBean(){
        return new testBean("from development profile");
    }
    @Bean
    @Profile("prod")
    public testBean prodTestBean(){
        return new testBean("from production profile");
    }
}
