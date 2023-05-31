package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Comment;

@Dao
public interface CommentDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Comment comment);

    @Update
    void update(Comment comment);

    @Delete
    void delete(Comment comment);

    @Query("SELECT * FROM tbl_comments")
    List<Comment> getAllComments();

    @Query("SELECT * FROM tbl_comments WHERE comment_id = :commentId")
    Comment getCommentById(int commentId);
}