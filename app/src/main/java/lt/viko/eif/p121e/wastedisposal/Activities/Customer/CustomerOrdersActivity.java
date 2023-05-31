package lt.viko.eif.p121e.wastedisposal.Activities.Customer;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Adapters.OrderAdapter;
import lt.viko.eif.p121e.wastedisposal.Models.Order;
import lt.viko.eif.p121e.wastedisposal.R;
import lt.viko.eif.p121e.wastedisposal.Util.AppDatabase;

public class CustomerOrdersActivity extends AppCompatActivity {
    private RecyclerView ordersView;
    private AppDatabase appDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_orders);
        appDatabase = AppDatabase.getInstance(getApplicationContext());

        ordersView = findViewById(R.id.ordersView);


        new AsyncTask<Void, Void, List<Order>>() {
            @Override
            protected List<Order> doInBackground(Void... voids) {
                return appDatabase.orderDAO().getAllOrders();
            }

            @Override
            protected void onPostExecute(List<Order> orderList) {
                super.onPostExecute(orderList);
                OrderAdapter adapter = new OrderAdapter(orderList);
                ordersView.setAdapter(adapter);
            }
        }.execute();
    }
}
