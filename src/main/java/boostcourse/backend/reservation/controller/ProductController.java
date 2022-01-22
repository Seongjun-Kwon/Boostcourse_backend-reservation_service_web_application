package boostcourse.backend.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @GetMapping("/detail")
    public String getDetail(@RequestParam(name = "displayInfoId") int displayInfoId) {
        return "detail";
    }
}
