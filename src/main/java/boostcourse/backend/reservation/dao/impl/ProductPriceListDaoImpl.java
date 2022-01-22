package boostcourse.backend.reservation.dao.impl;

import boostcourse.backend.reservation.dao.ProductPriceListDao;
import boostcourse.backend.reservation.dao.mapper.ProductPriceListMapper;
import boostcourse.backend.reservation.dto.ProductPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static boostcourse.backend.reservation.dao.sqls.ProductPriceListSql.SELECT_PRODUCT_PRICES;

@Repository
public class ProductPriceListDaoImpl implements ProductPriceListDao {
    private final NamedParameterJdbcTemplate jdbc;

    @Autowired
    public ProductPriceListDaoImpl(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<ProductPrice> getProductPriceList(int productId) {
        Map<String, Integer> params = new HashMap<>();

        params.put("productId", productId);

        return jdbc.query(SELECT_PRODUCT_PRICES, params, new ProductPriceListMapper());
    }
}
