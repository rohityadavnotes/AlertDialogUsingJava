package com.dialog.using.java;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShowAlertDialogActivity extends AppCompatActivity {

    private static final String TAG = ShowAlertDialogActivity.class.getSimpleName();

    private MaterialButton showDialogMaterialButton;

    private String[] itemsList;
    private boolean[] checkedItems;
    private ArrayList<Integer> selectedItems;

    private static int singleCheckedItem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_alert_dialog);
        initializeView();
        initializeObject();
        setOnClickListener();
    }

    protected void initializeView() {
        showDialogMaterialButton = findViewById(R.id.showDialogMaterialButton);
    }

    protected void initializeObject() {
        itemsList       = getResources().getStringArray(R.array.shopping_item);
        checkedItems    = new boolean[itemsList.length];
        selectedItems   = new ArrayList<>();
    }

    protected void setOnClickListener() {
        showDialogMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeAlertDialog(ShowAlertDialogActivity.this);
            }
        });
    }

    public void alertDialog(Activity activity) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);

        alertDialogBuilder.setIcon(R.drawable.ic_android);
        alertDialogBuilder.setTitle("Title");
        alertDialogBuilder.setMessage("Message");

        alertDialogBuilder.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(getApplicationContext(),
                        "You clicked on Neutral Button", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        alertDialogBuilder.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(getApplicationContext(),
                        "You clicked on Negative Button", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        alertDialogBuilder.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(getApplicationContext(),
                        "You clicked on Positive Button", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }

    public void alertDialogTwo(Activity activity) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);

        alertDialogBuilder.setIcon(R.drawable.ic_android);
        alertDialogBuilder.setTitle("Title");
        alertDialogBuilder.setMessage("Message");

        alertDialogBuilder.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(getApplicationContext(),
                        "You clicked on Neutral Button", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        alertDialogBuilder.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(getApplicationContext(),
                        "You clicked on Negative Button", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        alertDialogBuilder.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(getApplicationContext(),
                        "You clicked on Positive Button", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();

        Button positiveButton   = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
        Button negativeButton   = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);
        Button neutralButton    = alertDialog.getButton(AlertDialog.BUTTON_NEUTRAL);

        positiveButton.setTextColor(Color.parseColor("#FF0B8B42"));
        positiveButton.setBackgroundColor(Color.parseColor("#FFE1FCEA"));

        negativeButton.setTextColor(Color.parseColor("#FFFF0400"));
        negativeButton.setBackgroundColor(Color.parseColor("#FFFCB9B7"));

        neutralButton.setTextColor(Color.parseColor("#FF1B5AAC"));
        neutralButton.setBackgroundColor(Color.parseColor("#FFD9E9FF"));

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        params.setMargins(20, 0, 0, 0);
        positiveButton.setLayoutParams(params);
    }

    public void exitAlertDialog(Activity activity) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);

        alertDialogBuilder.setIcon(R.drawable.ic_question_mark);
        alertDialogBuilder.setTitle("Confirm Exit");
        alertDialogBuilder.setMessage("Are you sure you want to exit?");

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }

    public void customAlertDialogOne(Activity activity) {
        LayoutInflater inflater = getLayoutInflater();
        View customAlertDialogLayout = inflater.inflate(R.layout.custom_alert_dialog_one, null);

        TextInputLayout emailTextInputLayout        = customAlertDialogLayout.findViewById(R.id.emailTextInputLayout);
        TextInputEditText emailTextInputEditText    = customAlertDialogLayout.findViewById(R.id.emailTextInputEditText);

        TextInputLayout passwordTextInputLayout     = customAlertDialogLayout.findViewById(R.id.passwordTextInputLayout);
        TextInputEditText passwordTextInputEditText = customAlertDialogLayout.findViewById(R.id.passwordTextInputEditText);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);

        alertDialogBuilder.setIcon(R.drawable.ic_account);
        alertDialogBuilder.setTitle("Sing In");

        alertDialogBuilder.setNegativeButton("DONE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(getApplicationContext(),
                        "You clicked on Negative Button", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        alertDialogBuilder.setPositiveButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(getApplicationContext(),
                        "You clicked on Positive Button", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        alertDialogBuilder.setView(customAlertDialogLayout);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }

    public void customAlertDialogTwo(Activity activity) {
        LayoutInflater inflater = getLayoutInflater();
        View customAlertDialogLayout = inflater.inflate(R.layout.custom_alert_dialog_two, null);

        TextView signInHeadingTextView              = customAlertDialogLayout.findViewById(R.id.signInHeadingTextView);

        TextInputLayout emailTextInputLayout        = customAlertDialogLayout.findViewById(R.id.emailTextInputLayout);
        TextInputEditText emailTextInputEditText    = customAlertDialogLayout.findViewById(R.id.emailTextInputEditText);

        TextInputLayout passwordTextInputLayout     = customAlertDialogLayout.findViewById(R.id.passwordTextInputLayout);
        TextInputEditText passwordTextInputEditText = customAlertDialogLayout.findViewById(R.id.passwordTextInputEditText);

        MaterialButton signInMaterialButton         = customAlertDialogLayout.findViewById(R.id.signInMaterialButton);
        MaterialButton signUpLinkMaterialButton     = customAlertDialogLayout.findViewById(R.id.signUpLinkMaterialButton);

        signInMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        signUpLinkMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);
        alertDialogBuilder.setView(customAlertDialogLayout);

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }

    public void customAlertDialogTesting(Activity activity) {
        LayoutInflater inflater = getLayoutInflater();
        View customAlertDialogLayout = inflater.inflate(R.layout.test_custom_alert_dialog, null);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);
        alertDialogBuilder.setView(customAlertDialogLayout);
        alertDialogBuilder.setCancelable(false);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void singleChoiceAlertDialog(Activity activity) {
        final String[] stringArray = getResources().getStringArray(R.array.languages);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);

        alertDialogBuilder.setTitle("Select Language");

        alertDialogBuilder.setItems(stringArray, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int indexPosition) {
                String selectedItem = Arrays.asList(stringArray).get(indexPosition);
                Toast.makeText(getApplicationContext(), "Selected Language: " + selectedItem, Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }

    public void setSingleChoiceAlertDialog(Activity activity) {
        final String[] stringArray = new String[]{"Rohit", "Abhishek", "Jatinder", "Shiva", "Rama"};

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);

        alertDialogBuilder.setTitle("Select Name");

        alertDialogBuilder.setSingleChoiceItems(stringArray, singleCheckedItem, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int indexPosition) {
                singleCheckedItem = indexPosition;
                String selectedItem = Arrays.asList(stringArray).get(singleCheckedItem);
                Toast.makeText(getApplicationContext(), "Selected Language: " + selectedItem, Toast.LENGTH_LONG).show();
            }
        });

        alertDialogBuilder.setNeutralButton("Clear all", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                singleCheckedItem = 0;
            }
        });

        alertDialogBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }

    public void multiChoiceAlertDialog(Activity activity) {
       /* final String[] itemsList = getResources().getStringArray(R.array.shopping_item);
        final boolean[] checkedItems = new boolean[itemsList.length];
        final ArrayList<Integer> selectedItems = new ArrayList<>();*/

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);

        alertDialogBuilder.setTitle("Select Item");
        alertDialogBuilder.setMultiChoiceItems(itemsList, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {
                if (isChecked) {
                    selectedItems.add(position);
                } else {
                    selectedItems.remove((Integer.valueOf(position)));
                }
            }
        });

        alertDialogBuilder.setNeutralButton("Clear all", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                for (int i = 0; i < checkedItems.length; i++) {
                    checkedItems[i] = false;
                    selectedItems.clear();
                }
            }
        });

        alertDialogBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                String item = "";
                for (int i = 0; i < selectedItems.size(); i++) {
                    item = item + itemsList[selectedItems.get(i)];
                    if (i != selectedItems.size() - 1) {
                        item = item + ", ";
                    }
                }
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }

    public void multiChoiceAlertDialogTwo(Activity activity) {
        final String[] colorsArray = new String[]{"Black", "Orange", "Green", "Yellow", "White", "Purple"};
        final boolean[] checkedColorsArray = new boolean[]{
                true, /* Black checked */
                false, /* Orange */
                false, /* Green */
                true, /* Yellow checked */
                false, /* White */
                false  /* Purple */
        };

        /* Convert the color array to list */
        final List<String> colorsList = Arrays.asList(colorsArray);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);

        alertDialogBuilder.setTitle("Select Item");
        alertDialogBuilder.setMultiChoiceItems(colorsArray, checkedColorsArray, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {
                checkedColorsArray[position] = isChecked;
                String currentItem = colorsList.get(position);
                Toast.makeText(getApplicationContext(), currentItem + " " + isChecked, Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setNeutralButton("Clear all", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                for (int i = 0; i < checkedColorsArray.length; i++) {
                    checkedColorsArray[i] = false;
                }
            }
        });

        alertDialogBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                System.out.println("Your preferred colors..... \n");
                for (int i = 0; i < checkedColorsArray.length; i++) {
                    boolean checked = checkedColorsArray[i];
                    if (checked) {
                        System.out.println(colorsList.get(i) + "\n");
                    }
                }
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }

    public void dateAlertDialog(Activity activity) {
        DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int monthofYear, int dayOfMonth) {
                System.out.println("Date: " + dayOfMonth + "/" + (monthofYear + 1) + "/" + year);
            }
        };

        DatePicker datePicker = new DatePicker(getBaseContext());
        DatePickerDialog datePickerDialog = new DatePickerDialog(activity, onDateSetListener, datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
        datePickerDialog.show();
    }

    public void timeAlertDialog(Activity activity) {
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                System.out.println("Time: " + hourOfDay + ":" + minute);
            }
        };

        TimePicker timePicker = new TimePicker(activity);
        TimePickerDialog timePickerDialog = new TimePickerDialog(activity, onTimeSetListener, timePicker.getCurrentHour(), timePicker.getCurrentMinute(), true);
        timePickerDialog.show();
    }
}