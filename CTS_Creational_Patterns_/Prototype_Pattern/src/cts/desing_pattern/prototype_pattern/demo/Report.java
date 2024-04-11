package cts.desing_pattern.prototype_pattern.demo;

public interface Report {
    public void generateReport();
    public void setData(String data);
    public void setFormat(String format);
    public Report clone();
}
