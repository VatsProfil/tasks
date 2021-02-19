package lesson190221;

public abstract class Workplace {

    private String workName;
    private String workRank;
    public abstract void isWork(String answer);

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkRank() {
        return workRank;
    }

    public void setWorkRank(String workRank) {
        this.workRank = workRank;
    }
}
