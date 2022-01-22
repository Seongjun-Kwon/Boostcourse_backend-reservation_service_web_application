package boostcourse.backend.reservation.dao.impl;

import boostcourse.backend.reservation.dao.DisplayInfoDao;
import boostcourse.backend.reservation.dao.mapper.DisplayInfoMapper;
import boostcourse.backend.reservation.dto.DisplayInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

import static boostcourse.backend.reservation.dao.sqls.DisplayInfoSql.SELECT_DISPLAY_INFO;

@Repository
public class DisplayInfoDaoImpl implements DisplayInfoDao {
    private final NamedParameterJdbcTemplate jdbc;

    @Autowired
    public DisplayInfoDaoImpl(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public DisplayInfo getDisplayInfo(int displayInfoId) {
        Map<String, Integer> params = new HashMap<>();

        params.put("displayInfoId", displayInfoId);

        return jdbc.queryForObject(SELECT_DISPLAY_INFO, params, new DisplayInfoMapper());
    }
}
