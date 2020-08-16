package com.example.android.tourguide;

import android.os.Parcel;
import android.os.Parcelable;

public class Information implements Parcelable {
    private String placeName;
    private String nearestMetro;
    private String distanceFromMetro;
    private int placeImageResourceID;
    private String phoneNo;
    private String address;
    private String palaceDiscription;

    public Information(String placeName, String nearestMetro, String distanceFromMetro, int placeImageResourceID,
                String phoneNo, String address, String palaceDiscription) {
        this.placeName = placeName;
        this.nearestMetro = nearestMetro;
        this.distanceFromMetro = distanceFromMetro;
        this.placeImageResourceID = placeImageResourceID;
        this.phoneNo = phoneNo;
        this.address = address;
        this.palaceDiscription = palaceDiscription;
    }

    protected Information(Parcel in) {
        placeName = in.readString();
        nearestMetro = in.readString();
        distanceFromMetro = in.readString();
        placeImageResourceID = in.readInt();
        phoneNo = in.readString();
        address = in.readString();
        palaceDiscription = in.readString();
    }

    public static final Creator<Information> CREATOR = new Creator<Information>() {
        @Override
        public Information createFromParcel(Parcel in) {
            return new Information(in);
        }

        @Override
        public Information[] newArray(int size) {
            return new Information[size];
        }
    };

    public String getPlaceName() {
        return placeName;
    }

    public String getNearestMetro() {
        return nearestMetro;
    }

    public String getDistanceFromMetro() {
        return distanceFromMetro;
    }

    public int getPlaceImageResourceID() {
        return placeImageResourceID;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public String getPalaceDiscription() {
        return palaceDiscription;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public void setNearestMetro(String nearestMetro) {
        this.nearestMetro = nearestMetro;
    }

    public void setDistanceFromMetro(String distanceFromMetro) {
        this.distanceFromMetro = distanceFromMetro;
    }

    public void setPlaceImageResourceID(int placeImageResourceID) {
        this.placeImageResourceID = placeImageResourceID;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPalaceDiscription(String palaceDiscription) {
        this.palaceDiscription = palaceDiscription;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(placeName);
        dest.writeString(nearestMetro);
        dest.writeString(distanceFromMetro);
        dest.writeInt(placeImageResourceID);
        dest.writeString(phoneNo);
        dest.writeString(address);
        dest.writeString(palaceDiscription);
    }
}
