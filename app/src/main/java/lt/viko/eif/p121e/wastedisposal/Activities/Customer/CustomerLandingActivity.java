package lt.viko.eif.p121e.wastedisposal.Activities.Customer;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;;

import lt.viko.eif.p121e.wastedisposal.Activities.LogInActivity;
import lt.viko.eif.p121e.wastedisposal.Models.Customer;
import lt.viko.eif.p121e.wastedisposal.R;
import lt.viko.eif.p121e.wastedisposal.Util.AppDatabase;

public class CustomerLandingActivity extends AppCompatActivity  {
    private TextView textViewLogout;
    private TextView textViewUsername;
    private TextView textViewUsernameMail;
    private TextView textViewSettings;
    private AppDatabase appDatabase;
    private Intent intent;
    private Button buttonMilestones;
    private Button buttonOrders;
    private ImageView imageViewButtonRecycle;
    private ImageView imageViewButtonBuyingIn;
    private int userID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_landing);

        textViewLogout = findViewById(R.id.textViewLogout);
        textViewUsername = findViewById(R.id.textViewUsername);
        textViewUsernameMail = findViewById(R.id.textViewUsernameMail);
        textViewSettings = findViewById(R.id.textViewSettings);

        imageViewButtonRecycle = findViewById(R.id.imageViewButtonRecycle); // Initialize imageViewButtonRecycle
        imageViewButtonBuyingIn = findViewById(R.id.imageViewButtonBuyingIn); // Initialize imageViewButtonBuyingIn

        buttonMilestones = findViewById(R.id.buttonMilestones);
        buttonOrders = findViewById(R.id.buttonOrders);

        appDatabase = AppDatabase.getInstance(getApplicationContext());
        intent = new Intent(CustomerLandingActivity.this, LogInActivity.class);

        Bundle arguments = getIntent().getExtras();
        userID = arguments.getInt("id");

        new AsyncTask<Integer, Void, Customer>() {
            @Override
            protected Customer doInBackground(Integer... params) {
                int customerId = params[0];
                return appDatabase.customerDAO().getCustomerById(customerId);
            }

            @Override
            protected void onPostExecute(Customer customer) {
                super.onPostExecute(customer);
                if (customer != null) {
                    textViewUsername.setText(customer.getUsername());
                    textViewUsernameMail.setText(customer.getEmail());
                }
            }
        }.execute(userID);

        textViewLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        buttonMilestones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(CustomerLandingActivity.this, CustomerMilestonesActivity.class);
                startActivity(intent);
            }
        });

        buttonOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(CustomerLandingActivity.this, CustomerOrdersActivity.class);
                startActivity(intent);
            }
        });

        textViewSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(CustomerLandingActivity.this, CustomerSettingsActivity.class);
                intent.putExtra("id", userID);
                startActivity(intent);
            }
        });

        imageViewButtonRecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle onClick for imageViewButtonRecycle
                // Add your logic here
            }
        });

        imageViewButtonBuyingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle onClick for imageViewButtonBuyingIn
                // Add your logic here
            }
        });
    }
}
