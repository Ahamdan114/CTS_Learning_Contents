package cts.singleton.pattern;

import cts.singleton.pattern.example.report_generation.singleton.GamingTestReport;
import cts.singleton.pattern.implementation.Singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        singleton = Singleton.getInstance();

        GamingTestReport gamingTestReport = GamingTestReport.getReport(3, 5, 1000);
        String reportData = gamingTestReport.test();
        System.out.println(reportData);
    }
}