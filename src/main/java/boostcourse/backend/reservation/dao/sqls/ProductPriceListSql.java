package boostcourse.backend.reservation.dao.sqls;

public class ProductPriceListSql {
    public static final String SELECT_PRODUCT_PRICES =
            "SELECT pp.create_date, pp.discount_rate, pp.modify_date, pp.price, pp.price_type_name, pp.product_id, pp.id FROM product_price pp "
            + "WHERE pp.product_id = :productId "
            + "ORDER BY pp.id DESC ";
}
