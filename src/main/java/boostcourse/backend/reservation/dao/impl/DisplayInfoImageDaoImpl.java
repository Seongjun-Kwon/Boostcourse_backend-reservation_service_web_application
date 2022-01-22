package boostcourse.backend.reservation.dao.impl;

import boostcourse.backend.reservation.dao.DisplayInfoImageDao;
import boostcourse.backend.reservation.dao.mapper.DisplayInfoImageMapper;
import boostcourse.backend.reservation.dto.DisplayInfoImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

import static boostcourse.backend.reservation.dao.sqls.DisplayInfoImageSql.SELECT_DISPLAY_INFO_IMAGE;

@Repository
public class DisplayInfoImageDaoImpl implements DisplayInfoImageDao {
    private final NamedParameterJdbcTemplate jdbc;

    @Autowired
    public DisplayInfoImageDaoImpl(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public DisplayInfoImage getDisplayInfoImage(int displayInfoId) {
        Map<String, Integer> params = new HashMap<>();

        params.put("displayInfoId", displayInfoId);

        return jdbc.queryForObject(SELECT_DISPLAY_INFO_IMAGE, params, new DisplayInfoImageMapper());
    }
}
