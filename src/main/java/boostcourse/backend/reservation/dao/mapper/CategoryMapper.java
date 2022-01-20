package boostcourse.backend.reservation.dao.mapper;

import boostcourse.backend.reservation.dto.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {

        Category category = new Category();

        category.setCategoryId(rs.getInt(1));
        category.setCategoryName(rs.getString(2));
        category.setDisplayInfoCount(rs.getInt(3));

        return category;
    }
}
