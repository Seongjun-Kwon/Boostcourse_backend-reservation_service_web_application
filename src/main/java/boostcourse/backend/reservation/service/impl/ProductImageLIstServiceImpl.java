package boostcourse.backend.reservation.service.impl;

import boostcourse.backend.reservation.dao.ProductImageListDao;
import boostcourse.backend.reservation.dto.ProductImage;
import boostcourse.backend.reservation.service.ProductImageListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageLIstServiceImpl implements ProductImageListService {
    private final ProductImageListDao productImageListDao;

    @Autowired
    public ProductImageLIstServiceImpl(ProductImageListDao productImageListDao) {
        this.productImageListDao = productImageListDao;
    }

    @Override
    public List<ProductImage> getProductImageList(int productId) {
        return productImageListDao.getProductImageList(productId);
    }
}
