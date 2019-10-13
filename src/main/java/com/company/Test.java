package com.company;
import com.company.hobby.Hobby;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите чз пробел  (год месяц день сложность_трасс[LSE] ) ГГГГ ММ ДД SkyDiff");

        short nYearBirthday = scan.nextShort();
        int nMonthBirthday = scan.nextInt();
        byte nDayBirthday = scan.nextByte();
        String sSkiDifficulty = scan.next();

        char cSkiDifficulty = sSkiDifficulty.charAt(0);
        Hobby man3 = new Hobby( nYearBirthday, nMonthBirthday, nDayBirthday , cSkiDifficulty);


        Hobby man1 = new Hobby();
        man1.setnYearBirthday((short) 1968);
        man1.setnMonthBirthday(3);
        man1.setnDayBirthday((byte) 24);
        man1.setcSkiDifficulty('E'); ////Blue - (L)ight, red - (S)imple,  black - (E)xperts.
        man1.setnDayDistance(36.500f);
        man1.setnTotalDistance(115.400);
        man1.setnLong(15);
        man1.setLboolean(false);

        // Hobby( short nYearBirthday, int  nMonthBirthday, byte nDayBirthday, char cSkiDifficulty);
        Hobby man2 = new Hobby( (short) 1997, (int) 9, (byte) 2, 'S');
        Hobby aHb[] = {man1, man2, man3};

        for ( Hobby oElem : aHb  ) {
            System.out.println( oElem.tellAboutHobby() );
        }
    }
}
