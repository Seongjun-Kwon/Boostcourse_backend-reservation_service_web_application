package boostcourse.backend.reservation.service.impl;

import boostcourse.backend.reservation.dao.PromotionListDao;
import boostcourse.backend.reservation.dto.PromotionResponse;
import boostcourse.backend.reservation.service.PromotionListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromotionListServiceImpl implements PromotionListService {

    private final PromotionListDao promotionListDao;

    @Autowired
    public PromotionListServiceImpl(PromotionListDao promotionListDao) {
        this.promotionListDao = promotionListDao;
    }

    @Override
    public PromotionResponse getPromotionResponse() {

        PromotionResponse promotionResponse = new PromotionResponse();

        promotionResponse.setItems(promotionListDao.getPromotionList());

        return promotionResponse;
    }

}
