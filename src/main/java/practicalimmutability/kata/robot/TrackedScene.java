package practicalimmutability.kata.robot;

import io.vavr.Tuple2;
import io.vavr.collection.Iterator;
import org.immutables.value.Value;

@Value.Immutable
public abstract class TrackedScene {
    @Value.Parameter
    public abstract Scene scene();

    @Value.Parameter
    public abstract SceneTracking tracking();

    public boolean completed() {
        return scene().completed() || tracking().loop();
    }

    public TrackedScene next() {
        final Scene currentScene = scene();
        final SceneTracking currentTracking = tracking();
        final Scene updatedScene = currentScene.next();
        final SceneTracking updatedTracking = currentTracking.track(updatedScene);
        return ImmutableTrackedScene.of(updatedScene, updatedTracking);
    }

    public Iterator<TrackedScene> run() {
        final Tuple2<Iterator<TrackedScene>, Iterator<TrackedScene>> prefixAndReminder =
                Iterator.iterate(this, TrackedScene::next).span(trackedScene -> !trackedScene.completed());

        return Iterator.concat(prefixAndReminder._1, prefixAndReminder._2.take(1));
    }

    public static TrackedScene fromInitialScene(final Scene scene) {
        return ImmutableTrackedScene.of(scene, SceneTracking.fromInitialScene(scene));
    }
}