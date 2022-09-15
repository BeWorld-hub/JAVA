package com.streamvoice;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import scripts.streamvoice.Scripts;

public class ConnectionSceneController {
    Scripts scripts = new Scripts();
    @FXML private ImageView mErrorImage;
    @FXML private VBox mVBox;

    @FXML
    private void tryConnect() {
        ProgressIndicator mConnectionProgressIndicator = new ProgressIndicator();

        mVBox.getChildren().set(0, mConnectionProgressIndicator);

        Task<Boolean> isConnection = new Task<Boolean>() {
            @Override
            protected Boolean call() throws Exception {
                return scripts.isConnection();
            }
        };

        isConnection.setOnSucceeded((event)->{
            if (isConnection.getValue()) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainScene.fxml"));
                Stage testStage = new Stage();
                Scene mainScene;

                try {
                    mainScene = new Scene(fxmlLoader.load());

                    testStage.setTitle("Stream Voice");
                    testStage.setScene(mainScene);
                    testStage.show();

                    Stage startStage = (Stage) mVBox.getScene().getWindow();
                    startStage.close();

                } catch (Exception exception) {
                    exception.printStackTrace();
                    }
            } else {
                mVBox.getChildren().set(0, mErrorImage);
            }
        });

        Thread thread = new Thread(isConnection);
        thread.start();
    }
}
