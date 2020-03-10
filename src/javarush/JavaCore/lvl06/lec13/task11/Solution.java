package javarush.JavaCore.lvl06.lec13.task11;

import javarush.JavaCore.lvl06.lec13.task11.common.ImageReader;
import javarush.JavaCore.lvl06.lec13.task11.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
