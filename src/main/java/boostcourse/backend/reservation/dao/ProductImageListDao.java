package boostcourse.backend.reservation.dao;

import boostcourse.backend.reservation.dto.ProductImage;

import java.util.List;

public interface ProductImageListDao {
    List<ProductImage> getProductImageList(int productId);
}
