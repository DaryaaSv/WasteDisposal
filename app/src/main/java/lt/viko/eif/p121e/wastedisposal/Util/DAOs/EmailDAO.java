package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Email;

@Dao
public interface EmailDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Email email);

    @Update
    void update(Email email);

    @Delete
    void delete(Email email);

    @Query("SELECT * FROM tbl_emails")
    List<Email> getAllEmails();

    @Query("SELECT * FROM tbl_emails WHERE email_id = :id")
    Email getEmailById(int id);
}