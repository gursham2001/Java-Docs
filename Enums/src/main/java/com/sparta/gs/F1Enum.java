package com.sparta.gs;

public enum F1Enum {

    Mercedes("Hamilton", "Toto", 3),
    Red_Bull("Max V", "Horner", 1),
    Ferrari("Charles L", "Binotto", 2),
    Mclaren ("Lando", "Brown", 5),
    Alpine("Alonso", "Otmar", 4),
    Alpha_Romeo("Bottas", "", 6),
    Alpha_Tauri("Gasly", "Franz Tost", 7),
    Haas("Mick s", "Guther", 8),
    Aston_Martin("Vettel", "Mike Kcrack", 9),
    Williams("Albon", "Capito", 10);

    private String driver1;
    private String team_boss;
    private int rank;

    F1Enum(String driver1, String team_boss, int rank) {
        this.driver1 = driver1;
        this.team_boss = team_boss;
        this.rank = rank;
    }

    public String getDriver1() {
        return driver1;
    }
    public void setDriver1(String driver1) {
        this.driver1 = driver1;
    }

    public String getTeam_boss() {
        return team_boss;
    }
    public void setTeam_boss(String team_boss) {
        this.team_boss = team_boss;
    }

    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "F1Enum{" +
                "driver1='" + driver1 + '\'' +
                ", team_boss='" + team_boss + '\'' +
                ", rank=" + rank +
                '}';
    }
}
