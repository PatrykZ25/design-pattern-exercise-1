package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        BarChart barChart = new BarChart("Task types report",new ArrayList());

        BarChart chart1 = BarChart.builder()
                .withTitle("chart1")
                .build();
        System.out.println(chart1);
    }
}
