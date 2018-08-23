package com.dcyao.merry.controller;

import com.dcyao.merry.dao.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by dcyao on 2018/8/22.
 */
@RestController
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @PostMapping(value = "/user/dologin")
    public ResponseEntity doLogin(@RequestBody User user) {
        HashMap<String, String> map = new HashMap<>();
        logger.info(user.toString());
        if("admin".equals(user.getUsername()) &&
                "123456".equals(user.getPassword())) {
            map.put("result","success");
        }else {
            map.put("result","error");
        }
        return new ResponseEntity(map,HttpStatus.OK);
    }
}
