package org.gof.behavioral.patterns6.observer.migrate.listener.api;

import org.gof.behavioral.patterns6.observer.migrate.event.MigrateEvent;
import org.gof.behavioral.patterns6.observer.migrate.listener.api.IMigrateListener;

public class DefaultMigrateAdapterListener implements IMigrateListener {

    @Override
    public void onStartMigrate(MigrateEvent event) {

    }

    @Override
    public void onPrepMigrateRow(MigrateEvent event) {

    }

    @Override
    public void onPostMigrateRow(MigrateEvent event) {

    }

    @Override
    public void onFailMigrateRow(MigrateEvent event) {

    }

    @Override
    public void onFinishMigrate(MigrateEvent event) {

    }
}
