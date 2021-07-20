package uz.pdp.demo2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.demo2.model.MessageResponseModel;

/**
 * Created by
 * Sahobiddin Abbosaliyev
 * 7/17/2021
 */
@RestController
public class Demo2Controller {

    @GetMapping
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Hello from Demo2");
    }

    @PostMapping("message/{id}")
    public ResponseEntity<?> message(@PathVariable int id) {
        MessageResponseModel messageResponseModel = new MessageResponseModel();
        messageResponseModel.setId(id);
        messageResponseModel.setMessage("Hello from demo 2");
        return ResponseEntity.ok(messageResponseModel);
    }


}


