package boostcourse.backend.reservation.dao;

import boostcourse.backend.reservation.dto.ProductPrice;

import java.util.List;

public interface ProductPriceListDao {
    List<ProductPrice> getProductPriceList(int productId);
}
