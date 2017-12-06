package cc.dc.structure.test;

import com.sun.imageio.plugins.gif.GIFImageReader;
import com.sun.imageio.plugins.gif.GIFImageReaderSpi;
import com.sun.imageio.plugins.gif.GIFImageWriter;
import com.sun.imageio.plugins.gif.GIFImageWriterSpi;

import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;
import java.io.File;

public class TestDemo2 {
    public static void main(String[] args) throws Exception {
        test();
    }

    private static void test() throws Exception {
        File file = new File("C:\\Users\\lc\\Desktop\\test.gif");

        FileImageInputStream in = new FileImageInputStream(file);

        //GIFImageReader reader = null;
        ImageReaderSpi readerSpi = new GIFImageReaderSpi();

        //readerSpi.canDecodeInput(in);

        GIFImageReader gifReader = (GIFImageReader) readerSpi.createReaderInstance();

        gifReader.setInput(in);

        int num = gifReader.getNumImages(true);

        gifReader.getNumImages(true);

        System.out.println(num);

        ImageWriterSpi writerSpi = new GIFImageWriterSpi();

        GIFImageWriter writer = (GIFImageWriter) writerSpi.createWriterInstance();

        for (int i = 0; i < num; i++) {

            File newfile = new File("C:\\Users\\lc\\Desktop\\test\\"+i+".jpg");

            FileImageOutputStream out = new FileImageOutputStream(newfile);

            writer.setOutput(out);

            writer.write(gifReader.read(i));

            out.close();
        }

    }
}
