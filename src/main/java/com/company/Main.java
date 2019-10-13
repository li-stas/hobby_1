package com.company;

import com.company.hobby.Hobby;

public class Main {
    public static void main( String[] args ) {
        Hobby man1 = new Hobby();
        man1.setnInt(10);
        man1.setbByte((byte) 11);
        man1.setcChar('C');
        man1.setnShort((short) 14);
        man1.setnLong(15);
        man1.setnDouble(16);
        man1.setnFloat(17);
        man1.setLboolean(false);

        Hobby man2 = new Hobby(20,(byte)21,'B',(short) 24,25,26,27,true);

        Hobby aHb[] = {man1, man2};

        for ( Hobby oElem : aHb  ) {
            System.out.println( oElem.tellAboutHobby() );
        }

        for ( Hobby oElem : aHb  ) {
            System.out.println( oElem.toString() );
        }

    }

}
