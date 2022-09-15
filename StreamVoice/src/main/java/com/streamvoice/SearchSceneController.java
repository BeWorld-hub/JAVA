package com.streamvoice;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SearchSceneController {
    @FXML
    TextField searchField;
    @FXML
    private void searchSong() {
        SearchSongLogic handlerSearchForm = new SearchSongLogic();
        handlerSearchForm.searchSong(searchField.getText());
    }
}
