package cts.singleton.pattern.example.report_generation.singleton;

public class GamingTestReport implements ITesingModule{
    private static volatile GamingTestReport test_instance;

    private int failedTests;
    private int completedTests;
    private int wholeDurationTime;

    private GamingTestReport(int failedTests, int completedTests, int wholeDurationTime) {
        this.completedTests = completedTests;
        this.failedTests = failedTests;
        this.wholeDurationTime = wholeDurationTime;
    }

    public static synchronized GamingTestReport getReport(int failedTests, int completedTests, int wholeDurationTime) {
        boolean reportNotFound = GamingTestReport.test_instance == null;
        if(reportNotFound) {
            GamingTestReport.test_instance =
                    new GamingTestReport(failedTests, completedTests, wholeDurationTime);
            System.out.println("Report structure Created");
        }
        return GamingTestReport.test_instance;
    }

    @Override
    public String test() {
        System.out.println("Report generates...");
        int timeout = 5;
        try {
            Thread.sleep(timeout * 1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Report geneated.");
        return GamingTestReport.test_instance.toString();
    }

    @Override
    public String toString() {
        final StringBuilder report = new StringBuilder("GamingTestReport{");
        report.append("failedTests = ").append(failedTests);
        report.append(", completedTests = ").append(completedTests);
        report.append(", wholeDurationTime = ").append(wholeDurationTime);
        report.append('}');
        return report.toString();
    }
}
