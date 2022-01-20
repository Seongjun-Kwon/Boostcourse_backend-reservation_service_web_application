package boostcourse.backend.reservation.controller;

import boostcourse.backend.reservation.dto.CategoryResponse;
import boostcourse.backend.reservation.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/categories")
    public CategoryResponse getCategoryResponse() {
        return categoryService.getCategories();
    }
}
