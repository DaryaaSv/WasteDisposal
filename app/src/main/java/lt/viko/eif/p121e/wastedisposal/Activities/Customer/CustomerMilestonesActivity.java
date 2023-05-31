package lt.viko.eif.p121e.wastedisposal.Activities.Customer;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Adapters.MilestoneAdapter;
import lt.viko.eif.p121e.wastedisposal.Models.Milestone;
import lt.viko.eif.p121e.wastedisposal.R;
import lt.viko.eif.p121e.wastedisposal.Util.AppDatabase;

public class CustomerMilestonesActivity extends AppCompatActivity {
    private RecyclerView milestonesRecyclerView;
    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_milestones);

        appDatabase = AppDatabase.getInstance(getApplicationContext());
        milestonesRecyclerView = findViewById(R.id.milestonesRecyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        milestonesRecyclerView.setLayoutManager(layoutManager);

        new AsyncTask<Void, Void, List<Milestone>>() {
            @Override
            protected List<Milestone> doInBackground(Void... voids) {
                return appDatabase.milestoneDAO().getAllMilestones();
            }

            @Override
            protected void onPostExecute(List<Milestone> milestoneList) {
                super.onPostExecute(milestoneList);
                MilestoneAdapter adapter = new MilestoneAdapter(milestoneList);
                milestonesRecyclerView.setAdapter(adapter);
            }
        }.execute();
    }
}