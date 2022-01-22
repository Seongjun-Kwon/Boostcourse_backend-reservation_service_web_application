package boostcourse.backend.reservation.service;

import boostcourse.backend.reservation.dto.ProductImage;

import java.util.List;

public interface ProductImageListService {
    List<ProductImage> getProductImageList(int productId);
}
