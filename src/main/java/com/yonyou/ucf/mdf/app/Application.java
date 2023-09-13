package com.yonyou.ucf.mdf.app;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;



@SpringBootApplication
@MapperScan("com.yonyou.ucf.mdf.app.application.mapper")
public class Application {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);

    }
}