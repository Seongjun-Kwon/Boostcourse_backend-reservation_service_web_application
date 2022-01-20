package boostcourse.backend.reservation.dao.impl;

import boostcourse.backend.reservation.dao.ProductListDao;
import boostcourse.backend.reservation.dao.mapper.ProductListMapper;
import boostcourse.backend.reservation.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

import static boostcourse.backend.reservation.dao.sqls.ProductListSql.SELECT_PRODUCTS;

@Repository
public class ProductListDaoImpl implements ProductListDao {

    private final NamedParameterJdbcTemplate jdbc;

    @Autowired
    public ProductListDaoImpl(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<Product> getProductList() {
        return jdbc.query(SELECT_PRODUCTS, new ProductListMapper());
    }
}
