package dio.avanade.spring_primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAPP implements CommandLineRunner {
    @Autowired
    private calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("A soma dos dois números é:" + calculadora.soma(2,4));
    }
}
