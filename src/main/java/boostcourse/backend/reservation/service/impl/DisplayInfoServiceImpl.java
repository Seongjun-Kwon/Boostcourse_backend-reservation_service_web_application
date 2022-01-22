package boostcourse.backend.reservation.service.impl;

import boostcourse.backend.reservation.dao.DisplayInfoDao;
import boostcourse.backend.reservation.dto.DisplayInfo;
import boostcourse.backend.reservation.service.DisplayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisplayInfoServiceImpl implements DisplayInfoService {
    private final DisplayInfoDao displayInfoDao;

    @Autowired
    public DisplayInfoServiceImpl(DisplayInfoDao displayInfoDao) {
        this.displayInfoDao = displayInfoDao;
    }

    @Override
    public DisplayInfo getDisplayInfo(int displayInfoId) {
        return displayInfoDao.getDisplayInfo(displayInfoId);
    }
}
