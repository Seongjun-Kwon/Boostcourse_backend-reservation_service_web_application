package boostcourse.backend.reservation.dao.mapper;

import boostcourse.backend.reservation.dto.DisplayInfoImage;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayInfoImageMapper implements RowMapper<DisplayInfoImage> {

    @Override
    public DisplayInfoImage mapRow(ResultSet rs, int rowNum) throws SQLException {
        DisplayInfoImage displayInfoImage = new DisplayInfoImage();

        displayInfoImage.setContentType(rs.getString(1));
        displayInfoImage.setCreateDate(rs.getString(2));
        displayInfoImage.setDeleteFlag(rs.getBoolean(3));
        displayInfoImage.setDisplayInfoId(rs.getInt(4));
        displayInfoImage.setDisplayInfoImageId(rs.getInt(5));
        displayInfoImage.setFileId(rs.getInt(6));
        displayInfoImage.setFileName(rs.getString(7));
        displayInfoImage.setModifyDate(rs.getString(8));
        displayInfoImage.setSaveFileName(rs.getString(9));

        return displayInfoImage;
    }
}
