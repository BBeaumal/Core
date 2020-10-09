package com.mycompany.tennis.core.services;

import com.mycompany.tennis.core.repository.MatchDAOImpl;
import com.mycompany.tennis.core.repository.ScoreDAOImpl;
import com.mycompany.tennis.core.entity.Match;

public class MatchService {

    private ScoreDAOImpl scoreDAO;
    private MatchDAOImpl matchDAO;

    public MatchService() {
        this.scoreDAO = new ScoreDAOImpl();
        this.matchDAO = new MatchDAOImpl();
    }

    public void enregistrerNouveauMatch(Match match) {
        matchDAO.create(match);
        scoreDAO.create(match.getScore());

    }
}
