
import org.bytedeco.javacv.FFmpegFrameGrabber;

import java.io.File;

public class App {
    public static void main(String[] args) {

        File videoFile = new File("C:\\Users\\roger\\Downloads\\corrupted_oscar.mp4");
        try (FFmpegFrameGrabber frameGrabber = new FFmpegFrameGrabber(videoFile)) {
            frameGrabber.start();
            System.out.println(frameGrabber.getLengthInTime());

            frameGrabber.getMetadata().forEach( (x, y) -> {
                System.out.printf("%s - %s %n", x, y);
            });

        } catch (Exception ex) {
            System.out.printf("Error %s%n", ex.getCause());
        } finally {

        }


    }
}
