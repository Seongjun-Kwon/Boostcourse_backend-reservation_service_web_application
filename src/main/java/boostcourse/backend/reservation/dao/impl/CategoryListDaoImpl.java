package boostcourse.backend.reservation.dao.impl;

import boostcourse.backend.reservation.dao.CategoryListDao;
import boostcourse.backend.reservation.dao.mapper.CategoryListMapper;
import boostcourse.backend.reservation.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

import static boostcourse.backend.reservation.dao.sqls.CategoryListSql.SELECT_CATEGORIES;

@Repository
public class CategoryListDaoImpl implements CategoryListDao {
    private final NamedParameterJdbcTemplate jdbc;

    @Autowired
    public CategoryListDaoImpl(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<Category> getCategoryList() {
        return jdbc.query(SELECT_CATEGORIES, new CategoryListMapper());
    }
}
