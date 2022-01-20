package boostcourse.backend.reservation.service.impl;

import boostcourse.backend.reservation.dao.CategoryListDao;
import boostcourse.backend.reservation.dto.CategoryResponse;
import boostcourse.backend.reservation.service.CategoryListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryListServiceImpl implements CategoryListService {

    private final CategoryListDao categoryDao;

    @Autowired
    public CategoryListServiceImpl(CategoryListDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public CategoryResponse getCategories() {
        CategoryResponse categoryResponse = new CategoryResponse();
        categoryResponse.setItems(categoryDao.getCategoryList());

        return categoryResponse;
    }
}
