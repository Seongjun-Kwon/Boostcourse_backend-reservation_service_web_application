package boostcourse.backend.reservation.service.impl;

import boostcourse.backend.reservation.dao.*;
import boostcourse.backend.reservation.dto.DisplayInfo;
import boostcourse.backend.reservation.dto.DisplayInfoResponse;
import boostcourse.backend.reservation.service.DisplayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisplayInfoServiceImpl implements DisplayInfoService {
    private final DisplayInfoDao displayInfoDao;
    private final DisplayInfoImageDao displayInfoImageDao;
    private final ProductImageListDao productImageListDao;
    private final ProductPriceListDao productPriceListDao;
    private final CommentListDao commentListDao;

    @Autowired
    public DisplayInfoServiceImpl(DisplayInfoDao displayInfoDao, DisplayInfoImageDao displayInfoImageDao,
                                  ProductImageListDao productImageListDao, ProductPriceListDao productPriceListDao,
                                  CommentListDao commentListDao) {

        this.displayInfoDao = displayInfoDao;
        this.displayInfoImageDao = displayInfoImageDao;
        this.productImageListDao = productImageListDao;
        this.productPriceListDao = productPriceListDao;
        this.commentListDao = commentListDao;
    }

    @Override
    public DisplayInfo getDisplayInfo(int displayInfoId) {
        return displayInfoDao.getDisplayInfo(displayInfoId);
    }

    @Override
    public DisplayInfoResponse getDisplayInfoResponse(int displayInfoId) {
        DisplayInfoResponse displayInfoResponse = new DisplayInfoResponse();

        DisplayInfo displayInfo = getDisplayInfo(displayInfoId);
        int productId = displayInfo.getProductId();

        displayInfoResponse.setAverageScore(commentListDao.getCommentAverageScore(productId));
        displayInfoResponse.setComments(commentListDao.getCommentList(productId));
        displayInfoResponse.setDisplayInfo(displayInfo);
        displayInfoResponse.setDisplayInfoImage(displayInfoImageDao.getDisplayInfoImage(displayInfoId));
        displayInfoResponse.setProductImages(productImageListDao.getProductImageList(productId));
        displayInfoResponse.setProductPrices(productPriceListDao.getProductPriceList(productId));

        return displayInfoResponse;
    }
}
