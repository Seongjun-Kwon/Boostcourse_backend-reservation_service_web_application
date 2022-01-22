package boostcourse.backend.reservation.dao.mapper;

import boostcourse.backend.reservation.dto.ProductPrice;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductPriceListMapper implements RowMapper<ProductPrice> {

    @Override
    public ProductPrice mapRow(ResultSet rs, int rowNum) throws SQLException {

        ProductPrice productPrice = new ProductPrice();

        productPrice.setCreateDate(rs.getString(1));
        productPrice.setDiscountRate(rs.getDouble(2));
        productPrice.setModifyDate(rs.getString(3));
        productPrice.setPrice(rs.getInt(4));
        productPrice.setPriceTypeName(rs.getString(5));
        productPrice.setProductId(rs.getInt(6));
        productPrice.setProductPriceId(rs.getInt(7));

        return null;
    }
}
