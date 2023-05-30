package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.CustomerComment;

@Dao
public interface CustomerCommentDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(CustomerComment customerComment);

    @Update
    void update(CustomerComment customerComment);

    @Delete
    void delete(CustomerComment customerComment);

    @Query("SELECT * FROM tbl_branch_containers")
    List<CustomerComment> getAllCustomerComments();

    @Query("SELECT * FROM tbl_branch_containers WHERE branch_container_id = :id")
    CustomerComment getCustomerCommentById(int id);
}