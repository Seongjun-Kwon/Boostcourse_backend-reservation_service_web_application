package boostcourse.backend.reservation.service;

import boostcourse.backend.reservation.dto.ProductPrice;

import java.util.List;

public interface ProductPriceListService {
    List<ProductPrice> getProductPriceList(int productId);
}
