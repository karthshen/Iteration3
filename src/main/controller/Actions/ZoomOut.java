package controller.Actions;

import controller.ControlHandler;
import view.Camera;

/**
 * Created by rishabh on 14/04/17.
 */
public class ZoomOut extends CameraAction {
    public ZoomOut(ControlHandler controlHandler, Camera camera){
        super(controlHandler,camera);
    }
    @Override
    public void perform() {
        getControlHandler().cameraZoomOut(getCamera());
    }
}

