package com.doanhung.parceable.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
    private String mName;
    private int mAge;

    public Person() {

    }

    public Person(String mName, int mAge) {
        this.mName = mName;
        this.mAge = mAge;
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int mAge) {
        this.mAge = mAge;
    }

    protected Person(Parcel in) {
        mName = in.readString();
        mAge = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);
        dest.writeInt(mAge);
    }
}
