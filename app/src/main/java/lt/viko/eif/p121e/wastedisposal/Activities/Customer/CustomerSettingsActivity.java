package lt.viko.eif.p121e.wastedisposal.Activities.Customer;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import lt.viko.eif.p121e.wastedisposal.Models.Address;
import lt.viko.eif.p121e.wastedisposal.Models.Customer;
import lt.viko.eif.p121e.wastedisposal.R;
import lt.viko.eif.p121e.wastedisposal.Util.AppDatabase;

public class CustomerSettingsActivity extends AppCompatActivity  {
    private Button changeUsername;
    private Button changeEmail;
    private Button changePassword;
    private Button changePhone;
    private Button changeCountry;
    private Button changeRegion;
    private Button changeCity;
    private EditText editTextUsername;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextPhone;
    private EditText editCountry;
    private EditText editRegion;
    private EditText editCity;
    private AppDatabase appDatabase;
    private Bundle arguments;
    private int userID;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_settings);

        changeUsername = findViewById(R.id.buttonMilestones);
        changeEmail = findViewById(R.id.buttonMilestones2);
        changePassword = findViewById(R.id.buttonMilestones3);
        changePhone = findViewById(R.id.buttonMilestones4);
        changeCountry = findViewById(R.id.changeCountry);
        changeRegion = findViewById(R.id.changeRegion);
        changeCity = findViewById(R.id.changeCity);

        editTextUsername = findViewById(R.id.editTextUsername2);
        editTextEmail = findViewById(R.id.editTextUsername3);
        editTextPassword = findViewById(R.id.editTextUsername5);
        editTextPhone = findViewById(R.id.editTextUsername6);
        editCountry = findViewById(R.id.editCountry);
        editRegion = findViewById(R.id.editRegion);
        editCity = findViewById(R.id.editCity);

        appDatabase = AppDatabase.getInstance(getApplicationContext());

        arguments = getIntent().getExtras();
        userID = arguments.getInt("id");

        changeUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new UpdateCustomerTask().execute(editTextUsername.getText().toString());
                intent = new Intent(CustomerSettingsActivity.this, CustomerLandingActivity.class);
                intent.putExtra("id", userID);
                startActivity(intent);
            }
        });

        changeEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new UpdateEmailTask().execute();
                intent = new Intent(CustomerSettingsActivity.this, CustomerLandingActivity.class);
                intent.putExtra("id", userID);
                startActivity(intent);
            }
        });

        changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new UpdatePasswordTask().execute();
                intent = new Intent(CustomerSettingsActivity.this, CustomerLandingActivity.class);
                intent.putExtra("id", userID);
                startActivity(intent);
            }
        });

        changePhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new UpdatePhoneTask().execute();
                intent = new Intent(CustomerSettingsActivity.this, CustomerLandingActivity.class);
                intent.putExtra("id", userID);
                startActivity(intent);
            }
        });

        changeCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new UpdateCountryTask().execute();
                intent = new Intent(CustomerSettingsActivity.this, CustomerLandingActivity.class);
                intent.putExtra("id", userID);
                startActivity(intent);
            }
        });

        changeRegion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new UpdateRegionTask().execute();
                intent = new Intent(CustomerSettingsActivity.this, CustomerLandingActivity.class);
                intent.putExtra("id", userID);
                startActivity(intent);
            }
        });

        changeCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new UpdateCityTask().execute();
                intent = new Intent(CustomerSettingsActivity.this, CustomerLandingActivity.class);
                intent.putExtra("id", userID);
                startActivity(intent);
            }
        });
    }
    private class UpdateCustomerTask extends AsyncTask<String, Void, Void> {
        @Override
        protected Void doInBackground(String... strings) {
            Customer customer = appDatabase.customerDAO().getCustomerById(userID);
            customer.setUsername(strings[0]);
            appDatabase.customerDAO().update(customer);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(CustomerSettingsActivity.this, "Data was successfully changed!", Toast.LENGTH_SHORT).show();
        }
    }

    private class UpdateEmailTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            Customer customer = appDatabase.customerDAO().getCustomerById(userID);
            customer.setEmail(editTextEmail.getText().toString());
            appDatabase.customerDAO().update(customer);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(CustomerSettingsActivity.this, "Data was successfully changed!", Toast.LENGTH_SHORT).show();
        }
    }

    private class UpdatePasswordTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            Customer customer = appDatabase.customerDAO().getCustomerById(userID);
            customer.setPassword(editTextPassword.getText().toString());
            appDatabase.customerDAO().update(customer);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(CustomerSettingsActivity.this, "Data was successfully changed!", Toast.LENGTH_SHORT).show();
        }
    }

    private class UpdatePhoneTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            Customer customer = appDatabase.customerDAO().getCustomerById(userID);
            customer.setPhoneNumber(editTextPhone.getText().toString());
            appDatabase.customerDAO().update(customer);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(CustomerSettingsActivity.this, "Data was successfully changed!", Toast.LENGTH_SHORT).show();
        }
    }

    private class UpdateCountryTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            Customer customer = appDatabase.customerDAO().getCustomerById(userID);
            Address address = appDatabase.addressDAO().getAddressById(customer.getAddressId());
            address.setCountry(editCountry.getText().toString());
            appDatabase.addressDAO().update(address);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(CustomerSettingsActivity.this, "Data was successfully changed!", Toast.LENGTH_SHORT).show();
        }
    }

    private class UpdateRegionTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            Customer customer = appDatabase.customerDAO().getCustomerById(userID);
            Address address = appDatabase.addressDAO().getAddressById(customer.getAddressId());
            address.setRegion(editRegion.getText().toString());
            appDatabase.addressDAO().update(address);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(CustomerSettingsActivity.this, "Data was successfully changed!", Toast.LENGTH_SHORT).show();
        }
    }

    private class UpdateCityTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            Customer customer = appDatabase.customerDAO().getCustomerById(userID);
            Address address = appDatabase.addressDAO().getAddressById(customer.getAddressId());
            address.setCity(editCity.getText().toString());
            appDatabase.addressDAO().update(address);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(CustomerSettingsActivity.this, "Data was successfully changed!", Toast.LENGTH_SHORT).show();
        }
    }
}
