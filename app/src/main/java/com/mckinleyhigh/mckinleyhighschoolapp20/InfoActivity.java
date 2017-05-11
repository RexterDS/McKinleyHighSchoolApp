package com.mckinleyhigh.mckinleyhighschoolapp20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InfoActivity extends AppCompatActivity {

    String schoolinfo = "School Information";
    String addressinfo = "1039 South King Street Honolulu, HI 96814";
    String contactinfo = "(808) 594-0400";

    String counselortitle = "Counselors";
    String description = "Students are assigned to a counselor based on their last name.";
    String counselorinfo = "A-Del               Erik Smith\n" +
            "Dem-Ke           Lisa Saito\n" +
            "Kf-Muo            Shane Cummings\n" +
            "Mup-Sog          Christine Affleck\n" +
            "Soh-Z               Lynne Medeiros\n";

    String bellschedule = "Bell Schedule";

    String campusmap = "Campus Map";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView schoolinfotextview = (TextView) findViewById(R.id.SchoolInfoTitle);
        TextView addressinfotextview = (TextView) findViewById(R.id.AddressInformation);
        TextView contactinfotextview = (TextView) findViewById(R.id.ContactInformation);

        TextView counselortitletextview = (TextView) findViewById(R.id.CounselorTitle);
        TextView descriptiontextview = (TextView) findViewById(R.id.Description);
        TextView counselorinfotextview = (TextView) findViewById(R.id.CounselorAssignment);

        schoolinfotextview.setText(schoolinfo);
        addressinfotextview.setText(addressinfo);
        contactinfotextview.setText(contactinfo);

        counselortitletextview.setText(counselortitle);
        descriptiontextview.setText(description);
        counselorinfotextview.setText(counselorinfo);

    }
}
