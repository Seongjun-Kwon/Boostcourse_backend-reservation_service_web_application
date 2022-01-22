package boostcourse.backend.reservation.dao.sqls;

public class DisplayInfoSql {
    public static final String SELECT_DISPLAY_INFO =
            "SELECT c.id, c.name, di.create_date, di.id, di.email, di.homepage, di.modify_date, di.opening_hours, di.place_lot, di.place_name, di.place_street, p.content, p.description, p.event, di.product_id, di.tel FROM display_info di "
            + "INNER JOIN product p ON p.id = di.product_id "
            + "INNER JOIN category c ON c.id = p.category_id "
            + "WHERE di.id = :displayInfoId ";
}
