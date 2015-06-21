package com.praisenation.pnonoma30.logger;


import java.util.ArrayList;
/**
 * Created by kayanhales on 6/18/15.
 */
public class WeeklyLogger {
    /**
     * Should only have 7 daily logs
     *
     *
     *
     * Arraylists should be replaced with Database
     */
    private int logID;
    private ArrayList<DailyLogger>dailyLogsList;
    private String progressLevel;
    private ArrayList<DailyLogger>pastSevenDays;

    public WeeklyLogger (int logID, ArrayList<DailyLogger>dailyLogsList){
        this.logID=logID;
        this.dailyLogsList=dailyLogsList;

        setProgressLevel();

    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public ArrayList<DailyLogger> getDailyLogsList() {
        return dailyLogsList;
    }

    public void setDailyLogsList(ArrayList<DailyLogger> dailyLogsList) {
        this.dailyLogsList = dailyLogsList;
    }

    public String getProgressLevel() {
        return progressLevel;
    }


    public void setProgressLevel() {
        if (dailyLogsList.size()==7)
            this.progressLevel = "Copper";
        else if (dailyLogsList.size()==14)
            this.progressLevel = "Bronze";
        else if (dailyLogsList.size()==21)
            this.progressLevel = "Silver";
        else if (dailyLogsList.size()==28)
            this.progressLevel = "Gold";
        else if (dailyLogsList.size()==30)
            this.progressLevel = "Diamond";
    }

    public void setPastSevenDays(ArrayList<DailyLogger> pastSevenDays) {
        this.pastSevenDays = pastSevenDays;
    }

    public ArrayList<DailyLogger> getPastSevenDays(){

        for (int i=getDailyLogsList().size(); i>getDailyLogsList().size()-7; i--){
            this.pastSevenDays.add(getDailyLogsList().get(i));
        }
        return this.pastSevenDays;
    }

    @Override
    public String toString() {
        return "WeeklyLogger{" +
                "logID=" + logID +
                ", progressLevel='" + progressLevel + '\'' +
                ", pastSevenDays=" + pastSevenDays +
                '}';
    }
}
