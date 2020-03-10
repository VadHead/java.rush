package javarush.JavaCore.lvl06.lec13.task11;

import javarush.JavaCore.lvl06.lec13.task11.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) throws IllegalArgumentException {
        try {
            if (imageTypes.name().equals("BMP")) {
                return new BmpReader();
            } else if (imageTypes.name().equals("PNG")) {
                return new PngReader();
            } else if (imageTypes.name().equals("JPG")) {
                return new JpgReader();
            } else {
                throw new IllegalArgumentException();
            }
        } catch (NullPointerException npe) {
            throw new IllegalArgumentException();
        }
    }
}
