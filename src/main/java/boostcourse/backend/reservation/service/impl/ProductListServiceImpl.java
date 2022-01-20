package boostcourse.backend.reservation.service.impl;

import boostcourse.backend.reservation.dao.ProductListDao;
import boostcourse.backend.reservation.dto.Product;
import boostcourse.backend.reservation.dto.ProductResponse;
import boostcourse.backend.reservation.service.ProductListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductListServiceImpl implements ProductListService {

    private final ProductListDao productListDao;

    @Autowired
    public ProductListServiceImpl(ProductListDao productListDao) {
        this.productListDao = productListDao;
    }

    @Override
    public ProductResponse getProductResponse(int categoryId, int start) {

        ProductResponse productResponse = new ProductResponse();

        productResponse.setItems(getProductList(categoryId, start));
        productResponse.setTotalCount(getTotalCount(categoryId));

        return productResponse;
    }

    @Override
    public List<Product> getProductList(int categoryId, int start) {
        if (categoryId == ALL_CATEGORIES) {
            return productListDao.getProductListAll(start, LIMIT);
        } else {
            return productListDao.getProductListByCategory(categoryId, start, LIMIT);
        }
    }

    @Override
    public int getTotalCount(int categoryId) {
        if (categoryId == ALL_CATEGORIES) {
            return productListDao.getTotalCountsAll();
        } else {
            return productListDao.getTotalCountsByCategory(categoryId);
        }
    }
}
