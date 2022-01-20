package boostcourse.backend.reservation.dao;

import boostcourse.backend.reservation.dto.Product;

import java.util.List;

public interface ProductListDao {
    List<Product> getProductListByCategory(int categoryId, int start, int limit);

    List<Product> getProductListAll(int start, int limit);

    int getTotalCountsByCategory(int categoryId);

    int getTotalCountsAll();
}
