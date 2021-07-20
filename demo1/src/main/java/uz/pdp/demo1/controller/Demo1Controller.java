package uz.pdp.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.demo1.model.MessageReceiveModel;
import uz.pdp.demo1.service.Demo2Service;

/**
 * Created by
 * Sahobiddin Abbosaliyev
 * 7/17/2021
 */

@RestController
@Component
public class Demo1Controller {
    private final Demo2Service demo2Service;

    @Autowired
    public Demo1Controller(Demo2Service demo2Service) {
        this.demo2Service = demo2Service;
    }

    @GetMapping
    public String hello() {
        return "Hello from demo 1 " + demo2Service.hello();
    }

    @GetMapping("message")
    public MessageReceiveModel message(Long id) {
        MessageReceiveModel message = demo2Service.message(id);
        return new MessageReceiveModel(message.getId(), message.getMessage(), System.currentTimeMillis());
    }
}
