package boostcourse.backend.reservation.dao.impl;

import boostcourse.backend.reservation.dao.PromotionListDao;
import boostcourse.backend.reservation.dao.mapper.PromotionListMapper;
import boostcourse.backend.reservation.dto.Promotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

import static boostcourse.backend.reservation.dao.sqls.PromotionListSql.SELECT_PROMOTIONS;

@Repository
public class PromotionListDaoImpl implements PromotionListDao {

    private final NamedParameterJdbcTemplate jdbc;

    @Autowired
    public PromotionListDaoImpl(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<Promotion> getPromotionList() {
        return jdbc.query(SELECT_PROMOTIONS, new PromotionListMapper());
    }
}
