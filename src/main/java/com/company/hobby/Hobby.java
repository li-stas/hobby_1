package com.company.hobby;

public class Hobby {
    private int  nInt;
    private byte bByte; // возраст
    private char cChar;
    private short nShort;
    private long  nLong;
    private double nDouble;
    private float nFloat;
    private boolean lboolean; // лыжы или доска

    public int getnInt() {        return nInt;    }
    public void setnInt(int nInt) {        this.nInt = nInt;    }

    public byte getbByte() {        return bByte;    }
    public void setbByte(byte bByte) {        this.bByte = bByte;    }

    public char getcChar() {        return cChar;    }
    public void setcChar(char cChar) {        this.cChar = cChar;    }

    public short getnShort() {        return nShort;    }
    public void setnShort(short nShort) {        this.nShort = nShort;    }

    public long getnLong() {        return nLong;    }
    public void setnLong(long nLong) {        this.nLong = nLong;    }

    public double getnDouble() {        return nDouble;    }
    public void setnDouble(double nDouble) {        this.nDouble = nDouble;    }

    public float getnFloat() {        return nFloat;    }
    public void setnFloat(float nFloat) {        this.nFloat = nFloat;    }

    public boolean isLboolean() {        return lboolean;    }
    public void setLboolean(boolean lboolean) {        this.lboolean = lboolean;    }

    //  конструктор
    public Hobby( int  nInt, byte bByte, char cChar, short nShort, long  nLong, double nDouble, float nFloat, boolean lboolean)     {
        this.nInt = nInt;
        this.bByte = bByte;
        this.cChar = cChar;
        this.nShort = nShort;
        this.nLong = nLong;
        this.nDouble = nDouble;
        this.nFloat = nFloat;
        this.lboolean = lboolean;
    }
    public Hobby()     {
        /*
        int nInt, int bByte, char cChar, int nShort, int nLong, int nDouble, int nFloat, boolean lboolean
        this.nInt = nInt;
        this.bByte = bByte;
        this.cChar = cChar;
        this.nShort = nShort;
        this.nLong = nLong;
        this.nDouble = nDouble;
        this.nFloat = nFloat;
        this.lboolean = lboolean; */
    }
    /*public String ShowThis(){
        String str = String.format("nInt=%d, bByte=%d, cChar=%c, nShort=%d, nLong=%d, nDouble=%.3f, nFloat=%.2f, boolean=%s",
                this.nInt,  this.bByte, this.cChar, this.nShort, this.nLong, this.nDouble, this.nFloat, this.lboolean ? "TRUE" : "FALSE" );
        return str;
    }*/
    public String tellAboutHobby(){
        String str = String.format("nInt=%d, bByte=%d, cChar=%c, nShort=%d, nLong=%d, nDouble=%.3f, nFloat=%.2f, boolean=%s",
                nInt,  bByte, cChar, nShort, nLong, nDouble, nFloat, lboolean ? "TRUE" : "FALSE" );
        return str;
    }

    @Override
    public String toString() {
        return tellAboutHobby(); //super.toString();

    }
}
