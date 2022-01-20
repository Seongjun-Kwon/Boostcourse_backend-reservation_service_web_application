package boostcourse.backend.reservation.dao;

import boostcourse.backend.reservation.dto.Product;

import java.util.List;

public interface ProductListDao {
    List<Product> getProductList();
}
