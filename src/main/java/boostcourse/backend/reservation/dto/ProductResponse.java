package boostcourse.backend.reservation.dto;

import java.util.List;

public class ProductResponse {
    private List<Product> items;
    private Integer totalCount;

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
