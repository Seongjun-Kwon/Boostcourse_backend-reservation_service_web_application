package boostcourse.backend.reservation.dto;

public class Category {
    private Integer displayInfoCount;
    private Integer categoryId;
    private String categoryName;

    public Integer getDisplayInfoCount() {
        return displayInfoCount;
    }

    public void setDisplayInfoCount(Integer displayInfoCount) {
        this.displayInfoCount = displayInfoCount;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
