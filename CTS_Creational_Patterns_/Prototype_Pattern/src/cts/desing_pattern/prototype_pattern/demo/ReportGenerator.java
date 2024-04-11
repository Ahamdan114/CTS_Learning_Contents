package cts.desing_pattern.prototype_pattern.demo;

import java.util.Map;

public class ReportGenerator {
    Map<String, Report> reports;

    ReportGenerator() {}

    public Report generateReport(String x, String y, String z) {
       Report currentReport = reports.get(x);

        boolean hasNotBeenUsed = reports.get(x) == null;
        if(hasNotBeenUsed) reports.put(y, new SalesReport());

        return currentReport;
    }
}
