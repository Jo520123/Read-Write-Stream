package Bytes;

import java.io.*;
import java.io.OutputStream;
import java.io.InputStream;

public class WithInputStream {


    public static void main(String[] args)
    {
        byte [] h = {0xC, 0xA, 0xF, 0xE, 0xB, 0xA, 0xB, 0xE};

        try(OutputStream os = new FileOutputStream("files/test.bin")){

            os.write(h);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


        try(InputStream is = new FileInputStream("files/test.bin"))
        {

            byte [] readB = is.readAllBytes();

            for (byte x : readB)
            {

                System.out.printf("0x%x ",x);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
