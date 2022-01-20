package boostcourse.backend.reservation.dao.mapper;

import boostcourse.backend.reservation.dto.Promotion;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PromotionListMapper implements RowMapper<Promotion> {

    @Override
    public Promotion mapRow(ResultSet rs, int rowNum) throws SQLException {

        Promotion promotion = new Promotion();

        promotion.setId(rs.getInt(1));
        promotion.setProductId(rs.getInt(2));
        promotion.setProductImageUrl(rs.getString(3));

        return promotion;
    }
}
