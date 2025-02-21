package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        //
        String result;
        switch (monthNumber){
            case 12:
            case 1:
            case 2: result="Winter"; break;
            case 3:
            case 4:
            case 5: result="Spring"; break;
            case 6:
            case 7:
            case 8: result="Summer"; break;
            case 9:
            case 10:
            case 11: result="Autumn"; break;
            default: result="Wrong month number";
        }
        System.out.println(result);
    }

}
