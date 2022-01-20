package boostcourse.backend.reservation.controller.api;

import boostcourse.backend.reservation.dto.CategoryResponse;
import boostcourse.backend.reservation.service.CategoryListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryListApiController {

    private final CategoryListService categoryService;

    @Autowired
    public CategoryListApiController(CategoryListService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/categories")
    public CategoryResponse getCategoryResponse() {
        return categoryService.getCategories();
    }
}
