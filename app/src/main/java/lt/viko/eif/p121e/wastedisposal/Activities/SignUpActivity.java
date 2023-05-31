package lt.viko.eif.p121e.wastedisposal.Activities;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import lt.viko.eif.p121e.wastedisposal.Models.Address;
import lt.viko.eif.p121e.wastedisposal.Models.Customer;
import lt.viko.eif.p121e.wastedisposal.Models.DAOs.AddressDAO;
import lt.viko.eif.p121e.wastedisposal.R;
import lt.viko.eif.p121e.wastedisposal.Util.AppDatabase;
import lt.viko.eif.p121e.wastedisposal.Models.DAOs.CustomerDAO;

public class SignUpActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextUsername;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private CheckBox checkBoxShowPassword;
    private EditText editTextPhoneNumber;
    private EditText editCountry;
    private EditText editRegion;
    private EditText editCity;
    private TextView textViewBackToLogin;
    private AppDatabase appDatabase;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_register);

        editTextName = findViewById(R.id.editTextName);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        checkBoxShowPassword = findViewById(R.id.checkBoxShowPassword);
        editTextPhoneNumber = findViewById(R.id.editPhoneNumber);
        editCountry = findViewById(R.id.editCountry);
        editRegion = findViewById(R.id.editRegion);
        editCity = findViewById(R.id.editCity);
        appDatabase = AppDatabase.getInstance(getApplicationContext());
        textViewBackToLogin = findViewById(R.id.textViewBackToLogin);
        intent = new Intent(SignUpActivity.this, LogInActivity.class);

        checkBoxShowPassword.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                editTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        textViewBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }

    public void signUp(View view) {
        String name = editTextName.getText().toString();
        String username = editTextUsername.getText().toString();
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();
        String phoneNumber = editTextPhoneNumber.getText().toString();

        String country = editCountry.getText().toString();
        String region = editRegion.getText().toString();
        String city = editCity.getText().toString();

        Address address = new Address(country, region, city);

        AddressDAO addressDAO = appDatabase.addressDAO();
        CustomerDAO customerDao = appDatabase.customerDAO();

        try {
            AsyncTask.execute(new Runnable() {
                @Override
                public void run() {
                    addressDAO.insert(address);
                    int addressId = (addressDAO.getAddressByProperties(country, region, city)).getId();

                    Customer customer = new Customer(name, phoneNumber, email, username, password, addressId);
                    customerDao.insert(customer);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(SignUpActivity.this, "Account created successfully", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                        }
                    });
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
