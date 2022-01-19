package boostcourse.backend.reservation.dao;

import boostcourse.backend.reservation.dto.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> getCategoryList();
}
