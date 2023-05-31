package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Milestone;

@Dao
public interface MilestoneDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Milestone milestone);

    @Update
    void update(Milestone milestone);

    @Delete
    void delete(Milestone milestone);

    @Query("SELECT * FROM tbl_milestones")
    List<Milestone> getAllMilestones();

    @Query("SELECT * FROM tbl_milestones WHERE milestone_id = :id")
    Milestone getMilestoneById(int id);
}