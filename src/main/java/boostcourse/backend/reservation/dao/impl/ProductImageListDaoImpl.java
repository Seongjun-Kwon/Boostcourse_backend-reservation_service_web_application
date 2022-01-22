package boostcourse.backend.reservation.dao.impl;

import boostcourse.backend.reservation.dao.ProductImageListDao;
import boostcourse.backend.reservation.dao.mapper.ProductImageListMapper;
import boostcourse.backend.reservation.dto.ProductImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static boostcourse.backend.reservation.dao.sqls.ProductImageListSql.SELECT_PRODUCT_IMAGES;

@Repository
public class ProductImageListDaoImpl implements ProductImageListDao {
    private final NamedParameterJdbcTemplate jdbc;

    @Autowired
    public ProductImageListDaoImpl(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<ProductImage> getProductImageList(int productId) {
        Map<String, Integer> params = new HashMap<>();

        params.put("productId", productId);

        return jdbc.query(SELECT_PRODUCT_IMAGES, params, new ProductImageListMapper());
    }
}
