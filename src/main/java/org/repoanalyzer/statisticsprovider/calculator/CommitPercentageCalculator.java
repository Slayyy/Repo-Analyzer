package org.repoanalyzer.statisticsprovider.calculator;


import org.repoanalyzer.reporeader.commit.Author;
import org.repoanalyzer.reporeader.commit.Commit;
import org.repoanalyzer.statisticsprovider.data.CommitPercentageData;

import java.util.ArrayList;
import java.util.List;

public class CommitPercentageCalculator {
    private List<Commit> commits;

    public CommitPercentageCalculator(List<Commit> commits) {
        this.commits = commits;
    }

    public List<CommitPercentageData> generateData(){
        List<CommitPercentageData> data = new ArrayList<>();

        List<Author> authors = new ArrayList<Author>();

        for(Commit commit: commits){
            if(!authors.contains(commit.getAuthor())){
                authors.add(commit.getAuthor());
            }
        }

        for(Author author: authors){
            int authorCommitsNumber = 0;
            for(Commit commit: commits) {
                if (author.equals(commit.getAuthor())) {
                    authorCommitsNumber++;
                }
            }
            data.add(new CommitPercentageData(author.getName(), authorCommitsNumber));
        }
        return data;
    }
}
