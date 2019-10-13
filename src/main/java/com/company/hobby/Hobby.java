package com.company.hobby;

public class Hobby {
    private byte nDayBirthday;
    private int  nMonthBirthday;     
    private short nYearBirthday;
    private char cSkiDifficulty; //Blue - light, red - simple,  black - for experts.
    private float nDayDistance;
    private double nTotalDistance;
    private long  nLong;
    private boolean lboolean;


    public int getnMonthBirthday() {        return nMonthBirthday;    }
    public void setnMonthBirthday(int nMonthBirthday) {        this.nMonthBirthday = nMonthBirthday;    }

    public byte getnDayBirthday() {        return nDayBirthday;    }
    public void setnDayBirthday(byte nDayBirthday) {        this.nDayBirthday = nDayBirthday;    }

    public char getcSkiDifficulty() {        return cSkiDifficulty;    }
    public void setcSkiDifficulty(char cSkiDifficulty) {        this.cSkiDifficulty = cSkiDifficulty;    }

    public short getnYearBirthday() {        return nYearBirthday;    }
    public void setnYearBirthday(short nYearBirthday) {        this.nYearBirthday = nYearBirthday;    }

    public long getnLong() {        return nLong;    }
    public void setnLong(long nLong) {        this.nLong = nLong;    }

    public double getnTotalDistance() {        return nTotalDistance;    }
    public void setnTotalDistance(double nTotalDistance) {        this.nTotalDistance = nTotalDistance;    }

    public float getnDayDistance() {        return nDayDistance;    }
    public void setnDayDistance(float nDayDistance) {        this.nDayDistance = nDayDistance;    }

    public boolean isLboolean() {        return lboolean;    }
    public void setLboolean(boolean lboolean) {        this.lboolean = lboolean;    }

    //  конструктор
    /*public Hobby( int  nMonthBirthday, byte nDayBirthday, char cSkiDifficulty, short nYearBirthday,
                  long  nLong, double nTotalDistance, float nDayDistance, boolean lboolean)     {
        this.nMonthBirthday = nMonthBirthday;
        this.nDayBirthday = nDayBirthday;
        this.nYearBirthday = nYearBirthday;
        this.cSkiDifficulty = cSkiDifficulty;
        this.nLong = nLong;
        this.nTotalDistance = nTotalDistance;
        this.nDayDistance = nDayDistance;
        this.lboolean = lboolean;
    }*/
    public Hobby( short nYearBirthday, int  nMonthBirthday, byte nDayBirthday, char cSkiDifficulty)  {
        this.nMonthBirthday = nMonthBirthday;
        this.nDayBirthday = nDayBirthday;
        this.nYearBirthday = nYearBirthday;
        this.cSkiDifficulty = cSkiDifficulty;
        this.nLong = 0;
        this.nTotalDistance = 0;
        this.nDayDistance = 0;
        this.lboolean = false;
    }
    public Hobby()  {
    }

    public String tellAboutHobby(){
        String str = String.format(
                "nYearBirthday=%d, nMonthBirthday=%d, nDayBirthday=%d, cSkiDifficulty=%c, nTotalDistance=%.3f, nDayDistance=%.2f, nLong=%d, boolean=%s",
                    nYearBirthday,    nMonthBirthday,    nDayBirthday, cSkiDifficulty, nTotalDistance, nDayDistance, nLong, lboolean ? "TRUE" : "FALSE" );
        return str;
    }

    @Override
    public String toString() {
        return tellAboutHobby(); //super.toString();

    }
}
