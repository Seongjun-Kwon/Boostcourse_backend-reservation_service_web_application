package boostcourse.backend.reservation.service;

import boostcourse.backend.reservation.dto.Product;
import boostcourse.backend.reservation.dto.ProductResponse;

import java.util.List;

public interface ProductListService {

    public final int LIMIT = 4;
    public final int ALL_CATEGORIES = 0;

    ProductResponse getProductResponse(int categoryId, int start);

    List<Product> getProductList(int categoryId, int start);

    int getTotalCount(int categoryId);
}
