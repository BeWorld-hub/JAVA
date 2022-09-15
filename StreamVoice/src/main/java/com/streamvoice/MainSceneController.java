package com.streamvoice;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class MainSceneController {
    @FXML private BorderPane mRootPane;
    @FXML
    private void setFindForm() {
        try {
            Parent searchNode = FXMLLoader.load(getClass().getResource("SearchScene.fxml"));

            mRootPane.setCenter(searchNode);
            mRootPane.setRight(null);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    private void setFavouriteForm() {
        try {
            Parent favouriteNode = FXMLLoader.load(getClass().getResource("FavouriteScene.fxml"));

            mRootPane.setCenter(favouriteNode);
            mRootPane.setRight(null);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    private void setMainForm() {
        try {
            Parent mainNode = FXMLLoader.load(getClass().getResource("AudioScene.fxml"));
            Parent songTextNode = FXMLLoader.load(getClass().getResource("SongTextScene.fxml"));

            mRootPane.setCenter(mainNode);
            mRootPane.setRight(songTextNode);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    private void setRatingForm() {
        try {
            Parent ratingNode = FXMLLoader.load(getClass().getResource("RatingScene.fxml"));

            mRootPane.setCenter(ratingNode);
            mRootPane.setRight(null);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    private void setProfileForm() {
        try {
            Parent profileNode = FXMLLoader.load(getClass().getResource("ProfileScene.fxml"));

            mRootPane.setCenter(profileNode);
            mRootPane.setRight(null);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @FXML
    private void setSettingsForm() {
        try {
            Parent settingsNode = FXMLLoader.load(getClass().getResource("SettingsScene.fxml"));

            mRootPane.setCenter(settingsNode);
            mRootPane.setRight(null);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
