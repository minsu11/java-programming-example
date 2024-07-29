package org.json.database;

public class Record {
    private int fightCnt;
    private int winCnt;

    public Record(int fightCnt, int winCnt) {
        this.fightCnt = fightCnt;
        this.winCnt = winCnt;
    }

    public int getFightCnt() {
        return fightCnt;
    }

    public int getWinCnt() {
        return winCnt;
    }

    public void setFightCnt(int fightCnt) {
        this.fightCnt = fightCnt;
    }

    public void setWinCnt(int winCnt) {
        this.winCnt = winCnt;
    }
}
