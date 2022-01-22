package boostcourse.backend.reservation.dao;

import boostcourse.backend.reservation.dto.Comment;

import java.util.List;

public interface CommentListDao {
    List<Comment> getCommentList(int productId);

    double getCommentAverageScore(int productId);
}
