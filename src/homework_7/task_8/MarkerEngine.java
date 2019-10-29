package homework_7.task_8;

public enum MarkerEngine {
    MARKER1_4L("1.4L"), MARKER2_0T("2.0T"), MARKER1_8L("1.8"), MARKER1_8T("1.8T");

    private String config;

    MarkerEngine(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "MarkerEngine{" +
                "config='" + config + '\'' +
                '}';
    }
}
