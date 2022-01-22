package boostcourse.backend.reservation.dao.impl;

import boostcourse.backend.reservation.dao.CommentListDao;
import boostcourse.backend.reservation.dto.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentListDaoImpl implements CommentListDao {
    @Override
    public List<Comment> getCommentList(int productId) {
        return null;
    }

    @Override
    public double getCommentAverageScore(int productId) {
        return 0;
    }
}
