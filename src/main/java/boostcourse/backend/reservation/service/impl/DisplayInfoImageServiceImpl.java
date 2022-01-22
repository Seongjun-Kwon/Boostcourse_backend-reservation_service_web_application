package boostcourse.backend.reservation.service.impl;

import boostcourse.backend.reservation.dao.DisplayInfoImageDao;
import boostcourse.backend.reservation.dto.DisplayInfoImage;
import boostcourse.backend.reservation.service.DisplayInfoImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisplayInfoImageServiceImpl implements DisplayInfoImageService {
    private final DisplayInfoImageDao displayInfoImageDao;

    @Autowired
    public DisplayInfoImageServiceImpl(DisplayInfoImageDao displayInfoImageDao) {
        this.displayInfoImageDao = displayInfoImageDao;
    }

    @Override
    public DisplayInfoImage getDisPlayInfoImage(int displayInfoId) {
        return displayInfoImageDao.getDisplayInfoImage(displayInfoId);
    }
}
