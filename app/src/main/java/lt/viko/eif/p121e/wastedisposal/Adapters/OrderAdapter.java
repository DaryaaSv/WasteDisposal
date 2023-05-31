package lt.viko.eif.p121e.wastedisposal.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Order;
import lt.viko.eif.p121e.wastedisposal.R;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private List<Order> orderList;

    public OrderAdapter(List<Order> orderList) {
        this.orderList = orderList;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item, parent, false);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        Order order = orderList.get(position);

        holder.textOrderId.setText("Order ID: " + order.getId());
        holder.textIsDone.setText("Is Done: " + order.isDone());
        holder.textCustomerNote.setText("Customer Note: " + order.getCustomerNote());
        holder.textOrderDate.setText("Order Date: " + order.getOrderDate());
        holder.textCustomerId.setText("Customer ID: " + order.getCustomerId());
        holder.textBranchId.setText("Branch ID: " + order.getBranchId());
        holder.textOrderTypeId.setText("Order Type ID: " + order.getOrderTypeId());
        holder.textServiceId.setText("Service ID: " + order.getServiceId());
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    public class OrderViewHolder extends RecyclerView.ViewHolder {
        public TextView textOrderId;
        public TextView textIsDone;
        public TextView textCustomerNote;
        public TextView textOrderDate;
        public TextView textCustomerId;
        public TextView textBranchId;
        public TextView textOrderTypeId;
        public TextView textServiceId;

        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            textOrderId = itemView.findViewById(R.id.text_order_id);
            textIsDone = itemView.findViewById(R.id.text_is_done);
            textCustomerNote = itemView.findViewById(R.id.text_customer_note);
            textOrderDate = itemView.findViewById(R.id.text_order_date);
            textCustomerId = itemView.findViewById(R.id.text_customer_id);
            textBranchId = itemView.findViewById(R.id.text_branch_id);
            textOrderTypeId = itemView.findViewById(R.id.text_order_type_id);
            textServiceId = itemView.findViewById(R.id.text_service_id);
        }
    }
}
