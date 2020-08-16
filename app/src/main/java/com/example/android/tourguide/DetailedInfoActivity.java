package com.example.android.tourguide;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailedInfoActivity extends AppCompatActivity {

    @BindView(R.id.detailInfoImageView)
    ImageView detailImage;

    @BindView(R.id.detailNameTextView)
    TextView detailplaceName;

    @BindView(R.id.nearMetroTextView)
    TextView detailNearMetro;

    @BindView(R.id.disMetroTextView)
    TextView distanceDetaiMetroText;

    @BindView(R.id.phoneTextView)
    TextView detailPhoneText;

    @BindView(R.id.addressTextView)
    TextView detailAddressText;

    @BindView(R.id.discriptionTextView)
    TextView detailDiscText;
    /************************* it gets created when activity first starts **********************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_info);
        ButterKnife.bind(this);
        extractDataAndSetToViews();
    }
    /************************** it extracts recieved intent data from fragment and populate it ************************/
    public void extractDataAndSetToViews()
    {
        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        int index = bundle.getInt("index");
        Information infoDataObject = bundle.getParcelable("object");

        assert infoDataObject != null;
        int imageResourceID = infoDataObject.getPlaceImageResourceID();
        String name = infoDataObject.getPlaceName();
        String nearMetro = getString(R.string.nearestMetroText) + infoDataObject.getNearestMetro();
        String disMetro = getString(R.string.nearestMetroDistance) + infoDataObject.getDistanceFromMetro();
        String phoneNo = getString(R.string.phoneNoText) + infoDataObject.getPhoneNo();
        String address = getString(R.string.address) + infoDataObject.getAddress();
        String discription = getString(R.string.discrip) + infoDataObject.getPalaceDiscription();

        detailImage.setImageResource(imageResourceID);
        detailplaceName.setText(name);
        detailNearMetro.setText(nearMetro);
        distanceDetaiMetroText.setText(disMetro);
        detailPhoneText.setText(phoneNo);
        detailAddressText.setText(address);
        detailDiscText.setText(discription);
    }
}
