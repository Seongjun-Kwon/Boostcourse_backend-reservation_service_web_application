package boostcourse.backend.reservation.dao.sqls;

public class CategoryListSql {
    public static final String SELECT_CATEGORIES =
            "SELECT c.id, c.name, count(*) FROM display_info d "
            + "INNER JOIN product p ON d.product_id = p.id "
            + "INNER JOIN category c ON c.id = p.category_id "
            + "GROUP BY c.id";
}
