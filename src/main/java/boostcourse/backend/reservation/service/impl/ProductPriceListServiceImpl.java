package boostcourse.backend.reservation.service.impl;

import boostcourse.backend.reservation.dao.ProductPriceListDao;
import boostcourse.backend.reservation.dto.ProductPrice;
import boostcourse.backend.reservation.service.ProductPriceListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductPriceListServiceImpl implements ProductPriceListService {
    private final ProductPriceListDao productPriceListDao;

    @Autowired
    public ProductPriceListServiceImpl(ProductPriceListDao productPriceListDao) {
        this.productPriceListDao = productPriceListDao;
    }

    @Override
    public List<ProductPrice> getProductPriceList(int productId) {
        return productPriceListDao.getProductPriceList(productId);
    }
}
