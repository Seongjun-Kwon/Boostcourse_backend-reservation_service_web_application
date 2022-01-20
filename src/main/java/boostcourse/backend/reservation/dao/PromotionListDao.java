package boostcourse.backend.reservation.dao;

import boostcourse.backend.reservation.dto.Promotion;

import java.util.List;

public interface PromotionListDao {
    List<Promotion> getPromotionList();
}
