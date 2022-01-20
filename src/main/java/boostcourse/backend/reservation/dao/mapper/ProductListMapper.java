package boostcourse.backend.reservation.dao.mapper;

import boostcourse.backend.reservation.dto.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductListMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

        Product product = new Product();

        product.setDisplayInfoId(rs.getInt(1));
        product.setPlaceName(rs.getString(2));
        product.setProductContent(rs.getString(3));
        product.setProductDescription(rs.getString(4));
        product.setProductId(rs.getInt(5));
        product.setProductImageUrl(rs.getString(6));

        return product;
    }
}
