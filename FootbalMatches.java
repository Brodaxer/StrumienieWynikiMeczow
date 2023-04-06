import java.util.Objects;

class FootbalMatches {
    private String homeTeam;
    private int scoreHome;
    private String visitingTeam;

    private int scoreVisiting;

    public FootbalMatches(String homeTeam, int scoreHome, String visitingTeam, int scoreVisiting) {
        this.homeTeam = homeTeam;
        this.scoreHome = scoreHome;
        this.visitingTeam = visitingTeam;
        this.scoreVisiting = scoreVisiting;
    }
    public int sortScore(){
        return scoreHome - scoreVisiting;
    }
    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public void setVisitingTeam(String visitingTeam) {
        this.visitingTeam = visitingTeam;
    }

    public int getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(int scoreHome) {
        this.scoreHome = scoreHome;
    }

    public int getScoreVisiting() {
        return scoreVisiting;
    }

    public void setScoreVisiting(int scoreVisiting) {
        this.scoreVisiting = scoreVisiting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootbalMatches that = (FootbalMatches) o;
        return  Objects.equals(homeTeam, that.homeTeam) && Objects.equals(visitingTeam, that.visitingTeam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeTeam, visitingTeam, scoreHome, scoreVisiting);
    }
    public int bothScore(){
        return scoreVisiting + scoreHome;
    }
    @Override
    public String toString() {
        return homeTeam + " - "+ visitingTeam+"("+scoreHome+":"+scoreVisiting+")";
    }
}
