package boostcourse.backend.reservation.dao.categoryDaoImpl;

import boostcourse.backend.reservation.dao.CategoryDao;
import boostcourse.backend.reservation.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

import static boostcourse.backend.reservation.dao.sqls.CategoryListSqls.SELECT_CATEGORIES;

@Repository
public class SpringJdbcCategoryDaoImpl implements CategoryDao {
    private final NamedParameterJdbcTemplate jdbc;
    RowMapper<Category> categoryRowMapper = BeanPropertyRowMapper.newInstance(Category.class);

    @Autowired
    public SpringJdbcCategoryDaoImpl(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<Category> getCategoryList() {
        return jdbc.query(SELECT_CATEGORIES, categoryRowMapper);
    }
}
