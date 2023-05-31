package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.BranchBuyingIn;

@Dao
public interface BranchBuyingInDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(BranchBuyingIn branchBuyingIn);

    @Update
    void update(BranchBuyingIn branchBuyingIn);

    @Delete
    void delete(BranchBuyingIn branchBuyingIn);

    @Query("SELECT * FROM tbl_branch_buying_in")
    List<BranchBuyingIn> getAllBranchBuyingIn();

    @Query("SELECT * FROM tbl_branch_buying_in WHERE branch_buying_in_id = :branchBuyingInId")
    BranchBuyingIn getBranchBuyingInById(int branchBuyingInId);
}