package lt.viko.eif.p121e.wastedisposal.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lt.viko.eif.p121e.wastedisposal.Models.Administrator;
import lt.viko.eif.p121e.wastedisposal.Models.Customer;
import lt.viko.eif.p121e.wastedisposal.Models.Employee;
import lt.viko.eif.p121e.wastedisposal.R;
import lt.viko.eif.p121e.wastedisposal.Util.AppDatabase;

public class LogInActivity extends AppCompatActivity {
    private TextView textViewSignUp;
    private Intent intent;
    private CheckBox checkBoxShowPassword;
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;
    private AppDatabase appDatabase;
    private Map<String, String> credentials;
    private String username;
    private String password;
    private String typeOfUser;
    private int userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_log_in);

        editTextPassword = findViewById(R.id.editTextPassword);
        checkBoxShowPassword = findViewById(R.id.checkBoxShowPassword);
        textViewSignUp = findViewById(R.id.textViewSignUp);
        editTextUsername = findViewById(R.id.editTextUsername);
        buttonLogin = findViewById(R.id.buttonSignUp);
        appDatabase = AppDatabase.getInstance(getApplicationContext());

        intent = new Intent(LogInActivity.this, SignUpActivity.class);

        textViewSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        checkBoxShowPassword.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                editTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = editTextUsername.getText().toString();
                password = editTextPassword.getText().toString();

                new DatabaseTask().execute();
            }
        });
    }

    private class DatabaseTask extends AsyncTask<Void, Void, Boolean> {
        @Override
        protected Boolean doInBackground(Void... voids) {
            credentials = createCredentialsDictionary();
            getUserType();
            return isValidCredentials(username, password);
        }

        @Override
        protected void onPostExecute(Boolean isValid) {
            if (isValid) {
                switch (typeOfUser) {
                    case "admin":
                        intent = new Intent(LogInActivity.this, AdministratorLandingActivity.class);
                        break;
                    case "employee":
                        intent = new Intent(LogInActivity.this, EmployeeLandingActivity.class);
                        break;
                    case "customer":
                        intent = new Intent(LogInActivity.this, CustomerLandingActivity.class);
                        break;
                }
                intent.putExtra("id", userID);
                startActivity(intent);
            } else {
                Toast.makeText(LogInActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private Map<String, String> createCredentialsDictionary() {
        Map<String, String> credentials = new HashMap<>();

        List<Administrator> administrators = appDatabase.administratorDAO().getAllAdministrators();
        for (Administrator admin : administrators) {
            credentials.put(admin.getUsername(), admin.getPassword());
        }

        List<Employee> employees = appDatabase.employeeDAO().getAllEmployees();
        for (Employee employee : employees) {
            credentials.put(employee.getUsername(), employee.getPassword());
        }

        List<Customer> customers = appDatabase.customerDAO().getAllCustomers();
        for (Customer customer : customers) {
            credentials.put(customer.getUsername(), customer.getPassword());
        }

        return credentials;
    }

    private boolean isValidCredentials(String username, String password) {
        return credentials.containsKey(username) && credentials.get(username).equals(password);
    }

    private void getUserType() {
        Administrator administrator = appDatabase.administratorDAO().getAdministratorByUsername(this.username);
        Employee employee = appDatabase.employeeDAO().getEmployeeByUsername(this.username);
        Customer customer = appDatabase.customerDAO().getCustomerByUsername(this.username);

        if (administrator != null) {
            typeOfUser = "admin";
            userID = administrator.getId();
        } else if (employee != null) {
            typeOfUser = "employee";
            userID = employee.getId();
        } else {
            typeOfUser = "customer";
            userID = customer.getId();
        }
    }
}