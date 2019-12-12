package org.kzMall.payment;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;



@SpringBootApplication
public class PaymentApplication {

    public static void main(String[] args) {
    	new SpringApplicationBuilder(PaymentApplication.class).properties("server.port=" + "8080").run(args);
        System.err.println("=========================启动成功======================================");
    }
}
