package org.repoanalyzer.statisticsprovider.statistics.revertpercentage;


import javafx.stage.Stage;
import org.repoanalyzer.reporeader.author.Author;
import org.repoanalyzer.statisticsprovider.statistics.AbstractStatisticsComponent;

import java.util.Set;

public class RevertPercentageComponent extends AbstractStatisticsComponent {

    private RevertPercentageView revertView;
    private RevertPercentageCalculator revertCalculator;

    public RevertPercentageComponent(Set<Author> authors) {
        super(authors);
        revertCalculator= new RevertPercentageCalculator(authors);
        revertView = new RevertPercentageView(revertCalculator.generateStatistics());
    }

    public void createAndShowStatisticsView() {
        revertView.createView(new Stage());
    }
}
