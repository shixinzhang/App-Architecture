package com.frodo.app.framework.controller;

/**
 * Created by frodo on 2015/4/1.
 */
public abstract class AbstractModel implements IModel {

    private MainController mainController;

    public AbstractModel(MainController controller) {
        this.mainController = controller;
        controller.getModelFactory().registerMode(this);
    }

    @Override
    public final String name() {
        return getClass().getSimpleName();
    }

    @Override
    public final MainController getMainController() {
        return mainController;
    }

    @Override
    public final ModelFactory getModelFactory() {
        return getMainController().getModelFactory();
    }

    @Override
    public void initBusiness() {
        // do something
    }

    public static class SimpleModel extends AbstractModel {

        public SimpleModel(MainController controller) {
            super(controller);
        }
    }
}
