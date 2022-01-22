package boostcourse.backend.reservation.controller.api;

import boostcourse.backend.reservation.dto.DisplayInfoResponse;
import boostcourse.backend.reservation.dto.ProductResponse;
import boostcourse.backend.reservation.service.DisplayInfoService;
import boostcourse.backend.reservation.service.ProductListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductListApiController {

    private final ProductListService productListService;
    private final DisplayInfoService displayInfoService;

    @Autowired
    public ProductListApiController(ProductListService productListService, DisplayInfoService displayInfoService) {
        this.productListService = productListService;
        this.displayInfoService = displayInfoService;
    }

    @GetMapping
    public ProductResponse getProductList(@RequestParam(defaultValue = "0") int categoryId,
                                          @RequestParam(defaultValue = "0") int start) {

        return productListService.getProductResponse(categoryId, start);
    }

    @GetMapping("/{displayInfoId}")
    public DisplayInfoResponse getDisplayInfo(@PathVariable int displayInfoId) {
        return displayInfoService.getDisplayInfoResponse(displayInfoId);
    }
}
