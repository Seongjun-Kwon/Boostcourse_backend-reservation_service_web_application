package boostcourse.backend.reservation.dao.sqls;

public class ProductImageListSql {
    public static final String SELECT_PRODUCT_IMAGES =
            "SELECT fi.content_type, fi.create_date, fi.delete_flag, pi.file_id, fi.file_name, fi.modify_date, pi.product_id, pi.id, fi.save_file_name, fi.content_type FROM product_image pi "
            + "INNER JOIN file_info fi ON fi.id = pi.file_id "
            + "WHERE pi.type NOT IN 'th' "
            + "AND pi.product_id = :productId "
            + "LIMIT 2 ";
}
