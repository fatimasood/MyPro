package com.example.mproject;

class ContactModel {
    String ram,date,stime,atime;

    public ContactModel( String ram, String date,String stime,String atime) {
        this.ram = ram;
        this.date = date;
        this.stime = stime;
        this.atime=atime;
    }

    //getter
    public String getRam() {
        return ram;
    }

    public String getdate() {
        return date;
    }

    public String getStime()
    {
        return stime;
    }

    public String getAtime()
    {
        return atime;
    }

    //setter
    public void setRam(String ram1) {
        ram = ram1;
    }

    public void setDate(String date1) {
        date = date1;
    }

    public void setStime(String stime1) {
        stime = stime1;
    }
    public void setAtime(String atime1) {
        atime = atime1;
    }
}