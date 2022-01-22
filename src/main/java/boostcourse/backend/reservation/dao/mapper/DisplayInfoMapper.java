package boostcourse.backend.reservation.dao.mapper;

import boostcourse.backend.reservation.dto.DisplayInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayInfoMapper implements RowMapper<DisplayInfo> {
    @Override
    public DisplayInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
        DisplayInfo displayInfo = new DisplayInfo();

        displayInfo.setCategoryId(rs.getInt(1));
        displayInfo.setCategoryName(rs.getString(2));
        displayInfo.setCreateDate(rs.getString(3));
        displayInfo.setDisplayInfoId(rs.getInt(4));
        displayInfo.setEmail(rs.getString(5));
        displayInfo.setHomepage(rs.getString(6));
        displayInfo.setModifyDate(rs.getString(7));
        displayInfo.setOpeningHours(rs.getString(8));
        displayInfo.setPlaceLot(rs.getString(9));
        displayInfo.setPlaceName(rs.getString(10));
        displayInfo.setPlaceStreet(rs.getString(11));
        displayInfo.setProductContent(rs.getString(12));
        displayInfo.setProductDescription(rs.getString(13));
        displayInfo.setProductEvent(rs.getString(14));
        displayInfo.setProductId(rs.getInt(15));
        displayInfo.setTelephone(rs.getString(16));

        return displayInfo;
    }
}
