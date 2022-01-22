package boostcourse.backend.reservation.dao.sqls;

public class DisplayInfoImageSql {
    public static final String SELECT_DISPLAY_INFO_IMAGE =
            "SELECT fi.content_type, fi.create_date, fi.delete_flag, dii.display_info_id, dii.id, dii.file_id, fi.file_name, fi.modify_date, fi.save_file_name FROM display_info_image dii "
            + "INNER JOIN file_info fi ON fi.id = dii.file_id "
            + "WHERE dii.display_info_id = :displayInfoId ";
}
