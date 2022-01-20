package boostcourse.backend.reservation.controller.api;

import boostcourse.backend.reservation.dto.ProductResponse;
import boostcourse.backend.reservation.service.ProductListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductListApiController {

    private final ProductListService productListService;

    @Autowired
    public ProductListApiController(ProductListService productListService) {
        this.productListService = productListService;
    }

    @GetMapping("/api/products")
    public ProductResponse getProductList(@RequestParam(defaultValue = "0") int categoryId,
                                          @RequestParam(defaultValue = "0") int start) {

        return productListService.getProductResponse(categoryId, start);
    }
}
