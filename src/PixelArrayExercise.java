/**
*   PixelArrayExercise: Playing around with pixels
*   @author Gabriel Skoglund
*   @version 2020-10-08
*/

public class PixelArrayExercise{

    public static void main(String[] args){
        ImageWindow image = new ImageWindow();
        // You can get a 2d array of pixels from the image with this method
        Pixel[][] pixels = image.getPixels();

        // An example: we loop over all the pixels in the image
        // and set the top half to one color and the bottom half
        // to another.
        for (int x = 0; x < image.WIDTH; x++){
            for (int y = 0; y < image.HEIGHT; y++){

                if (y < image.HEIGHT/2){
                    pixels[x][y].setRGB(255, 128, 64);
                } else {
                    pixels[x][y].setRGB(64,128,64);
                }
            }
        }

        // Remember to set the pixels of the image and update it
        image.setPixels(pixels);
        image.update();
    }
}
