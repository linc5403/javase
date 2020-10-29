package com.linchuan.remotecontrol;

import com.linchuan.remotecontrol.bean.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlController {
    @GetMapping("/controller")
    public Result getStatus() {
        Result r = new Result();
        r.setContent("lalala");
        return r;
    }
}
