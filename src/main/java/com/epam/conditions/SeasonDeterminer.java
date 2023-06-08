package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String[] season = new String[] {"Wrong month number", "Winter", "Spring", "Summer", "Autumn"};
        int n = 0;
        switch (monthNumber){
            case 1, 2, 12:
                n = 1;
                break;
            case 3, 4, 5:
                n = 2;
                break;
            case 6, 7, 8:
                n = 3;
                break;
            case 9, 10, 11:
                n = 4;
                break;
        }
        System.out.println(season[n]);
    }

}
