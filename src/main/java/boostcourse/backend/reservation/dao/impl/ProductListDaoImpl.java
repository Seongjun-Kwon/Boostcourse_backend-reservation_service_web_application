package boostcourse.backend.reservation.dao.impl;

import boostcourse.backend.reservation.dao.ProductListDao;
import boostcourse.backend.reservation.dao.mapper.ProductListMapper;
import boostcourse.backend.reservation.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static boostcourse.backend.reservation.dao.sqls.ProductListSql.*;

@Repository
public class ProductListDaoImpl implements ProductListDao {

    private final NamedParameterJdbcTemplate jdbc;

    @Autowired
    public ProductListDaoImpl(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<Product> getProductListByCategory(int categoryId, int start, int limit) {
        Map<String, Integer> params = new HashMap<>();

        params.put("categoryId", categoryId);
        params.put("start", start);
        params.put("limit", limit);

        return jdbc.query(SELECT_PRODUCTS_BY_CATEGORY, params, new ProductListMapper());
    }

    @Override
    public List<Product> getProductListAll(int start, int limit) {
        Map<String, Integer> params = new HashMap<>();

        params.put("start", start);
        params.put("limit", limit);

        return jdbc.query(SELECT_PRODUCTS_ALL, params, new ProductListMapper());
    }

    @Override
    public int getTotalCountsAll() {
        return jdbc.queryForObject(SELECT_TOTAL_COUNTS, Collections.EMPTY_MAP, Integer.class);
    }

    @Override
    public int getTotalCountsByCategory(int categoryId) {
        Map<String, Integer> params = new HashMap<>();

        params.put("categoryId", categoryId);

        return jdbc.queryForObject(SELECT_TOTAL_COUNTS_BY_CATEGORY, params, Integer.class);
    }
}
