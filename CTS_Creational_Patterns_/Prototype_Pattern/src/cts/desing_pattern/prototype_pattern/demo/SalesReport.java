package cts.desing_pattern.prototype_pattern.demo;

public class SalesReport implements Report {
    String format;
    String data;

    @Override
    public void generateReport() {

    }

    @Override
    public void setData(String data) {

    }

    @Override
    public void setFormat(String format) {

    }

    @Override
    public Report clone() {

        return null;
    }
}
