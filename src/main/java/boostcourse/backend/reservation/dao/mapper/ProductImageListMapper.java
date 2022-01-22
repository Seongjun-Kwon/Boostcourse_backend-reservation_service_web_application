package boostcourse.backend.reservation.dao.mapper;

import boostcourse.backend.reservation.dto.ProductImage;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductImageListMapper implements RowMapper<ProductImage> {

    @Override
    public ProductImage mapRow(ResultSet rs, int rowNum) throws SQLException {

        ProductImage productImage = new ProductImage();

        productImage.setContentType(rs.getString(1));
        productImage.setCreateDate(rs.getString(1));
        productImage.setDeleteFlag(rs.getBoolean(3));
        productImage.setFileInfoId(rs.getInt(4));
        productImage.setFileName(rs.getString(5));
        productImage.setModifyDate(rs.getString(6));
        productImage.setProductId(rs.getInt(7));
        productImage.setProductImageId(rs.getInt(8));
        productImage.setSaveFileName(rs.getString(9));
        productImage.setType(rs.getString(10));

        return productImage;
    }
}
