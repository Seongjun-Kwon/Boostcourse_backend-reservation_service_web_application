package boostcourse.backend.reservation.service.impl;

import boostcourse.backend.reservation.dao.CategoryDao;
import boostcourse.backend.reservation.dto.CategoryResponse;
import boostcourse.backend.reservation.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryDao categoryDao;

    @Autowired
    public CategoryServiceImpl(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public CategoryResponse getCategories() {
        CategoryResponse categoryResponse = new CategoryResponse();
        categoryResponse.setItems(categoryDao.getCategoryList());

        return categoryResponse;
    }
}
