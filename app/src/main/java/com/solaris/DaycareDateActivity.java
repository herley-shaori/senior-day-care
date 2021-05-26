package com.solaris;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DaycareDateActivity extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private TextView tvDateResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daycare_date);

        ActionBar supportActionBar = this.getSupportActionBar();
        supportActionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.senja_logo_horizontal));
        supportActionBar.setDisplayShowTitleEnabled(false);

        this.dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        this.tvDateResult = findViewById(R.id.pilihTanggalInputEditText);

        findViewById(R.id.pickADate).setOnClickListener(v -> doPickADate());
    }

    /**
     * Tampilkan date picker dan set tanggal.
     */
    private void doPickADate() {
        /**
         * Calendar untuk mendapatkan tanggal sekarang
         */
        Calendar newCalendar = Calendar.getInstance();

        /**
         * Initiate DatePicker dialog
         */
        datePickerDialog = new DatePickerDialog(DaycareDateActivity.this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                /**
                 * Method ini dipanggil saat kita selesai memilih tanggal di DatePicker
                 */

                /**
                 * Set Calendar untuk menampung tanggal yang dipilih
                 */
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                /**
                 * Update TextView dengan tanggal yang kita pilih
                 */
                tvDateResult.setText(dateFormatter.format(newDate.getTime()));
                findViewById(R.id.goButton).setEnabled(true);
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        /**
         * Tampilkan DatePicker dialog
         */
        datePickerDialog.show();
    }
}