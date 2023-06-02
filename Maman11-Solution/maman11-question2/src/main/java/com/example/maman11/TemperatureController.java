package com.example.maman11;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class TemperatureController implements Initializable
{
    private int year = 2017;
    private XYChart.Series series;
    @FXML
    private Label welcomeText;
    @FXML
    private BarChart barChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        series = new XYChart.Series();
        series.setName(Integer.toString(year));

        series.getData().add(new XYChart.Data("January", 7));
        series.getData().add(new XYChart.Data("February", 8));
        series.getData().add(new XYChart.Data("March", 12));
        series.getData().add(new XYChart.Data("April", 15));
        series.getData().add(new XYChart.Data("May", 20));
        series.getData().add(new XYChart.Data("June", 25));
        series.getData().add(new XYChart.Data("July", 27));
        series.getData().add(new XYChart.Data("August", 28));
        series.getData().add(new XYChart.Data("September", 25));
        series.getData().add(new XYChart.Data("October", 18));
        series.getData().add(new XYChart.Data("November", 15));
        series.getData().add(new XYChart.Data("December", 9));

        barChart.getData().add(series);


        int i = 0;
        for(Node n: barChart.lookupAll(".default-color0.chart-bar"))
        {
            if (i == 0)
            {
                n.setStyle("-fx-bar-fill: blue;");
            }
            else if (i == 7)
            {
                n.setStyle("-fx-bar-fill: red;");
            }
            else
            {
                n.setStyle("-fx-bar-fill: grey;");
            }

            i++;
        }

        //second bar color
        i = 0;
        for(Node n:barChart.lookupAll(".default-color1.chart-bar"))
        {
            if (i == 0)
            {
                n.setStyle("-fx-bar-fill: blue;");
            }
            else if (i == 7)
            {
                n.setStyle("-fx-bar-fill: red;");
            }
            else
            {
                n.setStyle("-fx-bar-fill: grey;");
            }

            i++;
        }

    }

    @FXML
    protected void onNextYearButtonClick()
    {
        year++;
        barChart.getData().remove(series);

        series = new XYChart.Series();

        if (year == 2018)
        {
            set2018();
        }
        else if (year == 2019)
        {
            set2019();
        }
        else if (year == 2020)
        {
            set2020();
        }
        else if (year == 2021)
        {
            set2021();
        }
        else if (year == 2022)
        {
            set2022();
        }
        else if (year == 2023)
        {
            year = 2017;
            set2017();
        }

        for(Node n: barChart.lookupAll(".default-color0.chart-bar")) {
            n.setStyle("-fx-bar-fill: grey;");
        }
        //second bar color
        for(Node n:barChart.lookupAll(".default-color1.chart-bar")) {
            n.setStyle("-fx-bar-fill: grey;");
        }

        series.setName(Integer.toString(year));
        welcomeText.setText(Integer.toString(year));

        int i = 0;
        for(Node n: barChart.lookupAll(".default-color0.chart-bar"))
        {
            if (i == 0)
            {
                n.setStyle("-fx-bar-fill: blue;");
            }
            else if (i == 7)
            {
                n.setStyle("-fx-bar-fill: red;");
            }
            else
            {
                n.setStyle("-fx-bar-fill: grey;");
            }

            i++;
        }

        //second bar color
        i = 0;
        for(Node n:barChart.lookupAll(".default-color1.chart-bar"))
        {
            if (i == 0)
            {
                n.setStyle("-fx-bar-fill: blue;");
            }
            else if (i == 7)
            {
                n.setStyle("-fx-bar-fill: red;");
            }
            else
            {
                n.setStyle("-fx-bar-fill: grey;");
            }

            i++;
        }
    }

    private void set2017()
    {
        series.getData().add(new XYChart.Data("January", 7));
        series.getData().add(new XYChart.Data("February", 8));
        series.getData().add(new XYChart.Data("March", 12));
        series.getData().add(new XYChart.Data("April", 15));
        series.getData().add(new XYChart.Data("May", 20));
        series.getData().add(new XYChart.Data("June", 25));
        series.getData().add(new XYChart.Data("July", 27));
        series.getData().add(new XYChart.Data("August", 28));
        series.getData().add(new XYChart.Data("September", 25));
        series.getData().add(new XYChart.Data("October", 18));
        series.getData().add(new XYChart.Data("November", 15));
        series.getData().add(new XYChart.Data("December", 9));


        barChart.getData().add(series);
    }
    private void set2018()
    {
        series.getData().add(new XYChart.Data("January", 8));
        series.getData().add(new XYChart.Data("February", 9));
        series.getData().add(new XYChart.Data("March", 13));
        series.getData().add(new XYChart.Data("April", 16));
        series.getData().add(new XYChart.Data("May", 21));
        series.getData().add(new XYChart.Data("June", 26));
        series.getData().add(new XYChart.Data("July", 28));
        series.getData().add(new XYChart.Data("August", 29)); //7
        series.getData().add(new XYChart.Data("September", 25));
        series.getData().add(new XYChart.Data("October", 18));
        series.getData().add(new XYChart.Data("November", 15));
        series.getData().add(new XYChart.Data("December", 10));

        barChart.getData().add(series);
    }
    private void set2019()
    {
        series.getData().add(new XYChart.Data("January", 9));
        series.getData().add(new XYChart.Data("February", 10));
        series.getData().add(new XYChart.Data("March", 12));
        series.getData().add(new XYChart.Data("April", 17));
        series.getData().add(new XYChart.Data("May", 20));
        series.getData().add(new XYChart.Data("June", 27));
        series.getData().add(new XYChart.Data("July", 28));
        series.getData().add(new XYChart.Data("August", 30));
        series.getData().add(new XYChart.Data("September", 27));
        series.getData().add(new XYChart.Data("October", 18));
        series.getData().add(new XYChart.Data("November", 15));
        series.getData().add(new XYChart.Data("December", 9));

        barChart.getData().add(series);
    }
    private void set2020()
    {
        series.getData().add(new XYChart.Data("January", 8));
        series.getData().add(new XYChart.Data("February", 10));
        series.getData().add(new XYChart.Data("March", 12));
        series.getData().add(new XYChart.Data("April", 15));
        series.getData().add(new XYChart.Data("May", 20));
        series.getData().add(new XYChart.Data("June", 28));
        series.getData().add(new XYChart.Data("July", 28));
        series.getData().add(new XYChart.Data("August", 31));
        series.getData().add(new XYChart.Data("September", 27));
        series.getData().add(new XYChart.Data("October", 18));
        series.getData().add(new XYChart.Data("November", 15));
        series.getData().add(new XYChart.Data("December", 11));

        barChart.getData().add(series);
    }
    private void set2021()
    {
        series.getData().add(new XYChart.Data("January", 10));
        series.getData().add(new XYChart.Data("February", 12));
        series.getData().add(new XYChart.Data("March", 14));
        series.getData().add(new XYChart.Data("April", 18));
        series.getData().add(new XYChart.Data("May", 22));
        series.getData().add(new XYChart.Data("June", 24));
        series.getData().add(new XYChart.Data("July", 28));
        series.getData().add(new XYChart.Data("August", 30));
        series.getData().add(new XYChart.Data("September", 25));
        series.getData().add(new XYChart.Data("October", 18));
        series.getData().add(new XYChart.Data("November", 15));
        series.getData().add(new XYChart.Data("December", 12));

        barChart.getData().add(series);
    }
    private void set2022()
    {
        series.getData().add(new XYChart.Data("January", 12));
        series.getData().add(new XYChart.Data("February", 13));
        series.getData().add(new XYChart.Data("March", 15));
        series.getData().add(new XYChart.Data("April", 18));
        series.getData().add(new XYChart.Data("May", 22));
        series.getData().add(new XYChart.Data("June", 26));
        series.getData().add(new XYChart.Data("July", 29));
        series.getData().add(new XYChart.Data("August", 32));
        series.getData().add(new XYChart.Data("September", 28));
        series.getData().add(new XYChart.Data("October", 23));
        series.getData().add(new XYChart.Data("November", 17));
        series.getData().add(new XYChart.Data("December", 14));

        barChart.getData().add(series);
    }
}