package audioviz;

import javafx.scene.layout.AnchorPane;

/*
 * @author Austin Sizemore
 */
public interface Visualizer {
    public void start(Integer numBands, AnchorPane vizPane);
    public void end();
    public String getName();
    public void update(double timestamp, double duration, float[] magnitudes, float[] phases);
}
