package lt.viko.eif.p121e.wastedisposal.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Milestone;
import lt.viko.eif.p121e.wastedisposal.R;

public class MilestoneAdapter extends RecyclerView.Adapter<MilestoneAdapter.MilestoneViewHolder> {
    private List<Milestone> milestoneList;

    public MilestoneAdapter(List<Milestone> milestoneList) {
        this.milestoneList = milestoneList;
    }

    @NonNull
    @Override
    public MilestoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_milestone, parent, false);
        return new MilestoneViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MilestoneViewHolder holder, int position) {
        Milestone milestone = milestoneList.get(position);
        holder.bind(milestone);
    }

    @Override
    public int getItemCount() {
        return milestoneList.size();
    }

    public static class MilestoneViewHolder extends RecyclerView.ViewHolder {
        private TextView conditionTextView;
        private TextView milestoneCodeTextView;
        private TextView descriptionTextView;

        public MilestoneViewHolder(View itemView) {
            super(itemView);
            conditionTextView = itemView.findViewById(R.id.conditionTextView);
            milestoneCodeTextView = itemView.findViewById(R.id.milestoneCodeTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }

        public void bind(Milestone milestone) {
            conditionTextView.setText(milestone.getCondition());
            milestoneCodeTextView.setText(milestone.getMilestoneCode());
            descriptionTextView.setText(milestone.getDescription());
        }
    }
}
