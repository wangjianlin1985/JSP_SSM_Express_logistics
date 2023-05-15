// 
// 
// 

package cn.oza.logistic;

import org.springframework.boot.SpringApplication;
import cn.oza.logistic.config.ShiroConfig;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfigureBefore({ ShiroConfig.class })
public class LogisticApplication
{
    public static void main(final String[] args) {
        SpringApplication.run((Class)LogisticApplication.class, args);
    }
}
