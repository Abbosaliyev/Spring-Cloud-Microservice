package uz.pdp.demo1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import uz.pdp.demo1.model.MessageReceiveModel;

/**
 * Created by
 * Sahobiddin Abbosaliyev
 * 7/17/2021
 */
@FeignClient("demo2")
public interface Demo2Service {

    @GetMapping
    String hello();

    @PostMapping("message/{id}")
    MessageReceiveModel message(@PathVariable Long id);

}
