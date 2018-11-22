package ru.rost;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import ru.rost.model.TestModel;

/**
 * @author rost.
 */
@SpringBootApplication
public class ApplicationMain {
    public static void main(String ... args){
        new TestModel();
        new SpringApplicationBuilder(ApplicationMain.class)
                .run(args);
    }
}
