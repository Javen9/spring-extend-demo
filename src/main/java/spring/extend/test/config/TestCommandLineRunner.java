package spring.extend.test.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by javen on 2017/8/10.
 * <p>
 * 此接口是在容器初始化完成后执行，CommandLineRunner与ApplicationRunner类似，只是获得参数不同
 * 具体执行需调试查看
 * </p>
 */
@Component
public class TestCommandLineRunner implements CommandLineRunner {
    public void run(String... strings) throws Exception {
        System.out.println(this.getClass().getName() + " -> " + "run");
    }
}
