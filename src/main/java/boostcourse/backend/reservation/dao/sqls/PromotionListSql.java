package boostcourse.backend.reservation.dao.sqls;

public class PromotionListSql {
    public static final String SELECT_PROMOTIONS =
            "SELECT p.id, p.product_id, f.save_file_name FROM promotion p "
            + "INNER JOIN product_image pi ON p.product_id = pi.product_id "
            + "INNER JOIN file_info f ON f.id = pi.file_id "
            + "WHERE pi.type = 'th' ";
}
