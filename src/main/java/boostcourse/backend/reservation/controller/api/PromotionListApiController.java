package boostcourse.backend.reservation.controller.api;

import boostcourse.backend.reservation.dto.PromotionResponse;
import boostcourse.backend.reservation.service.PromotionListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromotionListApiController {

    private final PromotionListService promotionListService;

    @Autowired
    public PromotionListApiController(PromotionListService promotionListService) {
        this.promotionListService = promotionListService;
    }

    @GetMapping("/api/promotions")
    PromotionResponse getPromotionList() {
        return promotionListService.getPromotionResponse();
    }
}
