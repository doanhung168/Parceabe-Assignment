package com.doanhung.parceable.model;

import android.os.Parcel;

import androidx.annotation.NonNull;

public class Worker extends Person {
    private long mSalary;

    public Worker() {
    }

    public Worker(long mSalary) {
        this.mSalary = mSalary;
    }

    public long getSalary() {
        return mSalary;
    }

    public void setSalary(long salary) {
        this.mSalary = salary;
    }

    public Worker(Parcel in) {
        super(in);
        this.mSalary = in.readLong();
    }

    public static final Creator<Worker> CREATOR = new Creator<Worker>() {
        @Override
        public Worker createFromParcel(Parcel in) {
            return new Worker(in);
        }

        @Override
        public Worker[] newArray(int size) {
            return new Worker[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeLong(mSalary);
    }

    @NonNull
    @Override
    public String toString() {
        return "Worker{" +
                "name = " + getName()
                + "; age = " + getAge() +
                "; mSalary=" + mSalary +
                '}';
    }
}
