package boostcourse.backend.reservation.dao.sqls;

public class ProductListSql {
    public static final String SELECT_PRODUCTS_BY_CATEGORY =
            "SELECT d.id, d.place_name, p.content, p.description, p.id, f.save_file_name FROM product p "
            + "INNER JOIN display_info d ON p.id = d.product_id "
            + "INNER JOIN product_image pi ON p.id = pi.product_id "
            + "INNER JOIN file_info f ON f.id = pi.file_id "
            + "WHERE pi.type = 'th' AND p.category_id = :categoryId "
            + "ORDER BY d.id LIMIT :start, :limit ";

    public static final String SELECT_PRODUCTS_ALL =
            "SELECT d.id, d.place_name, p.content, p.description, p.id, f.save_file_name FROM product p "
            + "INNER JOIN display_info d ON p.id = d.product_id "
            + "INNER JOIN product_image pi ON p.id = pi.product_id "
            + "INNER JOIN file_info f ON f.id = pi.file_id "
            + "WHERE pi.type = 'th' "
            + "ORDER BY d.id LIMIT :start, :limit ";

    public static final String SELECT_TOTAL_COUNTS_BY_CATEGORY =
            "SELECT count(*) FROM product p "
            + "INNER JOIN display_info d ON p.id = d.product_id "
            + "WHERE p.category_id = :categoryID "
            + "GROUP BY p.category_id ";

    public static final String SELECT_TOTAL_COUNTS =
            "SELECT count(*) FROM display_info ";
}
