package org.jesperancinha.chartizate;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.jesperancinha.chartizate.objects.ChartizateCharacterImg;
import org.jesperancinha.chartizate.objects.ChartizateCharacterImgImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@RunWith(AndroidJUnit4.class)
public class ChartizateImageManagerImplTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    private File targetFile;

    @Before
    public void setUp() throws IOException {
        targetFile = folder.newFile();
    }

    @Test
    public void testgetImageAverageColorBlackGreen() throws IOException {
        Context ctx = androidx.test.core.app.ApplicationProvider.getApplicationContext();
        final InputStream imageFullStream = ctx.getResources().getAssets().open("chartizateblackgreen.png");

        final ChartizateImageManager<Integer, Typeface, Bitmap> imageManager = new ChartizateImageManagerImpl(imageFullStream, targetFile.getAbsolutePath());

        final Integer imageAverageInteger = imageManager.getImageAverageColor();
        assertThat(imageAverageInteger).isEqualTo(-416707840);
    }

    @Test
    public void testgetImageAverageColorCyanBlack() throws IOException {
        Context ctx = androidx.test.core.app.ApplicationProvider.getApplicationContext();
        final InputStream imageFullStream = ctx.getResources().getAssets().open("chartizatecyanblack.png");

        final ChartizateImageManager<Integer, Typeface, Bitmap> imageManager = new ChartizateImageManagerImpl(imageFullStream, targetFile.getAbsolutePath());

        final Integer imageAverageInteger = imageManager.getImageAverageColor();

        assertThat(imageAverageInteger).isEqualTo(-419399303);
    }

    @Test
    public void testGetPartAverageIntegerCyanBlack00() throws IOException {
        Context ctx = androidx.test.core.app.ApplicationProvider.getApplicationContext();
        final InputStream imageFullStream = ctx.getResources().getAssets().open("chartizatecyanblack.png");

        final ChartizateImageManager<Integer, Typeface, Bitmap> imageManager = new ChartizateImageManagerImpl(imageFullStream, targetFile.getAbsolutePath());

        final Integer partAverageInteger = imageManager.getPartAverageColor(IntStream.range(0, 10), IntStream.range(0, 10));

        assertThat(partAverageInteger).isEqualTo(-771710045);
    }

    @Test
    public void testGetPartAverageIntegerCyanBlack10() throws IOException {
        Context ctx = androidx.test.core.app.ApplicationProvider.getApplicationContext();
        final InputStream imageFullStream = ctx.getResources().getAssets().open("chartizatecyanblack.png");

        final ChartizateImageManager<Integer, Typeface, Bitmap> imageManager = new ChartizateImageManagerImpl(imageFullStream, targetFile.getAbsolutePath());

        final Integer partAverageInteger = imageManager.getPartAverageColor(IntStream.range(10, 19), IntStream.range(0, 10));

        assertThat(partAverageInteger).isEqualTo(-805290434);
    }

    @Test
    public void testSaveImage() throws IOException {
        Context ctx = androidx.test.core.app.ApplicationProvider.getApplicationContext();
        final InputStream imageFullStream = ctx.getResources().getAssets().open("chartizatecyanblack.png");
        final ChartizateImageManager<Integer, Typeface, Bitmap> imageManager = new ChartizateImageManagerImpl(imageFullStream, targetFile.getAbsolutePath());
        final ChartizateCharacterImg<Integer>[][] chartizateCharacterImgs = new ChartizateCharacterImg[2][];
        chartizateCharacterImgs[0] = new ChartizateCharacterImg[]{
                new ChartizateCharacterImgImpl<>(Color.GREEN, Color.RED, 10, 'A'),
                new ChartizateCharacterImgImpl<>(Color.BLACK, Color.RED, 10, 'B')
        };
        chartizateCharacterImgs[1] = new ChartizateCharacterImg[]{
                new ChartizateCharacterImgImpl<>(Color.BLUE, Color.YELLOW, 10, 'C'),
                new ChartizateCharacterImgImpl<>(Color.YELLOW, Color.GREEN, 10, 'D')
        };
        final ChartizateFontManager<Typeface> fontManager = new ChartizateFontManagerImpl("Arial", 10);

        assertDoesNotThrow(() -> {
            final Bitmap bufferedImage = imageManager.generateBufferedImage(chartizateCharacterImgs, fontManager);
            imageManager.saveBitmap(bufferedImage);
        });
    }

}
