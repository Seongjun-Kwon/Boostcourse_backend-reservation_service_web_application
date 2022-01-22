package boostcourse.backend.reservation.service;

import boostcourse.backend.reservation.dto.DisplayInfo;
import boostcourse.backend.reservation.dto.DisplayInfoResponse;

public interface DisplayInfoService {
    DisplayInfo getDisplayInfo(int displayInfoId);

    DisplayInfoResponse getDisplayInfoResponse(int displayInfoId);
}
